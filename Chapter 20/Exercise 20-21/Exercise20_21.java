/*
Author: Joshua Gray
Date: 9/24/21

Description: 
*/
import java.util.Comparator;

public class Exercise20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};
    
    selectionSort(list, new GeometricObjectComparator());
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i].getArea() + " ");
  }
  
  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
	  boolean needNextPass = true;	
	  for (int i = 1; i < list.length && needNextPass; i++) {
		  needNextPass = false;
		  for (int j = 0; j < list.length - i; j++) {
			  // Invoke compare
			  if (comparator.compare(list[j], list[j + 1]) > 0) {
				// Swap min to current position
				  E min = list[j];
				  list[j] = list[j + 1];
				  list[j + 1] = min;
				  
				  needNextPass = true;
			  }
		  }
	  } 
  }
}
