package day10;
class AException extends Exception{
	
}
class BException extends AException{
	
}
class CException extends Exception{
	
}
class Fu{
	void show() throws AException{
		
	}
}
class Test{
	void function(Fu f){
		try{
			f.show();
		}
		catch (AException e) {
			// TODO: handle exception
			
		}
	}
}
class Zi extends Fu{
	void show() throws BException{
		
	}
}
public class ExceptionDemo7 {

}
