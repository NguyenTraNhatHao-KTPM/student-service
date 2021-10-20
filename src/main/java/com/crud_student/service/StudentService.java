package com.crud_student.service;

import com.crud_student.VO.ResponseTemplateVO;
import com.crud_student.enity.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public ResponseTemplateVO getStudentWithDepartment (int studentId);
    public ResponseTemplateVO getStudentWithDepartmentTimeout (int studentId);
}
