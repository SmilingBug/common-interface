package com.ultrapower.unite.verify.impl;

import com.alibaba.fastjson.JSONObject;
import com.ultrapower.unite.common.pojo.BomcIntefaceRequest;
import com.ultrapower.unite.common.pojo.BomcIntefaceRule;
import com.ultrapower.unite.common.util.JsonUtil;
import com.ultrapower.unite.verify.service.BomcIntefaceRuleService;
import com.ultrapower.unite.verify.service.CheckHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class BizRequireCheck extends CheckHandler {

    @Autowired
    private BomcIntefaceRuleService bomcIntefaceRuleService;

    @Override
    public BomcIntefaceRequest checkMessage(BomcIntefaceRequest bomcIntefaceRequest) {
        JSONObject jsonObject;
        String requestContent = bomcIntefaceRequest.getRequestContent();
        jsonObject = JsonUtil.toJson(requestContent);

        // 查询所配置的校验规则
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("wfId",jsonObject.get("wfId"));
        params.put("outSystem",jsonObject.get("outSystem"));
        params.put("wfStep",jsonObject.get("wfStep"));
        params.put("checkType",1);
        BomcIntefaceRule bomcIntefaceRule = bomcIntefaceRuleService.findBomcIntefaceRule(params);

        return null;
    }

    private void checkBizFieldByRules() {

    }
}
