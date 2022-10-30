import java.util.Scanner;

public class Menu {
   static Scanner sc =new Scanner(System.in);
    static int opcao;
    public static void menuInicial(){
        System.out.println("------------------- \n|"+" 1- Vetor        |" +"\n|" + " 2- Lista        |"+
                "\n-------------------");
        System.out.println("Selecione a opção desejada:");
        opcao=sc.nextInt();
        subMenu();
    }
    public static void subMenu(){
        if (opcao==1){
            Vetor vetor = new Vetor();
            int opVetor=0;
            while(opVetor!=5){
                System.out.println("--------------------- \n|"+" 1- Inserir dado   |" +"\n|" + " 2- Alterar dado   |"+
                        "\n|" + " 3- Pesquisar dado |"+"\n|" + " 4- Mostar dados   |"+"\n|" + " 5- Voltar         |"+
                        "\n---------------------");
                opVetor= sc.nextInt();
                switch (opVetor){
                    case 1: {
                        System.out.println("Qual valor inserir no vetor?");
                        int novoVetor = sc.nextInt();
                        vetor.add(novoVetor);
                    }
                    case 2: {
                        System.out.println("Qual índice gostaria de alterar?");
                        int indice = sc.nextInt();
                        System.out.println("Qual novo valor?");
                        int novoValor = sc.nextInt();
                        vetor[indice] = novoValor;
                    }
                    case 3: {
                        System.out.println("Qual valor buscar no vetor?");
                        int valor = sc.nextInt();
                        vetor.indexOf(valor);
                    }

                    case 4: System.out.println(vetor);

                    case 5: menuInicial();

                    default: System.out.println("Entre com um uma opção entre 1 e 5");
                }
            }
        }
        else if(opcao==2) {
            ListaEncadeada lista = new ListaEncadeada();
            int opLista=0;
            while(opLista!=6){
                System.out.println("--------------------- \n|"+" 1- Inserir dado   |" +"\n|" + " 2- Alterar dado   |"+
                        "\n|" + " 3- Excluir dado   |"+"\n|" + " 4- Pesquisar dado |"+"\n|" + " 5- Mostar dados   |"+
                        "\n|" + " 6- Voltar         |" +
                        "\n---------------------");
                opLista= sc.nextInt();
                switch (opLista){
                    case 1:{
                        System.out.println("Qual valor inserir na lista?");
                        int valor= sc.nextInt();
                        lista.add(valor);
                        break;
                    }
                    case 2:{
                        int posicao,dado;
                        System.out.println("Qual indice gostaria de alterar?");
                        int valor=sc.nextInt();
                        System.out.println("Qual novo valor?");
                        dado=sc.nextInt();
                        lista.alterar(posicao,dado);
                        break;
                    }
                    case 3:{
                        System.out.println("Qual valor excluir da lista?");
                        Scanner scaner=new Scanner(System.in);
                        int valor= scaner.nextInt();
                        lista.remover(valor);
                        break;

                    }
                    case 4:{
                        System.out.println("Qual valor buscar na lista?");
                        int valor=sc.nextInt();
                        lista.pesquisar(valor);
                        break;

                    }
                    case 5:{
                        lista.ler();
                        break;

                    }
                    case 6:{
                        menuInicial();
                        break;
                    }
                    default:{
                        System.out.println("Entre com um uma opção entre 1 e 6");
                        break;
                    }
                }
            }
        }


    }
}
