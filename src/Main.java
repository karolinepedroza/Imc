import java.text.DecimalFormat;
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

                DecimalFormat df = new DecimalFormat("#.##");
                Scanner scanner = new Scanner(System.in);

                System.out.println("**** CALCULADORA DE IMC ****");

                System.out.println("Digite seu nome");
                String nome = scanner.nextLine();

                System.out.println("Digite seu peso");
                int peso = scanner.nextInt();

                System.out.println("Digite sua altura");
                double alt = scanner.nextDouble();

                double valor1 = alt * alt;
                double resultadoImc = peso / valor1;

                System.out.println("O resultado do seu IMC é " + df.format(resultadoImc));


                if (resultadoImc <= 18.5){
                    System.out.println(nome + ", seu IMC indica que você está com magreza.");
                } else if (resultadoImc >= 18.6 && resultadoImc < 25) {
                    System.out.println(nome + ", seu IMC indica que você está com peso normal.");
                } else if (resultadoImc >= 25 && resultadoImc <= 29) {
                    System.out.println(nome + ", seu IMC indica que você está com sobrepeso.");
                } else if (resultadoImc >= 30 && resultadoImc < 40) {
                    System.out.println("Seu IMC indica que você está com obesidade.");
                } else if (resultadoImc > 40) {
                    System.out.println("Seu IMC indica que você está com obesidade grave.");
                }


                scanner.close();
            }
        }
