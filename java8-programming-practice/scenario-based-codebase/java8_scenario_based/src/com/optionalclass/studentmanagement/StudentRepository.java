package com.optionalclass.studentmanagement;

import java.util.*;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(1, "Rahul", "rahul@gmail.com", null, "Delhi", "Rocky"));
        students.add(new Student(2, "Aryan", null, "99999998769", null, null));
    }

    public Optional<Student> findById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }
}

