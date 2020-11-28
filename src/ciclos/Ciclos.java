package ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        int repetir = 1;
        
        System.out.println("***** TABLA DE MULTIPLICAR DEL 1 AL 12 *****");
        
        while (repetir != 2) {
            int num;
            System.out.println("\nIntroduce un numero entero: ");
            num = r.nextInt();
            
            if (num > 0 && num <= 12) {
                
                for (int i = 1; i <= 12; i++) {
                    System.out.println(num + " * " + i + " = " + num * i);
                }
                
                System.out.println("\nDesea visualizar otra tabla de multiplicar? ");
                System.out.println("1 - Si");
                System.out.println("2 - No");
                repetir = r.nextInt();
            }
        }
        
    }
    
}
