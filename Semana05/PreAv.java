/*

ALGORITMO
CODIGO FONTE
    JAVA, O QUE NOS ESCREVEMOS
IDE - VS CODE

COMPILAÇÃO
    TRANSFORMA O CODIGO FONTE EM ALGO QUE A JRE CONSEGUE EXECUTAR (.CLASS / .JAR)

JRE - EXECUTOR DE JAVA


=== ALGORITMO EM JAVA ===

VARIAVEIS:
    ESPAÇO NOMEADO PARA GUARDAR UMA INFORMACAO DE DETERMINADO TIPO
    TIPOS:
        INT
        FLOAT
        DOUBLE
        CHAR
        STRING*
        BOOLEAN
        
        LONG
        BYTE
        SHORT

        * NAO PRIMITVO

        int idade;

    OPERACOES ARITMETICAS
        *
        /
        +
        -
        %   => RESTO

    OPERADORES RELACIONAIS
        >       >=
        <       <=
        ==      !=

        &&      => e       - ambas condicoes sao verdadeiras
        ||      => ou      - pelo menos 1 condicao verdadeira
        !       => nao     - troca o valor boolean

    Scanner
        import java.util.Scanner;
        Scanner in = new Scanner(System.in);
        in.nextTIPO();
        int => in.nextInt();
        String => in.next();    // nextLine();

    System.out.
        print("UM TEXTO"); // opcionalmente concatenar o texto com uma variavel
            "UM TEXTO: " + variavel

        println("IGUAL O PRINT + \n");

        printf("COMBINAR %f DENTRO DO TEXTO", variavelFloat);

    CONDICIONAIS

        if (valor_logico) {
            // codigo dentro do bloco só executado se valor logico for verdadeiro
        }

        int a = 5;
        int b = in.nextInt();

        // resto da divisao de b por a
        if (b % a == 0) {
            System.out.println("OI");
        }

        int resto = b % a;
        boolean valorLogico = resto == 0;
        if (valorLogico) {
            System.out.println("OI");
        }        


        if (valorLogico) {
            // bloco 1
        } else {        // opcionalmento else
            // ESTE BLOCO EH EXECUTADO QUANDO O VALORLOGICO É FALSE
        }

        if (valorLogico1) {

        } else if (valorLogico2) {

        } else if (valorLogico3) {

        } else if (valorLogico4) {

        } else {

        }

        if (idade < 4) {

        } else if (idade < 12) {

        } else if (idade < 18) {

        } else if (idade < 65) {

        } else if (idade < 100) {

        } else {

        }

        if (idade < 4) {

        }

        if (idade >= 4 && idade < 12) {
            
        }
*/