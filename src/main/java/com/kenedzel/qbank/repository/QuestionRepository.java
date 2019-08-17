package com.kenedzel.qbank.repository;

import com.kenedzel.qbank.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String>{

    List<Question> findAllByType(String type);
}
