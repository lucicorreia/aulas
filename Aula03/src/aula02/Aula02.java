package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 05.f;
        c1.status();
        c1.carga = 80;
        // c1.tampada = false;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
     
}
