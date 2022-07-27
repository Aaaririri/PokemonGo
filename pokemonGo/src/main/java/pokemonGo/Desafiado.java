package pokemonGo;

public class Desafiado extends Jogador {
	protected Desafiado() {};
	public void trocarEstado() {
		estado.manipulador(this);
	}
	public void atacarDesafiante() {
		chamaAtacar();
	}
}
