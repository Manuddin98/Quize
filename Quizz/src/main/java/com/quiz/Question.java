package com.quiz;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

@Entity
public class Question {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	
	
	private String question;
	
	private int rightAnswer;
	
	private Date startDate;
	
	private Date endDate;
	@OneToMany(targetEntity = Answer.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "questionId" , referencedColumnName = "Id")
	private List<Answer> ans;
	
	private String result;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(int rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Question [Id=" + Id + ", question=" + question + ", rightAnswer=" + rightAnswer + ", startDate="
				+ startDate + ", endDate=" + endDate + ", ans=" + ans + ", result=" + result + "]";
	}

	public Question(int id, String question, int rightAnswer, Date startDate, Date endDate, List<Answer> ans,
			String result) {
		super();
		Id = id;
		this.question = question;
		this.rightAnswer = rightAnswer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ans = ans;
		this.result = result;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
	
	
	

}
