package pokemonGo;

import java.util.ArrayList;
import java.util.List;

public class Regiao {
	private String Nome;
	private String historia;
	private List<String> cidades = new ArrayList<String>();
	private List<String> insignias = new ArrayList<String>();
	private List<String> equipesAntagonistas = new ArrayList<String>();
	private List<String> pokemonsIniciais = new ArrayList<String>();
	private List<String> pokemonsMiticos = new ArrayList<String>();
	private List<String> pokemonsLendarios = new ArrayList<String>();
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public List<String> getCidades() {
		return cidades;
	}
	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}
	public List<String> getInsignias() {
		return insignias;
	}
	public void setInsignias(List<String> insignias) {
		this.insignias = insignias;
	}
	public List<String> getEquipesAntagonistas() {
		return equipesAntagonistas;
	}
	public void setEquipesAntagonistas(List<String> equipesAntagonistas) {
		this.equipesAntagonistas = equipesAntagonistas;
	}
	public List<String> getPokemonsIniciais() {
		return pokemonsIniciais;
	}
	public void setPokemonsIniciais(List<String> pokemonsIniciais) {
		this.pokemonsIniciais = pokemonsIniciais;
	}
	public List<String> getPokemonsMiticos() {
		return pokemonsMiticos;
	}
	public void setPokemonsMiticos(List<String> pokemonsMiticos) {
		this.pokemonsMiticos = pokemonsMiticos;
	}
	public List<String> getPokemonsLendarios() {
		return pokemonsLendarios;
	}
	public void setPokemonsLendarios(List<String> pokemonsLendarios) {
		this.pokemonsLendarios = pokemonsLendarios;
	}

	
}
