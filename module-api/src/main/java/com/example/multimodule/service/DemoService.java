package com.example.multimodule.service;

import com.example.multimodule.enums.CodeEnum;
import com.example.multimodule.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }

    public String exception() {

        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }

        return "exception";
    }
}
