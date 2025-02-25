package aula01;

public class Main {
	
	public static void main(String[] args) {
		Aula aula = new Aula();
		
		System.out.println("ja cansei de dar oi para o mundo e nunca responderem...");
		aula.sout2("melhor que o syout");
		
		Cafe cantina = new Cafe("PILÃO", 1.0, 2);
		aula.sout2(cantina.toString());
		
		cantina.setPreco(cantina.getPreco()*2);
		aula.sout2(cantina.toString());
		
		aula.variaveisAluno();
	}	

}

