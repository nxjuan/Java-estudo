package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Coment> comments = new ArrayList<>(); 
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Post() {
		
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(moment + "\n");
		sb.append("coments:\n");
		for(Coment c : comments) {
			sb.append( c.getText() + "\n");
		}
		return sb.toString();
	}
	
}
