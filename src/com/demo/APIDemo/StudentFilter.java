package com.demo.APIDemo;
@FunctionalInterface
public interface StudentFilter {
    boolean test(Student stu);
}
