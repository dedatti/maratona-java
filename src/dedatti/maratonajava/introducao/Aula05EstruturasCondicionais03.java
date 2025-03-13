package dedatti.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar 500 se salário > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condição, mas vou ter!";
        String resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar; // (condition) ? true : false
        System.out.println(resultado);

        // resolv
        String resultado2 = (salario >= 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condição, mas vou ter!";
        System.out.println(resultado2);
    }
}
