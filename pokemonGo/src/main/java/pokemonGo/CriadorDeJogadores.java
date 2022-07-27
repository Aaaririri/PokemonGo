package pokemonGo;

public interface CriadorDeJogadores {
	public abstract Desafiante gerarDesafiante();
	public abstract Desafiado gerarDesafiado(Treinador desafiante);
}
