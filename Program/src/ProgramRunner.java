import java.util.ArrayList;

public class ProgramRunner 

{
	
	static ArrayList <Program> TVShows = new ArrayList <Program> ();
	
	public static void main(String[] args) 
		{
			arrayMethod();
			printTVShows();
			plusOneSeason();
			takeOutLongestTitle();
			addTitle();
		}
	
	public static void arrayMethod()
		{
				TVShows.add(new Program ("Teen Titans" , "Action" , 5));
				TVShows.add(new Program ("Avatar" , "Action" , 3));
				TVShows.add(new Program ("Stanger Things" , "Adventer/Thriller" , 3));
				TVShows.add(new Program ("Hunting of Hill House" , "Horror" , 1));
				TVShows.add(new Program ("Big Mouth" , "Scaring" , 2));
		}
	
	public static void printTVShows()
		{
			for (Program t : TVShows)
				{
					System.out.println(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());
			
				}
			System.out.println(" ");
		}
	
	public static void plusOneSeason()
		{
			for (Program t : TVShows)
				{
					System.out.print(t.getTitle() + " " + t.getGenre() + " ");
					System.out.print(t.getNumberOfSeasonsAired() + 1);
					System.out.println();

				}
			System.out.println(" ");

		}
	
	public static void takeOutLongestTitle()
		{
			int max = TVShows.get(0).getTitle().length();
			int index = 0;
			
				for (int t = 0; t < TVShows.size(); t++)
					{
						if (TVShows.get(t).getTitle().length() > max)
							{
								index = t; 
							}
					}
				TVShows.remove(index);
				
				for (Program t : TVShows)
					{
						System.out.println(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());
					}
				System.out.println(" ");
		}
	
	public static void addTitle()
		{
			TVShows.get(0).setTitle("Amazing World of Gumball");
			
				for (Program t : TVShows)
					{
						System.out.println(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());
						
					}
				System.out.println(" ");
		}
		
}



		

