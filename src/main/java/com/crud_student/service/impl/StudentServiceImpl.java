package com.crud_student.service.impl;

import com.crud_student.VO.Department;
import com.crud_student.VO.ResponseTemplateVO;
import com.crud_student.enity.Student;
import com.crud_student.repository.StudentRepository;
import com.crud_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:9001/department/";

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public ResponseTemplateVO getStudentWithDepartment(int studentId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student = studentRepository.findById(studentId).get();
        vo.setStudent(student);

        Department department = restTemplate.getForObject(BASE_URL + student.getDepartmentId(), Department.class);
        vo.setDepartment(department);

        return vo;
    }
}
