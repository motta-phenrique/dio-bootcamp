import java.util.Scanner;

public class DesafioImposto {
    public static void main(String[] args) throws Exception {
    Scanner leitorDeEntradas = new Scanner(System.in);

    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();
    float valorImposto = 0;

    if (valorSalario <= 1100){
        valorImposto = 0.05F * valorSalario;
    }else if(valorSalario <= 2500){
        valorImposto = 0.10F * valorSalario;
    }else{
        valorImposto = 0.15F * valorSalario;
    }


    float valorFinal = valorSalario - valorImposto + valorBeneficios;

    System.out.println(String.format("%.2f", valorFinal));

    leitorDeEntradas.close();
    }
}
