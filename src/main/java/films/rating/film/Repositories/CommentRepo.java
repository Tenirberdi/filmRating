package films.rating.film.Repositories;

import films.rating.film.Models.Comments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comments, Integer> {

    @Query(value = "SELECT * FROM `comments` WHERE film_id = ?1",
            nativeQuery = true)
    public List<Comments> getComments(Integer id);
}
