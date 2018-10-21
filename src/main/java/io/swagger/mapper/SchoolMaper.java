package io.swagger.mapper;

import io.swagger.db.model.SchoolEntry;
import io.swagger.model.School;

public class SchoolMaper {

    public static SchoolEntry schoolToSchoolEntry(School school) {
        SchoolEntry schoolEntry = new SchoolEntry(school.getName(), school.getAddress(), school.getPhoneNoString());
        return schoolEntry;
    }

    public static School schoolEntryToSchool(SchoolEntry schoolEntry) {
        return new School(schoolEntry.getSchoolId() + "" , schoolEntry.getNeme() , schoolEntry.getTelephoneNoList(), schoolEntry.getAddress());
    }
}
