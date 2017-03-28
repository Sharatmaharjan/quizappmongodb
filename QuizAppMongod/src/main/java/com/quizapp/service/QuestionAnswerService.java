package com.quizapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.model.QuestionAnswerModel;
import com.quizapp.repo.QuestionAnswerRepo;

@Service
public class QuestionAnswerService {
	@Autowired
	private QuestionAnswerRepo questionanswerrepo;
	
	public Map<Integer,QuestionAnswerModel> findAll(){
		Map<Integer,QuestionAnswerModel> map=new HashMap<Integer, QuestionAnswerModel>();
		map.put(1,questionanswerrepo.findById("1a"));
		return map;
	}
}
