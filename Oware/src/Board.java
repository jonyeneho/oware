
public class Board
{
	private static Pit[] allPits;
	private static Storehouse[] allStorehouses;
	static
	{
		allPits = new Pit[12];
		allStorehouses = new Storehouse[2];

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static Pit getPit(int pitnum)
	{
		System.out.println(allPits[0]);
		return allPits[pitnum];
	}
	
	public static Pit getStorehouse(int storehousenum)
	{
		System.out.println(allStorehouses[0]);
		return allPits[storehousenum];
	}

}
