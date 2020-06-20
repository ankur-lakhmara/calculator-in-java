package sample;

import java.util.Scanner;
public class Main
{
    public static void main(String[]arg){
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b= sc.nextDouble();

        System.out.println("Enter an Opertaor in one of them( + , - , * , /");
        char operator = sc.next().charAt(0);
double result;
switch (operator)
{
    case '+':
      result = a + b;
      break;

    case '-':
      result = a - b;
      break;

    case '*':
      result = a * b;
      break;

    case '/':
      result = a/b;
      break;

    default:
        System.out.println("Entered operator is Incorrect");
        return;
}

System.out.println("the result is  " + a + operator  + b +  "=" + result);
    }
        }
