public class Driver{
    public static void main(String[]args){
	BarCode b = new BarCode("01004");
	System.out.println(b);
	try{BarCode b2 = new BarCode("0301");
	    //System.out.println(b2);
	}catch(RuntimeException e){
	    System.out.println("ERROR:num of digits wrong");
	}
	BarCode b2 = new BarCode("03010");
	System.out.println(b2);
	try{BarCode b3 = new BarCode("abacd");
	}catch(RuntimeException e){
	    System.out.println("ERROR:BarCode contains non-digits");
	}
	BarCode b3 = new BarCode("03010");
	System.out.println(b3);
	System.out.println(b.equals(b2));
	System.out.println(b2.equals(b3));
    }
}
