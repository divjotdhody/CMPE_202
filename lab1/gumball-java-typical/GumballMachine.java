import java.util.ArrayList;

public class GumballMachine
{
    private int numGumballs;


    public GumballMachine(int numGumballs) {
        this.numGumballs = numGumballs;
     
    }
    public void insertCoin(int numGumballs)  
    {
    	this.numGumballs=numGumballs;
    }
    public void turnCrank(){
        System.out.println("Child can override this Turn Crank Method");
    }
    protected void gumballReleasing()
    {
    	if (numGumballs > 0 )
    	{
    		numGumballs=numGumballs-1;
    		System.out.println("Yeah..Gumball Ejected..!!");
    	}
    		else {
    			System.out.println("Sorry..No more Gumballs..!!");
    		}
    }
	public void insertCoin(int quarter, int quarter2) {
		// TODO Auto-generated method stub
		System.out.println("Child can override this insertCoin Method");
	}
}
