package io.github.mbarre.drhfpncrest.controllers;

import io.github.mbarre.drhfpncrest.domain.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacantPostsController {

    @GetMapping("/posts")
    public List<Post> getAllVacantPosts(){
        return null;
    }

    @GetMapping("/posts/sector/{sector}/category/{category}")
    public List<Post> getVacantPostBySectorAndCategory(@PathVariable(value = "sector") String sector,
                                                       @PathVariable(value = "category") String category){
        return null;
    }

    @GetMapping("/posts/sector/{sector}/category/{category}/keywords/{keywords}")
    public List<Post> getVacantPostBySectorByCategoryAndKeywords(@PathVariable(value = "sector") String sector,
                                                                 @PathVariable(value = "category") String category,
                                                                 @PathVariable(value = "keywords") List<String> keywords){
        return null;
    }
}
