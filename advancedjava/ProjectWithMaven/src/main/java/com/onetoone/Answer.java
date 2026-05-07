package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answeId;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	@JoinColumn(name="ques_id")
	private Question question;
	public int getAnsweId() {
		return answeId;
	}
	public void setAnsweId(int answeId) {
		this.answeId = answeId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answeId, String answer) {
		super();
		this.answeId = answeId;
		this.answer = answer;
	}
	

	
	
}
