public class Account {
	private int accountNumber;
	private String password;
	private float balance;

	//A new bank account should be defined with a given account number, password and balance
    Account (int number, String password, float balance) {
        this.accountNumber = number;
        this.password = password;
        this.balance = balance;
	}

    public int getNumber() {
        return accountNumber;
    //This method should return the account number of this account
    }

    public boolean checkPassword(String password) {
        if (this.password.equals(password)) {
            return true;
        }
        else{
            return false;
        }
    //This method should check if a given password is equal to the password for this account
    }

    public float getBalance() {
        return balance;
    //This method should return the balance of this account
    }

    public void setBalance(float newBalance) {
        this.balance = newBalance;
    //This method should change the balance of this account to a specified new value
    }
}