package com.jsyeo.dailydevcafe.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostApiController {

    @GetMapping("/posts")
    public String posts() {
        return "ok";
    }
}
