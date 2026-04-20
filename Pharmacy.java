import java.util.Scanner;
class Bank{
    int id;
    String name;
    int bal;
    int deposit;
    int withdraw;
    Bank(int i, String n, int b, int d, int w){
        id = i;
        name = n;
        bal = b;
        deposit = d;
        withdraw = w;
    }
    void getDeposit(){
        System.out.println("You have deposited " + deposit);
        bal = bal + deposit;
    }
    void getWithdraw(){
        if(withdraw>bal){
            System.out.println("You broke");
        }else{
            System.out.println("You have withdrawn " + withdraw);
            bal = bal - withdraw;
        }
    }
    void getDisplay(){
        System.out.println(bal);
    }
}

public class BankStuff{
    public static void main(String[] args){
        System.out.println("For bank account A: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id");
        int id = input.nextInt();
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter balance");
        int bal = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int dep = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int with = input.nextInt();
        Bank a = new Bank(id,name,bal,dep,with);
        System.out.println("For bank account B: ");
        System.out.println("Enter id");
        int idb = input.nextInt();
        System.out.println("Enter name");
        String nameb = input.next();
        System.out.println("Enter balance");
        int balb = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int depb = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int withb = input.nextInt();
        Bank b = new Bank(idb,nameb,balb,depb,withb);
        System.out.println("-----------------------------");
        System.out.println("For bank A");
        a.getDeposit();
        a.getWithdraw();
        a.getDisplay();
        System.out.println("-----------------------------");
        System.out.println("For bank B");
        b.getDeposit();
        b.getWithdraw();
        b.getDisplay();
    }
}
import java.util.Scanner;
class Bank{
    int id;
    String name;
    int bal;
    int deposit;
    int withdraw;
    Bank(int i, String n, int b, int d, int w){
        id = i;
        name = n;
        bal = b;
        deposit = d;
        withdraw = w;
    }
    void getDeposit(){
        System.out.println("You have deposited " + deposit);
        bal = bal + deposit;
    }
    void getWithdraw(){
        if(withdraw>bal){
            System.out.println("You broke");
        }else{
            System.out.println("You have withdrawn " + withdraw);
            bal = bal - withdraw;
        }
    }
    void getDisplay(){
        System.out.println(bal);
    }
}

public class BankStuff{
    public static void main(String[] args){
        System.out.println("For bank account A: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id");
        int id = input.nextInt();
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter balance");
        int bal = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int dep = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int with = input.nextInt();
        Bank a = new Bank(id,name,bal,dep,with);
        System.out.println("For bank account B: ");
        System.out.println("Enter id");
        int idb = input.nextInt();
        System.out.println("Enter name");
        String nameb = input.next();
        System.out.println("Enter balance");
        int balb = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int depb = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int withb = input.nextInt();
        Bank b = new Bank(idb,nameb,balb,depb,withb);
        System.out.println("-----------------------------");
        System.out.println("For bank A");
        a.getDeposit();
        a.getWithdraw();
        a.getDisplay();
        System.out.println("-----------------------------");
        System.out.println("For bank B");
        b.getDeposit();
        b.getWithdraw();
        b.getDisplay();
    }
}
import java.util.Scanner;
public class Pharmacy{
    public static void main(String[] args){
        System.out.println("------Welcome to my Pharmacy!------");
        System.out.println("-------------Medicines-------------");
        System.out.println("1. Paracetamol");
        System.out.println("2. Flexon");
        System.out.println("3. Tren");
        System.out.println("-----------------------------------");
        System.out.println("What medicine would you like?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Selected medicine is: " + name);
        System.out.println("Details about medicine");
        if (name == "Paracetamol"){
            System.out.println("Amount: 50   Price per Unit: 5NPR");
        } else if( name == "Flexon"){
            System.out.println("Amount: 20   Price per Unit: 10NPR");
        } else{
            System.out.println("Amount: 10   Price per Unit: 1000NPR");
        }
        System.out.println("How much would you like to order?");
        int amount = input.nextInt();
        int sum = 0;     
        if (name == "Paracetamol"){
            sum = amount * 5;
            System.out.println("Total would be: " + sum);
            if (amount > 50){
                System.out.println("Sadly, that amount is unavailable");
            }
        } else if( name == "Flexon"){
            sum = amount * 10;
            System.out.println("Total would be: " + sum);
            if (amount > 20){
                System.out.println("Sadly, that amount is unavailable");
            }
        } else{
            sum = amount * 1000;
            System.out.println("Total would be: " + sum);
            if (amount > 10){
                System.out.println("Sadly, that amount is unavailable");
            }
        }
        }
}
import java.util.Scanner;

public class Rickshaw{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("What is the distance you are travelling, in KM?");
    int distance = input.nextInt();

    System.out.println("How long might travelling there take in minutes?");
    int time = input.nextInt();

    System.out.println("Is it night right now? y/n");
    String nightInput = input.next();
    boolean isNight = nightInput.equals("y");

    int baseFare = 50;
    int perKm = 20;
    int perMin = 5;

    int price = baseFare + (distance * perKm) + (time * perMin);

    if(isNight){
        price = price + (price * 15 / 100);
    }

    System.out.println("Your final fare is: Rs. " + price);
    }
}
public class Scenario{
    public static void main(String[] args){
        String [] categories = {"Fiction", "Nepali"};
        String [][] titles = new String[2][1];
        double [][] prices = new double[2][1];
        
        titles[0][0] = "The Alchemist";
        prices[0][0] = 500.0;
        
        titles[1][0] = "Ashmati-5";
        prices[1][0] = 750.0;
        
        System.out.println("Book Corner: ");
        
        for(int i = 0; i<categories.length; i++){
            System.out.println("Category: " +categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %2f\n", prices[i][0]);
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        System.out.println("Enter your GPA: ");
        Scanner input = new Scanner(System.in);
        double gpa = input.nextDouble();
        if(gpa>=0.0 && gpa<=4.0){
            if(gpa>=0.0 && gpa <=1.0){
                System.out.println("You have F grade");
            }else if(gpa>=1.0 && gpa <=2.0){
                System.out.println("You have C grade");
            }else if(gpa>=0.0 && gpa <=3.0){
                System.out.println("You have B grade");
            }else{
                System.out.println("You have A grade");
            }if(gpa>= 3.0 && gpa<=4.0){
                System.out.println("You are eligible for scholarship.");
            }
        }else{
            System.out.println("Invalid GPA.");
        }
    }
}
