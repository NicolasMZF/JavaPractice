package com.example.java_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @PostMapping("/submitForm")
    public ModelAndView handleFormSubmission(@RequestParam("client") String client,
                                             @RequestParam("service") String service,
                                             @RequestParam("key") String key,
                                             @RequestParam("model") String model ) {
        ModelAndView modelAndView = new ModelAndView("resultados");
        modelAndView.addObject("client", client);
        modelAndView.addObject("service", service);
        modelAndView.addObject("key", key);
        modelAndView.addObject("model", model);
        return modelAndView;
    }
}
