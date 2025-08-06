import java.util.Scanner;

public class AcompanhamentoDeEstudo {

    public static void mostrarRelatorioFinal(int totalhorasEstudadas, int totalPaginas, double mediaGeral, int dias) {
        System.out.println("----RELATÓRIO FINAL-----");
        System.out.println("Dias de estudo: " + dias);
        System.out.println("Total de horas estudadas " + totalhorasEstudadas);
        System.out.println("Total de paginas lidas: " + totalPaginas);
        System.out.printf("A media geral: %.2f%n ", mediaGeral);
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            int dias =0;
            int horasEstudadas;
            int paginasLidas;
            double mediaEstudo;

            int totalhorasEstudadas = 0;
            int totalPaginas = 0;
            double mediaGeral = 0;

            System.out.println("Digite -1 para encerrar o programa");

            while (true) {
                System.out.print("Quantas horas estudou hoje: ");
                horasEstudadas = sc.nextInt();

                if (horasEstudadas == -1) {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Programa encerrado!! ");
                    break;
                }
                System.out.println("Quantos dias você estudou? ");
                dias = sc.nextInt();

                System.out.print("Quantas paginas você leu hoje: ");
                paginasLidas = sc.nextInt();

                if (paginasLidas == -1) {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Programa encerrado!! ");
                    break;
                }
                mediaEstudo = (double) paginasLidas / horasEstudadas;
                System.out.printf("A media de estudo diario foi de: %.2f paginas por hora.\n ", mediaEstudo);

                totalhorasEstudadas += horasEstudadas;
                totalPaginas += paginasLidas;
                dias++;

                mediaGeral = (double) totalPaginas / totalhorasEstudadas;
                System.out.printf("A média geral ate agora: %.2f paginas por hora.\n ", mediaGeral);
            }
            if(totalPaginas > 0){
                mostrarRelatorioFinal(totalhorasEstudadas, totalPaginas, mediaGeral, dias);
            }else{
                System.out.println("Entrada invalida!! ");
            }
            sc.close();
        }
    }