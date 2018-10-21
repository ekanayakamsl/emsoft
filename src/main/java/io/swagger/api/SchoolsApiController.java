package io.swagger.api;

import io.swagger.db.model.SchoolEntry;
import io.swagger.db.repository.SchoolRepository;
import io.swagger.mapper.SchoolMaper;
import io.swagger.model.School;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

@Controller
public class SchoolsApiController implements SchoolsApi {

    private static final Logger log = LoggerFactory.getLogger(SchoolsApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    private final SchoolRepository schoolRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public SchoolsApiController(ObjectMapper objectMapper, HttpServletRequest request, SchoolRepository schoolRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.schoolRepository = schoolRepository;
    }

    public ResponseEntity<School> schoolsPost(@ApiParam(value = "School details" ,required=true )  @Valid @RequestBody School school) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            try {
                SchoolEntry schoolEntry = schoolRepository.save(SchoolMaper.schoolToSchoolEntry(school));
                School school1 = SchoolMaper.schoolEntryToSchool(schoolEntry);
                return new ResponseEntity<School>(objectMapper.readValue(school.toString(), School.class), HttpStatus.NOT_IMPLEMENTED);
//                return new ResponseEntity<School>(objectMapper.readValue("{  \"schid\" : \"schid\",  \"address\" : \"address\",  \"name\" : \"name\",  \"phoneNo\" : [ \"phoneNo\", \"phoneNo\" ]}", School.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<School>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<School>(HttpStatus.NOT_IMPLEMENTED);
    }

}
