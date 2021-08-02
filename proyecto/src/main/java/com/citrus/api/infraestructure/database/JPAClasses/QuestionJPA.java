package com.citrus.api.infraestructure.database.JPAClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;

@Entity
@Table(name="question")
public class QuestionJPA {
	
	public QuestionJPA(Integer id, String name, Integer score, Integer reviewId) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.reviewId = reviewId;
	}
	
	public QuestionJPA() {
		super();
	}


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private Integer id;
	
	@NotEmpty
    @Column private String name;
	
    @Column private Integer score;
    
    @NotEmpty
    @Column(name="review_id") private Integer reviewId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

    
}
