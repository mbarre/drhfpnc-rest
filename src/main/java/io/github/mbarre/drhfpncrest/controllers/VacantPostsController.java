package io.github.mbarre.drhfpncrest.controllers;

import io.github.mbarre.drhfpnc.sdk.Category;
import io.github.mbarre.drhfpnc.sdk.Sector;
import io.github.mbarre.drhfpncrest.domain.Post;
import io.github.mbarre.drhfpncrest.exception.InternalErrorException;
import io.github.mbarre.drhfpncrest.services.VacantPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class VacantPostsController {

    @Autowired
    VacantPostsService vacantPostsService;

    @GetMapping("/posts")
    public List<Post> getAllVacantPosts(){
        try {
            return vacantPostsService.getVacantPosts(Sector.TOUTES.name(), Category.TOUTES.name(), null);
        } catch (IOException e) {
            throw new InternalErrorException(e.getMessage());
        }
    }

    @GetMapping("/posts/sector/{sector}")
    public List<Post> getVacantPostBySector(@PathVariable(value = "sector") String sector){
        try {
            return vacantPostsService.getVacantPosts(sector, Category.TOUTES.name(), null);
        } catch (IOException e) {
            throw new InternalErrorException(e.getMessage());
        }
    }

    @GetMapping("/posts/sector/{sector}/category/{category}")
    public List<Post> getVacantPostBySectorAndCategory(@PathVariable(value = "sector") String sector,
                                                       @PathVariable(value = "category") String category){
        try {
            return vacantPostsService.getVacantPosts(sector, category, null);
        } catch (IOException e) {
            throw new InternalErrorException(e.getMessage());
        }
    }

    @GetMapping("/posts/sector/{sector}/category/{category}/keywords/{keywords}")
    public List<Post> getVacantPostBySectorByCategoryAndKeywords(@PathVariable(value = "sector") String sector,
                                                                 @PathVariable(value = "category") String category,
                                                                 @PathVariable(value = "keywords") List<String> keywords){
        try {
            return vacantPostsService.getVacantPosts(sector, category, keywords);
        } catch (IOException e) {
            throw new InternalErrorException(e.getMessage());
        }
    }
}
