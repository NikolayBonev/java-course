package Account;

public class CoorporativeAccount extends Account{
	private String firmName;
	private String bulstat;
	
	public CoorporativeAccount() throws NegativeMoneyException{
		super();
		
		setFirmName("");
		setBulstat("");
	}
	
	public CoorporativeAccount(double balance, String firmName, String bulstat) throws NegativeMoneyException{
		super(balance);
		
		setFirmName(firmName);
		setBulstat(bulstat);
	}
	
	public String getFirmName() {
		return this.firmName;
	}
	
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	
	public String getBulstat() {
		return this.bulstat;
	}
	
	public void setBulstat(String bulstat) {
		this.bulstat = bulstat;
	}
	
}