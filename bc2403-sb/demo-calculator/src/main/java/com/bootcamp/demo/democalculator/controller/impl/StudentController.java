package com.bootcamp.demo.democalculator.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.democalculator.controller.StudentOperation;
import com.bootcamp.demo.democalculator.model.Student;

@Controller
@ResponseBody
public class StudentController implements StudentOperation {
  // API: add student (URL -> id name)
  // API: get student List
  // API: remove student by student name
  // API: get all student id
  // API: get Student by Student name

  @Override
  public List<Student> add(@RequestParam int studentId,
      @RequestParam String name) {
    Student.studentsDB.add(new Student(studentId, name));
    return Student.studentsDB;
  }

  @Override
  public List<Student> getAll() {
    return Student.studentsDB;
  }

  @Override
  public List<Student> remove(@RequestParam String name) {
    if (name == null) {
      return null;
    }
    List<Student> studentToBeRemove = new ArrayList<>();
    for (Student s : Student.studentsDB) {
      if (name.equals(s.getName()))
        studentToBeRemove.add(s);
    }
    return Student.studentsDB.removeAll(studentToBeRemove) ? studentToBeRemove
        : null;
  }

  @Override
  public int[] getAllIds() {
    return Student.studentsDB.stream()//
        .mapToInt(e -> e.getStudentId())//
        .toArray();
  }

  @Override
  public List<Student> getStudentByName(String name) {
    List<Student> studentsFound = new ArrayList<>();
    for (Student s : Student.studentsDB) {
      if (name.equals(s.getName()))
        studentsFound.add(s);
    }
    return Student.studentsDB.addAll(studentsFound) ? studentsFound : null;
  }
}
