package br.com.SousCheff.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
	public String EntDados(String rotulo) {
		System.out.println(rotulo);
		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);
		String ret = "";
		try {
			ret = buff.readLine();
		} catch (IOException ioe) {
			System.out.println("\n Erro no Sistema");
		}
		return ret;
	}
}
