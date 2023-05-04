package br.com.SousCheff.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravaEscolhas {

	public static void GravaArquivo(String escolhas) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\Cardápio da Semana.txt";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "\tSous Cheff \n\tCardápio Da Semana:\n";
		linha += escolhas;
		buffWrite.append(linha);
		buffWrite.close();
	}
}
