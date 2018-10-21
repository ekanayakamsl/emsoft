package io.swagger.mapper;

import io.db.model.SchoolEntry;
import io.swagger.model.School;

public class SchoolMaper {

    public static SchoolEntry schoolToSchoolEntry(School school) {
        SchoolEntry schoolEntry = new SchoolEntry(school.getName(), school.getAddress(), school._getPhoneNoString());
        schoolEntry.setSchoolId(0);
        return schoolEntry;
    }

    public static School schoolEntryToSchool(SchoolEntry schoolEntry) {
        return new School(schoolEntry.getSchoolId() + "", schoolEntry.getNeme(), schoolEntry._getTelephoneNoList(), schoolEntry.getAddress());
    }
}
