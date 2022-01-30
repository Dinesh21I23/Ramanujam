package d2;

public class datatypecasting {
	public static void main(String[] args) {
		System.out.println("implict casting");
		int i=100;
		long l=i;
		float f=l;
		System.out.println("int value"+i);
		System.out.println("long value"+l);
		System.out.println("float value"+f);
		
		System.out.println("explict casting");
		double d1=100.04;
		long l1=(long)d1;
		int i1=(int)l1;
		System.out.println("double value"+ d1);
		System.out.println("long value"+ l1);
		System.out.println("int value"+ i1);
		
		short s=65;
		byte b;
		char c;
		System.out.println("other casting");
		b=(byte)s;
		c=(char)s;
		System.out.println("short value"+ s);
		System.out.println("byte value"+ b);
		System.out.println("char value"+ c);
		
	}

}
