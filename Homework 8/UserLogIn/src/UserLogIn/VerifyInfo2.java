package UserLogIn;

public class VerifyInfo2 {
	private String userPass;
	private String email;
	
	public VerifyInfo2() throws CustomException{
		setUserPass(null);
		setEmail(null);
	}
	
	public VerifyInfo2(String pass, String mail) throws CustomException{
		setUserPass(pass);
		setEmail(mail);
	}
	
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) throws CustomException{
		if(userPass.length()<6){
			throw new CustomException("The password is to small!");	
		}else{
			passCheck(userPass);
			this.userPass = userPass;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws CustomException{
		if(email.length()<5){
			throw new CustomException("Too short e-mail!");		
		}else{
			checkMail(email);
			this.email = email;
		}
	}
	
	public void passCheck(String pass) throws CustomException{
		boolean check=false;
		for(int i = 0 ; i<pass.length() ; i++){
			if(Character.isDigit(pass.charAt(i))){
				check=true;
				break;
			}
		}
		
		if(check==false){
			throw new CustomException("The password has no number!");
		}
	}
	
	public void checkMail(String mail) throws CustomException{
		boolean checkA=false, checkDot=false;
		
		for(int i=0; i<mail.length();i++){
			if(mail.charAt(i)=='@'){
				checkA=true;
			}else if(mail.charAt(i)=='.'){
				checkDot=true;
			}
		}
		
		if(checkA==false && checkDot==false) {
			throw new CustomException("The e-mail has to have a \'@\' and a dot!");
		}else if(checkA==false){
			throw new CustomException("The e-mail has to have a \'@\'!");
		}else if(checkDot==false){
			throw new CustomException("The e-mail has to have a dot!");
		}
		

	}
	
}