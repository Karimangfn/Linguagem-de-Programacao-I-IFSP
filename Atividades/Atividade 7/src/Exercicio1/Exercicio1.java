package Exercicio1;

import java.io.IOException;
import java.util.Scanner;

	public class Exercicio1{

		public static void main(String[] args) throws IOException {
			
			 Scanner Scan = new Scanner (System.in);
			 int opcao;
			 int opcao2;
			 Lista l = new Lista();
			 RegistroLog r = new RegistroLog();
			 Localizacao lo = new Localizacao();
			 String elemento; 
			 int controle;
			 int posicao;
			
			 do {
			 System.out.println("Qual o idioma Desejado? [Digite 1 para Portugues ou Digite 2 para Ingles]");
			 opcao2 = Scan.nextInt();
			 if (opcao2 != 1 && opcao2 != 2) {
				 System.out.println("Opção invalida");
			 }
			 } while (opcao2 != 1 && opcao2 != 2);
		
			 switch (opcao2) {
			 case 1:
		     //Idioma em Portugues
				 do {
				 lo.MudarIdiomaPT(0,10);
				 opcao = Scan.nextInt();
				 
				 switch (opcao) {
				 case 1:
					 lo.MudarIdiomaPT(10,11);
					 elemento = Scan.next();
					 l.InserirProduto(elemento);
					 lo.MudarIdiomaPT(11,12);
					 controle = 1;
					 r.RegistrarLog(1);
				 break;
				 	
				 case 2:
					 lo.MudarIdiomaPT(10,11);
					 Scan.nextLine();
					 elemento = Scan.nextLine();
					 lo.MudarIdiomaPT(12,13);
					 posicao = Scan.nextInt();
					 l.InserirProdutoPosicaoEspecifica(posicao, elemento);
					 lo.MudarIdiomaPT(11,12);
					 controle = 2;
					 r.RegistrarLog(2);
				 break;
				 
				 case 3:
					 lo.MudarIdiomaPT(13,14);
					 Scan.nextLine();
					 elemento = Scan.nextLine();
					 l.ConsultarProdutoNome(elemento);
					 if (l.ConsultarProdutoNome(elemento) == true) {
						 lo.MudarIdiomaPT(14,15);
					 }
					 else {
						lo.MudarIdiomaPT(15,16);
					 }
					 controle = 3;
					 r.RegistrarLog(3);
				 break;
					 
				 case 4:
					 lo.MudarIdiomaPT(16,17);
					 posicao = Scan.nextInt();
					 lo.MudarIdiomaPT(17,18);
					 System.out.println("Posição: " + posicao + " Produto: " + l.ConsultarProdutoPosicao(posicao));
					 controle = 4;
					 r.RegistrarLog(4);
				 break;
			     
				 case 5:
					 lo.MudarIdiomaPT(18,19);
					 posicao = Scan.nextInt();
					 lo.MudarIdiomaPT(19,20);
					 Scan.nextLine();
					 elemento = Scan.nextLine();
					 l.SubstituirProduto(posicao, elemento);
					 lo.MudarIdiomaPT(20,21);
					 controle = 5;
					 r.RegistrarLog(5);
				 break;
				 
				 case 6:
					 lo.MudarIdiomaPT(21,22);
					 Scan.nextLine();
					 elemento = Scan.nextLine();
					 l.RemoverProdutoNome(elemento);
					 controle = 6;
					 r.RegistrarLog(6);
				 break;
				 
				 case 7:
					 lo.MudarIdiomaPT(22,23);
					 posicao = Scan.nextInt();
					 l.RemoverProdutoPosicao(posicao);
					 controle = 7;
					 r.RegistrarLog(7);
				 break;
				 
				 default:
				 if (opcao != 0)
					 lo.MudarIdiomaPT(23,24);
				 else
					lo.MudarIdiomaPT(24,25);
			     break;
				 }
				 
				 } while (opcao != 0);
				 Scan.close();	
				 break;
			 
			 case 2:
			 //Idioma em Ingles
				     do {
					 lo.MudarIdiomaEN(0,10);
					 opcao = Scan.nextInt();
					 
					 switch (opcao) {
					 case 1:
						 lo.MudarIdiomaEN(10,11);
						 elemento = Scan.next();
						 l.InserirProduto(elemento);
						 lo.MudarIdiomaEN(11,12);
						 controle = 1;
						 r.RegistrarLog(1);
					 break;
					 	
					 case 2:
						 lo.MudarIdiomaEN(10,11);
						 Scan.nextLine();
						 elemento = Scan.nextLine();
						 lo.MudarIdiomaEN(12,13);
						 posicao = Scan.nextInt();
						 l.InserirProdutoPosicaoEspecifica(posicao, elemento);
						 lo.MudarIdiomaEN(11,12);
						 controle = 2;
						 r.RegistrarLog(2);
					 break;
					 
					 case 3:
						 lo.MudarIdiomaEN(13,14);
						 Scan.nextLine();
						 elemento = Scan.nextLine();
						 l.ConsultarProdutoNome(elemento);
						 if (l.ConsultarProdutoNome(elemento) == true) {
							 lo.MudarIdiomaEN(14,15);
						 }
						 else {
							lo.MudarIdiomaEN(15,16);
						 }
						 controle = 3;
						 r.RegistrarLog(3);
					 break;
						 
					 case 4:
						 lo.MudarIdiomaEN(16,17);
						 posicao = Scan.nextInt();
						 lo.MudarIdiomaEN(17,18); System.out.println("Position: " + posicao + " Product: " + l.ConsultarProdutoPosicao(posicao));
						 controle = 4;
						 r.RegistrarLog(4);
					 break;
				     
					 case 5:
						 lo.MudarIdiomaEN(18,19);
						 posicao = Scan.nextInt();
						 lo.MudarIdiomaEN(19,20);
						 Scan.nextLine();
						 elemento = Scan.nextLine();
						 l.SubstituirProduto(posicao, elemento);
						 lo.MudarIdiomaEN(20,21);
						 controle = 5;
						 r.RegistrarLog(5);
					 break;
					 
					 case 6:
						 lo.MudarIdiomaEN(21,22);
						 Scan.nextLine();
						 elemento = Scan.nextLine();
						 l.RemoverProdutoNome(elemento);
						 controle = 6;
						 r.RegistrarLog(6);
					 break;
					 
					 case 7:
						 lo.MudarIdiomaEN(22,23);
						 posicao = Scan.nextInt();
						 l.RemoverProdutoPosicao(posicao);
						 controle = 7;
						 r.RegistrarLog(7);
					 break;
					 
					 default:
					 if (opcao != 0)
						 lo.MudarIdiomaEN(23,24);
					 else
						 lo.MudarIdiomaEN(24,25);
				     break;
					 }
					 
					 } while (opcao != 0);
					 Scan.close();	
					 break;
			 }
		
	}
	}
