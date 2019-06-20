package com.ultrapower.unite.common.pojo;

import com.ultrapower.unite.common.util.UUIDGenerator;

import java.util.Date;

/**
 * 请求封装类
 */
public class BomcIntefaceRequest {

    private String pid;
    private String intefaceMethordName;
    private String wfId;
    private String wfName;
    private String outSystem;
    private String outSystemName;
    private String wfStep;
    private String wfStepDesc;
    private String isFristRequest;
    private String requestContentProvide;
    private String requestContent;
    private int runCount;
    private int runResult;
    private String erroDesc;
    private String erroDetail;
    private String orderSn;
    private String sysOrderSn;
    private String isSendMq;
    private Date createTime;
    private Date dealTime;

    /** default constructor */
    public BomcIntefaceRequest() {
        this.pid = UUIDGenerator.getUUIDoffSpace();
        this.createTime = new Date();
        this.isSendMq = "N";
        this.runCount = 0;
        this.runResult = 0;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIntefaceMethordName() {
        return intefaceMethordName;
    }

    public void setIntefaceMethordName(String intefaceMethordName) {
        this.intefaceMethordName = intefaceMethordName;
    }

    public String getWfId() {
        return wfId;
    }

    public void setWfId(String wfId) {
        this.wfId = wfId;
    }

    public String getWfName() {
        return wfName;
    }

    public void setWfName(String wfName) {
        this.wfName = wfName;
    }

    public String getOutSystem() {
        return outSystem;
    }

    public void setOutSystem(String outSystem) {
        this.outSystem = outSystem;
    }

    public String getOutSystemName() {
        return outSystemName;
    }

    public void setOutSystemName(String outSystemName) {
        this.outSystemName = outSystemName;
    }

    public String getWfStep() {
        return wfStep;
    }

    public void setWfStep(String wfStep) {
        this.wfStep = wfStep;
    }

    public String getWfStepDesc() {
        return wfStepDesc;
    }

    public void setWfStepDesc(String wfStepDesc) {
        this.wfStepDesc = wfStepDesc;
    }

    public String getIsFristRequest() {
        return isFristRequest;
    }

    public void setIsFristRequest(String isFristRequest) {
        this.isFristRequest = isFristRequest;
    }

    public String getRequestContentProvide() {
        return requestContentProvide;
    }

    public void setRequestContentProvide(String requestContentProvide) {
        this.requestContentProvide = requestContentProvide;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getRunCount() {
        return runCount;
    }

    public void setRunCount(int runCount) {
        this.runCount = runCount;
    }

    public int getRunResult() {
        return runResult;
    }

    public void setRunResult(int runResult) {
        this.runResult = runResult;
    }

    public String getErroDesc() {
        return erroDesc;
    }

    public void setErroDesc(String erroDesc) {
        this.erroDesc = erroDesc;
    }

    public String getErroDetail() {
        return erroDetail;
    }

    public void setErroDetail(String erroDetail) {
        this.erroDetail = erroDetail;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getSysOrderSn() {
        return sysOrderSn;
    }

    public void setSysOrderSn(String sysOrderSn) {
        this.sysOrderSn = sysOrderSn;
    }

    public String getIsSendMq() {
        return isSendMq;
    }

    public void setIsSendMq(String isSendMq) {
        this.isSendMq = isSendMq;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}
