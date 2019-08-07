package com.vb.service.impl;

import com.vb.entity.VBoxManager;
import com.vb.entity.VbResult;
import com.vb.service.VbManageService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class VbManageServiceImpl implements VbManageService {
    @Resource
    private VBoxManager vBoxManager;

    @Override
    public VbResult initVb(){
        VbResult vbResult  = new VbResult();
        return vbResult;
    }

    @Override
    public VbResult getVBoxVersion(){
        VbResult vbResult  = new VbResult();
        vbResult.setStatus(200);
        vbResult.setMsg(vBoxManager.getVbox().getVersion());
        return vbResult;
    }



}
