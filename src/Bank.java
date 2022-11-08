import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Bank { // START OF CLASS

    Scanner inP = new Scanner(System.in);
    ArrayList<Customer> users = new ArrayList<Customer>();

    public void runBank(){ //START OF runBank()

        while(true){


            break;
        }


    } //END OF runBank()

    public ArrayList<Customer> addAccounts(){

        String i;
        int j;
        String k;

        while(true){ // Start of loop
            System.out.println("> Add Account");
            System.out.println("> Remove Account");
            System.out.println("> Return");
            i = inP.next();

            if (i == "Add Account" || i == "add account" ||i == "Add account"){
                System.out.println("> User name? (Lastname, Firstname");
                i = inP.next();
                System.out.println("> Personal number? (YYYYMMDDXXXX");
                j = Integer.parseInt(inP.next());
                System.out.println();
                System.out.println("Name: " + i);
                System.out.println("P.Num: " + j);
                System.out.println();
                System.out.println("Confirm input? [y/n]");
                k = inP.next();
                if(k == "y"){
                    users.add(new Customer(i, j));
                }

            }
            else if (i == "Remove Account" || i == "remove account" || i == "Remove account"){

                // Prints the data of all the users
                for(Customer c: users){
                    c.pData();
                }

                // When reaching the user that was specified, removes them.
                System.out.println("Which user would you like to remove? (Lastname, Firstname" );
                i = inP.next();
                for (Customer c : users){
                    if (i == c.getName()){
                        users.remove(c);
                    }
                }
            }
            else if (i == "Return" || i == "return"){
                return users;
            }

        } //End of loop
    }

    public ArrayList<Customer> addBalance(){

        String i;
        int j;
        String k;

        while(true){ // Start of loop
            System.out.println("> Add Balance");
            System.out.println("> Remove Balance");
            System.out.println("> Return");
            i = inP.next();

            if (i == "Return" || i == "return"){
                return users;

            }

        }
    }

    public void listAccounts(){

        for(Customer c : users){
            c.pData();
        }

        return;
    }

} // END OF CLASS
