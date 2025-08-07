public class Main {
    public static void main(String[] args) {

        // Mostra uma mensagem na tela
        System.out.println("Olá!");

        // VARIÁVEIS
        // TIPO nome;
        // NUMEROS INTEIROS
        int idade = 22;
        long populacao = 80000000000L;

        // NUMEROS DECIMAIS
        double preco = 20.90;
        float altura = 1.76f;

        // TEXTOS
        String nome = "Vinicio";
        char letra = ' ';

        // BOOLEANO - Valor que tem a informacao de SIM ou NAO
        boolean maiorDeIdade = true; // false

        // OPERADORES
        // = - Atribuicao

        // ARITMETICOS - Faz Conta
        int soma = 8 + 5;
        int subtracao = 10 - 3;
        int multiplicao = 2 * 5;
        int divisao = 10 / 2;
        int resto = 10 % 3;

        // OPERADORES COMPARACAO
        System.out.println(10 == 6); // igual
        System.out.println(10 != 6); // diferente
        System.out.println(10 > 6); // maior
        System.out.println(10 < 6); // menor
        System.out.println(10 >= 6); // maior ou igual



        int valor;

        valor = 10;

        int calculo = valor + 2;

        System.out.println(calculo);

        //                         CONCATENACAO
        System.out.println("Resultado: " + calculo);

        // Criando variaveis
        int num1 = 5;
        int num2 = 2;

        // Efetuando calculo
        int produto = num1 * num2;
        // Imprimindo resultado
        System.out.println(produto);

        // 5.
        String nome2 = "Ana";

        System.out.println("Olá, " + nome2);



        int numero1 = 5;
        int numero2 = 3;
        int numero3 = 2;

        // Somar todo mundo e dividir
        // * e / primeiro
        // + e -
        //                 CASTING
        double resultado = (double) (numero1 + numero2 + numero3) / 3;
        System.out.println(resultado);








        // Escrevo coisas
        // System.out.println();

        // Leio coisas - Scanner
        Scanner sc = new Scanner(System.in);

        // Perguntar o nome
        System.out.println("Digite o nome:");
        String nome3 = sc.nextLine();

        // Perguntar a idade
        System.out.println("Digite a idade:");
        int minhaIdade = sc.nextInt();

        //int resultado8 = minhaIdade + 2;

        // TOMAR DECISOES - ESTRUTURAS CONDICIONAIS
        // Se a pessoa é maior de idade "pode passar"
        // Senao "nao pode passar"
        int idadeVini = 26;
        // if (o que estou perguntando) {o que fazer}
        if (idadeVini > 18) {
            System.out.println("Pode passar!");
        }
        else {
            System.out.println("Nao pode passar!");
        }
        // Criança, adulto ou idoso
        if (idadeVini > 60) {
            System.out.println("Você é idoso");
            else if (idadeVini > 16) {
                System.out.println("Você é adulto");
           else {
                    System.out.println("Você é criança");
                }
        }
        }
}