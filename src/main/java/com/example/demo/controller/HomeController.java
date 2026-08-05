package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", " โย่ ปกรณ์เกียรติ ศรีจันทร์");
        model.addAttribute("studentId", "(รหัส 673380045-2)");
        return "home"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("about", "สวัสดีครับ มาจาก cs");
        return "about"; 
    }
}