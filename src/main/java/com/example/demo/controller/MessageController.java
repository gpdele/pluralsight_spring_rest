package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.model.Person;
import com.example.demo.model.Record;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    @GetMapping("/message")
    Message send() {
        return new Message("first message");
    }

    @PostMapping("/message")
    Message echo (@RequestBody Message message) {
        return message;
    }

    @GetMapping("/person")
    Person sendPerson() {
        return new Person("George", "Ponce de Leon", "Ablas");
    }

    @PostMapping("/person")
    Person echo (@RequestBody Person person) {
        return person;
    }

    @GetMapping("/people")
    List<Person> people () {
        Person person1 = new Person("George", "Ponce de Leon", "Ablas");
        Person person2 = new Person("Maria", "Ponce de Leon", "Ablas");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        return(personList);
    }

    @GetMapping("/record")
    Record record () {
        Record record = new Record();
        return(record);
    }
}

