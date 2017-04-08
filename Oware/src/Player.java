import java.util.Scanner;
public class Player
{
	private String[] playerlist;
	
	
	public Player(){
		playerlist = new String[2];
	}
	
	public void setPlayerList(String[] playerlist){
		this.playerlist = playerlist;
	}
	
	public String[] getPlayerList(){
		return this.playerlist;
	}
	
	
	public void addNamestoArray() {
		Scanner input = new Scanner(System.in);
		this.playerlist = new String[2];
		
		for (int i = 0; i < playerlist.length; i++) {
			System.out.println("Enter Player " + (i+1) + " name.");
			this.playerlist[i] = input.nextLine();
			}
		
		for (int i = 0; i < playerlist.length; i++) {
			System.out.println(this.playerlist[i]);
			}
		
	}
	
	
	public static void main(String[] args)
	{
		Player p = new Player();
		p.addNamestoArray();
	}

}
