package Debug;

public class Detail {
	private String candidate1;
	private String candidate2;
	private String candidate3;
	private String candidate4;
	private String candidate5;
	private int vote1;
	private int vote2;
	private int vote3;
	private int vote4;
	private int vote5;
	
	public Detail() {
		
	}
	
	public Detail(String candidate1, String candidate2, String candidate3, String candidate4, String candidate5,
			int vote1, int vote2, int vote3, int vote4, int vote5) {
		super();
		this.candidate1 = candidate1;
		this.candidate2 = candidate2;
		this.candidate3 = candidate3;
		this.candidate4 = candidate4;
		this.candidate5 = candidate5;
		this.vote1 = vote1;
		this.vote2 = vote2;
		this.vote3 = vote3;
		this.vote4 = vote4;
		this.vote5 = vote5;
	}
	public String getCandidate1() {
		return candidate1;
	}
	public void setCandidate1(String candidate1) {
		this.candidate1 = candidate1;
	}
	public String getCandidate2() {
		return candidate2;
	}
	public void setCandidate2(String candidate2) {
		this.candidate2 = candidate2;
	}
	public String getCandidate3() {
		return candidate3;
	}
	public void setCandidate3(String candidate3) {
		this.candidate3 = candidate3;
	}
	public String getCandidate4() {
		return candidate4;
	}
	public void setCandidate4(String candidate4) {
		this.candidate4 = candidate4;
	}
	public String getCandidate5() {
		return candidate5;
	}
	public void setCandidate5(String candidate5) {
		this.candidate5 = candidate5;
	}
	public float getVote1() {
		return vote1;
	}
	public void setVote1(int vote1) {
		this.vote1 = vote1;
	}
	public float getVote2() {
		return vote2;
	}
	public void setVote2(int vote2) {
		this.vote2 = vote2;
	}
	public float getVote3() {
		return vote3;
	}
	public void setVote3(int vote3) {
		this.vote3 = vote3;
	}
	public float getVote4() {
		return vote4;
	}
	public void setVote4(int vote4) {
		this.vote4 = vote4;
	}
	public float getVote5() {
		return vote5;
	}
	public void setVote5(int vote5) {
		this.vote5 = vote5;
	}
	
}
