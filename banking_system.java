/*
import java.util.*;

class login{
    Scanner sc = new Scanner(System.in);

    private String customer_id;
    private String customer_password;
    
    private String customer_id_input;
    private String customer_password_input;

    void info(String customer_id, String customer_password){
        this.customer_id = customer_id;
        this.customer_password = customer_password;
    }

    boolean validate(){
        System.out.println(" --- Welcome to XYZ bank --- ");
        System.out.println("enter customer id : ");
        customer_id_input = sc.next();
        System.out.println("enter password : ");
        customer_password_input = sc.next();

        if(customer_id_input.equals(customer_id) && customer_password_input.equals(customer_password)){
            System.out.println("valid credentials");
            return true;
        }else{
            return false;
        }

    }

}

class open_account{
    Scanner sc = new Scanner(System.in);
    private String user_name;
    private String user_email;
    private double user_PIN;

    void validate_info(){
        System.out.println("enter your name : ");
        user_name = sc.nextLine();
        System.out.println("enter your email-id");
        user_email = sc.nextLine();

        char ch1 = '@';
        char ch2 = '.';
        if(user_email.contains(Character.toString(ch1)) && user_email.contains(Character.toString(ch2))){
            System.out.println("valid email-id");
            user_PIN = (int) 1000*Math.random();
            System.out.println("your generated PIN is : "+user_PIN);
        }else{
            System.out.println("invalid email");
            validate_info();
        }

    }

}

/*
class bank_user{
    Scanner sc = new Scanner(System.in);
    private String account_no;
    private String user_name;
    private String account_type;
    private double bank_balance;

    public void open_account() {

        System.out.println("enter Name : ");
        user_name = sc.nextLine();

        System.out.println("enter account number : ");
        account_no = sc.next();

        System.out.println("enter account type (saving/salary/FD) : ");
        account_type = sc.next();

        System.out.println("enter account's bank balance : ");
        bank_balance = sc.nextLong();
    }
    //Displaying User Information -:

    public void account_info(){
        System.out.println("Name of user : "+user_name);
        System.out.println("Account number : "+account_no);
        System.out.println("Type of Account : "+account_type);
        System.out.println("Account Balance : "+bank_balance);
    }

    //Method to Deposit Money -:
    public void deposit_money(){

        System.out.println("Enter amount to be deposited : ");
        double amount = sc.nextDouble();
        bank_balance += amount;
        System.out.println("new balance : "+bank_balance);
    }


    //Method to Withdraw Money -:
    public void withdraw_money(){
        System.out.println("enter amount to be withdrawn : ");
        double amount = sc.nextDouble();
        bank_balance -= amount;

        if(bank_balance<amount){
            System.out.println("withdrawal not possible");
        }else{
            System.out.println("new balance : "+bank_balance);
        }
    }

}



public class bank{
    
    public static void main(String[] args) {

        login customer = new login();
        customer.info("2241013165", "Rishi2004");
        if(customer.validate()){
            
        }else{
            System.out.println("invalid credentials");
        }
       
        
        /*
        Scanner sc = new Scanner(System.in);
        bank_user user = new bank_user();
        user.open_account();
        int choice;

        do {
        System.out.println("\n --- Banking System Application ---");
        System.out.println(" 1.Display account details\n 2.Deposit the amount\n 3.Withdraw the amount\n 4.Exit ");
        choice = sc.nextInt();

        	switch (choice){
            	case 1:
            		user.account_info();
            		break;
            	case 2:
            		user.deposit_money();
            		break;
            	case 3:
            		user.withdraw_money();
            		break;
            	case 4:
            		System.out.println("--- Thanks for visiting --- \n --- Wish you a good day --- ");
        }
        }while(choice<4 && choice>0);
        
    }
}
*/