@@ -0,0 +1,90 @@

public class Film implements Comparable{

	private String film;
	private String director;
	private int yearOfRelease;
	
	public Film()
	{
		film = "";
		director = "";
		yearOfRelease = 0;
	}
	
	
	
	public String getFilm() {
		return film;
	}



	public void setFilm(String film) {
		this.film = film;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public int getYearOfRelease() {
		return yearOfRelease;
	}



	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String toString ()
	{
		return "Film: " + film + "\n" + "Director: " + director + "\n" + "Year Of Release: " + yearOfRelease + "\n";
	}
	
	public boolean equals(Object otherObject)
	{
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Film)
		{
			Film otherFilm = (Film)otherObject;
			if(this.film.equals(otherFilm.film) && this.director.equals(otherFilm.director) && this.yearOfRelease == otherFilm.yearOfRelease)
			{
				isEqual = true;
			}
		}
		return isEqual;
	}
	
	public int compareTo(Object otherObject)
	{
		if (otherObject != null && otherObject instanceof Film)
		{
			Film otherFilm = (Film)otherObject;
			if(this.yearOfRelease<otherFilm.yearOfRelease)
			{
				return -1;
			}
			else if(this.yearOfRelease == otherFilm.yearOfRelease)
			{
				return 0;
			}
			else if(this.yearOfRelease > otherFilm.yearOfRelease)
			{
				return 1;
			}
		}
		return -1;
	}
}
