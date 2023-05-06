package br.com.SousCheff.Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.SousCheff.Controller.Receita;

public class LeReceita {
	@SuppressWarnings("unchecked")
	public List<Receita> LeArquivoObj() {
		List<Receita> lista = new ArrayList<Receita>();	
		GravaReceita gr = new GravaReceita();
		
		File arq = new File(gr.endereço);
		if (arq.exists()) {
			FileInputStream is;
			try {				
				is = new FileInputStream(gr.endereço);
				try {
					if (is.available() > 0) {
						ObjectInputStream ois = new ObjectInputStream(is);
						lista = (List<Receita>) ois.readObject();
						ois.close();
					}
				} catch (IOException e) {
					System.out.println("Arquivo danificado!");

				} catch (ClassNotFoundException e) {
					System.out.println("Arquivo com classe errada!");
				}
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo nao encontrado!");
			}
		}
		return lista;
	}
}
