package com.crud_student.controller;

import com.crud_student.VO.ResponseTemplateVO;
import com.crud_student.enity.Student;
import com.crud_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);
    }

//    ratelimiter
    @GetMapping("/ratelimiter/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") int studentId) {
        return studentService.getStudentWithDepartment(studentId);
    }

//    Timeout ratelimiter
    @GetMapping("/ratelimiter/timeout/{id}")
    public ResponseTemplateVO getStudentWithDepartmentTimeut(@PathVariable("id") int studentId) {
        return studentService.getStudentWithDepartmentTimeout(studentId);
    }

}
