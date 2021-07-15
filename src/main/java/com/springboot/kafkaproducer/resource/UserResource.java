package com.springboot.kafkaproducer.resource;

import com.springboot.kafkaproducer.model.User;
import com.springboot.kafkaproducer.model.UserPlaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {
    @Autowired
    private KafkaTemplate<String,UserPlaces> kafkaTemplate;
    private static final String TOPIC = "kafka";
//    @GetMapping(path="/publish/{name}")
//    public String post(@PathVariable("name") final String name){
//       kafkaTemplate.send(TOPIC,new UserPlaces(name,"Tech",18L));
//       System.out.println(name);
//       return name;
//    }
    @PostMapping("/addUser")
    public void getTopic(@RequestBody UserPlaces userPlaces){
        System.out.println(userPlaces);
        kafkaTemplate.send(TOPIC,userPlaces);
    }
    @GetMapping("/userPlaces")
    public String postUserPlaces(){
        return "hello";
    }
}
