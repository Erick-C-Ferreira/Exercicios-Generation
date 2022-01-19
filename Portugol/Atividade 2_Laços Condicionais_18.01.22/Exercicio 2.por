
/*Exercicio - 2
Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/

programa
{
	
	funcao inicio()
	{
		real N, E, salarioTotal, salarioExcedente
		cadeia C
		 // C = nome do funcionario ou Mátricula
		 // N = codigo e numero de horas trabalhadas do Operario
          
		escreva ("Qual o nome do funcionario? ")
		leia (C)
		escreva ("Quantas horas o funcionário trabalhou ? ")
		leia (N)

		se (N > 50) 
		{
		E = N - 50  // ao sobra é o excedente
		salarioExcedente = (E * 20.0) // R$20,00 a hora
		salarioTotal = (50 * 10.0) + salarioExcedente // 50 horas por R$10,00 + hora extra
		escreva ("Seu salario excedente é de: R$" + salarioExcedente + "\nSeu salario total é de:  R$" + salarioTotal)
		}
		
			senao se (N <=50 e N > 0)
			{
				salarioTotal = N * 10 // não excedi horas então R$10 a hora
				escreva (C + "Seu salario total é de: R$" + salarioTotal)
			}
				
			senao se (N <= 0)
			{
				escreva ( C + " voce não trabalhou neste mês!")
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */