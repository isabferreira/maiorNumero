import java.util.Scanner;

public class maiorNum{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        float num1, num2, num3, maior;

        System.out.print("\n****DESCUBRA QUAL NÚMERO É O MAIOR****\n");
        System.out.println("Insira o primeiro número: ");
        num1 = num.nextFloat();

        System.out.println("Insira o segundo número: ");
        num2 = num.nextFloat();
    
        System.out.println("Insira o terceiro número: ");
        num3 = num.nextFloat();


        if(num1 >= num2 && num1 >= num3){
            System.out.println("O maior número entre "+num1+", "+num2+" e "+num3+" é "+num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("O maior número entre "+num1+", "+num2+" e "+num3+" é "+num2);
        }
        else{
            System.out.println("O maior número entre "+num1+", "+num2+" e "+num3+" é "+num3);
        }
        System.out.print("\n***************FIM***************\n");
    }
}