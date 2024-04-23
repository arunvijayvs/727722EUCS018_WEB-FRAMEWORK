package com.examly.class_exercise_1.Aruncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.Arunservice.ArunPersonService;
import com.examly.class_exercise_1.Arunvijaymodel.ArunPerson;

@RestController
public class ArunPersonController {

     @Autowired
     public ArunPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<ArunPerson> postMethodName(@RequestBody ArunPerson entity) {

          ArunPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<ArunPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<ArunPerson>> getMethodName() {

          List<ArunPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ArunPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ArunPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<ArunPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}