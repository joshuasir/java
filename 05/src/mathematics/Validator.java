package mathematics;

public class Validator<T extends Number> {

	public boolean validOption(int option,int max) {
		return option>0 && option<=max;
	}
	public boolean validNum(T num) {
		return num.doubleValue()>0;
	}
	public boolean validString(String str) {
		return str.length()>1;
	}
	public boolean validType(String type) {
		return type.equalsIgnoreCase("Integer")||type.equalsIgnoreCase("Double");
	}
}
