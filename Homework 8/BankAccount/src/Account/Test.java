package Account;

public class Test {
	public static void main(String[] args) throws NegativeMoneyException{
		try {
			PersonalAccount person = new PersonalAccount(3000.0, "Nikolay", "9412046740");
//			person1 will throw NegativeMoneyException
//			PersonalAccount person1 = new PersonalAccount(-3000.0, "Lalka", "6512046740");
			CoorporativeAccount company = new CoorporativeAccount(9600.17 , "Rumen", "7612046888");
//			errorPer will throw InvalidAccountException
			Object errorPer = "Alibaba";
			
			checkForInstance(person);
//			checkForInstance(person1);
			checkForInstance(company);
			checkForInstance(errorPer);
			
		} catch (InvalidAccountException exception) {
			System.out.println("The exception is caught: " + exception);
		}
	}

	public static void checkForInstance(Object object) throws InvalidAccountException {
		if (!(object instanceof Account)) {
			throw new InvalidAccountException();
		}
		if (object instanceof PersonalAccount) {
			System.out.printf("Personal ID: %s\n", ((PersonalAccount) object).getIdNumber());

		} else if (object instanceof CoorporativeAccount) {
			System.out.printf("BULSTAT: %s\n", ((CoorporativeAccount) object).getBulstat());

		}
	}
}
