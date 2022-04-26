import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
        String simbol;
        double num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti operatorul. De exemplu: +;-;*;/");
        simbol = scanner.nextLine();
        System.out.println("Introduceti doua numere, unul cate unul");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        
        scanner.close();
        
        switch(simbol){
            case "+": 
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
                break;
            
            case "-": 
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
                break;
                
            case "*": 
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1*num2));
                break;
                
            case "/":
                if(num2 != 0){
                    System.out.printf("%.2f / %.2f = %.2f", num1,num2, (num1/num2));
                }else{
                    throw new ImpartireException();
                }
                break;
            default :
                System.out.printf("%c nu se regaseste in lista elementelor recomandate", simbol);
          
            }
    }
}