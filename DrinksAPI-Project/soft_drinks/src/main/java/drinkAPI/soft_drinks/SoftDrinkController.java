package drinkAPI.soft_drinks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/soft-drinks")
public class SoftDrinkController {
    @Autowired
    private SoftDrinkService softDrinkService;

/*
     @GetMapping
      public ResponseEntity<String> getAllSoftDrinks(){
        return new ResponseEntity<String>("all drinks", HttpStatus.OK);
    }



    */

    @GetMapping
    public ResponseEntity<List<SoftDrink>> getAllSoftDrinks() {
        return new ResponseEntity<List<SoftDrink>>(softDrinkService.allSoftDrinks(), HttpStatus.OK);
    }


    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<SoftDrink>>getSingleSoftDrink(@PathVariable String imdbId){
        return new ResponseEntity<Optional<SoftDrink>>(softDrinkService.singleSoftDrink(imdbId), HttpStatus.OK);

    }

}