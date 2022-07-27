package pokemonGo;

public class Atacando implements Estado {

	public void manipulador(Jogador j) {
		if (j.getEscudo() > 0 && j.getEstado() instanceof  Atacando) {
			j.setEstado(new Escudo());
			j.setEscudo(j.getEscudo() - 1);
			System.out.printf("%s levantou o escudo",j.getNome());	
		} else {
			System.out.printf("%s nao possui mais escudos",j.getNome());
		}
		
	}

}
