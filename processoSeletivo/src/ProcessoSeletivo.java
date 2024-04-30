import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import javax.print.attribute.standard.RequestingUserName;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {        
    }


    static void entrandoContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Conseguiu entrar em contato");
            }



        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguiu: " + candidato + " Tentativas: " + tentativasRealizadas);
        }else{
            System.out.println("Não conseguiu: " + candidato + " Tentativas: " + tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }


    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE", "PAULO", "JHONATTA", "FRANCIELE", "TIAGO", "GABRIEL", "RYAN", "EMANUEL"};

        int selecionados = 0;
        int atual = 0;
        double salarioBase = 2000.0;
        while (selecionados < 5 && atual < candidatos.length) {
            String c = candidatos[atual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + c + " solicitou este valor: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato: " + c + " SITUAÇÃO: SELECIONADO");
                selecionados++;
            }else{
                System.out.println("Candidato: " + c + " SITUAÇÃO: NÃO SELECIONADO");
            }

            atual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisaCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("fazer contraproposta");
        }else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}
