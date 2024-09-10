package exercicioaula02;
public class DandoAula { 

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // essa classe é do objeto instanciado aula e dando aula é o estado desse objeto
        
        Aula c1 = new Aula(); // Substitua 'true' por 'false' lá em c1.greve para simular a ausência de greve
        c1.horario = "Manhã ";
        c1.dia = "Quarta ";
        c1.sala =  (int) 110f;
        c1.conteudo = "Java ";
        c1.greve = true;
                
       Aula c2 = new Aula (); // Substitua 'true' por 'false' lá em c1.greve para simular a ausência de greve
       c2.horario = "Tarde " ;
       c2.dia = "Quinta ";
       c2.sala = (int) 210f;
       c2.conteudo = "Java Script ";
       c2.greve = false;
       
        // Método status da aula
        c1.status();
         // Método verificando se vai ter aula
        c1.verificarAula();
                      
        c2.status();
        c2.verificarAula(); 
       
    }

   
}
    

