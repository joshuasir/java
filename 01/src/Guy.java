
public class Guy implements Comparable<Guy>{
	private String name;
	private Integer num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public Guy(String name,Integer num) {
		this.num = num;
		this.name = name;
	}
	@Override
	public int compareTo(Guy o) {
		return this.getName().compareTo(o.getName());
	}

}
