class action{



	action(String [] str){

		if (str.length > 0)
			massCheck(str);
			
		else 
			System.out.println("There are no strings to check");


	}


	private void massCheck(String[] str){

		lineChecker line; 

		for(String i:str)
			line = new lineChecker(i);
	
	}

}