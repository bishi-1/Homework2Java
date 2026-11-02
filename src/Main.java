import java.util.Locale;
import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter exercise number between 1 to 10: ");
        int exercize = scanner.nextInt();

        if (exercize == 1) f1();
        else if(exercize == 2) f2();
        else if(exercize == 3) f3();
        else if(exercize == 4) f4();
        else if(exercize == 5) f5();
        else if(exercize == 6) f6();
        else if(exercize == 7) f7();
        else if(exercize == 8) f8();
        else if(exercize == 9) f9();
        else if(exercize == 10) f10();
        else {
            System.out.println("Bad number, choose a number between 1 and 10");
        }
    }

    public static void f1()
    {
        System.out.print("first name: ");
        String name = scanner.next();
        System.out.print("age: ");
        int age = scanner.nextInt();
        System.out.print("height: ");
        double height = scanner.nextDouble();
        System.out.print("first last name letter: ");
        char lastNameLetter = scanner.next().charAt(0);
        int ageInTenYears = age+10;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Last name letter: " + lastNameLetter);
        System.out.println("Age in ten years: " + ageInTenYears);
    }

    public static void f2() {
        System.out.print("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println();
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

    public static void f3() {
        System.out.print("Bill: ");
        double bill = scanner.nextDouble();
        System.out.print("Tip percentage: ");
        double tipPercentage = scanner.nextDouble();
        System.out.print("People: ");
        int people = scanner.nextInt();

        double tip = bill * tipPercentage / 100;
        double total = bill + tip;
        double perPerson = total / people;

        System.out.println();
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
        System.out.println("Per person: " + perPerson);
    }

    public static void f4() {
        System.out.print("Price of product 1: ");
        double price1 = scanner.nextDouble();
        System.out.print("Quantity of product 1: ");
        int quantity1 = scanner.nextInt();

        System.out.print("Price of product 2: ");
        double price2 = scanner.nextDouble();
        System.out.print("Quantity of product 2: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Price of product 3: ");
        double price3 = scanner.nextDouble();
        System.out.print("Quantity of product 3: ");
        int quantity3 = scanner.nextInt();

        System.out.print("Discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        System.out.print("Amount paid: ");
        double paid = scanner.nextDouble();

        double totalBeforeDiscount = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;
        double discountAmount = totalBeforeDiscount * discountPercentage / 100;
        double finalPrice = totalBeforeDiscount - discountAmount;
        double change = paid - finalPrice;

        System.out.println();
        System.out.println("Total before discount: " + totalBeforeDiscount);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price: " + finalPrice);
        System.out.println("Change: " + change);
    }

    public static void f5() {
        System.out.print("Distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Time in minutes: ");
        int minutes = scanner.nextInt();

        double hours = minutes / 60.0; // 60.0 so the result keeps its fraction
        double averageSpeed = distance / hours;
        double distanceInOneHour = averageSpeed * 1;

        System.out.println();
        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + averageSpeed + " km/h");
        System.out.println("Distance in one hour: " + distanceInOneHour + " km");
    }

    public static void f6() {
        System.out.print("Assignments: ");
        double assignments = scanner.nextDouble();
        System.out.print("Quiz: ");
        double quiz = scanner.nextDouble();
        System.out.print("Final exam: ");
        double finalExam = scanner.nextDouble();

        double finalGrade = (assignments * 20 + quiz * 30 + finalExam * 50) / 100;

        System.out.println();
        System.out.println("Final grade: " + finalGrade);
        if (finalGrade >= 60) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void f7() {
        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();

        System.out.println();

        if (first > second) {
            System.out.println("The bigger number is " + first);
        } else if (second > first) {
            System.out.println("The bigger number is " + second);
        } else {
            System.out.println("The numbers are equal");
        }

        if (first % 2 == 0) {
            System.out.println("The first number is even");
        } else {
            System.out.println("The first number is odd");
        }

        if (second % 5 == 0) {
            System.out.println("The second number is divisible by 5");
        } else {
            System.out.println("The second number is not divisible by 5");
        }

        int sum = first + second;
        if (sum > 0) {
            System.out.println("The sum is positive");
        } else if (sum < 0) {
            System.out.println("The sum is negative");
        } else {
            System.out.println("The sum is zero");
        }
    }

    public static void f8()
    {
        System.out.print("age: ");
        int age = scanner.nextInt();
        System.out.println();

        if(age < 0)
        {
            System.out.println("age cant be negative");
        }
        else
        {
            int price;
            if(age < 6) price = 0;
            else if (age <= 17) price = 30;
            else if(age <= 64) price = 45;
            else price = 25;
            System.out.println("Ticket price: " + price + " NIS");
        }

    }

    public static void f9()
    {
        System.out.print("Enter word: ");
        String word = scanner.next();

        System.out.println();
        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
    }

    public static void f10(){
        //prediction: 3, 3.5
        //7/2 has two ints so it stays an int from 3.5 to 3
        //7 / 2.0 has a double so it can give the half

        int intA = 7;
        int intB = 2;

        System.out.println("A:");
        System.out.println(intA / intB);
        System.out.println(intA / 2.0);

        //B
        //prediction: 2157583647 and -2147483648
        //its 32 bits and adding 1 will go back to the smallest
        int num = 2147483647;

        System.out.println("B:");
        System.out.println(num);
        System.out.println(num+1);

        //C
        //prediction: 0.3000000000004 and false
        //coubles cant be stored exacly in binary so a close number is saved
        // it makes checking if its equalls false sometimes
        double doubleA = 0.1;
        double doubleB = 0.2;

        System.out.println("C:");
        System.out.println(doubleA + doubleB);
        System.out.println(doubleA + doubleB == 0.3);

        //D
        //prediction: 1.0E8 and 1.000000001E8
        //float only has 7 significant digits
        //at 100 million the gap between floats is 8 so adding 1 does not work
        //the result says 100000000 with 15-16 significant digits so it can store 100000001

        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println("D:");
        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision+1);

        // its important to understand the size of a type
        // and its memory and not only how to declare it
        //because every type has a fixed number of bits
        //and that is the range of it
        //and how acurate it is
    }
}