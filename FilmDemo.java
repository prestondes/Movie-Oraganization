@@ -0,0 +1,159 @@
import java.util.Arrays;
import java.util.Scanner;
public class FilmDemo {
public static void main(String [] args)
{
	Scanner keyboard = new Scanner(System.in);
	int option;
	Film [] filmArray = new Film[5];
	int numberOfFilms = 0;
	do{
		System.out.println("Enter 1 to create an American film");
		System.out.println("Enter 2 to create a Foreign film");
		System.out.println("Enter 3 to create a Bollywood film");
		System.out.println("Enter 4 to view all of the films");
		System.out.println("Enter 5 to exit the program");
		System.out.println("Enter 6 to sort the films by the year they were made.");
		option = keyboard.nextInt();

		
		if(option == 1)
		{
			Scanner filmInput = new Scanner(System.in);
			Film movie = new Film();
			System.out.println("Enter the name of the American Film");
			String name = filmInput.nextLine();
			movie.setFilm(name);
			System.out.println("Enter the name(s) of the director");
			String director = filmInput.nextLine();
			movie.setDirector(director);
			System.out.println("Enter the year of release");
			int release = keyboard.nextInt();
			movie.setYearOfRelease(release);
			
			boolean sameMovie = false;
			for(int index = 0; index < numberOfFilms; index++) {
				if(filmArray[index].equals(movie)) {
					sameMovie = true;
					System.out.println("This film already exists");
				}
			}
			
			if(sameMovie == false) {
				filmArray[numberOfFilms] = movie;
				numberOfFilms++;	
			}
			
			
			
		}
		
		else if(option == 2)
		{
			Scanner foreignInput = new Scanner(System.in);	
			ForeignFilm foreign = new ForeignFilm();
			System.out.println("Enter the name of the Foreign Film");
			String name = foreignInput.nextLine();
			foreign.setFilm(name);
			System.out.println("Enter the name(s) of the director");
			String director = foreignInput.nextLine();
			foreign.setDirector(director);
			System.out.println("Enter the year of release");
			int release = keyboard.nextInt();
			foreign.setYearOfRelease(release);
			System.out.println("Enter the language of the film");
			String language = keyboard.next();
			foreign.setLanguage(language);
			System.out.println("Enter the subtitle info");
			String subs = foreignInput.nextLine();
			foreign.setSubtitles(subs);
			System.out.println("Enter the translation info");
			String translation = foreignInput.nextLine();
			foreign.setTranslation(translation);
			
			boolean sameMovie = false;
			for(int index = 0; index < numberOfFilms; index++) {
				if(filmArray[index].equals(foreign)) {
					sameMovie = true;
					System.out.println("This film already exists");
				}
			}
			
			if(sameMovie == false) {
				filmArray[numberOfFilms] = foreign;
				numberOfFilms++;	
			}
		}
		
		else if (option == 3)
		{
		Scanner bollyInput = new Scanner(System.in);
		BollywoodFilm bolly = new BollywoodFilm();	
		System.out.println("Enter the name of the Bollywood Film");
		String name = bollyInput.nextLine();
		bolly.setFilm(name);
		System.out.println("Enter the name(s) of the director");
		String director = bollyInput.nextLine();
		bolly.setDirector(director);
		System.out.println("Enter the year of release");
		int release = keyboard.nextInt();
		bolly.setYearOfRelease(release);
		System.out.println("Enter the language of the film");
		String language = keyboard.next();
		bolly.setLanguage(language);
		System.out.println("Enter the secondary language");
		String secondLanguage = keyboard.next();
		bolly.setSecondaryLanguage(secondLanguage);
		System.out.println("Enter the subtitle info");
		String subs = bollyInput.nextLine();
		bolly.setSubtitles(subs);
		System.out.println("Enter the translation info");
		String translation = bollyInput.nextLine();
		bolly.setTranslation(translation);
		System.out.println("Enter the songs for the film");
		String addSong = bollyInput.nextLine();
		bolly.setSongs(addSong);
		
		boolean sameMovie = false;
		for(int index = 0; index < numberOfFilms; index++) {
			if(filmArray[index].equals(bolly)) {
				sameMovie = true;
				System.out.println("This film already exists");
			}
		}
		
		if(sameMovie == false) {
			filmArray[numberOfFilms] = bolly;
			numberOfFilms++;	
		}
		
		}
		
		else if(option ==4)
		{			for(int index = 0; index < numberOfFilms; index++) {
				System.out.println(filmArray[index].toString());
			}
		}
		
		else if(option == 5)
		{
			System.out.println("The system will now close");
		}
		
		else if (option == 6)
		{
			Arrays.sort(filmArray);
			for(int index = 0; index < numberOfFilms; index++) {
				System.out.println(filmArray[index].toString());
			}
			
		}
		
		else
		{
			System.out.println("Error!");
		}
	}
	while(option !=5);
}
}
