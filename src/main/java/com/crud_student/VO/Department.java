package com.crud_student.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int id;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
