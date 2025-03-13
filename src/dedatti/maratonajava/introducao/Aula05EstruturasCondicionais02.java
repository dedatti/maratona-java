package dedatti.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 18;
        String categoria = ""; // importante atribuir um valor mesmo que vazio para inicializar antes de executar

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
         /*
         pode ser usado mas não recomendado:

         categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
          */


        System.out.println(categoria);
    }
}
