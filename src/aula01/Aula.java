package aula01;

import javax.swing.JOptionPane;

public class Aula {
	
	public void sout2(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
		return;
	}
	
	public static String scanner2() {
		String s = JOptionPane.showInputDialog("Digite a sua resposta: ");
		if (s.isBlank()){
			return "paia...";
		}
		return s;
	}
	
	public void variaveisAluno() {
		int idade = 0;
		char c = 'R';
		double d = 7.35;
		float f = 3.14f;
		
		String nome = scanner2();
		
		//sout2(idade+"\n"+c+"\n"+d+"\n"+f);
		sout2(idade);
		sout2(c);
		sout2(d);
		sout2(f);
		sout2("Meu nome é "+nome);
		
		int key = 0;
		switch (key) {
		case 0: {
			System.out.println("Esta eh a opção 0");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
}
