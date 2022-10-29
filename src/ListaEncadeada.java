import javax.swing.*;

public class ListaEncadeada {
    No primeiro;


    public void add(int dado){
        No novo = new No(dado);
        if (primeiro==null){
            primeiro=novo;
            novo.setIndice(0);
        }
        else {
            No aux=primeiro;
            if(primeiro.getProximo()==null){
                novo.setAnterior(primeiro);
                novo.setIndice(aux.getIndice()+1);
            }
            while(aux.getProximo()!=null){
                aux=aux.getProximo();
            }
            aux.setProximo(novo);
            novo.setAnterior(aux);
            novo.setIndice(aux.getIndice()+1);

        }
    }

    public void ler(){
        if(primeiro==null){
            JOptionPane.showMessageDialog(null,"lista vazia","aviso",1);
        }

        else {
            No aux=primeiro;
            System.out.println("a Lista contém:");
            while (aux!=null){
                System.out.print(aux.getDado() + " ");
                aux=aux.getProximo();
            }
            System.out.println();
        }

    }

    public void remover(int dado){
        int contador=0;
        if (dado== primeiro.getDado()){
            primeiro=primeiro.getProximo();
            contador=1;
        }

        No aux=primeiro;
        while (aux.getDado()!=dado && aux.getProximo()!=null){
            aux=aux.getProximo();
            if(aux.getDado()==dado){
                No aux2 =aux.getAnterior();
                aux2.setProximo(aux.getProximo());
                aux=aux.getProximo();
                aux.setAnterior(aux2);
                contador=1;

            }

        }
        if(contador==0){

                JOptionPane.showMessageDialog(null,"Elemento não encontrado","falha na operação",1);

        }

        }

        public void alterar(int posicao,int dado){
        No aux =primeiro;
        if (aux.getProximo()==null || aux.getIndice()==posicao){
            aux.setDado(dado);
        }
        while (aux.getProximo()!=null){
            aux=aux.getProximo();
            if (aux.getIndice()==posicao){
                aux.setDado(dado);
            }
        }

        }

        public void pesquisar(int dado) {
            No aux = primeiro;
            int verificador=0;
            do {
                if (aux.getDado()==dado){
                    System.out.println("O indicie é " + aux.getIndice());
                    verificador++;
                }
                aux=aux.getProximo();
            }while (aux!=null);
            if (verificador==0){
                System.out.println(-1);
            }
        }


        public boolean listaVazia(){
        if(primeiro==null){
            return true;
        }
            return false;
        }

    }

