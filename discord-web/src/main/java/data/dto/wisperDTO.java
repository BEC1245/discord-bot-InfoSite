package data.dto;

public class wisperDTO {
	private String uname;
	private String resiver;
	private String wisper;
	
	public wisperDTO() {}

	public wisperDTO(String uname, String resiver, String wisper) {
		this.uname = uname;
		this.resiver = resiver;
		this.wisper = wisper;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getResiver() {
		return resiver;
	}

	public void setResiver(String resiver) {
		this.resiver = resiver;
	}

	public String getWisper() {
		return wisper;
	}

	public void setWisper(String wisper) {
		this.wisper = wisper;
	}

	@Override
	public String toString() {
		return "wisperDTO [uname=" + uname + ", resiver=" + resiver + ", wisper=" + wisper + "]";
	}
}
