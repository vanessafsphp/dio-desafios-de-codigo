import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        // Lê os valores de entrada
        Scanner inputReader = new Scanner(System.in);

        System.out.println("\nDigite o sálario: ");
        float salaryValue = inputReader.nextFloat();

        System.out.println("\nDigite o valor dos benefícios: ");
        float valueBenefits = inputReader.nextFloat();
        inputReader.close();

        float taxValue = 0;

        if (salaryValue >= 0 && salaryValue <= 1100)
            // Atribui alíquota de 5%
            taxValue = 0.05F * salaryValue;
        else if(salaryValue > 1100 && salaryValue <= 2500)
            // Atribui alíquota de 10%
            taxValue = 0.10F * salaryValue;
        else
            // Atribui alíquota de 15%
            taxValue = 0.15F * salaryValue;

        // Calcula e imprime a saída (com 2 casas decimais)
        float newSalary = (salaryValue - taxValue) + valueBenefits;
        System.out.println("O novo sálario é de R$ " + String.format("%.2f", newSalary));
    }
}
