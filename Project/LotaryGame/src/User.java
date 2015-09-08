public class User {
	private long ID;
	private String[] userNumbers;
	private String userNumbersString;
	private int guestedNums;
	
	public User() {
		super();
	}

	public User(long ID, String[] userNumbers) {
		setID(ID);
		setUserNumbers(userNumbers);
	}

	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		if (ID <= 0) {
			return;
		}
		this.ID = ID;
	}

	public String[] getUserNumbers() {
		return this.userNumbers;
	}

	public void setUserNumbers(String[] userNumbers) {
		if (userNumbers == null || userNumbers.length <= 0) {
			return;
		}
		this.userNumbers = userNumbers;
	}
	
	public int getGuestedNums() {
		return this.guestedNums;
	}

	public void setGuestedNums(int guestedNums) {
		this.guestedNums = guestedNums;
	}

	public String getUserNumbersString() {
		StringBuilder numbers = new StringBuilder();

		for (int i = 0; i < this.userNumbers.length; i++) {
			numbers.append(this.userNumbers[i]);
			if (i < this.userNumbers.length - 1) {
				numbers.append(" ");
			}
		}
		this.userNumbersString = numbers.toString();
		return this.userNumbersString;
	}

}
