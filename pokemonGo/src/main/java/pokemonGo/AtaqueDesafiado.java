package pokemonGo;

import java.util.Scanner;

public class AtaqueDesafiado implements Batalha {
	private Desafiante desafiante;
	private Desafiado desafiado;
	
	public void atacar() {
		if (desafiado.getPokemon().getVida() > 0 && desafiante.getPokemon().getVida() > 0) {
			if(desafiante.getCooldown() >= desafiante.getPokemon().getAtaqueEspecial().getCooldown()) {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.printf("\n%s digite 0 para levantar o escudo ou 1 para continuar atacando:", desafiado.getNome());
				int escudo = s.nextInt();
				if (escudo == 0) {
					desafiado.trocarEstado();
				}
				if (desafiado.getEstado() instanceof Atacando) {
					int dano = (int) (desafiante.getPokemon().getAtaqueEspecial().getDano() + Math.floor((desafiante.getPokemon().getPc()*10)/desafiante.getPokemon().getPc()));
					System.out.printf("\n%s %s seu pokemon %s sofreu um dano de %d",desafiante.getPokemon().getAtaqueEspecial().getNome(), desafiado.getNome(), desafiado.getPokemon().getEspecie(), dano);
					desafiado.getPokemon().setVida(desafiado.getPokemon().getVida() - dano);
					desafiante.setCooldown(0);
				} else {
					System.out.printf("\n%s foi defendido pelo escudo", desafiante.getPokemon().getAtaqueEspecial().getNome());
					desafiado.trocarEstado();
					desafiante.setCooldown(0);
				}
			} else {
				int dano = (int) (desafiante.getPokemon().getAtaqueBase().getDano());
				System.out.printf("\n%s seu pokemon %s sofreu um dano de %d", desafiado.getNome(), desafiado.getPokemon().getEspecie(), dano);
				desafiado.getPokemon().setVida(desafiado.getPokemon().getVida() - dano);
				desafiante.setCooldown(desafiante.getCooldown() +1);
			}
			if (desafiado.getPokemon().getVida()>0) {
				System.out.printf("\n%s seu pokemon %s tem %d de vida", desafiado.getNome(), desafiado.getPokemon().getEspecie(), desafiante.getPokemon().getVida());
			}
			else {
				System.out.printf("\n%s voce venceu!!!!", desafiante.getNome());
			}
		}
	}

	public Desafiante getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Desafiante desafiante) {
		this.desafiante = desafiante;
	}

	public Desafiado getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Desafiado desafiado) {
		this.desafiado = desafiado;
	}
}
