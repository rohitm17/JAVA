package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Courses;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    List<Courses> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Courses(123, "Core Java", "Contains basics of Java"));
        list.add(new Courses(143, "Core Spring", "Contains basics of Spring"));

    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for (Courses corse : list) {
            if (corse.getId() == courseId) {
                c = corse;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses) {

        list.add(courses);
        return courses;

    }

}
