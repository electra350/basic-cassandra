package com.kplearning.controller;

import com.kplearning.model.UserData;
import com.kplearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserDataController
{
    @Autowired
    private UserRepository userRepository;

    @PostConstruct public void saveUser ()
    {
        List<UserData> users = new ArrayList<>();
        users.add(new UserData(123, "Adhyaksha", "Bangalore", 24));
        users.add(new UserData(124, "Raviraja", "Delhi", 53));
        users.add(new UserData(125, "Gundappa", "Chennai", 32));
        userRepository.saveAll(users);
    }

    @GetMapping("/getAllUsers") public List<UserData> getUsers ()
    {
        return userRepository.findAll();
    }

    @GetMapping("/getUsersFilterByAge/{age}") public List<UserData> getUserFilterByAge (@PathVariable int age)
    {
        return userRepository.findByAgeGreaterThan(age);
    }
}
