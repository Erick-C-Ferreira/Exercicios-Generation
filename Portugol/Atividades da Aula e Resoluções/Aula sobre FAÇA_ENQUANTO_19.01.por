programa
{
	
	funcao inicio()
	{
		inteiro numero, somaPar=0, contImpar=0

		escreva ("\nEntre com um número: ")
		leia(numero)

		faca
		{
			se(numero % 2 == 0)
			{
				somaPar += numero // somaPar = somaPar + numero
			}
			senao
			{
				contImpar++  // ContImpar = contImpar +1
			}
			escreva ("\nEntre com um número: ")
			leia(numero)	// 6 9 0
		}
		enquanto(numero!=0) // != quer dizer diferente

		escreva ("\nSomátorio dos números pares "+somaPar)
		escreva ("\nQuantidade de números Impares: "+contImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */