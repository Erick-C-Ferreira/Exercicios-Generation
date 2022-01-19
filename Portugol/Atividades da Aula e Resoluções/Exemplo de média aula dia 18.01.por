programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva("Entre com a nota 1: ")
		leia(nota1)
		escreva("Entre com a nota 2: ")
		leia(nota2)
		escreva("Entre com a nota 3: ")
		leia(nota3)

		media = (nota1+nota2+nota3) / 3 // media aritimetica

		escreva ("\nMédia aritimetica do aluno foi de: " +media) // media = 5.8

		se(media>=7.0 e media<=10.0) // F e V = F
          {
		escreva ("\nAluno Aprovado!!!")
          }
          senao se(media>=5.0 e media< 7.0) // V e V = V
          {
          escreva ("\nAluno de Exame!!!")
          }
          senao se (media>=0.0 e media<5.0)
	     {
	     escreva ("\nAluno foi Reprovado!!!")
	     }
	     se nao 
	     {
          escreva
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */