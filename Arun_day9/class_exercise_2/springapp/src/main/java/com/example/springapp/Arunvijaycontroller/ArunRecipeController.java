package com.example.springapp.Arunvijaycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.springapp.Arunvijaymodel.ArunRecipe;
import com.example.springapp.Arunvijayservice.ArunRecipeService;

@RestController
public class ArunRecipeController {
    @Autowired
    private ArunRecipeService ser;

    @PostMapping("/api/recipe")
    public ResponseEntity<ArunRecipe> post(@RequestBody ArunRecipe person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<ArunRecipe>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<ArunRecipe> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<ArunRecipe> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        ArunRecipe li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
