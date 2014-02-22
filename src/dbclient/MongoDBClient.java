package dbclient;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoDBClient {

	public MongoDBClient() throws UnknownHostException {
		// To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
		// if it's a member of a replica set:
		MongoClient mongoClient = new MongoClient();
		DB db = mongoClient.getDB( "mydb" );

		DBCollection coll = db.getCollection("testCollection");

		BasicDBObject doc = new BasicDBObject("name", "MongoDB").
				append("type", "database").
				append("count", 1).
				append("info", new BasicDBObject("x", 203).append("y", 102));

		coll.insert(doc);
		
		DBObject myDoc = coll.findOne();
		System.out.println(myDoc);
	}

}