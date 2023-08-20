package drinkAPI.soft_drinks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document(collection = "soft drinks")//this class represents each document/drink in the softdrinks collection
@Data //gives all getter, setters, and toString methods
@AllArgsConstructor
@NoArgsConstructor
public class SoftDrink {
    @Id
    private ObjectId id;
    private String imdbId;
    private String drinkName;
    private List<String> bestFlavors;
    private String image;

    @DocumentReference
    private List<Review> reviewIds;

}
