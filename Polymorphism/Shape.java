public class Shape extends StringToNumber{
	private StringToNumber strToNum = new StringToNumber();
	double area;
	double perimeter;
	int radius;
	int side1;
	int side2;
	int side3;
	double value;

	int val1;
	int val2;
	int val3;

	Shape (int input){
		/*this.radius = input;    //have val1, val2 and val3
		this.area = Math.PI*(this.radius*this.radius);
		this.perimeter = 2*Math.PI*this.radius;
		System.out.println("The perimeter of the circle is "+this.perimeter);
		System.out.println("The area of the circle is "+this.area);*/
		val1 = input;
		val2 = 0;
		val3=0;
	}

	Shape (String input){
		/*this.radius = convert(input);
		this.area = Math.PI*(this.radius*this.radius);
		this.perimeter = 2*Math.PI*this.radius;
		System.out.println("The perimeter of the circle is "+this.perimeter);
		System.out.println("The area of the circle is "+this.area);*/
		val1 = convert(input);
		val2 = 0;
		val3=0;
	}

	Shape (int input1, int input2){
		/*this.side1 = input1;
		this.side2 = input2;
		this.perimeter = this.side1+this.side2+this.side1+this.side2;
		this.area = this.side1*this.side2;
		System.out.println("The perimeter of the rectangle is "+this.perimeter);
		System.out.println("The area of the rectangle is "+this.area);*/
		val1 = input1;
		val2 = input2;
		val3=0;
	}

	Shape (String input1, String input2){
		/*this.side1 = convert(input1);
		this.side2 = convert(input2);
		this.perimeter = this.side1+this.side2+this.side1+this.side2;
		this.area = this.side1*this.side2;
		System.out.println("The perimeter of the rectangle is "+this.perimeter);
		System.out.println("The area of the rectangle is "+this.area);*/
		val1 = convert(input1);
		val2 = convert(input2);
		val3=0;
	}

	Shape (int input1, int input2, int input3){
		/*this.side1 = input1;
		this.side2 = input2;
		this.side3 = input3;
		this.perimeter = side1+side2+side3;
		this.value =  (this.perimeter/2 * (this.perimeter/2-this.side1) * (this.perimeter/2-this.side2) * (this.perimeter/2-this.side3));
		this.area = Math.sqrt(value);
		//this.area = (this.side1*this.side2)/2;
		System.out.println("The perimeter of the triangle is "+this.perimeter);
		System.out.println("The area of the triangle is "+this.area);*/
		val1 = input1;
		val2 = input2;
		val3 = input3;
	}

	Shape (String input1, String input2, String input3){
		/*this.side1 = convert(input1);
		this.side2 = convert(input2);
		this.side3 = convert(input3);
		this.perimeter = side1+side2+side3;
		this.value =  (this.perimeter/2 * (this.perimeter/2-this.side1) * (this.perimeter/2-this.side2) * (this.perimeter/2-this.side3));
		this.area = Math.sqrt(value);
		//this.area = (this.side1*this.side2)/2;
		System.out.println("The perimeter of the triangle is "+this.perimeter);
		System.out.println("The area of the triangle is "+this.area);*/
		val1 = convert(input1);
		val2 = convert(input2);
		val3 = convert(input3);
	}

	public double perimeter(){
		if(val1 > 0 && val2==0 && val3==0){
			System.out.println("The perimeter of the circle is:"+2*Math.PI*val1);
			return 2*Math.PI*val1;
		}
		else if(val1 > 0 && val2>0 && val3==0){
			System.out.println("The perimeter of the rectangle is:"+(val1+val2+val1+val2));
			return val1+val1+val2+val2;
		}
		else{
			System.out.println("The perimeter of the triangle is:"+(val1+val2+val3));
			return val1+val2+val3;
		}
	}

	public double area(){  //area of circle
		if(val1 > 0 && val2==0 && val3==0){
			System.out.println("The area of the circle is:"+Math.PI*(val1*val1));
			return Math.PI*(val1*val1);
		}
		else if(val1 > 0 && val2>0 && val3==0){
			System.out.println("The area of the rectangle is:"+val1*val2);
			return val1*val2;
		}
		else{
			//System.out.println("The area of the triangle is:"+((val1+val2+val3/2 * (val1+val2+val3/2-val1) * (val1+val2+val3/2-val2) * (val1+val2+val3/2-val3))));
			perimeter = val1+val2+val3;
			//double formula = (perimeter/2)*(perimeter/2-val2)*(perimeter/2-val3);
			value =  (perimeter/2 * (perimeter/2-val1) * (perimeter/2-val2) * (perimeter/2-val3));
			area = Math.sqrt(value);
			System.out.println("The area of the triangle is:"+area);
			return Math.sqrt((val1+val2+val3/2 * (val1+val2+val3/2-val1) * (val1+val2+val3/2-val2) * (val1+val2+val3/2-val3)));
		}
	}
}

//p/2 x (p/2-a) x (p/2-b) x (p/2-c)