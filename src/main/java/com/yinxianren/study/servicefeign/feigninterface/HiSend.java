package com.yinxianren.study.servicefeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(value="SERVICE-PROVIDER",fallback =HiSendImpl.class)
public interface HiSend {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
   String  saiHiFromClientOne(@RequestParam(value="name") String name);

}
