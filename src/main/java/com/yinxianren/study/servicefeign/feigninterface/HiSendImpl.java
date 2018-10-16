package com.yinxianren.study.servicefeign.feigninterface;


import org.springframework.stereotype.Component;

@Component
public class HiSendImpl implements HiSend {
    @Override
    public String saiHiFromClientOne(String name) {
        return  "HiSendFallbackFactory 异常!";
    }


}
