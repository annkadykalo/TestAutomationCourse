package сom.homework;

import java.util.Scanner;

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
