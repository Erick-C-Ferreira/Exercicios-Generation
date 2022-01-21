/*
 Exercicio 4
 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
 
programa
{
	
	funcao inicio()
	{
		real matriz[3][3], somaTotal = 0.0, somaDiagonal = 0.0

		para (inteiro linha = 0; linha < 3; linha++) {
			para(inteiro coluna = 0; coluna < 3; coluna++) {
				escreva ("Digite um valor: ")
				leia (matriz[linha][coluna])
				somaTotal += matriz[linha][coluna]

				se (linha ==coluna) {
					somaDiagonal +=matriz[linha][coluna]
				}
				limpa()
				
			}
		escreva ("\nA soma total da matriz é de: "+somaTotal)
		escreva ("\nA soma da diagonal é de: "+somaDiagonal)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 13, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */