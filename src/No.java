public class No {
    int dado,indice;
    No proximo,anterior;

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                ", indice=" + indice +
                ", proximo=" + proximo +
                ", anterior=" + anterior +
                '}';
    }

    public No(int dado) {
        this.dado = dado;
        this.proximo=null;
        this.anterior=null;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getIndice() {
        return indice;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public int getDado() {
        return dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}