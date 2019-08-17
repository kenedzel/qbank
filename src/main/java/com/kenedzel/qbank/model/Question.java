package com.kenedzel.qbank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "question")
public class Question {

    @Id
    private String _id;

    private String type;

    private String question;

    private String category;

    private List<Answer> answerList;

}
