package pokemonGo;

import java.util.Random;

public class AtaqueEspecial {
	private String nome;
	private int dano;
	private int cooldown;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano() {
        Random gerador = new Random();
		this.dano = gerador.nextInt(20) + 1;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown() {
		Random gerador = new Random();
		this.cooldown = gerador.nextInt(5) + 1;
	}

}
