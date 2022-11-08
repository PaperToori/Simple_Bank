public class Customer {
    String name;
    int perNum;
    int bal;

    //CONSTRUCTOR
    public Customer (String name, int perNum){
        this.name = name;
        this.perNum = perNum;
    }

    // METHODS
    public void deposit(int amount){
        this.bal += amount;
        return;
    }
    public void withdraw(int amount){
        if(amount > this.bal){
            System.out.println("Your balance is; " + this.bal);
            System.out.println("Given amount can not be withdrawn, try a smaller sum.");
        }
        else {
            this.bal -= amount;
            System.out.println(amount + " has been withdrawn.");
            System.out.println("Your new balance is: " + this.bal);
        }
        return;
    }
    public void pData(){
        System.out.println("----------");
        System.out.println("Name   : " + this.name);
        System.out.println("P.Num  : " + this.perNum);
        // System.out.println("Balance: " + this.bal);
    }

    // GETTERS
    public String getName(){
        return this.name;
    }
    public int getPerNum(){
        return this.perNum;
    }
    public int getBal(){
        return this.bal;
    }
}
