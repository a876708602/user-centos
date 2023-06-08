package com.zjq.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张建起
 */
@RestController
public class TestApi {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
