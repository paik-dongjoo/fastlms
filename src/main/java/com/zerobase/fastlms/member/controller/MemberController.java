package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/register")
    public String register() {
        return "/member/register";
    }

    // request : WEB > SERVER
    // response : SERVER > WEB
    @PostMapping("/member/register")
    public String registerSubmit(Model model,
                                 HttpServletRequest request,
                                 MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }

    // http://www.naver.com/news/list.do?쿼리스트링(파라미터)
    // https://www.naver.com/com/cafe/detail.do?id=1111&text=query
    // https://www.naver.com/com/cafe/detail.do?id=2222
    // 프로토콜://도메인(IP)/news/

    @GetMapping("/member/email-auth")
    public String emailAuth(Model model, HttpServletRequest request) {

        String uuid = request.getParameter("id");

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result);

        return "member/email_auth";

    }

}
