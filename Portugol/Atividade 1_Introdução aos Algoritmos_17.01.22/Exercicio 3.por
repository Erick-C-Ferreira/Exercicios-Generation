programa
{
	
	funcao inicio()
	{
		inteiro horas
		inteiro minutos
		inteiro segundos

		escreva("Quantos segundos deseja converter: ")
		leia(segundos)

		horas = segundos / 3600
		minutos = segundos / 60

		escreva("\nSão " + horas + " horas")
		escreva("\nSão " + minutos + " minutos")
		escreva("\nSão " + segundos + " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */