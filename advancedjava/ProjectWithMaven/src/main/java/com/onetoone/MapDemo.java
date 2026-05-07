package com.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();	
	
//	    creating question1
	    Question Ques1 = new Question();
	    Ques1.setQuestionId(121);
	    Ques1.setQuestion("what is java");
	    
	    
//	    creating answer1
	    Answer answer = new Answer();
	    answer.setAnsweId(890);
	    answer.setAnswer("java is programming language");
	    answer.setQuestion(Ques1);
	    Ques1.setAnswer(answer);
	    
	    
	    
	    
//	    creating question2
	    Question Ques2 = new Question();
	    Ques2.setQuestionId(242);
	    Ques2.setQuestion("what is collection framework");

	    
//	    creating answer2
	    Answer answerr = new Answer();
	    answerr.setAnsweId(120);
	    answerr.setAnswer("it is object is creted collection framwork...");
	    answerr.setQuestion(Ques2);
	    Ques2.setAnswer(answerr);
	    
	    
	    
	    //session
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
//	    save
	    s.save(Ques1);
	    s.save(Ques2);
	    s.save(answer);
	    s.save(answerr);
	    
	    tx.commit();
	    s.close();
	    factory.close();
	
	}
}
