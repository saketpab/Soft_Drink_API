package drinkAPI.soft_drinks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.List;

//mongodb+srv://saketp73:qThZbHLFLiimrTK6@cluster0.awpgz2o.mongodb.net

@Document(collection = "soft drinks")//this class represents each document/drink in the softdrinks collection
@Data //gives all getter, setters, and toString methods
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    public Review(String body) {
        this.body = body;
    }

    @Id
    private ObjectId id;
    private String body;
}
