package Debug;

public class Result {
	
	private String candVote1;
	private String candVote2;
	private String candVote3;
	private String candVote4;
	private String candVote5;
	private float total;
	
	public String getCandVote1() {
		return candVote1;
	}
	public void setCandVote1(String candVote1) {
		this.candVote1 = candVote1;
	}
	public String getCandVote2() {
		return candVote2;
	}
	public void setCandVote2(String candVote2) {
		this.candVote2 = candVote2;
	}
	public String getCandVote3() {
		return candVote3;
	}
	public void setCandVote3(String candVote3) {
		this.candVote3 = candVote3;
	}
	public String getCandVote4() {
		return candVote4;
	}
	public void setCandVote4(String candVote4) {
		this.candVote4 = candVote4;
	}
	public String getCandVote5() {
		return candVote5;
	}
	public void setCandVote5(String candVote5) {
		this.candVote5 = candVote5;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total2) {
		this.total = total2;
	}
	@Override
	public String toString() {
		return "Result [candVote1=" + candVote1 + ", candVote2=" + candVote2 + ", candVote3=" + candVote3
				+ ", candVote4=" + candVote4 + ", candVote5=" + candVote5 + ", total=" + total + "]";
	}
	
	
}
