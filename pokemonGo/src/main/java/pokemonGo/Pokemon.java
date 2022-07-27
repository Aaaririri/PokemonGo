package pokemonGo;

public class Pokemon implements Criatura {
	private String especie;
	private int pc;
	private int vida;
	private Tipo tipo;
	private Regiao regiao;
	private AtaqueBase ataqueBase;
	private AtaqueEspecial ataqueEspecial;
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String pokemon) {
		this.especie = pokemon;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	public AtaqueBase getAtaqueBase() {
		return ataqueBase;
	}
	public void setAtaqueBase(AtaqueBase ataqueBase) {
		this.ataqueBase = ataqueBase;
	}
	public AtaqueEspecial getAtaqueEspecial() {
		return ataqueEspecial;
	}
	public void setAtaqueEspecial(AtaqueEspecial ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}
	
}	
