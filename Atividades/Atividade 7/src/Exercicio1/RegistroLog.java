package Exercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistroLog {

	public void RegistrarLog(int controle) {
		File arquivo = new File("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt");
		    try {  	
				FileWriter fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				Calendar cal = Calendar.getInstance();
		    	cal.setTimeInMillis(arquivo.lastModified());
		    	String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			if (controle == 1) {
				fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a inser��o de um produto \n\n");
				bw.close();
			}
			else if (controle == 2) {
				fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a inser��o de um produto em uma posi��o especifica \n\n");
				bw.close();
			}
            else if (controle == 3) {
            	fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a Consulta de um produto pelo nome \n\n");
				bw.close();
			}
            else if (controle == 4) {
            	fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a consulta de um produto pela posi��o \n\n");
				bw.close();
            }
            else if (controle == 5) {
            	fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a substitui��o de um produto \n\n");
				bw.close();
            }
            else if (controle == 6) {
            	fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a remo��o de um produto pelo nome \n\n");
				bw.close();
            }
            else if (controle == 7) {
            	fw = new FileWriter("C:\\Users\\Kariman\\Desktop\\Kariman\\Anota��es em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 at� xx.xx.xxxx\\3- Quarta - Linguagem de Programa��o l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\registro-log.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(dataHora + " O Usuario solicitou a remo��o de um produto pela posi��o \n\n");
				bw.close();
            }	
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}

