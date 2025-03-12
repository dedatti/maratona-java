package dedatti.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Caiky";
        String endereco = "Lindolfo Bastista de Souza - n21";
        double salario = 2500.12;
        String dataRecebimentoSalario = "05/02";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
