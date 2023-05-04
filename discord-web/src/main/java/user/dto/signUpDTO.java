package user.dto;

public class signUpDTO {
	private String uid;
	private String uname;
	
	public signUpDTO() {
		super();
	}

	public signUpDTO(String uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "signUpDTO [uid=" + uid + ", uname=" + uname + "]";
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
}
