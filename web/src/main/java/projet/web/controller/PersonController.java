package projet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import projet.web.models.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {
    @GetMapping("/peopleJson")
    @ResponseBody
    public List<Person> showPeople(Model model){
        List<Person> friends = new ArrayList<Person>();

        friends.add(new Person(0, "crepin", 20, 75));
        friends.add(new Person(1, "david", 21, 70));
        friends.add(new Person(2, "gilbert", 23,70));
        friends.add(new Person(3, "israel", 19, 85));
        friends.add(new Person(4, "benit", 19, 80));
        System.out.print(friends);

        model.addAttribute("friends", friends);
        model.addAttribute("title" , "this personnes are my close friends");
        model.addAttribute("comming", "i have others friends that i not mention here");

        return friends;
    }
}
