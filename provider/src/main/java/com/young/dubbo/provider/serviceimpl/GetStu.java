package com.young.dubbo.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.dubbo.api.model.Stu;
import com.young.dubbo.api.service.IGetStu;
import org.springframework.stereotype.Component;

@Service
@Component
public class GetStu implements IGetStu {
    @Override
    public Stu getStu(String name, int age) {
        return new Stu(name,age);
    }
}
