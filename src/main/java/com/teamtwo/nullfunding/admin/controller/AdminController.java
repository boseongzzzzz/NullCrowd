package com.teamtwo.nullfunding.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/inquiry")
    public ModelAndView adminInquiry(ModelAndView mv) {

        mv.setViewName("content/admin/inquiry");

        return mv;
    }
}