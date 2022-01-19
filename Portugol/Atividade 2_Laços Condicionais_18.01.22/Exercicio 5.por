/*
 	Exercicio 5
 	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
	medido e emita a notificação adequada aos diferentes grupos de empresas.
 */
	/*
	 // Indice real 
	/// são 3 grupos
	// Indice aceitavel varia de 0,05 até 0,25
	// se subir para para 0,3 = 1º Grupo são intimadas a suspenderem as atividades
	// Se subir para 0,4 = Industrias do 1º e 2º Grupo são intimadas a suspenderem as atividades.
	// se subir para 0,5 todos os grupos devem ser notificados a paralisarem as atividades
	// Faça um sistema que leia o índice de poluição,
	// medido e emita a notificação adequada aos diferentes grupos de empresas.
	*/
programa
{
	
	funcao inicio()
	{
		real IndicePolui
		cadeia G1, G2, G3
		G1 = "1º Grupo"
		G2 = "2º Grupo"
		G3 = "3º Grupo"
		
		escreva ("Qual o Indice de poluição ?: ")
		leia (IndicePolui)

		se (IndicePolui >= 0.05 e IndicePolui <= 0.25) 
		{
			escreva ("Indice Aceitavel")
		} senao se (IndicePolui >= 0.3 e IndicePolui < 0.4){
			escreva ("As Atividades do: " + G1 + " Estão suspenças")
		}senao se (IndicePolui >=0.4 e IndicePolui <= 0.5){
			escreva ("As Atividades do: " + G1 + " e do " + G2 + " Estão suspenças")
		}senao se (IndicePolui >= 0.5){
		  	escreva ("As Atividades do: " + G1 + ", " + G2 + " e do " + G3 + " Estão suspenças")
		}senao {
		  		escreva ("O indice não é classificavel")}
	}
}			
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */