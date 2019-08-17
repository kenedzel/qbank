package com.kenedzel.qbank.controller;

import com.kenedzel.qbank.dto.Void;
import com.kenedzel.qbank.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/v1/qbank")
public interface QuestionAPI {

    @PostMapping(value = "/question")
    ResponseEntity<Void> saveQuestion(@RequestBody Question question);

    @GetMapping(value = "/question/{type}")
    ResponseEntity<List<Question>> findAllByType(@PathVariable(value = "type") String type);
}
