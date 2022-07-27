package pokemonGo;

public abstract class Jogador {
	private String nome;
	private Pokemon pokemon;
	private int escudo = 3;
	private int cooldown;
	private Batalha golpe;
	protected Estado estado = new Atacando();
	
	public abstract void trocarEstado();
	protected void chamaAtacar() {
		golpe.atacar();
	};
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public int getEscudo() {
		return escudo;
	}
	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	public Batalha getGolpe() {
		return golpe;
	}
	public void setGolpe(Batalha golpe) {
		this.golpe = golpe;
	}
	
}
