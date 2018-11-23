package com.pack.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="question")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	
	@Column
	@NotEmpty(message="Qustion cant be empty")
	private String qname;
	
	@Column
	@NotEmpty(message="enter option1")
	private String option1;
	
	@Column
	@NotEmpty(message="enter option2")
	private String option2;
	
	@Column
	@NotEmpty(message="enter option3")
	private String option3;
	
	@Column
	@NotEmpty(message="enter option4")
	private String option4;
	
	@Column
	@NotEmpty(message="result cant be empty")
	private String result;

	public Question() {
		super();
	}

	public Question(int qid, String qname, String option1, String option2, String option3, String option4,
			String result) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.result = result;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
