package com.herme.test;

public class Test {

	public static void main(String args[]){
	try{
		PrincipalService service = new PrincipalServiceLocator();
	
	Principal p = service.getPrincipal();
	
	System.out.println(p.saludar("Herme san desu"));
	
	System.out.println(p.mensaje());
	}catch(Exception e){
		
	}
	
	}//main
	
	
}// ~
