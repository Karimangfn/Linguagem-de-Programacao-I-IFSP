package Exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Localizacao {
	
	List<String> Separador = new ArrayList<>();
	List<String> Separador2 = new ArrayList<>();

	public List<String> MudarIdiomaPT(int quantidadecomeco, int quantidadefim) {
		try {     
            FileReader fr = new FileReader("C:\\Users\\Kariman\\Desktop\\Kariman\\Anotações em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 até xx.xx.xxxx\\3- Quarta - Linguagem de Programação l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\localizacao-pt.txt");   
            BufferedReader br = new BufferedReader(fr); 
            String linha;      
            while ((linha = br.readLine()) != null){ 
                String[] palavrasDaLinha = linha.split(";");
                
                for(String palavra : palavrasDaLinha) {
                	if(palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                        Separador.add(palavra);         
                	}
                }
                linha = br.readLine();
              
            }  
            br.close();

            for (int i = quantidadecomeco; i < quantidadefim ; i++) {
            System.out.println(Separador.get(i));
            }
           
        } catch (FileNotFoundException el){   
            System.out.println("Arquivo não Encontrado!");   
            
        } catch (IOException e){   
            e.printStackTrace();   
        }   
		return Separador;
    }
	
       public List<String> MudarIdiomaEN(int quantidadecomeco, int quantidadefim) {	
		try {     
            FileReader fr = new FileReader("C:\\Users\\Kariman\\Desktop\\Kariman\\Anotações em geral\\Faculdade - 2021 - Um Dia\\3 Semestre 10.03.2022 até xx.xx.xxxx\\3- Quarta - Linguagem de Programação l - Leonardo Bertholdo\\Projetos e Trabalhos\\Exercicios para 10.05.2022\\src\\localizacao-en.txt");   
            BufferedReader br = new BufferedReader(fr); 
            String linha;      
            while ((linha = br.readLine()) != null){
                
                String[] palavrasDaLinha = linha.split(";");
                
                for(String palavra : palavrasDaLinha) {
                	if(palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                        Separador2.add(palavra);         
                	}
                }
                linha = br.readLine();
              
            }  
            br.close();
            
            for (int i = quantidadecomeco; i < quantidadefim ; i++) {
            System.out.println(Separador2.get(i));
            }
           
        } catch (FileNotFoundException el){   
            System.out.println("Arquivo não Encontrado!");   
            
        } catch (IOException e){   
            e.printStackTrace();   
        }   
		return Separador2;
    }
	
}

