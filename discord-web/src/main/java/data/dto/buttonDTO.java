package data.dto;

public class buttonDTO {
	private String uname;
	private int click_count;

	public buttonDTO() {}

	public buttonDTO(String uname, int click_count) {
		this.uname = uname;
		this.click_count = click_count;
	}
	
	@Override
	public String toString() {
		return "ButtonDTO [uname=" + uname + ", click_count=" + click_count + "]";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getClick_count() {
		return click_count;
	}

	public void setClick_count(int click_count) {
		this.click_count = click_count;
	}
	
}
