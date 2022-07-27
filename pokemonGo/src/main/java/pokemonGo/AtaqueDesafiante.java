package pokemonGo;

import java.util.Scanner;

public class AtaqueDesafiante implements Batalha {
	private Desafiante desafiante;
	private Desafiado desafiado;
	
	public void atacar() {
		if (desafiante.getPokemon().getVida() > 0 && desafiado.getPokemon().getVida() > 0) {
			if(desafiado.getCooldown() >= desafiado.getPokemon().getAtaqueEspecial().getCooldown()) {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.printf("\n%s digite 0 para levantar o escudo ou 1 para continuar atacando:", desafiante.getNome());
				int escudo = s.nextInt();
				if (escudo == 0) {
					desafiante.trocarEstado();
				}
				if (desafiante.getEstado() instanceof Atacando) {
					int dano = (int) (desafiado.getPokemon().getAtaqueEspecial().getDano() + Math.floor((desafiado.getPokemon().getPc()*10)/desafiado.getPokemon().getPc()));
					System.out.printf("\n%s %s seu pokemon %s sofreu um dano de %d",desafiado.getPokemon().getAtaqueEspecial().getNome(), desafiante.getNome(), desafiante.getPokemon().getEspecie(), dano);
					desafiante.getPokemon().setVida(desafiante.getPokemon().getVida() - dano);
					desafiado.setCooldown(0);
				} else {
					System.out.printf("\n%s foi defendido pelo escudo", desafiante.getPokemon().getAtaqueEspecial().getNome());
					desafiante.trocarEstado();
					desafiado.setCooldown(0);
				}
			} else {
				int dano = (int) (desafiado.getPokemon().getAtaqueBase().getDano());
				System.out.printf("\n%s seu pokemon %s sofreu um dano de %d", desafiante.getNome(), desafiante.getPokemon().getEspecie(), dano);
				desafiante.getPokemon().setVida(desafiante.getPokemon().getVida() - dano);
				desafiado.setCooldown(desafiado.getCooldown() +1);
			}
			if (desafiante.getPokemon().getVida()>0) {
				System.out.printf("\n%s seu pokemon %s tem %d de vida", desafiante.getNome(), desafiante.getPokemon().getEspecie(), desafiado.getPokemon().getVida());
			}
			else {
				System.out.printf("\n%s voce venceu!!!!", desafiado.getNome());
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
