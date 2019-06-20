package com.ultrapower.unite.verify.impl;

import com.alibaba.fastjson.JSONObject;
import com.ultrapower.unite.common.pojo.BomcIntefaceRequest;
import com.ultrapower.unite.common.pojo.exception.MessageCheckException;
import com.ultrapower.unite.common.util.JsonUtil;
import com.ultrapower.unite.common.util.StringUtil;
import com.ultrapower.unite.verify.service.CheckHandler;

import java.util.HashSet;
import java.util.Set;

public class BaseRequireCheck extends CheckHandler {

    private static final Set<String> baseRequireField = new HashSet<String>();

    static {
        baseRequireField.add("wfId");
        baseRequireField.add("outSystem");
        baseRequireField.add("wfStep");
        baseRequireField.add("sysOrderSn");
    }

    @Override
    public BomcIntefaceRequest checkMessage(BomcIntefaceRequest bomcIntefaceRequest) {
        JSONObject jsonObject;
        String requestContent = bomcIntefaceRequest.getRequestContent();
        if (StringUtil.isEmpty(requestContent)) {
            throw new MessageCheckException("入库报文解析失败。");
        }
        jsonObject = JsonUtil.toJson(requestContent);
        for (String value : baseRequireField) {
            if(!jsonObject.containsKey(value)) {
                throw new MessageCheckException(value + "为必输字段。");
            }else {
                if (StringUtil.isEmpty(value)) {
                    throw new MessageCheckException(value + "不能为空。");
                }
            }
        }
        return null;
    }
}
