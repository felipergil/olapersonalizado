import java.util.Scanner;
/**
 *
 * @author Felipe Rodrigues Gil - 248543
 * Classe para questionar o usuário qual o seu idioma.
 * 
 */
public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = s.nextLine();
        System.out.println("Qual o seu idioma? (PT,AL,ES,FR,IN,JP)" );
        String idioma = s.nextLine();
        
        Ola ola = new Ola();
        String saudacao = ola.dizerOla(nome,idioma);
        System.out.println( saudacao );
        
    }
    
}
