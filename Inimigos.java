package entities;

	public class Inimigos {
		
		String nome;
		int lvl;
		int vidaTotal;
		
		void InfinitFire() {
			nome = "IMBUSHBOX";
			lvl = 1;
			vidaTotal = 100;
			
			System.out.printf("Nome: ", nome + "Level: ", lvl + "HP: ", vidaTotal);
			
		}
}
