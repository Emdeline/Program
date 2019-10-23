public class Object {

	private String Title;
	private String Genre;
	private int numberOfSeasonsAired;
	
	public Object (String t, String g, int n)
		{
			Title = t;
			Genre = g;
			numberOfSeasonsAired = n;
		}
	
	public String getTitle() 
	{
		return Title;
	}

	public void setTitle(String title) 
	{
		this.Title = title;
	}

	public String getGenre()
	{
		return Genre;
	}

	public void setGenre(String genre)
	{
		this.Genre = genre;
	}

	public int getNumberOfSeasonsAired() 
	{
		return numberOfSeasonsAired;
	}

	public void setNumberOfSeasonsAired(int numberOfSeasonsAired) {
		this.numberOfSeasonsAired = numberOfSeasonsAired;
	}

	
}
