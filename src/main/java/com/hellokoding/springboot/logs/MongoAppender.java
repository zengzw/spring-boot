/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 
package com.hellokoding.springboot.logs;

import org.apache.log4j.AppenderSkeleton;
import org.slf4j.event.LoggingEvent;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

*//**
 *
 * @author zengzw
 * @date 2017年3月31日
 *//*
public class MongoAppender extends AppenderSkeleton {
    
    private MongoClient mongoClient;
    
    
    private MongoDatabase mongoDatabase;
    
    private MongoCollection<BasicDBObject> logsCollection;
    
    private String connectionUrl;
    private String databaseName;
    private String collectionName;
    
    protected void append(LoggingEvent loggingEvent) {
      if(mongoDatabase == null) {
            MongoClientURI connectionString = new MongoClientURI(connectionUrl);
            mongoClient = new MongoClient(connectionString);
            mongoDatabase = mongoClient.getDB(databaseName);
            logsCollection = mongoDatabase.getCollection(collectionName, BasicDBObject.class);
        }
        logsCollection.insertOne((BasicDBObject) loggingEvent.getMessage());
    }
    
    
    public void close() {
        if(mongoClient != null) {
            mongoClient.close();
        }
    }
    public boolean requiresLayout() {
        return false;
    }

}
*/