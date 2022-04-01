package films.rating.film.Controllers;


import films.rating.film.JavaModels.User;
import films.rating.film.Models.account;
import films.rating.film.Services.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
@SessionAttributes("acc")
public class RegistrationController {

    @Autowired
    private RegService regService;

    @GetMapping("")
    public String getRegister(@ModelAttribute("acc") account acc, Model model){

        User user = new User();

        model.addAttribute("user", user);
        model.addAttribute("acc", acc);
        return "register";
    }

    @PostMapping("/reg")
    public String getReg(@ModelAttribute User user){

        String resUrl =  regService.insertData(user);

        return resUrl;
    }
}
