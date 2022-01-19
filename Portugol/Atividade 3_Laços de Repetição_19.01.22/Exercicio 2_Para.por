/*
 Exericio 2 - "Para"
 Desenvolver um sistema que efetue a soma de todos os números ímpares // se(num%2 != 0) {programa}
 que são múltiplos de três // se(num%3 == 3) é pq ele é multiplo de 3
 e que se encontram no conjunto dos números de 1 até 500. //contador para(num = 1, num <= 500, num++)
 */

programa
{
	
	funcao inicio()
	{
		inteiro num = 1, somaNum = 0, ateNum
		ateNum = 500
		
		para (num = 1; num <=ateNum; num++) {
			se (num % 2 != 0) { // para saber se é impar
				se (num % 3 == 0) { // para saber se é multiplo de 3
					somaNum = somaNum + num
				}
			}
		}

		escreva("A somatoria dos números impares e multiplos de 3 entre 1 é 500 é de: " + somaNum)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */