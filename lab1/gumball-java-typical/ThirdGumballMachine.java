import java.util.ArrayList;

public class ThirdGumballMachine extends GumballMachine {
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
    private ArrayList<Integer> coinAcceptedList;
    private int coins;

	public ThirdGumballMachine(int numberOfGumballs){
		super(numberOfGumballs);
        this.coinAcceptedList = new ArrayList<Integer>();
        this.coinAcceptedList.add(QUARTER);
        this.coinAcceptedList.add(NICKEL);
        this.coinAcceptedList.add(DIME);
        this.coins = 0;
	}

    public void setCoins(int current_coin_value){
        this.coins = 0;
    }

	public void insertCoin(int coin){
		if(coinAcceptedList.contains(coin)) {
			coins = coins + coin;
			System.out.println("Your coin " + coin+ " is inserted succesfully!");
			if(coins == 50){
				this.setCoins(0);
				this.gumballReleasing();
			}
		} else{
			System.out.println("Collected your coins, you inserted invalid coins "+coin+"..!!");
		}
	}
	@Override
	public String toString() {
		return "Third Gumball Machine started";
	}
	
}
