package C8_SpringBoot.Controller;

import C8_SpringBoot.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/users")


public class UserController {

    @GetMapping ("/{name}/{age}/{email}/{gender}")
    public String showUser
            (@PathVariable String name,
             @PathVariable int age,
             @PathVariable String email,
             @PathVariable String gender,
             Model model){
        User user = new User(name, age, email, gender);
        model.addAttribute("user", user);
        return "user";
    }
}
