package io.cahlee.blog.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Post {
	@Id @GeneratedValue
	private Long id;
	private String title;
	@Column(length=4000)
	private String content;
	private String author;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date modifyDate;
}