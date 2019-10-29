package connectJavaToMongoDB;
//legacy MongoClient API:
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoClientOptions;

import java.util.Arrays;


public class Principal {

	//A MongoClient instance represents a pool of connections to the database; 
	//Only need one MongoClient ins for the entire JVM/a given MongoDB deployment (standalone, replica set, shared cluster...)
	//Creates an instance based on a (single) mongodb node (localhost, default port)
	MongoClient mongoClient1 = new MongoClient();
	
	
}
