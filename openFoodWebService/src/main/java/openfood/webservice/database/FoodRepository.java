package openfood.webservice.database;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<Product, String> {

}