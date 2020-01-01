package com.young.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.young.dubbo.api.model.Stu;
import com.young.dubbo.api.service.IGetStu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {

    @Reference
    IGetStu stuService;

    @GetMapping("/test/{name}/{age}")
    public Stu getStu(@PathVariable("name") String name,@PathVariable("age") int age){
        return stuService.getStu(name,age);
    }
}
