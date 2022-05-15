package com.kplearning.repository;

import com.kplearning.model.UserData;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CassandraRepository<UserData, Integer>
{
    @AllowFiltering
    List<UserData> findByAgeGreaterThan (int age);
}
