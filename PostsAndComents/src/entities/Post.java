package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDate moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Coment> comments = new ArrayList<>(); 
	
	
	public Post() {
		
	}

	public Post(LocalDate moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Coment> getComments() {
		return comments;
	}

	public void addComent(Coment coment) {
		comments.add(coment);
	}
	public void removeComent(Coment coment) {
		comments.remove(coment);
	}
}
