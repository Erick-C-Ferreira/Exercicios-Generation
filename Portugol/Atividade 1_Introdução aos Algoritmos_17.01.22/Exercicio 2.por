programa
{
	
	funcao inicio()
	{
	inteiro Anos
	inteiro meses
	inteiro dias
	inteiro TotalDias

	escreva ("Quantos Dias você tem: ")
	leia (TotalDias) // 1000

	Anos = TotalDias / 365 // 1000 / 365 = 2 anos
	meses = (TotalDias % 365) / 30 // 1000 % 365 = 270 / 30 = 9 meses
	dias = (TotalDias % 365) % 30 // 1000 % 365 = 270 % 30 = 0 dias
	

	escreva ("\nVocê tem " + Anos + " ano(s)")
	escreva ("\nVocê tem " + meses + " meses")
	escreva ("\nVocê tem " + dias + " dia(s)...")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */