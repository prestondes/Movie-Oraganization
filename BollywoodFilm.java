@@ -0,0 +1,36 @@

public class BollywoodFilm extends ForeignFilm {

	private String songs;
	private String secondaryLanguage;
	
	public BollywoodFilm()
	{
		super();
		songs = "";
		secondaryLanguage = "";
		
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}

	public String getSecondaryLanguage() {
		return secondaryLanguage;
	}

	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}
	
	public String toString()
	{
		return super.toString() + "Song: " + songs + "\n" + "Secondary Language: " + secondaryLanguage + "\n";
	}
	
}
