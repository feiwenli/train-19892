package io.choerodon.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrController {

    @Value("${number}")
    private String number;

    @Value("${name}")
    private String name;

//    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
//    @ApiOperation(value = "demo")
    @GetMapping("/hello")
    public String test01(){
        return "Hello, "+number+", "+name;
    }
}
