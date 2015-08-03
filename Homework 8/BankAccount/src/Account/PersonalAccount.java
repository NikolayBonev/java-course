package Account;

public class PersonalAccount extends Account{
	private String name;
	private long idNumber;
	
	public PersonalAccount() throws NegativeMoneyException{
		super();
		
		setName("");
		setIdNumber(0);
	}
	
	public PersonalAccount(double balance, String name, long idNumber) throws NegativeMoneyException{
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
	
	public long getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	
	
}
