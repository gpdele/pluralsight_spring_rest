package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Record {

    private Message message;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    private List<Person> people;

    public Record(Message message, Person person) {
        this.message = message;
    }

    public Record(Message message) {
        this.message = message;
    }

    public Record() {
        this.message = new Message("in record class");

        Person person1 = new Person("George", "Ponce de Leon", "Ablas");
        Person person2 = new Person("Maria", "Ponce de Leon", "Ablas");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        this.setPeople(personList);
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
