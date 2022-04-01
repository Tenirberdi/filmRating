package films.rating.film.Controllers;


import films.rating.film.Models.account;
import films.rating.film.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
@SessionAttributes("acc")
public class LoginController {

    @Autowired
    private LoginService logService;

    @GetMapping("")
    private String getLogin(@ModelAttribute("acc") account acc, Model model){


        model.addAttribute("acc", acc);
        return "login";
    }

    @PostMapping("/check")
    private String getCheck(@RequestParam("email") String email, @RequestParam("password") String password){

        System.out.println("check");
        String res = logService.getCheck(email, password);

        return res;
    }
}
