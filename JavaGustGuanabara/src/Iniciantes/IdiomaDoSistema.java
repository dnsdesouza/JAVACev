package Iniciantes;

import java.util.Locale;

public class IdiomaDoSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale local = Locale.getDefault();
		System.out.println("Local do computador: "+local.getDisplayCountry());
		
		System.out.println("Idioma: "+ local.getDisplayLanguage());
		
		System.out.println("Idioma e local: "+local.getDisplayName());
	}

}
