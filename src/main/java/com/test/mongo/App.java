package com.test.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MongoClientURI uri = new MongoClientURI("mongodb+srv://diana:d14n4pwd@cluster0-k9guk.mongodb.net/test?retryWrites=true&w=majority");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("kingsmentest");
        for(String s : database.listCollectionNames()){
            System.out.println(s);
        }
    }
}
