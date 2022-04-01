package films.rating.film.Services;

import films.rating.film.Models.account;
import films.rating.film.Repositories.accountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private accountRepo accRepo;

    public String getCheck(String email, String password){

        List<account> accList = (List<account>) accRepo.findAll();

        for(account acc : accList){
            System.out.println(acc.getEmail());
            if(acc.getEmail().equals(email)){
                if(acc.getPassword().equals(password)){
                    return "redirect:/" + acc.getId();
                }else{
                    return "redirect:/login";
                }
            }
        }

        return "redirect:/login";
    }
}
