@@ -0,0 +1,45 @@

public class ForeignFilm extends Film {

	private String language;
	private String subtitles;
	private String translation;
	
	public ForeignFilm()
	{
		super();
		language = "";
		subtitles = "";
		translation = "";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public String toString()
	{
		return super.toString() + "Language: " + language + "\n" + "Subtitles: " + subtitles + "\n" + "Translation: " +  translation + "\n";
	}
	
}
