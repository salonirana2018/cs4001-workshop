class Bank{
    int accountNumber;
    double balance;
    String name;
    
    Bank(int a, double b, String n){
        accountNumber = a;
        balance = b;
        name = n;
    }
    
    double getBalance(){
        return balance;
    }
    
    void deposit(double amount){
        System.out.println("You have deposited : " + amount);
        balance += amount;
    }
    
    boolean withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }else{
            return false;
        }
    }
}

public class Atm{
    public static void main(String[] args){
        Bank a = new Bank(1234,50000,"Saharsha");
        System.out.println(a.getBalance());
        a.deposit(200);
        if(a.withdraw(200) == true){
            System.out.println("You're rich");
        } else{
            System.out.println("You're poor");
        }
    }
}
class ElectricityBill{
    String consumerName;
    double unitsConsumed;
    double bill;
    
    ElectricityBill(String c, double u){
        consumerName=c;
        unitsConsumed=u;
    }
    
    double calculateBill(){
        if(unitsConsumed<=100 && unitsConsumed>0){
            bill = unitsConsumed * 5;
        }else{
            bill = 500 + (unitsConsumed-100)*8;
        }
        return bill;
    }
    
    void displayBill(){
        System.out.println("Your total bill is:Rs" + bill);
    }
}

public class ElectricityBillShow{
    public static void main(String[] args){
        ElectricityBill a = new ElectricityBill("Ram",140);
        a.calculateBill();
        a.displayBill();
    }
}
class Employee{
    double basicSalary;
    double GrossSalary;
    
    Employee(double b){
        basicSalary = b;
    }
    
    double calculateGrossSalary(){
        GrossSalary = basicSalary + basicSalary * 0.5;
        System.out.println("Your gross salary is: " + GrossSalary);
        return GrossSalary;
    }
}

public class Employees{
    public static void main(String[] args){
        Employee a = new Employee(5000.0);
        System.out.println("Your basic salary is: " + a.basicSalary);
        a.calculateGrossSalary();
    }
}
class Cart{
    String itemName;
    double itemPrice;
    double quantity;
    double Total;
    double Discounted;
    
    Cart(String i, double p, double q){
        itemName = i;
        itemPrice = p;
        quantity = q;
    }
    
    double calculateTotal(){
        Total = itemPrice * quantity;
        return Total;
    }
    
    double calculateDiscountedTotal(double discountPercent){
        Discounted = Total - Total*discountPercent/100;
        return Discounted;
    }
    
    void displayCart(){
        System.out.println("You got: " +itemName);
        System.out.println(itemName + " costs:Rs" +itemPrice);
        System.out.println("You got "+ quantity + " " + itemName);
        System.out.println("Your total before discount is:Rs"+Total);
        System.out.println("Your total is:Rs" + Discounted);
    }
}

public class ShoppingApp{
    public static void main(String[] args){
        Cart a = new Cart("Juice",2,4);
        a.calculateTotal();
        a.calculateDiscountedTotal(2);
        a.displayCart();        
    }
}
class Student{
    int id;
    String name;
    String address;
    long phoneNumber;
    String collegeName;
    
    Student(int i, String n, String a, long p, String c){
        id = i;
        name = n;
        address = a;
        phoneNumber = p;
        collegeName = c;
    }
    void displayInfo(){
        System.out.println("Student id: " +id);
        System.out.println("Student name: " + name);
        System.out.println("Student address: " + address);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("Student's college name: " + collegeName);
    }
}
public class StudentTest{
    public static void main(String[] args){
        Student a = new Student(1,"Saharsha","Sukedhara",984080962,"Islington");
        a.displayInfo();
    }
}

