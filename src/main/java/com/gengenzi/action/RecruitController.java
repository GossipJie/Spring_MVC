package com.gengenzi.action;

import com.gengenzi.dao.ResponseVO;
import com.gengenzi.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/recruit")
public class RecruitController {
    @Autowired
    private RecruitService recruitService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO getAllInterviewer() {
        /*ResponseVO res = new ResponseVO();
        res.setCode(1000);
        res.setMsg("test");
        res.setObj("");*/
        return recruitService.getInterviewerList();
    }
}
