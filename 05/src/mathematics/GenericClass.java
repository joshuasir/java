package mathematics;


public class GenericClass<T extends Number,V extends Number> implements GenericInterface<T, V>{
	T height,width,length;

	public GenericClass(T width,T length,T height){
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public Double volume() {
		System.out.println("The volume of the cuboid with:");
		System.out.println("Width: "+this.width);
		System.out.println("Length: "+this.length);
		System.out.println("Height: "+this.height);
		return (this.height.doubleValue())*(this.width.doubleValue())*(this.length.doubleValue());
	}
	@Override
	public Double add(T num1, V num2) {
		return num1.doubleValue()+num2.doubleValue();
	}
	@Override
	public Double subtract(T num1, V num2) {
		return num1.doubleValue()-num2.doubleValue();
	}
	@Override
	public Double multiply(T num1, V num2) {
		return num1.doubleValue()*num2.doubleValue();
	}
	@Override
	public Double divide(T num1, V num2) {
		return num1.doubleValue()/num2.doubleValue();
	}
	
}
