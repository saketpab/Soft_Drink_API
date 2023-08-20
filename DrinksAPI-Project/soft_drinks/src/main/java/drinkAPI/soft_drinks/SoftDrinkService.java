package drinkAPI.soft_drinks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoftDrinkService {

    @Autowired
    private SoftDrinkRepository softDrinkRepository;

    public List<SoftDrink> allSoftDrinks(){

        //System.out.println(softDrinkRepository.findAll().toString());
        return softDrinkRepository.findAll();

    }

    public Optional<SoftDrink> singleSoftDrink(String imdbId){

        return softDrinkRepository.findSoftDrinkByImdbId(imdbId);

    }


}
