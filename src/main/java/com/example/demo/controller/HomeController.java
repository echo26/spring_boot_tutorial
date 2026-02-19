package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;
import com.example.demo.service.homeService;

@Controller
public class HomeController {

    @Autowired
    private homeService homeService;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/memberList")
    public String memberList(Model model) {
        List<Member> memberList = homeService.memberList();
        System.out.println("here");
        System.out.println(memberList);
        model.addAttribute("memberList", memberList);
        return "memberList";
    }
}
