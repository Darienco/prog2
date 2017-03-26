package estacionamento;

public class Vaga {
    int numVaga;
    char lado;
    boolean isFull;
    String placa;
    int horaChegada;
    int horaPartida;
    
    
    Vaga(){
        numVaga = 0;
        lado = ' ';
        isFull = false;
        placa = "";
        horaChegada = 0;
        horaPartida = 0;
                }
    
    int calcularTempo(){
        int horaEntrada;
        int horaSaida;
        int minutoEntrada;
        int minutoSaida;
        
        return (horaSaida - horaChegada);
    }
    
    void chegar(int horaAgora){
        horaChegada = horaAgora;
    }
    
    void sair(int horaAgora){
        horaPartida = horaAgora;
    }
    
    public void ocupar(){
        isFull = true;
    
    }
    public void desocupar(){
        isFull = false;
    
    }
    public String checarVaga(){
        if(isFull){
            return "Ocupado";
        }
        else{
            return "Desocupado";
            }
}
    @Override
    public String toString(){
       return this.checarVaga();
    }
}

   