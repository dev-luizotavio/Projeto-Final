import java.util.Scanner;


//Classe principal
public class CalculoDoSalario {

    // Método que calcula o desconto do Imposto de Renda (famoso Leão) com base na tabela fornecida.
    public static double CalcR (double salariob) {

        if(salariob <=1903.98){

            return 0;

        } else if(salariob <=2826.65) {

            return (salariob - 1903.98) * 0.075;

        } else if(salariob <=3751.05)

        {

            return (2826.65 - 1903.98) * 0.075 + (salariob - 2826.65) * 0.015;

        } else if(salariob <=4664.68)

        {

            return (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.015 + (salariob - 3751.05) * 0.225;

        } else

        {

            return (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salariob - 4664.68) * 0.275;

        }

    }

    // Método que calcula o desconto do INSS com base na tabela fornecida
    public static double calcInss(double salariob)
    {

        if (salariob <= 1212.0) {

            return salariob * 0.075;

        } else if (salariob <= 2427.35) {

            return salariob * 0.09;

        } else if (salariob <= 3461.03) {

            return salariob * 0.12;

        } else {

            return salariob * 0.14;

        }

    }

    // Método Principal
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {

                System.out.println("Qual o valor do salário bruto do funcionário "+ i + " (em reais):");
                double salariob = scanner.nextDouble(); // Recebe o valor do salário.

                double inss = calcInss(salariob); //
                double impostoR = CalcR(salariob - inss);
                double salariol = salariob - inss - impostoR;



                System.out.printf("\nFuncionário %d:\n", i);
                System.out.printf("Salário Bruto: R$ %.2f\n", salariob);
                System.out.printf("Desconto INSS: R$ %.2f\n", inss);
                System.out.printf("Desconto Imposto de Renda: R$ %.2f\n", impostoR);
                System.out.printf("Salário Líquido: R$ %.2f\n", salariol);
                System.out.println();


            }
            scanner.close();
        }
    }
