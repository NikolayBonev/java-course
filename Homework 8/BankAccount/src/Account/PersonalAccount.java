package Account;

public class PersonalAccount extends Account{
	private String name;
	private String idNumber;
	
	public PersonalAccount() throws NegativeMoneyException{
		super();
		
		setName("");
		setIdNumber("");
	}
	
	public PersonalAccount(double balance, String name, String idNumber) throws NegativeMoneyException{
		super(balance);
		
		setName(name);
		setIdNumber(idNumber);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
}
