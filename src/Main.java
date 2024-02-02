import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // EXERCICIO
        // imprimir a palvra com espaçamento entre as letras

        // jeito 1
        String palavra = "EDNEI TRABACH";
        palavra = palavra.replaceAll ("(.)", "$1 "); // ACHEI NO GOOGLE
        System.out.println(palavra);

        // jeito 2
        String spaces = "EDNEI TRABACH";

        for (int i = 0; i <= spaces.length() - 1; i++)
            System.out.print(spaces.charAt(i) + " ");

        /***

         // EXERCICIO
         // LOOP FOR de 1 a 10 (PARES)
         for (int i = 0; i <= 100;) {
         System.out.print(i + " ");
         i = i + 2;
         }

         // EXERCICIO
         // LOOP FOR de 1 a 10 (IMPARES)
         for (int i = 1; i <= 100; i++) {
         if (i % 2 != 0)
         System.out.println(i + " ");
         }


         // WHILE LOOP
         int i = 0;
         while ( i < 5){
         System.out.println(i + " - Hi! ");
         i++;
         }

         // NESTED LOOPS
         for (int i = 0; i < 2; i++)
         for (int n = 0; n < 2; n++)
         System.out.println(i + " " + n);



         // FOR LOOP COM ARRAY
         String [] cars = {"BMW", "TESLA", "FERRARI", "BUGATI", "DUCATI"};
         for (int i = 0; i < cars.length; i++)
         System.out.print(cars[i] + " ");


         // LOOP FOR de 1 a 10
         for (int i = 1; i <= 10; i++) {
         System.out.print(i + " ");
         }


        //SWITCH
        // COLETAR O NOME DO PRODUTO
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        // RETORNAR O VALOR DO PRODUTO

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$ 9,99");
                break;
            case "manga":
                System.out.println("R$ 13,80");
                break;
            case "maracujá":
                System.out.println("R$ 23,45");
                break;
            case "abacate":
                System.out.println("R$ 16,10");

         ***/

        }
    }
