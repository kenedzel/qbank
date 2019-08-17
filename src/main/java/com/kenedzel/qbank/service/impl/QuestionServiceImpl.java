package com.kenedzel.qbank.service.impl;

import com.kenedzel.qbank.dto.Void;
import com.kenedzel.qbank.model.Question;
import com.kenedzel.qbank.repository.QuestionRepository;
import com.kenedzel.qbank.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public ResponseEntity<Void> save(Question question) {
        questionRepository.save(question);
        return new ResponseEntity<>(Void.SUCCESSFUL_SAVE, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Question>> listQuestionByType(String type) {
        return new ResponseEntity<>(questionRepository.findAllByType(type), HttpStatus.OK);
    }
}
