package com.ultrapower.unite.verify.impl;

import com.alibaba.fastjson.JSONObject;
import com.ultrapower.unite.common.pojo.BomcIntefaceRequest;
import com.ultrapower.unite.common.util.JsonUtil;
import com.ultrapower.unite.verify.service.CheckHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基础校验
 */
public class JsonParseCheck extends CheckHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonParseCheck.class);

    @Override
    public BomcIntefaceRequest checkMessage(BomcIntefaceRequest bomcIntefaceRequest) {
        JSONObject jsonObject;
        String requestContentProvide = bomcIntefaceRequest.getRequestContentProvide();
        try {
            jsonObject = JsonUtil.toJson(requestContentProvide);
            bomcIntefaceRequest.setRequestContent(jsonObject.toString());
        }catch (Exception e) {
            LOGGER.error("基础校验异常，请检查报文是否符合json格式！",e);
            throw new RuntimeException("报文解析异常！请检查是否符合json格式。");
        }
        // 传递给下一步校验
        next(bomcIntefaceRequest);
        return bomcIntefaceRequest;
    }
}
