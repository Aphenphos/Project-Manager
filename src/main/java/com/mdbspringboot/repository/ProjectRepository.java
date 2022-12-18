package com.mdbspringboot.repository;

import com.mdbspringboot.models.ProjectItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ProjectRepository extends MongoRepository<ProjectItem, String> {
    @Query("{name:'?0'}")
    ProjectItem findProjectByName(String name);


}
