package pokemonGo;

import java.util.HashMap;

public class PokemonsParaPokedex {
	private HashMap<String, Pokemon> pokemons = new HashMap<String,Pokemon>();
	public Criatura getCriatura(String pokemon) {		
		Pokemon p = pokemons.get(pokemon);
		if(p==null) {
			p = new Pokemon();
			p.setEspecie(pokemon);
			pokemons.put(pokemon, p);
		}
		return p;
	}		
	
	public HashMap<String, Pokemon> getCriatura() {
		return pokemons;
	}
	public void setCriatura(HashMap<String, Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
}
