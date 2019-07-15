
public class NTransactionThread extends Thread {
	private NAccount account;
	private TransactionType type;
	private String name;
	private double amt;
	public NTransactionThread(NAccount account, TransactionType type, String name, double amt) {
		
		this.account = account;
		this.type = type;
		this.name = name;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		if(type == TransactionType.CREDIT) {
			account.deposit(name, amt);
		}
		else {
			account.withdraw(name, amt);
		}
	}
	
	

}
