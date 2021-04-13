package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Sorvete;

public class Principal {

	public static void main(String[] args) {
		dadosSorvete();
	}
	
	
	
	public static void dadosSorvete() {
		Scanner sc = new Scanner(System.in);
		Sorvete sorvete;
		List<Sorvete> listaSorvete = new ArrayList<Sorvete>();
		
					
		int opcao = 0;
		
		do {
			System.out.println("===================SORVETERIA===================");
			System.out.println();
			System.out.println("1 - INSERIR");
			System.out.println();
		    System.out.println("2 - REMOVER");
		    System.out.println();
		    System.out.println("3 - LISTAR");
		    System.out.println();
		    System.out.println("0 - SAIR DO PROGRAMA");
		    System.out.println("================================================");
		    System.out.println();
		    System.out.println("DIGITE SUA OPÇÃO: ");
		    opcao = Integer.parseInt(sc.nextLine());
		    
		   
		    sorvete = new Sorvete();
		    
		     
		    if(opcao == 1){
		    	
		    	
		    	  System.out.print("INFORME O CÓDIGO: ");
		          sorvete.setCod(Integer.parseInt(sc.nextLine()));
		    	 
		          System.out.print("INFORME O SABOR: ");
		          sorvete.setSabor(sc.nextLine());
		          
		          System.out.print("INFORME O PREÇO: ");
		    	  sorvete.setPreco(Double.parseDouble(sc.nextLine()));
		        
		          System.out.println();
		          		          
		          listaSorvete.add(sorvete);
		          
		    }else if(opcao == 2){
		    	
	            	if(listaSorvete.isEmpty()){
	            		System.out.println("NÃO EXISTEM SORVETES CADASTRADOS,"
			              		+ " PRESSIONE UMA TECLA PARA CONTINUAR!");
	              
		             sc.nextLine();
	              
	            	}else{
	            	
	            		System.out.print("INFORME O SABOR QUE DESEJA EXCLUIR: ");
	            		String sabor = sc.nextLine();
	                
	            	
			          
			         for (Sorvete s : listaSorvete) {
			        	  if(s.getSabor().equalsIgnoreCase(sabor)) {
			        		  listaSorvete.remove(s);
			        		  System.out.println("ITEM REMOVIDO COM SUCESSO!");	        	 			        		   
			        	  }
			        	  else {
			        		  //ESSA MENSGEM REPETE A QUANTIDADE DE REGISTROS - NÃO CONSEGUI ARRUMAR. 
			        		  System.out.println("NÃO EXISTE ESSE SABOR CADASTRADO,"
					              		+ " PRESSIONE UMA TECLA PARA CONTINUAR!");
			        		 
			        	  }
			          }
                } 
	            
		    	}else if(opcao == 3){
		    		
		    		if(listaSorvete.isEmpty()){
	            	 System.out.println("NÃO EXISTEM SORVETES CADASTRADOS,"
			              		+ " PRESSIONE UMA TECLA PARA CONTINUAR!");
	            	 sc.nextLine();
	            	 
		    		}else{
		    			System.out.println(listaSorvete.toString());

		    			System.out.println("PRESSIONE UMA TECLA PARA CONTINUAR!");
		    			sc.nextLine();
	            	}         
		    	}
		    	
				    	
		
		 } while (opcao != 0);
	}
}


		



