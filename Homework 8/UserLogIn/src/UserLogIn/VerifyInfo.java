package UserLogIn;

public class VerifyInfo {
	private String userPass;
	private String email;
	
	public VerifyInfo(){
		setUserPass(null);
		setEmail(null);
	}
	
	public VerifyInfo(String pass, String mail){
		setUserPass(pass);
		setEmail(mail);
	}
	
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		if(userPass.length()<6){
			throw new IllegalArgumentException("The password is to small!");		
		}else{
			passCheck(userPass);
			this.userPass = userPass;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.length()<5){
			throw new IllegalArgumentException("Too short e-mail!");		
		}else{
			checkMail(email);
			this.email = email;
		}
	}
	
	public void passCheck(String pass){
		boolean check=false;
		for(int i = 0 ; i<pass.length() ; i++){
			if(Character.isDigit(pass.charAt(i))){
				check=true;
				break;
			}
		}
		
		if(check==false){
			throw new IllegalArgumentException("The password has no number!");
		}
	}
	
	public void checkMail(String mail){
		boolean checkA=false, checkDot=false;
		
		for(int i=0; i<mail.length();i++){
			if(mail.charAt(i)=='@'){
				checkA=true;
			}else if(mail.charAt(i)=='.'){
				checkDot=true;
			}
		}
		
		if(checkA==false && checkDot==false){
			throw new IllegalArgumentException("The e-mail has to have a \'@\' and a dot!");
		}else if(checkA==false){
			throw new IllegalArgumentException("The e-mail has to have a \'@\'!");
		}else if(checkDot==false){
			throw new IllegalArgumentException("The e-mail has to have a dot!");
		}
		

	}
	
}
