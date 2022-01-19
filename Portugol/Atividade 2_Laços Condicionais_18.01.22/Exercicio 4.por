
/*
 Exercicio 4
 Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 
*/
programa
{
	
	funcao inicio()
	{
		inteiro  num

		escreva ("\nEntre com um número: ")
		leia (num)

		se (num % 2 == 0)
		{
			se (num>=0)
			{
				escreva("\nPar e Positivo...")
			}
			senao se (num<0)
			{
				escreva("\nPar e Negativo...")
			}
			senao
			{
				escreva("\nPar e Neutro...")
			}
		}
		senao
		{
			se(num>0)
			{
				escreva("\nÍmpar e Postivo...")
			}
			senao se (num<0)
			{
				escreva("\nÍmpar e Negativo...")
			}
			senao
			{
				escreva("\nÍmpar e Neutro...")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */