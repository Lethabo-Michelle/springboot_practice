package org.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1,
                        "Lethabo",
                        "Monama",
                        "lethabo@gmail.com",
                        "Maths"
                ),
                new Student(
                        2,
                        "Lerato",
                        "Monama",
                        "lerato@gmail.com",
                        "English"
                ),
                new Student(
                        3,
                        "Lelo",
                        "Monama",
                        "lelo@gmail.com",
                        "Computer"
                )
        );
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        List<Student> students = getStudent();
        for(Student std: students){
            if(std.id() == id){
                return std;
            }
        }
        return null;
    }
}
