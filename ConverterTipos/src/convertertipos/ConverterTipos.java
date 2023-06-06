package convertertipos;

public class ConverterTipos {

    public static void main(String[] args) {
        // metodo para converter inteiro em String ou ao contrario
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "20";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        //Converter para float
        String valor3 = "10.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("%.1f \n",idade3);
    }
    
}
