import java.util.*;

public class Main {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int escolha, escolha_busca;
        boolean exit = false;
        Hashtable<String, String> lista_telefonica = new Hashtable<String, String>();

        // FACILITAR OS TESTES
        lista_telefonica.put("felipe", "4412315452");
        lista_telefonica.put("joão", "23123188882");
        lista_telefonica.put("maria", "3398756248");

        do {
            System.out.println("**************************");
            System.out.println("*          MENU          *");
            System.out.println("*------------------------*");
            System.out.println("* 1 - Adicionar contato  *");
            System.out.println("* 2 - Buscar contatos    *");
            System.out.println("* 3 - Sair               *");
            System.out.println("**************************");
            System.out.println(" Digite uma opção(1 ,2 ou 3):");
            System.out.print(">");
            escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do contato:");
                    System.out.print(">");
                    scan.nextLine();// EVITA PULAR O PRÓXIMO SCAN
                    String nome_contato = scan.nextLine();

                    System.out.println("Digite o número do contato:");
                    System.out.print(">");
                    String numero_contato = scan.nextLine();

                    lista_telefonica.put(nome_contato, numero_contato);

                    break;
                case 2:
                    System.out.println("**************************");
                    System.out.println("*          MENU          *");
                    System.out.println("*------------------------*");
                    System.out.println("* 1 - Listar   todos  os *");
                    System.out.println("*     contatos           *");
                    System.out.println("* 2 - Buscar contato     *");
                    System.out.println("**************************");
                    escolha_busca = scan.nextInt();

                    switch (escolha_busca){
                        case 1:
                            System.out.println("**************************");
                            System.out.println("Nome   | Número");

                            for (Map.Entry<String, String> String : lista_telefonica.entrySet()){
                                System.out.println(String.getKey() + " | " + String.getValue());
                            }

                            break;
                        case 2:
                            System.out.println("Digite o nome do contato: ");
                            System.out.print(">");
                            scan.nextLine();
                            nome_contato = scan.nextLine();

                            if(lista_telefonica.get(nome_contato) != null){
                                System.out.println("**************************");
                                System.out.println("Nome   | Número");
                                System.out.println(nome_contato + " | " + lista_telefonica.get(nome_contato));
                            } else {
                                System.out.println("Contato não encontrado!");
                            }

                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("           ＿＿\n" +
                            "　　　　　\uD83C\uDF38＞　　フ\n" +
                            "　　　　　| 　_　 _ l\n" +
                            "　 　　　／` ミ＿xノ\n" +
                            "　　 　 /　　　 　 |\n" +
                            "　　　 /　 ヽ　　 ﾉ\n" +
                            "　 　 │　　|　|　|\n" +
                            "　／￣|　　 |　|　|\n" +
                            "　| (￣ヽ＿_ヽ_)__)\n" +
                            "　＼二つ");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (exit == false);
        System.out.println("Saiu.");

    }
}
