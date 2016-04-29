import java.util.ArrayList;

public class PlayListPractice
	{
		static ArrayList<Songs> playlist = new ArrayList<Songs>();
		public static void main(String[] args)
			{	
			playlist.add(new Songs ("Set Free", "Veora", 197));
			playlist.add(new Songs ("Sleep Walker", "Illenium", 251));
			playlist.add(new Songs ("Hide Away", "Daya", 213));
			playlist.add(new Songs ("Pompeii", "Bastille", 192));
			playlist.add(new Songs ("Uma Thurman", "Fall Out Boy", 192));
			printList();
			spreadWord();
			cutTime();
			printList();
			spreadWord();
			deleteSong();
			printList();
			spreadWord();
			changeArtist();
			printList();
			}
		public static void printList()
		    {
		    for (int i = 0; i < playlist.size(); i++)
		    	{
		    		System.out.println(playlist.get(i).getTitle());
		    		System.out.println(playlist.get(i).getArtist());
		    		System.out.println(playlist.get(i).getLength());
		    		System.out.println(" ");
		    	}
		    }
		public static void spreadWord()
		    {
		    System.out.println("");
			System.out.println("NEXT");
			System.out.println("");
			System.out.println("");
		    }
		public static void cutTime()
		    {
		    for (int i = 0; i < playlist.size(); i++)
		    	{
		    		playlist.get(i).setLength(playlist.get(i).getLength() - 10);
		    	}
		    }
		public static void deleteSong()
		    {
		    int longestTitle = playlist.get(0).getTitle().length();
		    for (int i = 0; i < playlist.size() - 1; i++)
		    	{
		    	if (playlist.get(i).getTitle().length() > longestTitle)
		    		{
		    		longestTitle = playlist.get(i).getTitle().length();
		    		}
		    	}
		    for (int i = 0; i < playlist.size() - 1; i++)
		    	{
		    	if (playlist.get(i).getTitle().length() == longestTitle)
		    		{
		    		playlist.remove(playlist.get(i));
		    		}
		    	}
		    }
		public static void changeArtist()
		    {
		    playlist.get(0).setArtist("Regan Archibald");
		    }
	}
