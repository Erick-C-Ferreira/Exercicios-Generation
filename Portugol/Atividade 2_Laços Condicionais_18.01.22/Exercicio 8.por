/*
	Exercicio 8
	Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
	for maior que 100, caso contrário imprimi-la com o valor zero.
 
 */

programa
{
	
	funcao inicio()
	{
		real N

		escreva ("Qual o valor da variavel? ")
		leia(N)

		se (N > 100) {
			escreva ("Seu numero é " + N)
		} senao {
			N = 0.0
			escreva ("Seu número é menor do que 101, logo aqui ele é " + N)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */