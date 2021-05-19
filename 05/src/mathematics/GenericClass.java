package mathematics;


public class GenericClass<T extends Number>{
	T height,width,length;

	public GenericClass(T height,T width,T length){
		this.height = height;
		this.length = length;
		this.width = width;
		System.out.println("The volume of the cuboid with:");
		System.out.println("Width: "+this.width);
		System.out.println("Length: "+this.length);
		System.out.println("Height: "+this.height);
	}
	
	public Integer intVolume() {
		return (this.height.intValue())*(this.width.intValue())*(this.length.intValue());
	}
	
	public Double doubleVolume() {
		return (this.height.doubleValue())*(this.width.doubleValue())*(this.length.doubleValue());
	}

}
