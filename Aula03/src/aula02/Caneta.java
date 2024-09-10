package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
            System.out.println("Modelo " + this.modelo);
            System.out.println("Uma caneta " + this.cor);
            System.out.println("Está tampada? " + this.tampada);
            System.out.println("Qual é a ponta? " + this.ponta);
            System.out.println("Qual Carga? " + this.carga);
    }
    
    public void rabiscar() {
         if (this.tampada == true) {
             System.out.println("ERRO! Não posso Rabiscar! ");
             }  else {
             System.out.println("Estou Rabiscando! ");
         }     
    }
    
    public void tampar() {
        this.tampada = true;
                      
    }
    
    protected void destampar() {
        this.tampada = false;
        
    }

}
  
    
    
    
