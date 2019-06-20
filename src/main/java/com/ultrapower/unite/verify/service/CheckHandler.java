package com.ultrapower.unite.verify.service;

import com.ultrapower.unite.common.pojo.BomcIntefaceRequest;

public abstract class CheckHandler {

    // 后续校验器
    protected CheckHandler checkHandler;

    public abstract BomcIntefaceRequest checkMessage(BomcIntefaceRequest bomcIntefaceRequest);

    protected final void next(BomcIntefaceRequest bomcIntefaceRequest){
        if(this.checkHandler != null){
            this.checkHandler.checkMessage(bomcIntefaceRequest);
        }
    }

    public void setCheckHandler(CheckHandler checkHandler) {
        this.checkHandler = checkHandler;
    }
}
