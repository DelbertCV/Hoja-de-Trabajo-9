/**
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 * 
 * Se siguieron las instrucciones indicadas en comentarios
 */

import java.io.*;
import java.util.Scanner;

class WordTypeCounter {
	public static void main(String[] args) throws Exception
	{
		if(args.length > 1)
		{
			// Declaración e inicialización de variables.
			// el primer parametro indica el nombre del archivo con las definiciones de las palabras
			File wordFile = new File(args[0]);
			
			// el segundo parametro indica el nombre del archivo que tiene el texto a analizar
			File textFile = new File(args[1]);
			
			int implementacion = Integer.parseInt(args[2]);
			
			BufferedReader wordreader;
			BufferedReader textreader;
			
			int verbs=0;
			int nouns=0;
			int adjectives=0;
			int adverbs=0;
			int gerunds=0;
			
			long starttime;
			long endtime;
			
			if(wordFile.isFile() && textFile.isFile()) {
				try
				{
					wordreader = new BufferedReader(new FileReader(wordFile));
					textreader = new BufferedReader(new FileReader(textFile));
				}
				catch (Exception ex)
				{
					System.out.println("Error al leer!");
					return;
				}
				
				String seleccion = null;
				
				switch (implementacion){
				
				case 1:
					seleccion = "SimpleSet";
					break;
				case 2:
					seleccion = "Red Black Tree";
					break;
				case 3:
					seleccion = "Splay Tree";
					break;
				case 4:
					seleccion = "HashMap";
					break;
				case 5:
					seleccion = "TreeMap";
					break;
				
				}
				
				
				WordSet words =  WordSetFactory.generateSet(implementacion);
				
				String line = null;
				String[] wordParts;
				
				starttime = System.currentTimeMillis();
				line = wordreader.readLine();
				while(line!=null)
				{
					wordParts = line.split("\\.");  // lo que esta entre comillas es una expresión regular.
					if(wordParts.length == 2)
					{
						words.add(new Word(wordParts[0].trim(),wordParts[1].trim()));
					}
					line = wordreader.readLine();
				}
				wordreader.close();
				endtime = System.currentTimeMillis();
				
				System.out.println("Palabras cargadas en " + (endtime-starttime) + " ms.");
				
				// Procesar archivo de texto
				starttime = System.currentTimeMillis();
				line = textreader.readLine();
				String[] textParts;
				Word currentword;
				Word lookupword = new Word();
				
				while(line!=null)
				{
					// Separar todas las palabras en la línea.
					textParts = line.split("[^\\w-]+"); // utilizar de separador cualquier caracter que no sea una letra, número o guión.
					
					// Revisar cada palabra y verificar de que tipo es. 
					for(int i=0;i<textParts.length;i++)
					{
						lookupword.setWord(textParts[i].trim().toLowerCase());
						currentword = words.get(lookupword);
						if(currentword != null)
						{
							if(currentword.getType().equals("v-d") || currentword.getType().equals("v") || currentword.getType().equals("q"))
								verbs++;
							else if(currentword.getType().equals("g") )
								gerunds++;
							else if(currentword.getType().equals("a-s") || currentword.getType().equals("a-c") || currentword.getType().equals("a"))
								adjectives++;
							else if(currentword.getType().equals("e"))
								adverbs++;
							else 
								nouns++;
						}
					}
					
					line = textreader.readLine();
				}
				textreader.close();
				endtime = System.currentTimeMillis();
				System.out.println("Texto analizado en " + (endtime-starttime) + " ms.");
				
				System.out.println();
				System.out.println();
				System.out.println();

				
				// Presentar estadísticas
				System.out.println("El texto tiene:");
				System.out.println(verbs + " verbos");
				System.out.println(nouns + " sustantivos");
				System.out.println(adjectives + " adjetivos");
				System.out.println(adverbs + " adverbios");
				System.out.println(gerunds + " gerundios");
				
				System.out.println("Implementacion que se utilizo: "+seleccion);

			}
			else
			{
				System.out.println("No encuentro los archivos :'( ");
			}
		}
		else
		{
			System.out.println("Faltan Parametros.");
		}
	}
}
