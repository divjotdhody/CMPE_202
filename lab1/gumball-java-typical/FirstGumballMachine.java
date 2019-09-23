import java.util.ArrayList;

public class FirstGumballMachine extends GumballMachine{
	public static final int QUARTER = 25;
    private ArrayList<Integer> coinAcceptedList;
    private int coins;

	public FirstGumballMachine(int numGumballs){
		super(numGumballs);
        this.coinAcceptedList = new ArrayList<Integer>();
        this.coinAcceptedList.add(QUARTER);
        this.coins = 0;
	}

	public void setCoins(int coin){
		this.coins = 0;
	}

	public void insertCoin(int currentCoin){
		 if(coinAcceptedList.contains(currentCoin) ){
	        	this.coins = this.coins + currentCoin;
	        	 System.out.println("Your coin "+currentCoin +" is inserted succesfully!");
	        } else{
	            System.out.println("One or other coin is invalid..!");
	        }
	}

	public void turnCrank(){
		if(this.coins == 25){
			this.setCoins(0);
			this.gumballReleasing();
		} else{
			System.out.println("You have inserted lesser coins than expected..!!");	
		}
	}

	@Override
	public String toString() {
		return "First Gumball Machine started";
	}
	
}