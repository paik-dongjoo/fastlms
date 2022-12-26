package com.zerobase.fastlms.main.controller;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.service.BannerService;
import com.zerobase.fastlms.component.MailComponents;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

//    private final MailComponents mailComponents;
    private final BannerService bannerService;

    @RequestMapping("/")
    public String index(Model model){
        List<BannerDto> list = bannerService.frontList();
        model.addAttribute("list", list);

        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied(){

        return "error/denied";
    }
}
