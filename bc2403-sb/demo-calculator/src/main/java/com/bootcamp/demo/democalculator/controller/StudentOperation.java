package com.bootcamp.demo.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.democalculator.model.Student;

public interface StudentOperation {

 @GetMapping(value = "/students/add")
 List<Student> add(int studentId, String name);

 @GetMapping(value = "/students")

 List<Student> getAll();

 @GetMapping(value = "/students/remove")
 List<Student> remove(String name);

 @GetMapping(value = "/students/ids")
  int[] getAllIds();

 @GetMapping(value = "/students/name")
 List<Student> getStudentByName(String name);
}
