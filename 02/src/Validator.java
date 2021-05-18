import java.text.SimpleDateFormat;

public class Validator {

	public boolean validDate (String date) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
 		format.setLenient(false);
		try {
			format.parse(date);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean validName(String name) {
		return name.endsWith("shoe");
	}
	
	public boolean validCategory(String category) {
		return category.contentEquals("Sneaker")||category.contentEquals("Running")||category.contentEquals("Boot");
	}
	public boolean validPrice(Integer num) {
		return num.intValue() >= 5000;
	}
	
	public boolean validOption(int opt,int max) {
		return ( opt >= 1 && opt <= max);
	}
}
