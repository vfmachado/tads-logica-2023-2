import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = in.nextInt();

        // classificar uma pessoa dentro de uma categoria de acordo com a idade
        /*
        0 ~ 12 => infantil
        13 ~ 17 => adolescente
        18 ~ 64 => adulto
        65+     => experiente
        */
        String categoria;
        
        if (idade <= 12) {
            categoria = "Infantil";
        } else if (idade <= 17) {
            categoria = "adolescente";
        } else if (idade <= 64) {
            categoria = "adulto";
        } else {
            categoria = "experiente";
        }
    }
}