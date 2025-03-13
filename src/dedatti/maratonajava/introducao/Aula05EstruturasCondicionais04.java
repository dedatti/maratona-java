package dedatti.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100; // porcentagem de imposto
        double valorImposto;
        String imposto = "";

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
            imposto = " Você terá que pagar 9,70% de imposto";
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
            imposto = " Você terá que pagar 37,35% de imposto";
        } else {
            valorImposto = salarioAnual * terceiraFaixa; // sA * 49.50 / 100 = 34650
            imposto = " Você terá que pagar 49,50% de imposto";
        }
        System.out.println(valorImposto + imposto);
    }
}
