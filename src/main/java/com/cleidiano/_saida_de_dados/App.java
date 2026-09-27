
package com.cleidiano._saida_de_dados;

// Importa a classe Locale, utilizada para definir
// o padrão de formatação de números.
import java.util.Locale;

/**
 *
 * @author cleidano silva
 */

public class App {

    public static void main(String[] args) {
        
        // Define o nome de uma pessoa.
        String nome = "Maria";

        // Define o ano.
        int ano = 2026;

        // Define o dia.
        int dia = 25;

        // Define uma idade
        int idade = 32;

        // Armazena o valor de Pi com várias casas decimais.
        double pi = 3.14159265359;

        // Define o valor de renda
        double renda = 3000.0;
        
        // Imprime a mensagem 'Ola,' sem pular para a próxima linha.
        System.out.print("Ola, ");

        // Imprime uma mensagem e pula para a próxima linha.
        System.out.println("hoje é " + dia + " de " + ano);

        // Exibe o valor de Pi.
        System.out.println("O número Pi é: " + pi);

        // Exibe informações utilizando printf:
        // %s  -> String
        // %d  -> número inteiro
        // %.2f -> número decimal com 2 casas decimais
        // %n  -> quebra de linha
        
        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);

        // Define o padrão americano para a formatação dos números.
        // Nesse padrão, o ponto (.) é utilizado como separador decimal.
        Locale.setDefault(Locale.US);

        // Exibe o valor de Pi arredondado para duas casas decimais.
        // Com Locale.US, o resultado será exibido com ponto decimal.
        System.out.printf("O número Pi arredondado é: %.2f%n", pi);
    }
}
