package com.zerobase.fastlms;

// MainPage class 생성 목적
// 맵핑하기 위해서
// (논리적) 주소와 (물리적) 파일을 맵핑

// http://www.naver.com/news/list.do
// 하나의 주소에 대해서
// 어디서? 누가?
// 후보군 : 클래스, 속성, 메소드

// http://localhost:8080/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    // Spring -> MVC (View -> 템플릿엔진을 통해 화면에 내용을 출력)
    // .NET -> MVC (View -> 출력)
    // python django -> MTV(Template -> 화면출력)
    // V -> HTML == webpage
    // V -> json == API

    // request : web > server
    // response : server > web

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> " +
                "<p>fastlms website!</p>" +
                "<p> 안녕하세요! </p>" +
                "</body>" +
                "<html>";

        printWriter.write(msg);
        printWriter.close();

    }

}
