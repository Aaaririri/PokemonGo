package pokemonGo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Treinador implements GeradorDePokemonsSelvagens, CriadorDeJogadores {
	private String nome;
	private int idade;
	private Pokemon pokemonDeBatalha;
	private List<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Time time;
	private Regiao regiao = new Regiao();
	private Pokedex pokedex = new Pokedex();
	
	public Desafiante gerarDesafiante() {
		Desafiante novoDesafiante = new Desafiante();
		novoDesafiante.setNome(getNome());
		novoDesafiante.setPokemon(pokemonDeBatalha);
		return novoDesafiante;
	}
	
	public Desafiado gerarDesafiado(Treinador desafiado) {
		Desafiado novoDesafiado = new Desafiado();
		novoDesafiado.setNome(desafiado.getNome());
		novoDesafiado.setPokemon(desafiado.getPokemonDeBatalha());
		return novoDesafiado;
	}

	public void gerarPokemonSelvagem(String str) {
        Random gerador = new Random();
        int teste = gerador.nextInt(100);
		if (teste < 70 || pokemonDeBatalha == null) {
			Pokemon pokemon = new Pokemon();
			pokemon.setEspecie(str);
			int pc = gerador.nextInt(2000) + 10;
			pokemon.setPc(pc);
			int vida = gerador.nextInt(200) + 10;
			pokemon.setVida(vida);
			AtaqueBase ataqueBase = new AtaqueBase();
			ataqueBase.setDano();
			pokemon.setAtaqueBase(ataqueBase);
			AtaqueEspecial ataqueEspecial = new AtaqueEspecial();
			String ataqueEspecialNome = pokemon.getEspecie() + "Atack!!!";
			ataqueEspecial.setNome(ataqueEspecialNome);
			ataqueEspecial.setDano();
			ataqueEspecial.setCooldown();
			pokemon.setAtaqueEspecial(ataqueEspecial);
			pokemon.setRegiao(regiao);	
            System.out.printf("Um %s selvagem foi captudo\n", str);
            pokemons.add(pokemon);
            pokemonDeBatalha = pokemon;
            pokedex.novoPokemon(pokemon.getEspecie());
		} else {
            System.out.println("O Pokemon selvagem escapou");
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pokemon getPokemonDeBatalha() {
		return pokemonDeBatalha;
	}

	public void setPokemonDeBatalha(Pokemon pokemonDeBatalha) {
		this.pokemonDeBatalha = pokemonDeBatalha;
	}

	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public void gerarPokemonSelvagem() {
		// TODO Auto-generated method stub
		
	}

	public Pokedex getPokedex() {
		return pokedex;
	}

	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}


}
