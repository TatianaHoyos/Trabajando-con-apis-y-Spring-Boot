package com.tatiana.ejemplospring;

import com.tatiana.ejemplospring.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class PersonsController {

    private static List<Person> persona =new ArrayList<>();

    public PersonsController(){
        persona.add(new Person("123","c.c","canela","cane","1234"));
        persona.add(new Person("345", "cc","cactus","verde","3456"));
    }

    @GetMapping("/persona")
    public List<Person> SearchPerson(@RequestParam Map<String,String> Parameters){
        return persona.stream()
                .filter(p -> Parameters.get("id") == null || Parameters.get("id").equals(p.getId()))
                .filter(p -> Parameters.get("idType") == null || Parameters.get("idType").equals(p.getIdType()))
                .filter(p -> Parameters.get("name") == null || Parameters.get("name").equals(p.getName()))
                .filter(p -> Parameters.get("lastName") == null || Parameters.get("lastName").equals(p.getLastName()))
                .filter(p -> Parameters.get("phone") == null || Parameters.get("phone").equals(p.getPhone()))
                .collect(Collectors.toList());
    }

}
