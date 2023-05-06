package br.com.SousCheff.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import br.com.SousCheff.Controller.Receita;

public class GravaReceita {

//  endereço onde fica salvo o arquivo de memória do programa, deve ser atualizado sempre que uma nova versão é feita !
	String endereço = "C:\\Users\\User\\eclipse-workspace-SousCheff\\SousCheff_6\\src\\br\\com\\SousCheff\\Model\\Dados.txt";

	public void GravaArquivoObj(List<Receita> lista) throws IOException {
		File file = new File(endereço);
		boolean existe = file.exists();
		if (!existe) {
			file.createNewFile();
		}
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		out.writeObject(lista);
		out.flush();
		out.close();
	}
}
