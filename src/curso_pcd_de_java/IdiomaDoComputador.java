package curso_pcd_de_java;

import java.util.Locale;

public class IdiomaDoComputador {

	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		String idioma = local.getDisplayLanguage();
		System.out.println("Seu idioma é: "+idioma);
	}
}
