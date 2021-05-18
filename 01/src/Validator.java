import java.util.ArrayList;

public class Validator {

	public boolean validName(String name,ArrayList<Guy> guys) {
		for (Guy guy : guys) {
			if(guy.getName().contentEquals(name)) {
				return false;
			}
		}
		return true;
	}
	public boolean validNumber(Integer num) {
		return num!=null && num.intValue()>=0 && num.intValue()<=100;
	}
	
	public boolean validNameLength(Integer len) {
		return len.intValue()>=5 && len.intValue()<=20;
	}
	public boolean validOption(Integer option, Integer max) {
		return option.intValue() >= 0 && option.intValue() <= max.intValue();
	}
}
