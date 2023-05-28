package exercicioaula4;
//mostrar configurações do sistema na tela do java
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class ExercicioAula4 {

    public static void main(String[] args) {
      Date relogio = new Date();
		System.out.println("A data e a hora atual do sistema é: ");
		System.out.println(relogio.toString());
		System.out.println();
		
		Locale loc = Locale.getDefault();
		System.out.println("O idioma do sistema é:");
		System.out.println(loc.getDisplayLanguage());
		System.out.println();
		
		Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + "px X " + d.height + "px");  
    }
    
}