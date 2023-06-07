package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        
        System.out.println("A média é igual a " + m);
        System.out.println("");
        
        int numero = 5;
        //colocando o ++ depois ele primeiro executa o calculo e depois soma + 1 ao numero
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        System.out.println("");
        
        int numero2 = 5;
        //colocando o ++ antes ele soma primeiro 1 no numero e depois executa o calculo
        int valor2 = 5 + ++numero2;
        System.out.println(valor2);
        System.out.println(numero2);
        System.out.println("");
        
        int x = 25;
        x += 2; // é igual a x = x + 2
        System.out.println(x);
        System.out.println("");
        
        int y = 25;
        double raiz = Math.sqrt(y);
        System.out.println(raiz);
        System.out.println("");
        
        double cub = Math.cbrt(x);
        System.out.println(cub);
        
        
    }
    
}
