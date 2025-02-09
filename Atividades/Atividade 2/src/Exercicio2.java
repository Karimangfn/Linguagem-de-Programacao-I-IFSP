
public class Exercicio2 {

	public static void main(String[] args) {
		
		String Texto = "Uma ideia traz outra; o boticário imaginou que, uma vez preso o alienista, viriam também buscá-lo \r\n"
				+ "a ele, na qualidade de cúmplice. Esta ideia foi o melhor dos vesicatórios. Crispim Soares ergueu-se, \r\n"
				+ "disse que estava bom, que ia sair; e apesar de todos os esforços e protestos da consorte vestiu-se e \r\n"
				+ "saiu. Os velhos cronistas são unânimes em dizer que a certeza de que o marido ia colocar-se \r\n"
				+ "nobremente ao lado do alienista consolou grandemente a esposa do boticário; e notam com muita \r\n"
				+ "perspicácia, o imenso poder moral de uma ilusão; porquanto, o boticário caminhou resolutamente \r\n"
				+ "ao palácio do governo, não à casa do alienista. Ali chegando, mostrou-se admirado de não ver o \r\n"
				+ "barbeiro, a quem ia apresentar os seus protestos de adesão, não o tendo feito desde a véspera por \r\n"
				+ "enfermo. E tossia com algum custo. Os altos funcionários que lhe ouviam esta declaração,\r\n"
				+ "sabedores da intimidade do boticário com o alienista, compreenderam toda a importância da \r\n"
				+ "adesão nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro não \r\n"
				+ "tardava; Sua Senhoria tinha ido à Casa Verde, a negócio importante, mas não tardava. Deram-lhe \r\n"
				+ "cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porfírio era a de todos os patriotas; \r\n"
				+ "ao que o boticário ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria \r\n"
				+ "declarar a Sua Majestade";
		
		System.out.println("Letra A"); //Letra A)
		System.out.println("Posição da frase no texto: " + Texto.indexOf("E tossia com algum custo"));
		System.out.println(Texto.substring(799,823));
		
		System.out.println("\nLetra B"); //Letra B)
		Texto = Texto.replace("alienista" , "psiquiatra");
		System.out.println(Texto);
		
		System.out.println("\nLetra C"); //Letra C)
		Texto = Texto.replace("Crispim Soares", "Crispim Soares".toUpperCase());
		System.out.println(Texto);
		
		System.out.println("\nLetra D"); //Letra D)
		System.out.println(Texto.contains("vila"));
		System.out.println(Texto.contains("custo"));
		System.out.println(Texto.contains("receio"));
		
		System.out.println("\nLetra E"); //Letra E)
		boolean existe = true;
	    int indice;
	    int contador = 0;
	    
	    while(existe == true){
	      
	      if(Texto.indexOf("não") >= 0){
	        
	        indice = Texto.indexOf("não") + 1;
	        
	        if(indice < Texto.length())
	         Texto = Texto.substring(indice, Texto.length());
	        
	        contador++;
	      }
	     else
	        existe = false;
	    }
	    System.out.println("Quantas vezes que aparece a palavra não: " + contador);
		
		System.out.println("\nLetra F"); //Letra F)
		System.out.println("Quantos caracteres o texto possui: " + Texto.length());
		
		System.out.println("\nLetra G"); //Letra G)
		String Texto2 = "Umaideiatrazoutra;oboticárioimaginouque,umavezpresooalienista,viriamtambémbuscá-lo\r\n"
				+ "aele,naqualidadedecúmplice.Estaideiafoiomelhordosvesicatórios.CrispimSoaresergueu-se,\r\n"
				+ "dissequeestavabom,queiasair;eapesardetodososesforçoseprotestosdaconsortevestiu-see\r\n"
				+ "saiu.Osvelhoscronistassãounânimesemdizerqueacertezadequeomaridoiacolocar-se\r\n"
				+ "nobrementeaoladodoalienistaconsolougrandementeaesposadoboticário;enotamcommuita\r\n"
				+ "perspicácia,oimensopodermoraldeumailusão;porquanto,oboticáriocaminhouresolutamente\r\n"
				+ "aopaláciodogoverno,nãoàcasadoalienista.lichegandomostrou-seadmiradodenãovero\r\n"
				+ "barbeiro,aquemiaapresentarosseusprotestosdeadesão,nãootendofeitodesdeavésperapor\r\n"
				+ "enfermo.Etossiacomalgumcusto.Osaltosfuncionáriosquelheouviamestadeclaração,\r\n"
				+ "sabedoresdaintimidadedoboticáriocomoalienista,compreenderamtodaaimportânciada\r\n"
				+ "adesãonovaetrataramaCrispimSoarescomapuradocarinho;afirmaram-lhequeobarbeironão\r\n"
				+ "tardava;SuaSenhoriatinhaidoàCasaVerde,anegócioimportante,masnãotardava.Deram-lhe\r\n"
				+ "cadeira,refrescos,elogios;disseram-lhequeacausadoilustrePorfírioeraadetodosospatriotas;\r\n"
				+ "aoqueoboticárioiarepetindoquesim,quenuncapensaraoutracoisa,queissomesmomandaria\r\n"
				+ "declararaSuaMajestade";
		
		System.out.println("Quantidades de espaço que o texto possui: " + (Texto.length() - Texto2.length()));
	}

}
