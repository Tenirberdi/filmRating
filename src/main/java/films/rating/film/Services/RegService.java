package films.rating.film.Services;


import films.rating.film.JavaModels.User;
import films.rating.film.Models.account;
import films.rating.film.Repositories.accountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService {

    @Autowired
    private accountRepo accRepo;

    public String insertData(User user){
        System.out.println(user.getPassword() + "  " + user.getConfirm_password());
        if(user.getPassword().equals(user.getConfirm_password())){

            account acc = new account(user.getFirst_name(), user.getLast_name(), user.getPhoto(), user.getEmail_address(), user.getPassword());
            System.out.println(acc);
            accRepo.save(acc);
            return "redirect:/";
        }else{
            return "redirect:/register";
        }
    }

}
