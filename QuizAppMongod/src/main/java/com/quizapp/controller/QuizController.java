package com.quizapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.service.QuestionAnswerService;

@RestController
public class QuizController {

	@Autowired
	private QuestionAnswerService qas;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public Map<String,List<String>> findAllQuestionWithAnswers(){
		//qas.setQA();
	  return qas.findEachQuestionWithTheirAnswer();
	}
}
