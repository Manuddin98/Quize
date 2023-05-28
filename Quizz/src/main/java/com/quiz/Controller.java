package com.quiz;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class Controller {
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	
	@PostMapping("/quizzes")
	public Question addQuiz(@RequestBody Question q) {
		
	
		
	
		return this.questionRepository.save(q);
	}
	
	@GetMapping("/quizzes/all")
	public List<Question> getAll(){
		return this.questionRepository.findAll();
	}
	
	
	@GetMapping("/quizze/{id}")
	public Optional<Question> edit(@PathVariable("id") int id) {
	    Optional<Question> q=questionRepository.findById(id);
		return q;
	}
	
	@GetMapping("/quizze/result/{id}")
	public String getResult(@PathVariable("id") int id) {
	    Optional<Question> q=questionRepository.findById(id);
		return q.get().getResult();
	}
		

	
	
	

}
