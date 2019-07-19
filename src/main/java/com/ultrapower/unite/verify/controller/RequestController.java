package com.ultrapower.unite.verify.controller;

import com.ultrapower.unite.common.pojo.BomcIntefaceRequest;
import com.ultrapower.unite.common.pojo.result.MessageResult;
import com.ultrapower.unite.common.pojo.result.ReturnCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestController.class);

    @RequestMapping("/json")
    public MessageResult commonRequestJsonFun(String requestJson) {
        MessageResult messageResult = new MessageResult();
        BomcIntefaceRequest bomcIntefaceRequest = new BomcIntefaceRequest();
        bomcIntefaceRequest.setRequestContentProvide(requestJson);
        bomcIntefaceRequest.setIntefaceMethordName("commonRequestJsonFun");

        //调用校验器链进行系列校验
        try {
            messageResult.setCode(ReturnCode.SUCCESS.getCode());
            messageResult.setMsg(ReturnCode.SUCCESS.getMsg());
            messageResult.setSuccess(true);
        }catch (Exception e){
            messageResult.setCode(ReturnCode.CHECKFAILURE.getCode());
            messageResult.setMsg(e.getMessage());
            messageResult.setSuccess(false);
            LOGGER.debug(e.getMessage(),e);
        }

        return messageResult;
    }
}
