package films.rating.film.Repositories;

import films.rating.film.Models.film;
import org.springframework.data.repository.CrudRepository;

public interface filmRepo extends CrudRepository<film, Integer>{
}
