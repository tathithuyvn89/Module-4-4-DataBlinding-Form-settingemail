package myapp.controller;

import myapp.model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    @GetMapping("/")
    public String settingMailPage(Model model) {
        model.addAttribute("emailSetting", new EmailSetting());
        return "setting";
    }

    @PostMapping("updateSuccess")
    public ModelAndView settingSuccess(@ModelAttribute("emailSetting") EmailSetting emailSetting, BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("setting");
        } else {
            ModelAndView modelAndView = new ModelAndView("updatechange");
            modelAndView.addObject("emailSetting", emailSetting);
            return modelAndView;


        }
    }
    @ModelAttribute
    public void commonData(Model model){
        model.addAttribute("headerMessage","Wellcome to CodeGym");
        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("VietNamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        model.addAttribute("languageList",languageList);
        List<Integer> pageList = new ArrayList<>();
        pageList.add(5);
        pageList.add(10);
        pageList.add(15);
        pageList.add(20);
        model.addAttribute("pageList",pageList);
    }


}

