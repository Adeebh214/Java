#Asignment 1
#1
class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ajay", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();
    }
}


#2
import java.util.*;

class Book {
    String title, author;
    int isbn;

    Book(String t, String a, int i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(int isbn) {
        books.removeIf(b -> b.isbn == isbn);
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", 101));
        lib.addBook(new Book("Python", "Guido", 102));

        lib.displayBooks();
        lib.removeBook(101);

        System.out.println("After removal:");
        lib.displayBooks();
    }
}


#3
class CARRENTAL {
    int carId;
    String carType;
    float rent;

    void GetCar(int id, String type) {
        carId = id;
        carType = type;
    }

    void GetRent() {
        if (carType.equalsIgnoreCase("Small"))
            rent = 1000;
        else if (carType.equalsIgnoreCase("Van"))
            rent = 800;
        else if (carType.equalsIgnoreCase("SUV"))
            rent = 2500;
    }

    void ShowCar() {
        System.out.println(carId + " | " + carType + " | Rent: " + rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}


#4
class Resort {
    int Rno, Days;
    String Name;
    float Charges, Amount;

    void Getinfo(int r, String n, float c, int d) {
        Rno = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void Compute() {
        Amount = Days * Charges;
        if (Amount > 11000)
            Amount = (float)(Amount * 1.02);
    }

    void DispInfo() {
        Compute();
        System.out.println(Rno + " | " + Name + " | " + Charges + " | " + Days + " | " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Raj", 2000, 6);
        r.DispInfo();
    }
}


#5
class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = calculate();
    }

    void dispdata() {
        System.out.println(empno + " | " + ename + " | Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Amit", 10000, 2000, 1500);
        e.dispdata();
    }
}


#6
class Rectangle {
    int length, breadth;

    int Area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        System.out.println("Area1: " + r.Area(4, 5));
        System.out.println("Area2: " + r.Area(6, 3));
    }
}


#7
abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r = 5;

    void calculate_area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 5;

    void calculate_area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.display_info();
        s.calculate_area();

        s = new Rectangle();
        s.display_info();
        s.calculate_area();
    }
}


#8
interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter to image");
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter to data");
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class Main {
    public static void main(String[] args) {
        Filterable f1 = new ImageProcessor();
        f1.apply_filter("Blur");
        f1.reset_filter();

        Filterable f2 = new DataAnalyzer();
        f2.apply_filter("Noise Removal");
        f2.reset_filter();
    }
}


#9
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
    }
}


#10
interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Rate: " + b.getInterestRate());
    }
}


#11
class Shape {
    void display() {
        System.out.println("This is Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}


#12
abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(500);

        p = new NetBankingPayment();
        p.pay(2000);
    }
}


#13
abstract class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String n, double s) {
        super(n, s);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String n, double s) {
        super(n, s);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Adeebh", 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Rahul", 40000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}


#14
class Person {
    void role() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("I am a manager");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}


#15
abstract class Ride {
    double distance;

    Ride(double d) {
        distance = d;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Ride rides[] = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println("Fare: " + r.calculateFare());
        }
    }
}


#16
class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assisting doctor");
    }
}

class Technician extends Staff {
    void work() {
        System.out.println("Technician handling equipment");
    }
}

public class Main {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Technician();
        s.work();
    }
}


#17
class Employee {
    int id;
    String name;
    static int employeeCount = 0;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(2, "B");
        Employee e3 = new Employee(3, "C");

        Employee.displayCount();
    }
}


#18
class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println("Interest: " + b.calculateInterest(10000));
        System.out.println("Interest: " + b.calculateInterest(20000));
    }
}


#19
class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book books[] = {
            new Book("Java", "James", 500),
            new Book("Python", "Guido", 600),
            new Book("C++", "Bjarne", 700)
        };

        for (Book b : books) {
            b.display();
        }
    }
}


#20
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " | Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ajay", 30000);
        Employee e2 = new Employee("Rahul", 40000);

        e1.display();
        e2.display();
    }
}


#Asigment 2
#1
import java.util.*;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: "); // ✅ fixed
        String username = sc.nextLine();

        // Remove spaces
        username = username.trim();

        // Convert to lowercase
        username = username.toLowerCase();

        System.out.println("Cleaned Username: " + username);
    }
}


#2
import java.util.*;

class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}


#3
import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        // Case-sensitive comparison
        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Names are SAME");
        } else {
            System.out.println("Case-sensitive: Names are DIFFERENT");
        }

        // Case-insensitive comparison
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Names are SAME");
        } else {
            System.out.println("Case-insensitive: Names are DIFFERENT");
        }
    }
}


#4
import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        // Concatenate
        String fullName = first + " " + last;

        System.out.println("Full Name: " + fullName);
    }
}
