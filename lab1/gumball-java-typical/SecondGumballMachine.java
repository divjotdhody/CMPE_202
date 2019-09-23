
import java.util.*;
public class SecondGumballMachine extends MyMachine{
    public static final int QUARTER = 25;
    private ArrayList<Integer> coinAcceptedList;
    private int coins;


    public SecondGumballMachine(int numGumballs){
    	super(numGumballs);
        this.coinAcceptedList = new ArrayList<Integer>();
        this.coinAcceptedList.add(QUARTER);
        this.coins = 0;
    }
    public void setCoins(int coin){
		this.coins = 0;
	}

    public void insertCoin(int coin1, int coin2){
        if(coinAcceptedList.contains(coin1) && coinAcceptedList.contains(coin2)) {
        	this.coins = this.coins + coin1 + coin2;
        	 System.out.println("Your coins "+coin1 + "," + coin2+ " are inserted succesfully!");
        } else{
            System.out.println("One or other coin is invalid..!");
        }
    }

    public void turnCrank(){
        if(this.coins == 50){
        	this.setCoins(0);
            this.gumballReleasing();
        } else{
            System.out.println("You have inserted invalid coins than expected..!!"); 
        }
    }
    @Override
	public String toString() {
		return "Second Gumball Machine started";
	}
}