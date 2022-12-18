package com.mdbspringboot.controllers;

import com.mdbspringboot.models.ProjectItem;
import com.mdbspringboot.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {
    @Autowired
    ProjectRepository projectRepository;
    @GetMapping("/")
    public List<ProjectItem> getAll() {
        return new ArrayList<ProjectItem>(projectRepository.findAll());
    }

    @GetMapping("/post")
    public String newProject() {
        projectRepository.save(new ProjectItem("2", "DSNA-Visualiser", "Full Stack App that displays a data structure", new ArrayList<>()));
        return null;
    }

    @GetMapping("/delete")
    public String deleteProject(@RequestParam String id) {
        projectRepository.deleteById(id);
        return null;
    }

}
