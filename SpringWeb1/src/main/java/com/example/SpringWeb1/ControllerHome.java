package com.example.SpringWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHome {

    @RequestMapping("/")
    public String home()
    {
        System.out.print("home method called");
        return "index";
    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
//
//        int result = num1 + num2;
//        mv.addObject("result",result);
//        mv.setViewName("result");
//
//        return mv;
//    }


//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//
//        return mv;
//    }
    @ModelAttribute("course")
    public String addCourse()
    {
        return "java";
    }
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien)
    {
        return "result";
    }

}
