package com.zerobase.fastlms.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MemberController {

    @GetMapping("/member/register")
    public String register() {
        return "/member/register";
    }

    // request : WEB > SERVER
    // response : SERVER > WEB
    @PostMapping("/member/register")
    public String registerSubmit(HttpServletRequest request,
                                 HttpServletResponse response,
                                 MemberInput memberInput) {

        System.out.println(memberInput.toString());

        return "member/register";
    }

}
