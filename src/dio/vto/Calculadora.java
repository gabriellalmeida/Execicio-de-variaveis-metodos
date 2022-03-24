package dio.vto;

public class Calculadora {

    public static void soma(double n1, double n2){

        double resultado = n1 + n2;
        System.out.println("A soma de " + n1 + " + " + n2 + " é igual: " + resultado);
    }

    public static void subtrair(double n1, double n2){

        double resultado = n1 - n2;
        System.out.println("A subtração de " + n1 + " - " + n2 + " é igual: " + resultado);
    }

    public static void multiplicar(double n1, double n2){

        double resultado = n1 * n2;
        System.out.println("A soma de " + n1 + " * " + n2 + " é igual: " + resultado);
    }

    public static void dividir(double n1, double n2){

        double resultado = n1 / n2;
        System.out.println("A soma de " + n1 + " / " + n2 + " é igual: " + resultado);
    }
}
