import java.util.Scanner;

public class AcompanhamentoDeEstudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasEstudadas;
        int paginasLidas;
        double mediaEstudo;

        int totalhorasEstudas = 0;
        int totalPaginas = 0;
        double mediaGeral = 0;

        System.out.println("Digite -1 para encerrar o programa");

        while(true){
            System.out.print("Quantas horas estudou hoje: ");
            horasEstudadas = sc.nextInt();

            if(horasEstudadas == -1){
                System.out.println("---------------------------------------------------------------");
                System.out.println("Proograma encerrado!! ");
                break;
            }
            System.out.print("Quantas paginas você leu hoje: ");
            paginasLidas = sc.nextInt();

            if(paginasLidas == -1){
                System.out.println("---------------------------------------------------------------");
                System.out.println("Proograma encerrado!! ");
                break;
            }
            mediaEstudo = (double)paginasLidas/horasEstudadas;
            System.out.printf("A media de estudo diario foi de: %.2f paginas por hora.\n " , mediaEstudo);

            totalhorasEstudas += horasEstudadas;
            totalPaginas += paginasLidas;

            mediaGeral = (double)totalPaginas/totalhorasEstudas;
            System.out.printf("A média geral ate agora: %.2f paginas por hora.\n ", mediaGeral);
        }
        if(totalPaginas > 0){
            System.out.println("-----RELATÓRIO FINAL--------");
            System.out.println("total de horas estudadas: "+ totalhorasEstudas);
            System.out.println("total de paginas lidas: "+ totalPaginas);
            System.out.printf("Média geral: %.2f páginas por hora.\n ",mediaGeral);
        }else{
            System.out.println("Nenhuma entrada válida registrada!! Tente novamente");
        }
        sc.close();
    }
}
