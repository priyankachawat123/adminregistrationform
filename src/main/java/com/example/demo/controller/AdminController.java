package com.example.demo.controller;
import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/form")
    public String showAdminForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin-form";
    }

    @PostMapping("/save")
    public String saveAdmin(
            @ModelAttribute("admin") Admin admin,
            @RequestParam("cvFile") MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            try {
                admin.setCv(file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                return "error-page"; // Handle error gracefully
            }
        }
        adminService.saveAdmin(admin);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listAdmins(Model model) {
        model.addAttribute("admins", adminService.getAllAdmins());
        return "admin-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable("id") Long id) {
        adminService.deleteAdmin(id);
        return "redirect:/list";
    }
}
