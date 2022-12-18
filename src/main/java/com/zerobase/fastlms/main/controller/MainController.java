package com.zerobase.fastlms.main.controller;

// MainPage class 생성 목적
// 맵핑하기 위해서
// (논리적) 주소와 (물리적) 파일을 맵핑

// http://www.naver.com/news/list.do
// 하나의 주소에 대해서
// 어디서? 누가?
// 후보군 : 클래스, 속성, 메소드

// http://localhost:8080/

import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/")
    public String index() {

//        String email = "d5ngjoo@naver.com";
//        String subject = "안녕하세요. 제로베이스 입니다.";
//        String text = "<p>안녕하세요.</p>" +
//                "<p>반갑습니다.</p>";
//
//        mailComponents.sendMail(email, subject, text);

        return "index";
    }

    // Spring -> MVC (View -> 템플릿엔진을 통해 화면에 내용을 출력)
    // .NET -> MVC (View -> 출력)
    // python django -> MTV(Template -> 화면출력)
    // V -> HTML == webpage
    // V -> json == API

    // request : web > server
    // response : server > web

    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }
}
