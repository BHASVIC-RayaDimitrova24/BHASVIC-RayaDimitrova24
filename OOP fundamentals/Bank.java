import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private static int latestAccount;
    private Account account;
    //this.account = account;
    private float balance;




    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1; 
    }
    
    public int login() {
        try {
            System.out.println(
                    "What is your account number : \n");
            String responce = Console.readLine();
            Integer accountNumber = Integer.parseInt(responce);

            Account account = accounts.get(accountNumber);

            System.out.println(
                    "What is your password : \n");
            String password = Console.readLine();

            if (account.checkPassword(password) == true) {
                account.getNumber();
                return accountNumber;
            } else {
                return -1;
            }
        }
        catch (Exception e) {
            return -1;
        }
    //return 1;
    }


    
    public void deposit(int number) {
        Account account = accounts.get(number);
        System.out.println(
                "How much money do you want to deposit: \n");
        String deposit = Console.readLine();
        Integer deposit2 = Integer.parseInt(deposit);

        //float deposit3 = Float.parseFloat(deposit);
        //account.setBalance(deposit3);
        account.setBalance(account.getBalance()+deposit2);

    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/
    }
    
    public void withdraw(int number) {
        Account account = accounts.get(number);
        System.out.println(
                "How much money do you want to withdraw: \n");
        String withdraw = Console.readLine();
        Integer withdraw2 = Integer.parseInt(withdraw);
        account.setBalance(account.getBalance() - withdraw2);
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
    }
    
    public void checkBalance(int number) {
        //this.getBalance(number);
        Account account = accounts.get(number);
        balance = account.getBalance();
        System.out.println(
                "\n In your balance is £" + balance );

    //This method should display a message telling the user how much money is in their account
    }
    
    public void addAccount() {
        Bank.latestAccount = latestAccount+1;

        //Integer latestAccount2 = Integer.parseInt(withdraw);
        //int latestAccount2 = Bank.latestAccount;
        System.out.println(
                "Enter password: \n");
        String password = Console.readLine();
        balance =0;
        accounts.add(new Account(latestAccount, password, 0));


    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
    }
}