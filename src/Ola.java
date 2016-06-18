/**
 *
 * @author Felipe Rodrigues Gil - 248543
 * Classe para inserir resposta equivalente a opção de linguagem do usuário.
 */
public class Ola {
    public String dizerOla(String nome,String idioma){
        
        String olaPersonalizado;
        
        if (idioma.equals("AL")){
            olaPersonalizado = "Hallo ";
        }else if (idioma.equals("ES")){
            olaPersonalizado = "Hola ";
        }else if (idioma.equals("FR")){
            olaPersonalizado = "Bonjour ";
        }else if (idioma.equals("IN" )){
            olaPersonalizado = "Hello ";
        }else if (idioma.equals("JP")){
            olaPersonalizado = "Kon'nichiwa ";
    }else{
         olaPersonalizado = "Olá ";
    }

    
        return olaPersonalizado + nome;
    }
    }
    


