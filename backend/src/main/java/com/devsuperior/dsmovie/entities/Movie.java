package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;

@Entity
@Table(name = "tb-movie")
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tilte;
	private Double score;
	private Integer count;
	private String image;
	
	public Movie() {
	}

	public Movie(Long id, String tilte, Double score, Integer count, String image) {
		this.id = id;
		this.tilte = tilte;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
