package bankaccountapp;

import javax.swing.text.Utilities;
import java.util.LinkedList;
import java.util.List;


public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		String file = "D:\\original.csv";
        //Read a CSV File then create new account based on that data
        List<String[]> newAccounteHolder = utilities.CSV.read(file);
        for(String[] accountHolder: newAccounteHolder){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.valueOf(accountHolder[3]);
            //System.out.println(name + " " + sSN + " "+ accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
            	accounts.add(new Savings (name,sSN,initDeposit));
            }
            else if(accountType.equals("Checking")) {
                accounts.add(new Checking (name,sSN,initDeposit));
            }
            else{
                System.out.println("Error reading account type");
            }
        }
        for(Account acc: accounts){
            acc.showInfo();
            System.out.println("*****************");
        }
    }

}
