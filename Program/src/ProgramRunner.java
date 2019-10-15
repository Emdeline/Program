import java.util.ArrayList;

public class ProgramRunner {
	
	public static void printList()
		{
		
		}
	public static void plusOneSeason()
		{
		
		}
	public static void takeOutLongestTitle()
		{
		
		}

	public static void main(String[] args) 
		{
//Question 5-8 code
		ArrayList <Program> TVShows = new ArrayList <Program> ();
				TVShows.add(new Program ("Teen Titans" , "Action" , 5));
				TVShows.add(new Program ("Avatar" , "Action" , 3));
				TVShows.add(new Program ("Stanger Things" , "Adventer/Thriller" , 3));
				TVShows.add(new Program ("Hunting of Hill House" , "Horror" , 1));
				TVShows.add(new Program ("Big Mouth" , "Scaring" , 2));
		
			for (Program t : TVShows)
			{
				System.out.println(t.getTitle());
				System.out.println(t.getGenre());
				System.out.println(t.getNumberOfSeasonsAired());
				System.out.println(" ");
				
			}
			printList();
			
//Question 9 code 
			plusOneSeason();
		{
			ArrayList <Program> TVShows1 = new ArrayList <Program> ();
				TVShows1.add(new Program ("Teen Titans" , "Action" , 5));
				TVShows1.add(new Program ("Avatar" , "Action" , 3));
				TVShows1.add(new Program ("Stanger Things" , "Adventer/Thriller" , 3));
				TVShows1.add(new Program ("Hunting of Hill House" , "Horror" , 1));
				TVShows1.add(new Program ("Big Mouth" , "Scaring" , 2));

	for (Program t : TVShows1)//
		{
			System.out.println(t.getTitle());
			System.out.println(t.getGenre());
			System.out.println(t.getNumberOfSeasonsAired() + 1);
			System.out.println(" ");

		}
			printList();
			
//Question 10 code
			takeOutLongestTitle();
			ArrayList <Program> TVShows2 = new ArrayList <Program> ();
			TVShows2.add(new Program ("Teen Titans" , "Action" , 5));
			TVShows2.add(new Program ("Avatar" , "Action" , 3));
			TVShows2.add(new Program ("Stanger Things" , "Adventer/Thriller" , 3));
			TVShows2.add(new Program ("Big Mouth" , "Scaring" , 2));
	
		for (Program t : TVShows2)
			{
				System.out.println(t.getTitle());
				System.out.println(t.getGenre());
				System.out.println(t.getNumberOfSeasonsAired());
				System.out.println(" ");
				
			}
		printList();
		}

//Question 11 code
	ArrayList <Program> TVShows3 = new ArrayList <Program> ();
		TVShows3.add(new Program ("Twelve Forever" , "Fantasy" , 1));
		TVShows3.add(new Program ("Avatar" , "Action" , 3));
		TVShows3.add(new Program ("Stanger Things" , "Adventer/Thriller" , 3));
		TVShows3.add(new Program ("Hunting of Hill House" , "Horror" , 1));
		TVShows3.add(new Program ("Big Mouth" , "Scaring" , 2));

	for (Program t : TVShows3)
		{
			System.out.println(t.getTitle());
			System.out.println(t.getGenre());
			System.out.println(t.getNumberOfSeasonsAired());
			System.out.println(" ");
		
		}
	printList();

		}
}
