package drinkAPI.soft_drinks;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SoftDrinkRepository extends MongoRepository<SoftDrink, ObjectId> {

    Optional<SoftDrink> findSoftDrinkByImdbId(String imbdId);

}
