package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;

/**
 * Created by student on 6/21/17.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private SignupRepo signupRepo;

    @RequestMapping("/")
    public String start(Model model){
        model.addAttribute("signup", new Signup());
        return "getData";
    }

    @PostMapping("/next")
    public String done(@ModelAttribute Signup signup, Model model){
        signupRepo.save(signup);
        Iterable<Signup> values = signupRepo.findAll();
        /*String returnVal = "";
        Signup holder = values.iterator().next();
        while(holder != null) {
           returnVal += holder.getName() + " " + holder.getThing() + "/n";
           holder = values.iterator().next();
        }*/
        model.addAttribute("values", values);
        return "getData";
    }
}
