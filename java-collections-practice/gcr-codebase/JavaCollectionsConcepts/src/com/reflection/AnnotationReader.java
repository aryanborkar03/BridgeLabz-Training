package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Aryan Borkar")
class Book {}

public class AnnotationReader {
    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println(a.name());
    }
}
