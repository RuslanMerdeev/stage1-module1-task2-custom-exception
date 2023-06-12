package com.epam.mjc;


import com.epam.mjc.exception.StudentNotFoundException;

import java.util.Objects;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    try {
      return Objects.requireNonNull(Student.getValueOf(studentID));
    } catch (Exception ex) {
      throw new StudentNotFoundException(studentID, ex);
    }
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }

  }
}