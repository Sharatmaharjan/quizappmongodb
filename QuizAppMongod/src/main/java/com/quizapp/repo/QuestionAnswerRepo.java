package com.quizapp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.QuestionAnswerModel;

@Repository
public interface QuestionAnswerRepo extends MongoRepository<QuestionAnswerModel, String> {
	QuestionAnswerModel findById(String id);
}
