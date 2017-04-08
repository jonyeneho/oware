
public class Pit
{
	private int seednum;
	private int numSeeds;
	private Pit next;
	private Pit previous;
	
	public Pit ()
	{
		this.numSeeds = 4;
	}
	
	public Pit(Pit n, Pit p)
	{
		this.next = n;
		this.previous = p;
	}

	public Pit getPrev(){
		return this.previous;
	}
	
	public Pit getNext(){
		return this.next;
	}
	
	
	public int getNumSeeds()
	{
		return this.numSeeds;
	}

	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public static void main(String[] args)
	{
		// test the Pit...
		
		Pit test = new Pit();
		test.setNumSeeds(4);
		System.out.println(test.getNumSeeds());
	}

}
