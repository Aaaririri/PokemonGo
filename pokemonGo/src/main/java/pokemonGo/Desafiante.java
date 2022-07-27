package pokemonGo;

public class Desafiante extends Jogador {
	protected Desafiante() {};
	public void trocarEstado() {
		estado.manipulador(this);
	}
	public void atacarDesafiado() {
		chamaAtacar();
	}
}
