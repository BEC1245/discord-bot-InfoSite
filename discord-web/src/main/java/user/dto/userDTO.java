package user.dto;

public class userDTO {
	private String uid;
	private String uname;
	private int click_count;
	private int chat_count;	
	
	public userDTO() {}

	public userDTO(String uid, String uname, int click_count, int chat_count) {
		this.uid = uid;
		this.uname = uname;
		this.click_count = click_count;
		this.chat_count = chat_count;
	}

	@Override
	public String toString() {
		return "userDTO [uid=" + uid + ", uname=" + uname + ", click_count=" + click_count + ", chat_count="
				+ chat_count + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public int getChat_count() {
		return chat_count;
	}

	public void setChat_count(int chat_count) {
		this.chat_count = chat_count;
	}
}
