package films.rating.film.Controllers;


import films.rating.film.Models.Comments;
import films.rating.film.Models.account;
import films.rating.film.Models.film;
import films.rating.film.Repositories.CommentRepo;
import films.rating.film.Repositories.accountRepo;
import films.rating.film.Repositories.filmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/single")
@SessionAttributes({"acc","film"})
public class SingleController {
    @ModelAttribute("film")
    public film getFilm(){
        return new film();
    }

    @Autowired
    private filmRepo fRepo;

    @Autowired
    private CommentRepo comRepo;

    @Autowired
    private accountRepo accRepo;

    @GetMapping("/{film_id}")
    public String getSingle(@ModelAttribute("acc") account acc, @PathVariable("film_id") int id, Model model){

        film film = fRepo.findById(id+1).get();
        List<Comments> comList = comRepo.getComments(film.getId());

        for(Comments c: comList){
            System.out.println(c.getUser_id());
            System.out.println(c.getText());
            c.setUserPhoto(accRepo.findById(c.getUser_id()).get().getPhoto());
            c.setUserName(accRepo.findById(c.getUser_id()).get().getFirst_name());
        }

        model.addAttribute("film", film);
        model.addAttribute("acc", acc);
        model.addAttribute("comList", comList);

        System.out.println(acc.getId() + " < id of main user");

        return "single";

    }

    @PostMapping("/saveComment")
    public String saveComment(@RequestParam("Message") String text, @ModelAttribute("acc") account acc, @ModelAttribute("film") film film, Model model){

        System.out.println(acc.getEmail());
        System.out.println(acc.getId());
        System.out.println(film.getName());

        comRepo.save(new Comments(acc.getId(), text, film.getId()));

        return "redirect:/single/" + (film.getId()-1);
    }
}
