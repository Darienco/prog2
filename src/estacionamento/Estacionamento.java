package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;


public class Estacionamento {

    
    public static void main(String[] args) {
    
        ArrayList<Vaga> vagas = new ArrayList();
        
        for(int i = 0; i < 12; i++){
        Vaga vaga = new Vaga();
        vaga.lado = 'e';
        vaga.numVaga = i;
        vagas.add(vaga); 
            
        }
       
        for(int i = 0; i < 12; i++){
        Vaga vaga = new Vaga();
        vaga.lado = 'd';
        vaga.numVaga = i;
        vagas.add(vaga); 
        
       }
        int op;
        do{ 
            
       
        System.out.println( 
                             "\n=========ESTACIONAMENTO========" +
                             "\n===============================" +
                             "\n==Selecione uma opcao=======================" +
                             "\n==[1] Estacionar===============" +
                             "\n==[2] Remover carro ===========" +
                             "\n===============================");
        
        for(int i = 0; i < 12; i++){
        System.out.println(" Vaga e" + (i+1) +" = "+ vagas.get(i));
            
        }
        for(int i = 0; i < 12; i++){
        System.out.println(" Vaga d" + (i+1) +" = "+ vagas.get(i+12));
            
        }
        
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        int hora;
        int vagaSelecionada;
        int ladoSelecionado;
        switch(op){
        case 1 :
            System.out.println( "Escolha o lado (0 = esquerdo // 1 = direito)" );
            ladoSelecionado = sc.nextInt();
            System.out.println( "Escolha a vaga" );
            vagaSelecionada = sc.nextInt();
            vagaSelecionada -=1;
            
            if(ladoSelecionado == 1){
            vagaSelecionada +=12;
            }
            vagas.get(vagaSelecionada).ocupar();
            
            System.out.println( "Digite o horario " );
            hora = sc.nextInt();
            vagas.get(vagaSelecionada).chegar(hora);
            
            
        break;
        
        case 2 :
            System.out.println( "Escolha o lado (0 = esquerdo // 1 = direito)" );
            ladoSelecionado = sc.nextInt();
            System.out.println( "Escolha a vaga" );
            vagaSelecionada = sc.nextInt();
            vagaSelecionada -=1;
            
            if(ladoSelecionado == 1){
            vagaSelecionada +=12;
            }
            vagas.get(vagaSelecionada).desocupar();
        
            System.out.println( "Digite o horario " );
            hora = sc.nextInt();
            vagas.get(vagaSelecionada).sair(hora);
        
            
            
            System.out.println( vagas.get(vagaSelecionada).calcularTempo() + "Horas");
            
            break;
      
        }
       }
        while(op != 0);
        }
       }
        



            