package com.briup.cms.web;

import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class SecurityController {

    @GetMapping("/authentication/form")
    public Message logg(){
        return MessageUtil.error(403,"  请先登录以后进行操作");
    }
}
