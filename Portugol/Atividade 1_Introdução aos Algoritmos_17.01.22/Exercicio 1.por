programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses 
		inteiro dias 
		inteiro TotalDeDias

		escreva("Quantos anos você tem:")
		leia (anos)
		escreva("Quantos meses você tem:")
		leia (meses)
		escreva("Quantosdias você tem:")
		leia (dias)
	
		TotalDeDias = (( anos * 365 ) + ( meses * 12 ) + dias)

		escreva("você tem " + TotalDeDias + " dias de vida")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */