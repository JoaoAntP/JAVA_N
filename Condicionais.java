package TiposdeDados;

public class Condicionais {
    public static void main(String[] args){
        /*
        * IF E ELSE - Condicionais
        * ELSE IF
        * Objetivo: Passar o ninja de nivel de acordo com o numero de missões
        * */


        String nome = "Shikamaru";
        int idade = 17;
        boolean hokage = false;
        short numeroDemissoes = 23;
        String rank ;


        if(numeroDemissoes == 10 && idade > 10) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDemissoes >= 20) {
            System.out.println(" Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }


    }
}
