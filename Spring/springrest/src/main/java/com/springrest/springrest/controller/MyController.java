package com.springrest.springrest.controller;

import java.util.List;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    // getCourses page
    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId) {

        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses) {

        return this.courseService.addCourse(courses);
    }
}
