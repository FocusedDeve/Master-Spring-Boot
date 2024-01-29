package projet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projet.web.models.LoginModel;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/")
    public String showLogin(Model model)
    {
        model.addAttribute("loginModel", new LoginModel());
        return "loginForm";
    }


        @PostMapping("/processLogin")
        public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
            if (bindingResult.hasErrors()) {
                model.addAttribute("loginModel", loginModel);
                return "loginForm";

            }


            model.addAttribute("loginModel", loginModel);
            return "loginResult";
        }

        }
