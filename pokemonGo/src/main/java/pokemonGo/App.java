package pokemonGo;

import java.util.Map;

public class App {

	public static void main(String[] args) {
		Treinador treinador1 = new Treinador();
		treinador1.setIdade(12);
		treinador1.setNome("Ash");
		System.out.println("\nPrimeiro treinador começou sua caçada aos pokemons:\n");
		treinador1.gerarPokemonSelvagem("Picachu");
		treinador1.gerarPokemonSelvagem("Picachu");
		treinador1.gerarPokemonSelvagem("Picachu");
		treinador1.gerarPokemonSelvagem("Picachu");
		treinador1.gerarPokemonSelvagem("Raichu");
		treinador1.gerarPokemonSelvagem("Bulbassauro");
		treinador1.gerarPokemonSelvagem("Gengar");
		
		
		System.out.println("\nVamos ver todos os pokemons em sua pokedex:\n");
		for (Map.Entry<String, Pokemon> entry : treinador1.getPokedex().getEspecies().getCriatura().entrySet()) {
		    System.out.println(entry.getKey());
		}
		Treinador treinador2 = new Treinador();
		treinador2.setIdade(12);
		treinador2.setNome("Brock");
		System.out.println("\nSegundo treinador começou sua caçada aos pokemons:\n");
		treinador2.gerarPokemonSelvagem("Abba");
		treinador2.gerarPokemonSelvagem("Onix");
		treinador2.gerarPokemonSelvagem("Eve");
		treinador2.gerarPokemonSelvagem("Ratata");
		System.out.println("\nVamos ver todos os pokemons em sua pokedex:\n");
		for (Map.Entry<String, Pokemon> entry : treinador2.getPokedex().getEspecies().getCriatura().entrySet()) {
		    System.out.println(entry.getKey());
		}
		Desafiante jogador1 = treinador1.gerarDesafiante();
		Desafiado jogador2 = treinador1.gerarDesafiado(treinador2);
		
		System.out.println("\nO primeiro treinador acaba de desafiar o segundo treinador em uma batalha pokemon:\n");

		AtaqueDesafiado atacarDesafiado = new AtaqueDesafiado();
		atacarDesafiado.setDesafiado(jogador2);
		atacarDesafiado.setDesafiante(jogador1);
		AtaqueDesafiante atacarDesafiante = new AtaqueDesafiante();
		atacarDesafiante.setDesafiado(jogador2);
		atacarDesafiante.setDesafiante(jogador1);

		jogador1.setGolpe(atacarDesafiado);
		jogador2.setGolpe(atacarDesafiante);
		while(jogador1.getPokemon().getVida() > 0 && jogador2.getPokemon().getVida() > 0) {
			jogador1.atacarDesafiado();
			jogador2.atacarDesafiante();
		}

	}

}
