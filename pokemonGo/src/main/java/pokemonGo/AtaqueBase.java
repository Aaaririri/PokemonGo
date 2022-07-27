package pokemonGo;

import java.util.Random;

public class AtaqueBase {
	private int dano;

	public int getDano() {
		return dano;
	}

	public void setDano() {
        Random gerador = new Random();
		this.dano = gerador.nextInt(10) + 1;
	}
	
}
