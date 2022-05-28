package com.prathyusha.studentmanagementsystem.controllers.contract;

import com.prathyusha.studentmanagementsystem.dto.request.StudentMarksAddRequest;
import com.prathyusha.studentmanagementsystem.dto.response.StudentMarksAddResponse;
import org.springframework.http.ResponseEntity;

public interface User {

    ResponseEntity<StudentMarksAddResponse> addStudentMarks(Long studentId, StudentMarksAddRequest studentMarksAddRequest);

}
