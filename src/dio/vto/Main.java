package dio.vto;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício da calculadora chamando metodo:");
        Calculadora.soma(3, 6);
        Calculadora.subtrair(9, 1.8);
        Calculadora.multiplicar(7, 8);
        Calculadora.dividir(5, 2.5);

        // Mensagem
        System.out.println("\n\nExercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(60);

        // Empréstimo
        System.out.println("\n\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
