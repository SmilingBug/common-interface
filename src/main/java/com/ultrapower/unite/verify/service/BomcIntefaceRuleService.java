package com.ultrapower.unite.verify.service;

import com.ultrapower.unite.common.pojo.BomcIntefaceRule;

import java.util.Map;

public interface BomcIntefaceRuleService {
    BomcIntefaceRule findBomcIntefaceRule(Map<String,Object> params);
}
