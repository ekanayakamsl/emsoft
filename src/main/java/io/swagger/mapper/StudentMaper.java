package io.swagger.mapper;

import io.swagger.db.model.StudentEntry;
import io.swagger.model.Student;

public class StudentMaper {

    public static Student studentToStudentEntry(StudentEntry studentEntry){
        Student student = new Student();
        return student;
    }

    public static StudentEntry studentEntryToStudent(Student student){
        StudentEntry studentEntry = new StudentEntry();

        studentEntry.setStudentId(0);
        studentEntry.setFirstName(student.getFirstName());
        studentEntry.setLastName(student.getLastName());
        studentEntry.setAge(student.getAge());
//        studentEntry.setDateOfBirth(student.getDateOfBirth());
        studentEntry.setGrade(student.getGrade());
//        studentEntry.setMedium(student.getMedium());
        studentEntry.setRegId(student.getRegid());
        return studentEntry;
    }
}
