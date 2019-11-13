package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Arquivo {
    
    public static ArrayList<Alimento> leGrupo(String diretorio) throws IOException {
    	ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        BufferedReader buffRead = new BufferedReader(new FileReader(diretorio));
        String linha = "";
        while (true) {
        	linha = buffRead.readLine();
            if (linha != null) {
                String[] linhaAux = linha.split(";");
                Alimento alimento = new Alimento(linhaAux[0],linhaAux[1]);
                alimentos.add(alimento);
            } else
                break;
        }
        buffRead.close();
        return alimentos;
    }
    
    public static void reescreveArquivo(String diretorio, Grupo grupo) throws IOException {
    	BufferedWriter buffWrite = new BufferedWriter(new FileWriter(diretorio));
    	for(int i = 0; i < grupo.getAlimentos().size(); i++) {
    		buffWrite.append(grupo.getAlimentos().get(i).getNome() + ";" + grupo.getAlimentos().get(i).getMedida() + "\n");
    	}
    	buffWrite.close();
    }
 
}
