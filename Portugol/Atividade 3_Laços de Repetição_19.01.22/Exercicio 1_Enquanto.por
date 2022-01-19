/*
	Exericio 1 - "Enquanto"
 	Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores 
enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */

programa
{
	
	funcao inicio()
	{
		real num, totalSoma = 0.0, media, totalValores = 0.0
		
		escreva("Escreva um numero maior que zero: ")
		leia(num)
		
		enquanto (num >= 0) {
			totalSoma = totalSoma + num
			totalValores++
			escreva("\nDigite o proximo Número positvo: ")
			leia(num)
		} 	
		se (totalValores != 0) {
		media = totalSoma / totalValores
		} 	senao {
			media = 0.0	
		}
	
	escreva ("\nO total da soma é: " + totalSoma + "\nA média é de: " +media
	+ "\nVocê digitou: " + totalValores + " valores positivos")
			
			se(num < 0)
			escreva ("\nContagem Encerrada!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */