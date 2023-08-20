package drinkAPI.soft_drinks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplete;

    public Review createReview(String reviewBody, String imbdId){

        Review review= reviewRepository.insert(new Review(reviewBody));

        mongoTemplete.update(SoftDrink.class)
                .matching(Criteria.where("imdbId").is("imdbId"))
                .apply(new Update().push("reviewIds").value(review)).first();

        return review;

    }



}
