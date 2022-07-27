package pokemonGo;

import java.util.ArrayList;
import java.util.List;

public class Tipo {
	private String tipo;
	private List<String> vantagens = new ArrayList<String>();
	private List<String> desvantagens = new ArrayList<String>();
	private List<String> imunidades = new ArrayList<String>();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<String> getVantagens() {
		return vantagens;
	}
	public void setVantagens(List<String> vantagens) {
		this.vantagens = vantagens;
	}
	public List<String> getDesvantagens() {
		return desvantagens;
	}
	public void setDesvantagens(List<String> desvantagens) {
		this.desvantagens = desvantagens;
	}
	public List<String> getImunidades() {
		return imunidades;
	}
	public void setImunidades(List<String> imunidades) {
		this.imunidades = imunidades;
	}
}
