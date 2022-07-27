package pokemonGo;

public class Escudo implements Estado {

	public void manipulador(Jogador j) {
		if (j.getEstado() instanceof  Escudo) {
			j.setEstado(new Atacando());
			System.out.printf("\n%s abaixou o escudo",j.getNome());
		}
	}

}
