package dbclient;

import java.net.UnknownHostException;

import com.dreamproject.command.TravelPostDetailsCommand;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoDBClient {

	DBCollection collection;
	MongoClient mongoClient;
	DB db;

	public MongoDBClient() throws UnknownHostException {
		// To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
		// if it's a member of a replica set:
		this.mongoClient = new MongoClient();
		this.db = mongoClient.getDB( "mydb" );
		this.collection = db.getCollection("testCollection");
	}

	public void insertData(TravelPostDetailsCommand travelPostDetails) {
		BasicDBObject doc = new BasicDBObject("name", travelPostDetails.getName()).
				append("goingFrom", travelPostDetails.getGoingFrom()).
				append("goingTo", travelPostDetails.getGoingTo()).
				append("date", travelPostDetails.getDate()).
				append("message",travelPostDetails.getMessage());

		collection.insert(doc);
	}

	public void getListOfTravels() {
		DBCursor cursor = this.collection.find();
		while(cursor.hasNext()) {
		    System.out.println(cursor.next());
		}
	}
}