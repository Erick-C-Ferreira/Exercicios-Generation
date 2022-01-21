/*
 Exercicio 2
 Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */

programa
{
	
	funcao inicio()
	{
		real vetor[5], somaLan = 0.0, mediaLan, maiorPontu = 0.0, ocorrencia = 0.0

		para (inteiro rol=0; rol < 5; rol++) {
			escreva("Qual foi o maior valor no dado ?: ")
			leia (vetor[rol])

			somaLan += vetor[rol]
			limpa()

			se(vetor[rol] >= maiorPontu) {
				se (vetor[rol] == maiorPontu){
					ocorrencia++
				} senao {
					ocorrencia = 0.0 
					ocorrencia++
				}
				maiorPontu = vetor[rol]
			}
		}

		mediaLan = somaLan / 5
		escreva ("\nA media dos lançamentos e de: "+mediaLan)
		escreva ("\nO maior valor que foi: "+maiorPontu+" aparesceu: "+ocorrencia+"x")


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 14, 7, 5}-{maiorPontu, 14, 42, 10}-{ocorrencia, 14, 60, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */