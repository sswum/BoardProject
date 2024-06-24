package org.choongang.main.controllers;

import org.choongang.global.config.annotations.Controller;
import org.choongang.global.config.annotations.GetMapping;
import org.choongang.global.config.annotations.RequestMapping;

@Controller //애노테이션 컨트롤러로 관리되는 객체가 됨
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index() {
        return "main/index";
    }

}
