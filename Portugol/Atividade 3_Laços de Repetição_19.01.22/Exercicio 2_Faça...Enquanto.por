/*
	Exericio 2 - Faça_Enquanto
	Faça um programa que pegue um número do teclado e calcule a soma de todos os
	números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
	1+2+3+4+5+6+7=28.
 */

programa
{
	
	funcao inicio()
	{
		inteiro num, soma = 1, resultado = 0
		
		escreva ("Digite um Número do declado de 0 a 9: ")
		leia(num)
		
		se (num < 0) {
		escreva ("O numero nao pode ser calculado")
		}
		senao {
						
			faca{
			resultado += soma // 0+1+2 ....+5+6
			soma++ 
			
			} enquanto ( soma <= num)
		escreva(+ "O Resultado é = " + resultado)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */