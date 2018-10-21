package io.swagger.api;

import io.db.model.StudentEntry;
import io.db.repository.StudentRepository;
import io.swagger.mapper.StudentMaper;
import io.swagger.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

@Controller
public class StudentsApiController implements StudentsApi {

    private static final Logger log = LoggerFactory.getLogger(StudentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final StudentRepository studentRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentsApiController(ObjectMapper objectMapper, HttpServletRequest request, StudentRepository studentRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<Student> studentsPost(@ApiParam(value = "Student details" ,required=true )  @Valid @RequestBody Student student) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            try {
                StudentEntry studentEntry = StudentMaper.studentToStudentEntry(student, studentRepository);
                studentEntry = studentRepository.save(studentEntry);
                studentEntry.setRegId("G"+studentEntry.getGrade()+"R"+studentEntry.getStudentId());
                studentRepository.save(studentEntry);
                return new ResponseEntity<Student>(StudentMaper.studentEntryToStudent(studentEntry), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentsRegidGet(@ApiParam(value = "The student's registration id",required=true) @PathVariable("regid") String regid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"parent\" : [ {    \"address\" : \"address\",    \"name\" : \"name\",    \"prid\" : \"prid\",    \"phoneNo\" : [ \"phoneNo\", \"phoneNo\" ]  }, {    \"address\" : \"address\",    \"name\" : \"name\",    \"prid\" : \"prid\",    \"phoneNo\" : [ \"phoneNo\", \"phoneNo\" ]  } ],  \"school\" : {    \"schid\" : \"schid\",    \"address\" : \"address\",    \"name\" : \"name\",    \"phoneNo\" : [ \"phoneNo\", \"phoneNo\" ]  },  \"grade\" : 6,  \"regid\" : \"regid\",  \"dateOfBirth\" : \"2000-01-23\",  \"medium\" : \"SINHALA\",  \"age\" : 0}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

}
