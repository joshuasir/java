package mathematics;

public interface GenericInterface<T extends Number, V extends Number> {

	Double add(T num1,V num2);
	Double subtract(T num1,V num2);
	Double multiply(T num1,V num2);
	Double divide(T num1,V num2);
}
