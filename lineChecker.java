

class lineChecker{
	private String sequence;
	private boolean result;


	lineChecker(String sequence){
		
		this.sequence = sequence;
		this.result = true ;

		checker(this.sequence.trim().toCharArray());
		print();
				

	}
	

	private void checker(char[] line){
	
		Stack<Character> stack=new Stack(line.length);


			
		for (int i=0; i<line.length; ++i){



			switch(line[i]){

				case '{':
				case '(':
				case '[':
					try{	

						stack.push(line[i]);

						
					}
					catch(Exception ex){
						
						System.out.println(ex.getMessage()+" Exception happend");
						result=false;
						
					}

					break;

				case '}':
				case ')':
				case ']':


					try{


						if(stack.isEmpty())
							result=false;
						else
							result=compare(stack.pop(),line[i]);
							
						
					}
					catch(Exception ex){
						
						System.out.println(ex.getMessage());
						result=false;
						
					}
					break;

			}

			if (!result) break;

		}


		if( !stack.isEmpty()) result=false;
				

	}



	private boolean compare(char leftBr,char rightBr){

		if(leftBr=='{' && rightBr=='}' || leftBr=='(' && rightBr==')' || leftBr=='[' && rightBr==']')	
			return true;
		else
			return false;	
		

	}



	private void print(){

		String res;

		if(result) 
			res = "Correct";
		else 
			res = "Incorrect";

		System.out.println("Sequence: "+ sequence + " Result: "+ res);
	
	}


	



}