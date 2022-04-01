package films.rating.film.Controllers;


import films.rating.film.Models.account;
import films.rating.film.Models.film;
import films.rating.film.Repositories.accountRepo;
import films.rating.film.Repositories.filmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("acc")
public class MainController {

    @ModelAttribute("acc")
    public account getUserInfo(){
        return new account();
    }

    @Autowired
    private accountRepo accRepo;

    @Autowired
    private filmRepo fRepo;

    @GetMapping("/")
    private String getStart(@ModelAttribute("acc") account acc, Model model){

        acc = new account("no", "one", "/images/img.png", "yourEmail", "yourPassword");

        List<film> filmList = (List<film>) fRepo.findAll();

        model.addAttribute("filmList", filmList);
        model.addAttribute("acc", acc);

        return "index";

    }

    @GetMapping("/{id}")
    public String getStartId(@PathVariable("id") int id, Model model){

        account acc = accRepo.findById(id).get();

        List<film> filmList = (List<film>) fRepo.findAll();

        model.addAttribute("filmList", filmList);
        model.addAttribute("acc", acc);



        return "index";


    }


}
