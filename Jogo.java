package entities;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Jogo {
	public static void main(String[] args) {
	
		Habilidades habilidade = new Habilidades();
		Personagens personagem = new Personagens();
		Inimigos adv = new Inimigos();
		
		personagem.setNome(JOptionPane.showInputDialog(null, "Digite o nome do personagem: "));
		personagem.setFamilia(JOptionPane.showInputDialog("Digite em qual familia deseja criar: Human ou Darkness"));
		personagem.setClasse(JOptionPane.showInputDialog("Digite a classe que deseja criar: "));
		
		System.out.println("Parabéns, seu personagem foi criado.");
		System.out.println("Nome do personagem: " + personagem.getNome());
		System.out.println("Familia: " + personagem.getFamilia());
		System.out.println("Classe: " + personagem.getClasse());
		System.out.println("Level do personagem: " + personagem.level);
		
		System.out.println("-----------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
			System.out.println("Deseja atacar? 'sim' ou Desistir da luta 'desistir'");
			String resposta = sc.nextLine();

		if(resposta.equalsIgnoreCase("sim")) {
			System.out.println("Você atacou o inimigo!");
			System.out.println("Seu ataque causou: " + habilidade.comboHabilidade("ATAQUE PADRÃO", "SEIFAR", "BLO") + " de dano e derrotou o inimigo!");
			int subiuLvl = personagem.level + 1;
			System.out.println("Sucesso, você subiu de nivel: " + subiuLvl);
			
		} else if (resposta.equalsIgnoreCase("desistir")) {
			System.out.println("Você desistiu da luta e não subiu de level!");
		} 

		sc.close();
	}
	
}
