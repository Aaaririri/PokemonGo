package pokemonGo;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
	PokemonsParaPokedex especies = new PokemonsParaPokedex();
	private List<Criatura> criaturas = new ArrayList<Criatura>();
	
	public void novoPokemon(String pokemon) {
		criaturas.add(especies.getCriatura(pokemon));
	}
	
	public PokemonsParaPokedex getEspecies() {
		return especies;
	}

	public void setEspecies(PokemonsParaPokedex especies) {
		this.especies = especies;
	}
	
}
