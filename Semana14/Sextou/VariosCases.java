public class VariosCases {
    public static void main(String[] args) {
        
        char letra = 'a';

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("UMA VOGAL");
                break;
            default:
                System.out.println("NAO EH VOGAL");
        }

        // IDENTIFICAR EM QUAL TRIMESTRE ESTA UM MES
        String mes = "jan";
        switch (mes) {
            case "jan":
            case "fev":
            case "mar":
                System.out.println("PRIMEIRO TRIMESTRE");
                break;
        
            case "abr":
            case "jun":
            case "jul":
                System.out.println("SEGUNDO TRIMESTRE");
                break;
            default:
                break;
        }
    }
}
