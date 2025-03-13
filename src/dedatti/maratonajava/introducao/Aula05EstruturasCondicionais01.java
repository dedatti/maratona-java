package dedatti.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        // valor nos parenteses obrigatóriamente precisa ser boolean. e será executado apenas se o resultado da expressão () for true

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebidas alcólicas");
        }else {
            System.out.println("Não autorizado a comprar bebidas alcólicas");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebidas alcólicas");
        }

        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
