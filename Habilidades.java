package entities;

public class Habilidades {
	
	String atacarPadrao;
	String seifar;
	String shieldBlock;
	double danoCausado = 150;  
	
	double comboHabilidade(String atacarPadrao, String seifar, String shieldBlock) {
		return danoCausado;
	}
	
	public void comboAtaque() {
		String hab1 = "Ataque Padrão, ";
		String hab2 = "Seifar";
		String hab3 = "BlockShield";
		String danoCausado = "150";
		
		System.out.println(hab1 + hab2 + hab3 + "e causou" + danoCausado);
	}
	
	
}
