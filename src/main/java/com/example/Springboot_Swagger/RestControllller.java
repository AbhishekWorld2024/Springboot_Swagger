package com.example.Springboot_Swagger;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllller {
    private final List<Member> personList = new ArrayList<>();

    public RestControllller() {
        personList.add(new Member(1, "Abhi", 24));
        personList.add(new Member(2, "Tarun", 25));
        personList.add(new Member(3, "Sandy", 23));
    }

    @GetMapping("/api/all")
    public List<Member> getAllPersons() {
        return personList;
    }

    @GetMapping("/api/person/{id}")
    public Member getbyId(@PathVariable int id) {
        for (Member person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @PutMapping("/api/person/{id}")
    public Member updatePerson(@PathVariable int id, @RequestBody Member updatedPerson) {
        for (Member person : personList) {
            if (person.getId() == id) {
                person.setName(updatedPerson.getName());
                person.setAge(updatedPerson.getAge());
                return person;
            }
        }
        return null; // Or throw an exception if preferred
    }

    // POST: Create a new person
    @PostMapping("/api/person")
    public Member createPerson(@RequestBody Member newPerson) {
        // Assigning a new ID to the person (auto-increment approach)
        int newId = personList.size() + 1;
        newPerson.setId(newId);
        personList.add(newPerson);
        return newPerson;
    }

    // DELETE: Delete a person by ID
    @DeleteMapping("/api/person/{id}")
    public String deletePerson(@PathVariable int id) {
        for (Member person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
                return "Person with ID " + id + " has been deleted.";
            }
        }
        return "Person with ID " + id + " not found.";
    }
}
