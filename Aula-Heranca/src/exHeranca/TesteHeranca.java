package exHeranca;

public class TesteHeranca {
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria dos Santos");
		p1.setCpf("111.552.211-09");
		p1.setSexo('F');
		
		System.out.println("Pessoa: \n" + p1.dadosPessoa());
		
		Aluno a1 = new Aluno();
		a1.setNome("Paulo Soares");
		a1.setCpf("092.915.143-77");
		a1.setSexo('M');
		a1.setCurso("ADS");
		a1.setAnoIngresso(2022);		
		
		System.out.println("Aluno: \n" + a1.dadosAluno());
	}

}
