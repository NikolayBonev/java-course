package UserLogIn;

public class LogIn2 {
	public static void main(String[] args) {
		try{
//			Error will occur -> invalid password  
//			VerifyInfo2 usrF = new VerifyInfo2("pedkddm", "kfkf@kd.bg");
			
			
//			Error will occur -> invalid e-mail
			VerifyInfo2 usrS = new VerifyInfo2("pedkd1dm", "kfkfkd.bg");
			
//			Error won't occur
//			VerifyInfo2 usrT = new VerifyInfo2("ped1kddm", "kfkf@kd.bg");
			
		}catch(CustomException exception){
			System.out.println("Incorrect login info!\n" + exception.getMessage());
			System.out.println("Enter correct info!");
		}
	}
}
