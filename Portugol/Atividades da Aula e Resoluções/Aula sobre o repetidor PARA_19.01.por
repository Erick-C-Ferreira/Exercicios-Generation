programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, media, somaMedia=0.0, mediaGeral
		inteiro x

		para(x=1;x<=5;x++ ) // x = x +1
		// tem 3 parametros, 1º parametro = inicio do laço(primeiro aluno), 
		//2º indicação até onde vai, 3º indicação de como vai rodar este laço
		{
			escreva ("\nEntre com a Primeira Nota: ")
			leia(n1)
			escreva ("\nEntre com a Segunda Nota: ")
			leia(n2)
			escreva ("\nEntre com a Terceira Nota: ")
			leia(n3)

			media = (n1+n2+n3) / 3
			escreva ("\nMédia do Aluno "+x+" foi de: "+media)
			se (media>=7.0 e media <=10.0)
			{
				escreva ("\nAluno Aprovado")
			}
			senao se (media>=5.0 e media <7.0)
			{
				escreva ("\nAluno de Exame")
			}
			senao
			{
				escreva ("\nAluno Reprovado")
			}
			somaMedia = somaMedia + media
		}
		mediaGeral = somaMedia / 5
		escreva ("\nMédia geral da turma foi de: "+mediaGeral)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 867; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */