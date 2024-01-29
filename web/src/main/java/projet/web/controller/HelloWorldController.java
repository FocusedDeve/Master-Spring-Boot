package projet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/test1")
    @ResponseBody
    //return a string from a test url
            public String printHello(){
            return "test with the annotation responsebody";
    }
    @GetMapping("/test2")
    //return a string from a tesT page create in template
    public String showHello(){
        return "helllo";
    }

    @GetMapping("/test3")
    /*return a string from a tesT page create in template but here we'll add a Model
    we can subtitute the message in the template here by add new message
    */
    public String showHelloPage(Model model){
        model.addAttribute("message", "test Passed");
        model.addAttribute("rating", "899");
        return "helllo";
    }

    @GetMapping("/test4")
    /* now let try with model VIew Object
    */
    public ModelAndView showHelloPag(Model model){
        ModelAndView mv= new ModelAndView();
        mv.addObject("message", "test Passed");
        mv.addObject("rating", "899");
        mv.setViewName("helllo");
        return mv;
    }
    @GetMapping("/test5")
    /*here in this function we'are going to use requestParam  annotation
    we use it when we need to add a parameter in the browser before wiew the page content
    */
    public String showHeloPage(@RequestParam("message") String message , Model model){
        model.addAttribute("message", message);
        model.addAttribute("rating", "899");
        model.addAttribute("report", "this report will be the best");

        return "helllo";
    }

}
