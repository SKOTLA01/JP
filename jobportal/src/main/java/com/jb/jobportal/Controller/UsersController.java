package com.jb.jobportal.Controller;

import com.jb.jobportal.entity.UserType;
import com.jb.jobportal.entity.Users;
import com.jb.jobportal.services.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {
    private final UserTypeService userTypeService;
    @Autowired
    public  UsersController(UserTypeService userTypeService){
        this.userTypeService=userTypeService;
    }
    @GetMapping("/register")
    public String register(Model model){
        List<UserType> userTypes=userTypeService.getAll();
        model.addAttribute("getAllTypes",userTypes);
        model.addAttribute("user", new Users());
        return "register";

    }
}
