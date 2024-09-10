package exercicioaula02;
public class Aula {
    String horario;
    String conteudo;
    String dia;
    int sala;
    boolean greve; 
// aqui vai o método do status da aula e impressão no terminal
    void status(){ 
    
        System.out.println("Horário da Aula é  " + this.horario);
        System.out.println("O assunto da Aula é " + this.conteudo);
        System.out.println("O dia da Aula é  " + this.dia);
        System.out.println("O número da Sala é  " + this.sala);
        } 
    
    // Método para verificar se vai ter aula ou não
    void verificarAula() {    
        if (greve) { System.out.println("Não vai ter aula, teve greve");
        } else {
        System.out.println("Vai ter aula, acabou a greve");
      }
        { 
        // Quebra de linha
        System.out.println();

                      
        } 
    }
    
}