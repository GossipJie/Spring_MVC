package com.gengenzi.service.impl;

import com.gengenzi.dao.ResponseVO;
import com.gengenzi.service.RecruitService;
import org.springframework.stereotype.Service;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Override
    public ResponseVO getInterviewerList() {
        ResponseVO res = new ResponseVO();
        res.setCode(1000);
        res.setMsg("test");
        res.setObj("");
        return res;
    }
}
