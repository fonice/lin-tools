package com.fo.service.admin.controller;

import com.fo.server.dto.ResponseDto;
import com.fo.server.exception.ValidatorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class ControllerExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);
    @ExceptionHandler(value = ValidatorException.class)
    @ResponseBody
    public ResponseDto validatorExceptionHandler(ValidatorException validatorException) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setSuccess(false);
        LOG.warn(validatorException.getMessage());
        responseDto.setMessage("请求参数异常！");
        return responseDto;
    }
}
