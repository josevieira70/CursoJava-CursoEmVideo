package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    public static void main(String[] args) {
        
        float nota = 8.5f;
        String nome = "José Mario";
        
        System.out.println("A nota é " + nota);
        
        /*outras formas de printar dados na tela, o %.xf indica a quantidade de casas decimais
         *e o \n pula de linha 
         */
        
        System.out.printf("A nota de %s é %.2f \n", nome,  nota);
        System.out.format("A nota de %s é %.2f \n", nome,  nota);
        
        // Forma de ler entradas, sendo necessário importar biblioteca.
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do " + nome2 + ": ");
        float nota2 = teclado.nextFloat();
        
        System.out.format("A nota de %s é %.2f \n", nome2,  nota2);
        
    }
    
}
