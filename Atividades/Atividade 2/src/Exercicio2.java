
public class Exercicio2 {

	public static void main(String[] args) {
		
		String Texto = "Uma ideia traz outra; o botic�rio imaginou que, uma vez preso o alienista, viriam tamb�m busc�-lo \r\n"
				+ "a ele, na qualidade de c�mplice. Esta ideia foi o melhor dos vesicat�rios. Crispim Soares ergueu-se, \r\n"
				+ "disse que estava bom, que ia sair; e apesar de todos os esfor�os e protestos da consorte vestiu-se e \r\n"
				+ "saiu. Os velhos cronistas s�o un�nimes em dizer que a certeza de que o marido ia colocar-se \r\n"
				+ "nobremente ao lado do alienista consolou grandemente a esposa do botic�rio; e notam com muita \r\n"
				+ "perspic�cia, o imenso poder moral de uma ilus�o; porquanto, o botic�rio caminhou resolutamente \r\n"
				+ "ao pal�cio do governo, n�o � casa do alienista. Ali chegando, mostrou-se admirado de n�o ver o \r\n"
				+ "barbeiro, a quem ia apresentar os seus protestos de ades�o, n�o o tendo feito desde a v�spera por \r\n"
				+ "enfermo. E tossia com algum custo. Os altos funcion�rios que lhe ouviam esta declara��o,\r\n"
				+ "sabedores da intimidade do botic�rio com o alienista, compreenderam toda a import�ncia da \r\n"
				+ "ades�o nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro n�o \r\n"
				+ "tardava; Sua Senhoria tinha ido � Casa Verde, a neg�cio importante, mas n�o tardava. Deram-lhe \r\n"
				+ "cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porf�rio era a de todos os patriotas; \r\n"
				+ "ao que o botic�rio ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria \r\n"
				+ "declarar a Sua Majestade";
		
		System.out.println("Letra A"); //Letra A)
		System.out.println("Posi��o da frase no texto: " + Texto.indexOf("E tossia com algum custo"));
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
	      
	      if(Texto.indexOf("n�o") >= 0){
	        
	        indice = Texto.indexOf("n�o") + 1;
	        
	        if(indice < Texto.length())
	         Texto = Texto.substring(indice, Texto.length());
	        
	        contador++;
	      }
	     else
	        existe = false;
	    }
	    System.out.println("Quantas vezes que aparece a palavra n�o: " + contador);
		
		System.out.println("\nLetra F"); //Letra F)
		System.out.println("Quantos caracteres o texto possui: " + Texto.length());
		
		System.out.println("\nLetra G"); //Letra G)
		String Texto2 = "Umaideiatrazoutra;obotic�rioimaginouque,umavezpresooalienista,viriamtamb�mbusc�-lo\r\n"
				+ "aele,naqualidadedec�mplice.Estaideiafoiomelhordosvesicat�rios.CrispimSoaresergueu-se,\r\n"
				+ "dissequeestavabom,queiasair;eapesardetodososesfor�oseprotestosdaconsortevestiu-see\r\n"
				+ "saiu.Osvelhoscronistass�oun�nimesemdizerqueacertezadequeomaridoiacolocar-se\r\n"
				+ "nobrementeaoladodoalienistaconsolougrandementeaesposadobotic�rio;enotamcommuita\r\n"
				+ "perspic�cia,oimensopodermoraldeumailus�o;porquanto,obotic�riocaminhouresolutamente\r\n"
				+ "aopal�ciodogoverno,n�o�casadoalienista.lichegandomostrou-seadmiradoden�overo\r\n"
				+ "barbeiro,aquemiaapresentarosseusprotestosdeades�o,n�ootendofeitodesdeav�sperapor\r\n"
				+ "enfermo.Etossiacomalgumcusto.Osaltosfuncion�riosquelheouviamestadeclara��o,\r\n"
				+ "sabedoresdaintimidadedobotic�riocomoalienista,compreenderamtodaaimport�nciada\r\n"
				+ "ades�onovaetrataramaCrispimSoarescomapuradocarinho;afirmaram-lhequeobarbeiron�o\r\n"
				+ "tardava;SuaSenhoriatinhaido�CasaVerde,aneg�cioimportante,masn�otardava.Deram-lhe\r\n"
				+ "cadeira,refrescos,elogios;disseram-lhequeacausadoilustrePorf�rioeraadetodosospatriotas;\r\n"
				+ "aoqueobotic�rioiarepetindoquesim,quenuncapensaraoutracoisa,queissomesmomandaria\r\n"
				+ "declararaSuaMajestade";
		
		System.out.println("Quantidades de espa�o que o texto possui: " + (Texto.length() - Texto2.length()));
	}

}
