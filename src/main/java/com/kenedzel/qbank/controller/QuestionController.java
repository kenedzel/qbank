package com.kenedzel.qbank.controller;

import com.kenedzel.qbank.dto.Void;
import com.kenedzel.qbank.model.Question;
import com.kenedzel.qbank.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class QuestionController implements QuestionAPI {

    @Autowired
    private QuestionService questionService;

    @Override
    public ResponseEntity<Void> saveQuestion(Question question) {
        return questionService.save(question);
    }

    @Override
    public ResponseEntity<List<Question>> findAllByType(String type) {
        return questionService.listQuestionByType(type);
    }
}
