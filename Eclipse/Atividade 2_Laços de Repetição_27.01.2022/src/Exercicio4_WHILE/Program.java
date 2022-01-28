
// Exericio 4_While
// Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
// psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
// era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
// (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
// agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
// pessoas, calcule e mostre:
// * o n�mero de pessoas calmas;
// * o n�mero de mulheres nervosas;
// * o n�mero de homens agressivos;
// * o n�mero de outros calmos;
// * o n�mero de pessoas nervosas com mais de 40 anos;
// * o n�mero de pessoas calmas com menos de 18 anos.
package Exercicio4_WHILE;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, opc, totPes=0;
		int totCalm=0, muNerv=0, hoAgress=0, otherCalm=0, nerv40=0,calm18=0;
		
		while(totPes < 3) {// Simula��o com a quantidade de X pessoas.
		System.out.println("Qual a sua idade: ");
		idade = leia.nextInt();
		System.out.println("Informe o seu Sexo:\n1-Feminino.\n2-Masculino.\n3-Outro");
		sexo = leia.nextInt();
		System.out.println("Informe uma das op��es abaixo:\n1-Voc� � Calmo?\n2-Nervoso?\n3-Ou Agressivo?");
		// (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		opc = leia.nextInt();
		
		if(opc == 1) {
			totCalm++;
			}if(sexo == 3) {
				otherCalm++;
			}if(idade<18) {
				calm18++;
			}
		if(opc == 2) {
			if(sexo ==1) {
				muNerv++;
			}if(idade >=40) {
				nerv40++;
			}
		} 
		if(sexo == 2 && opc == 3) {
			hoAgress++;
		}
		totPes++;
		}
		System.out.println("O n�mero de pessoas calmas �: "+totCalm);
		System.out.println("O n�mero de mulheres nervosaas �: "+muNerv);
		System.out.println("O n�mero de homens agressivos �: "+hoAgress);
		System.out.println("O n�mero de outros calmos �: "+otherCalm);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+nerv40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+calm18);
		leia.close();

	}

}
