/*
	Exercicio  6
	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
 */

programa
{
	
	funcao inicio()
	{
		inteiro Idade
		cadeia IA, IB, JA, JB, A
		IA = "Infantil A"
		IB = "Infantil B"
		JA = "Juvenil A"
		JB = "JUvenil B"
		A = "Adultos"

		escreva ("Qual a Idade ? ")
		leia(Idade)

		   se (Idade >= 5 e Idade <= 7) { 
		   	escreva ("Categoria pertence a " + IA)
		 } 
		   	senao se (Idade >= 8 e Idade <= 11) {		   	
		   	escreva ("Categoria pertence a " + IB)
		   	
		 }   senao se (Idade >= 12 e Idade <= 13) {
		 	escreva ("Categoria pertence a " + JA)
		 	
		 }   senao se (Idade > 14 e Idade <= 17) {
		 	escreva ("Categoria pertence a " + JB)
		 	
		 }   senao se (Idade >= 18 ) {
		 	escreva ("Categoria de " + A)
		 	
		 }   senao {
		 	escreva ("Não existe categoria")
		 }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */