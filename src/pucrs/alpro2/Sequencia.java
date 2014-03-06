package pucrs.alpro2;

public class Sequencia {

	private char texto[];
	
	public Sequencia(String txt)
	{
		texto = txt.toCharArray();
		/*
		 * ou:
		texto = new char[txt.length()];
		for(int pos=0; pos<txt.length(); pos++)
			texto[pos] = txt.charAt(pos);
		*/
	}
	
	public int length()
	{
		return texto.length;
	}
	
	public char charAt(int pos)
	{
		return texto[pos];
	}
	
	public String toString()
	{
		return new String(texto);
		/*
		 * ou:
		 *
		String aux = "";
		for(char c: texto)
			aux = aux + c;
		return aux;
		*/
	}
}
