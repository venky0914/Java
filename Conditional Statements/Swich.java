package conditionalstmts;

import java.util.*;

public class Swich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("venky");

                break;
            case 2:
                System.out.println("nani");
                break;
            case 3:
                System.out.println("venku");
                break;

            default:
                break;
        }

    }
}