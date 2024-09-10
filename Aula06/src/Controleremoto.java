
public class Controleremoto implements Construtor {
	// atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	// métodos especiais
	
	
	public Controleremoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		
	}


	private int getVolume() {
		return volume;
	}


	private void setVolume(int volume) {
		this.volume = volume;
	}


	private boolean getLigado() {
		return ligado;
	}


	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	private boolean getTocando() {
		return tocando;
	}


	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}


	// metodos abstratos
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
		
	}


	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}


	@Override
	public void AbrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("----- MENU -----");
		System.out.println("Está Ligado? " + this.getLigado());
		System.out.println("Está Tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10 ) {
			System.out.print("[]");
		
				}
	}


	@Override
	public void FecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Fechando o menu");
		
	}


	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume() +5);
		}
	}


	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume() -5);
		}
		
	}


	@Override
	public void LigarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}


	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && !(this.getTocando()) ) {
			this.setTocando(true);
		}
	}


	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && (this.getTocando())) {
			this.setTocando(false);
		}
	}
	
	
	
	

}
