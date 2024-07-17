public class TiposPrimitivos {
    public static void main(String[] args) {
        
        int idade = 21;
        long numeroGrande = 100000000;
        //long numeroGrande = 100000000L;
        double salarioDouble = 2000;
        //double salarioDouble = 2000d; -> esse d no final (que pode sr maiculo ou minusculo) é uma forma de especificar que se trata de um duble 
        float salarioFloat =2500;
        //float salarioFloat =2500F; -> esse f é uma forma de especificar que se trata deum float 
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean trueOrFalse = true;
        char caracteres = 10;
        String nome = "Laysa";

        System.out.println(idade);
        System.out.println("A idade é: " + idade);
        System.out.println("Numero grande: " + numeroGrande);
        System.out.println("O salario double é: " + salarioDouble);
        System.out.println("O salario em loat é: " + salarioFloat);
        System.out.println("A idade em byte é: " +idadeByte);
        System.out.println("A idade em short é: " + idadeShort);
        System.out.println("True or False é: " +trueOrFalse);
        System.out.println("O caracter é: " + caracteres);
        System.out.println("O nome é: " + nome);
    }

}
