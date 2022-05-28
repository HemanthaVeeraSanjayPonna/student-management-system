package com.prathyusha.studentmanagementsystem.controllers.impl;

import com.prathyusha.studentmanagementsystem.controllers.contract.User;
import com.prathyusha.studentmanagementsystem.dto.request.StudentMarksAddRequest;
import com.prathyusha.studentmanagementsystem.dto.response.StudentMarksAddResponse;
import com.prathyusha.studentmanagementsystem.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/students")
public class UserImpl implements User {

    @Autowired
    private final UserService userService;

    @Override
    @PostMapping(value = "/addMarks/{studentId}")
    public ResponseEntity<StudentMarksAddResponse> addStudentMarks(@PathVariable Long studentId, @RequestBody StudentMarksAddRequest studentMarksAddRequest) {
        return userService.addStudentMarks(studentId, studentMarksAddRequest);
    }

}
