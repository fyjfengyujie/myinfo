package com.phicomm.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/info")
public class InfoController {

    @GetMapping("/index")
    @ResponseBody
    public String getIndex(){

        return "hello fengyujie,you are success!";
    }
}
