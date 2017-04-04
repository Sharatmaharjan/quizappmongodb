package com.quizapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.model.Option;
import com.quizapp.model.QuestionAnswerModel;
import com.quizapp.repo.QuestionAnswerRepo;

@Service
public class QuestionAnswerService {
	@Autowired
	private QuestionAnswerRepo questionanswerrepo;

	// public Map<Integer,QuestionAnswerModel> findAll(){
	// Map<Integer,QuestionAnswerModel> map=new HashMap<Integer,
	// QuestionAnswerModel>();
	// map.put(1,questionanswerrepo.findById("1a"));
	// return map;
	// }

	public Map<String, List<String>> findEachQuestionWithTheirAnswer() {
		System.out.println("hi");
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<QuestionAnswerModel> list = questionanswerrepo.findAll();

		for (QuestionAnswerModel lis : list) {
			System.out.println(lis.getQuestion());
			String question = lis.getQuestion(); // questions

			List<String> options = new ArrayList<>(); // options
			options.add(lis.getOption().getRightanswer());
			options.add(lis.getOption().getWronganswer1());
			options.add(lis.getOption().getWronganswer2());
			options.add(lis.getOption().getWronganswer3());
			Collections.shuffle(options);
			map.put(question, options);
		}
		return map;
		// map.put(questionanswerrepo.findById(id), value)
	}

	public void setQA() {
		System.out.println("hello");
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		QuestionAnswerModel qam = new QuestionAnswerModel();
		qam.setQuestion("Where is Nepal?");
		// Option option = new Option();
		List<String> lis = new ArrayList<>();
		qam.getOption().setRightanswer("Asia");
		qam.getOption().setWronganswer1("Europe");
		qam.getOption().setWronganswer2("Australia");
		qam.getOption().setWronganswer3("North America");
		qam.setOption(qam.getOption());
//		lis.add(qam.getOption().getRightanswer());
//		lis.add(qam.getOption().getWronganswer1());
//		lis.add(qam.getOption().getWronganswer2());
//		lis.add(qam.getOption().getWronganswer3());
//		map.put(qam.getQuestion(), lis);
	}
}
