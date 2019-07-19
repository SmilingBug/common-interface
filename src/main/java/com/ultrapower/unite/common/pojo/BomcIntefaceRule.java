package com.ultrapower.unite.common.pojo;

public class BomcIntefaceRule {
    private String pid;
    private String wfId;
    private String outSystem;
    private String wfStep;
    private String checkRule;
    private String callPluginsUrl;
    private String checkType;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getWfId() {
        return wfId;
    }

    public void setWfId(String wfId) {
        this.wfId = wfId;
    }

    public String getOutSystem() {
        return outSystem;
    }

    public void setOutSystem(String outSystem) {
        this.outSystem = outSystem;
    }

    public String getWfStep() {
        return wfStep;
    }

    public void setWfStep(String wfStep) {
        this.wfStep = wfStep;
    }

    public String getCheckRule() {
        return checkRule;
    }

    public void setCheckRule(String checkRule) {
        this.checkRule = checkRule;
    }

    public String getCallPluginsUrl() {
        return callPluginsUrl;
    }

    public void setCallPluginsUrl(String callPluginsUrl) {
        this.callPluginsUrl = callPluginsUrl;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
}
