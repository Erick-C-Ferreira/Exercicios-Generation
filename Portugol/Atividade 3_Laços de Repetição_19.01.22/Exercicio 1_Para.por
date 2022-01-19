/*
 Exercicio 1
 A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário; se salario digitado > salario maior = salario digitado é salario maior
d) percentual de pessoas com salário até R$100,00. // <= 100 contar essa pessoa N/20 * 100
 */


programa
{
	
	funcao inicio()
	{
		real habitante, salario = 0.0, salarioTotal = 0.0, numFilho, numFilhoTotal = 0.0, mediaSalario
		real mediaFilho, maiorSalario = 0.0, percentual, pessoasAte100 = 0.0, numHab

		numHab = 2.0

		para (habitante = 1.0; habitante <= numHab; habitante++) { //habitante +1

			escreva("Qual o seu salário? ")
			leia(salario)
			escreva("Quantos filhos você tem? ")
			leia(numFilho)
			limpa()

			salarioTotal = salarioTotal + salario
			numFilhoTotal = numFilho + numFilho

			se (salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario <=100){
				pessoasAte100++ // PessoasAte100 +1
			}
		}

		mediaSalario = salarioTotal / numHab // media de todos os salarios computados pelo numero de habitantes
		mediaFilho = numFilhoTotal / numHab // em media quantos filhos cada habitante tem
		percentual = pessoasAte100 / numHab * 100 // numero de pessoas divididas pelos hab * 100

		 escreva ("A media do salario é de: R$" + mediaSalario)
		 escreva ("\nA média de filhos por habitantes é de: " + mediaFilho)
		 escreva ("\nO maior salario dentre os habitantes é de: R$" + maiorSalario)
		 escreva ("\nO percentual de pessoas com salario até R$100,00 é de: " + percentual +"%!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */