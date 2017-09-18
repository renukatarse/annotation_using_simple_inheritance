package com.scp.bollywood;

import javax.persistence.*;


@Entity
@Table(name = "FILMSTARS")
public class Filmstars {
	
	
	@Id 
	@GeneratedValue
	   @Column(name = "no")
		private int no; 
	
	   @Column(name = "actorName")
		private String actorName;
	   
	   @Column(name = "film")
		private String film;
	   
	   
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getActorName() {
			return actorName;
		}
		public void setActorName(String actorName) {
			this.actorName = actorName;
		}
		public String getFilm() {
			return film;
		}
		public void setFilm(String film) {
			this.film = film;
		}  
		  
		


}
