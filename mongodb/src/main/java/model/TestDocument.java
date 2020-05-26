package model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class TestDocument {

    @Id
    private int id;

    public TestDocument(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
