package h17jb3.tu4.Opp;
//khai báo 1 lớp có cài đặt interface

public class xemay implements InterfaceExample {

	@Override
	public int gia(String s_model) {
		if (s_model.equals("2005"))
			return (2000);
		else
			return (1500);
	}

	public String chobietnhasx() {
		return (nhasx);
	}

}
