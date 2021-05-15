import java.util.Date;

public class Shoe {
	private String category,name,id;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	private String release;
	private Integer price;
	public Shoe(String Id,String name,String category,String release,Integer price) {
		this.name = name;
		this.category = category;
		this.release = release;
		this.price = price;
		this.id = Id;
	}

}
