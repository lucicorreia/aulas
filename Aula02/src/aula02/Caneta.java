package aula02;
public class Caneta {
    String modelo;
    String cor;
    boolean tampada;
    float ponta;
    int carga;
    void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual é a ponta? " + this.ponta);
        System.out.println("Qual Carga? " + this.carga);
    }
    
    void rabiscar() {
         if (this.tampada == true) {
             System.out.println("ERRO! Não posso Rabiscar! ");
             }  else {
             System.out.println("Estou Rabiscando! ");
         }     
    }
    
    void tampar() {
        this.tampada = true;
                      
    }
    
    void destampar() {
        this.tampada = false;
        
    }

}
  
    
    
    
