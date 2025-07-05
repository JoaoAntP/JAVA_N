package TiposdeDados;

public class DadosNPrimitivos {
    public static void main (String[] args){
        //Dados primitovos:não conseguem receber metodos

        //Dados não primitivos: são aqueles que a gente consegue colocar metodso para fazer alterações

    /*

    -Dados não primitivos: String, Array, Class, enum
    -

     */

        String nome = "Shikamaru Nara";
        String nomeEmCaixaAlta = nome.toUpperCase(); //Coloca tudo em CAPSLOCK
        System.out.println("Esse tecto esta em caps lock " + nomeEmCaixaAlta );
        System.out.println("E esse em esta normal " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println(aldeiaEmCaixaBaixa);


    }
}
