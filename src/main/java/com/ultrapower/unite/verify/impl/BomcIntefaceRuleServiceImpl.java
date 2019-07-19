package com.ultrapower.unite.verify.impl;

import com.ultrapower.unite.common.mapper.BomcIntefaceRuleMapper;
import com.ultrapower.unite.common.pojo.BomcIntefaceRule;
import com.ultrapower.unite.verify.service.BomcIntefaceRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BomcIntefaceRuleServiceImpl implements BomcIntefaceRuleService {

    @Autowired
    private BomcIntefaceRuleMapper bomcIntefaceRuleMapper;

    @Override
    public BomcIntefaceRule findBomcIntefaceRule(Map<String, Object> params) {
        return bomcIntefaceRuleMapper.findBomcIntefaceRule(params);
    }
}
