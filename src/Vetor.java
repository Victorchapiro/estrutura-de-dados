public class Vetor {
    int[]vetor;
    public Vetor(int tamanho) {
        int[]Novovetor=new int[tamanho];
        vetor=Novovetor;
    }
    public void add(int dado){
                for (int i=0;i<vetor.length-1;i++){
                    if (vetor[i]==0){
                        vetor[i]=dado;
                        break;
                    }

                }

            }


        public void mostrar(){
        for(int dado:vetor){
            if (dado!=0){
                System.out.println(dado);
            }
        }
        }



    }

