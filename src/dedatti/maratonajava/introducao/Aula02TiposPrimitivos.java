package dedatti.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String [] args) {
        // int, double, float, char, byte ,short, long, boolean
        int idade = (int) 10000000000L;  // casting
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;  // necessário colocar F ao final para declarar um float
        byte idadeByte = -127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';  // ideal para definir sexo, M ou F etc
        String nome = "Goku";



        System.out.println("A idade é " + idade + " anos"); // concatenação
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi, meu nome é " + nome);
    }
}
