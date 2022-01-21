/*
 Exercicio 1
 Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

programa
{
	
	funcao inicio()
	{
		real vetor[5], maiorPontu = 0.0

		para (inteiro perg = 0; perg < 5; perg++) {	
			escreva ("\nEntre com um valor: ") // pergunto valor
			leia (vetor[perg]) // salvo valor no vetor
			escreva(vetor[perg]) //
			limpa() // limpo para perguntar denovo

			se (maiorPontu<vetor[perg]) { // pergunto se foi o maior valor digitado
				maiorPontu = vetor[perg] // salvo o valor
			}
		}
		para (inteiro perg = 0; perg < 5; perg++) { // salvo todos os valores para nao perguntar denovo
			escreva(vetor[perg]+", ")
		}
		
		escreva("\nO maior valor inserido foi: "+ maiorPontu) // escrevo o maior valor
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 12, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */