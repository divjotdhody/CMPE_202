public class Main {
    public static final int NICKEL = 5;
    public static final int DIME = 10;
    public static final int QUARTER = 25; 
    
	public static void main(String[] args) {
        GumballMachine gumballMachineOne = new FirstGumballMachine(4);

        System.out.println(gumballMachineOne);

        gumballMachineOne.insertCoin( QUARTER );
        gumballMachineOne.turnCrank();

        gumballMachineOne.insertCoin( NICKEL );
        gumballMachineOne.insertCoin( DIME );
        gumballMachineOne.insertCoin( DIME );

        gumballMachineOne.turnCrank();
        
        System.out.println(gumballMachineOne+"\n");

        GumballMachine gumballMachineTwo = new SecondGumballMachine(5);

        System.out.println(gumballMachineTwo);

        gumballMachineTwo.insertCoin( QUARTER, QUARTER );
        gumballMachineTwo.turnCrank();

        System.out.println(gumballMachineTwo+"\n");

        gumballMachineTwo.insertCoin( QUARTER, 50 );
        gumballMachineTwo.turnCrank();

        System.out.println(gumballMachineTwo + "\n");

        GumballMachine gumballMachineThree = new ThirdGumballMachine(5);
        System.out.println(gumballMachineThree);
        gumballMachineThree.insertCoin(QUARTER);
        gumballMachineThree.insertCoin(DIME);
        gumballMachineThree.insertCoin(NICKEL);
        gumballMachineThree.insertCoin(DIME);
        System.out.println(gumballMachineThree);
        gumballMachineThree.insertCoin(50);
        System.out.println(gumballMachineThree);
    }

	}


