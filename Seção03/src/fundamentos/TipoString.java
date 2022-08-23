package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa Tarde";
		//s = s.toUpperCase(); Para deixar os caracteres em capslock
		//s = "Boa Tarde"; Atribuir um novo valor
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));//startsWith é saber se começa com "Boa".
		System.out.println(s.toLowerCase().startsWith("boa"));//LowerCase Converte todos os caracteres desta String para minúsculas.
		System.out.println(s.toUpperCase().endsWith("TARDE"));//Saber se a String termina com "tarde".
		System.out.println(s.length());//Saber quantos caracteres tem uma String.
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));//Desconsidera letras maiúsculas ou minúsculas.
		
		
		var nome = "Rafael";
		var sobrenome = " Teles";
		var idade = 26;
		var salario = 12345.987;
		
		String maisUmaFrase = "\nNome: " + nome 
				+ "\nSobrenome:" + sobrenome
				+ "\nIdade: " + idade
				+ "\nSalario: " + salario + "\n";
		
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome 
							+ "\nSobrenome:" + sobrenome
							+ "\nIdade: " + idade
							+ "\nSalario: " + salario + "\n");
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		/*
		 *\n, serve para quebrar linhas.
		 * %s, são Strings.
		 * %d, valores inteiros.
		 * %f, valores flutuantes.
		 * .2, define quantas casas decimais será exibido.
		 */
		
		
		String frase = String.format("\n\nO Senhor %s %s tem %d anos e ganha R$%.2f\n\n", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 11));
	}
	

}
