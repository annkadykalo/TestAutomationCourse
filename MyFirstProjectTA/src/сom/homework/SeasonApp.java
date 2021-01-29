package сom.homework;

import java.util.Scanner;

/*
Create new class SeasonApp with method main inside then:​

Create String variable currentMonth​

Assign it one value of the 12 months​

Create Enum with four seasons (WINTER, SPRING ...)​

Create Switch which identify which month related to what season (Winter, Spring and so on)​

Print out season in console - use for it System.out.println() ​

* Add reading variable currentMonth in console.
 */
public class SeasonApp {
    enum Season { WINTER, SPRING, SUMMER, AUTUMN};

    public static void main (String[] args) {
        String currentMonth;

        Scanner monthScan = new Scanner(System.in);
        currentMonth = monthScan.nextLine();

        switch (currentMonth){
            case ("January"):
            case ("February"):
            case ("December"): {
                System.out.println(Season.WINTER);
                break;
            }
            case ("March"):
            case ("April"):
            case ("May"): {
                System.out.println(Season.SPRING);
                break;
            }
            case ("June"):
            case ("July"):
            case ("August"):{
                System.out.println(Season.SUMMER);
                break;
            }
            case ("September"):
            case ("October"):
            case ("November"):{
                System.out.println(Season.AUTUMN);
                break;
            }
            default:
                System.out.println("This is not a month");
        }
    }
}
