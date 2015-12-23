import java.lang.*;
import java.util.*;
public class BarCode{
//implements Comparable{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
    public BarCode(String zip){
	_zip = zip;
	if(_zip.length() != 5){
	    throw new RuntimeException();
	}
	for(int i = 0;i<_zip.length();i++){
	    if(!Character.isDigit(_zip.charAt(i))){
		throw new RuntimeException();
	    }
	}
	int sum = 0;
	for(int i = 0;i<_zip.length();i++){
	    sum += _zip.charAt(i);
	}
	_checkDigit = sum & 10;
	
    }
// postcondition: Creates a copy of a bar code.
public BarCode(BarCode x){
    _zip = x._zip;
    int sum = 0;
    for(int i = 0;i<_zip.length();i++){
	    sum += _zip.charAt(i);
	}
	_checkDigit = sum & 10;
}

//post: computes and returns the check sum for _zip
//private int checkSum(){}

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
public String toString(){
    return _zip + _checkDigit;
}


//public boolean equals(Object other){}
// postcondition: false if the object is not a BarCode, 
// false if it is a non-matching barcode
// true when they match.


//public int compareTo(Comparable other){
// postcondition: compares the zip + checkdigit 
//    _zip - other._zip;
//}

    
}
