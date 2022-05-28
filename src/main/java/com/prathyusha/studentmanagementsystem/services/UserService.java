package com.prathyusha.studentmanagementsystem.services;

import com.prathyusha.studentmanagementsystem.dto.request.StudentMarksAddRequest;
import com.prathyusha.studentmanagementsystem.dto.response.StudentMarksAddResponse;
import com.prathyusha.studentmanagementsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<StudentMarksAddResponse> addStudentMarks(Long studentId, StudentMarksAddRequest studentMarksAddRequest){
        System.out.println(studentMarksAddRequest);
        System.out.println(studentId);

    return null;
    }
}
