package com.app;

import com.app.dto.Comments;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ComponentScan
@ActiveProfiles("env")
@SpringBootTest(classes = TestServer.class)
public class TestServer {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void insert(){
        Comments comments = Comments.builder().content("test").userId("1").parentId("2").build();
        Comments insert = mongoTemplate.insert(comments);
        System.out.println("insert = " + insert);
    }

    @Test
    public void query(){
        Query query = new Query(Criteria.where("userId").is("1"));
        List<Comments> comments = mongoTemplate.find(query, Comments.class);
        System.out.println("comments = " + comments);
    }

}
