package com.mdbspringboot.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mdbspringboot.models.ProjectItem;
import com.mdbspringboot.repository.ProjectRepository;
import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class AppController {
    @Autowired
    ProjectRepository projectRepository;
    @GetMapping("/getAll")
    public List<ProjectItem> getAll() {
        return new ArrayList<ProjectItem>(projectRepository.findAll());
    }

    @RequestMapping("/post")
    public ProjectItem newProject(@RequestBody ProjectItem newProj) {
        try {
            return projectRepository.save(newProj);
        } catch (Exception e) {
            throw new MongoException("Failed to save project.");
        }
    }
    @DeleteMapping("/delete")
    public ProjectItem deleteProject(@RequestParam String id) {
    //http:link/delete?id=uuidHere
        if (projectRepository.findById(id).isPresent()) {
            ProjectItem projectToDelete = projectRepository.findById(id).get();
            projectRepository.delete(projectToDelete);
            return projectToDelete;
        } else {
            throw new MongoException("Project Not Found");
        }
    }

}
