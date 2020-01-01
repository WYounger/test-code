package com.young.dubbo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu implements Serializable {
    private static final long serialVersionUID = 12345678L;
    private String name;
    private int age;
}
