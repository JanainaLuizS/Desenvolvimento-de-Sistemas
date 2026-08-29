package exercicio11;

public class ListaCidades {

	public static void main(String[] args) {
		
		String[] cidades = {"Valença", "Vassouras", "Rio das Flores"};
		
		for(int i = 0; i < cidades.length ;i++) {
			System.out.println ((i+1) +"° cidade: " + cidades[i]);
	
		}
		
	}

}

/*11. Lista de cidades
Nome do projeto Java: ProjetoVetoresBasicos
Pacote: exercicio11
Classe principal: ListaCidades
Método: public static void main(String[] args)
Objetivo
Criar um vetor de textos já preenchido e percorrer suas posições.
Descrição
Desenvolva um programa que:
1. Crie um vetor chamado cidades. 
2. Armazene cinco nomes de cidades diretamente na declaração. 
3. Exiba cada cidade utilizando um comando for. 
4. Exiba também a posição de cada cidade.
*/