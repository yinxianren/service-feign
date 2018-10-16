package com.yinxianren.study.servicefeign.controller;

import com.yinxianren.study.servicefeign.feigninterface.HiSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @Autowired
    private HiSend hiSend;

    /**
     *  http://localhost:8101/hi?name=forezp
     * @param name
     * @return
     */

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value="name") String name){
        return hiSend.saiHiFromClientOne(name);
    }


}
