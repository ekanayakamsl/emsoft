package io.swagger.mapper;

import io.db.model.StudentEntry;
import io.db.repository.StudentRepository;
import io.swagger.model.Student;

public class StudentMaper {

    public static Student studentEntryToStudent(StudentEntry studentEntry){
        Student student = new Student(studentEntry.getRegId(),studentEntry.getFirstName(),studentEntry.getLastName(),
                null,studentEntry.getAge(),studentEntry.getGrade(),studentEntry._getMedium()
                ,null,null);
        return student;
    }

    public static StudentEntry studentToStudentEntry(Student student, StudentRepository studentRepository){
        StudentEntry studentEntry = new StudentEntry();

        studentEntry.setStudentId( 0 );
        studentEntry.setFirstName(student.getFirstName());
        studentEntry.setLastName(student.getLastName());
        studentEntry.setAge(student.getAge());
//        studentEntry.setDateOfBirth(student.getDateOfBirth());
        studentEntry.setGrade(student.getGrade());
        studentEntry.setMedium(student._getMedium());
        studentEntry.setRegId(student.getRegid());
        studentEntry.setSchoolSchoolId(Integer.parseInt( student.getSchool().getSchid()));
        return studentEntry;
    }
}
