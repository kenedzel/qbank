package com.kenedzel.qbank.service;

import com.kenedzel.qbank.dto.Void;
import com.kenedzel.qbank.model.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {

    ResponseEntity<Void> save(Question question);

    ResponseEntity<List<Question>> listQuestionByType(String type);
}
