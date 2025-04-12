
public class Sorting {
  
   public static void selectionSort (Comparable<Object>[] list)
   {
      int max;
      Comparable<Object> temp;

      for (int index = 0; index < list.length - 1; index++) {
         max = index;
         for (int scan = index + 1; scan < list.length; scan++)
            if (list[scan].compareTo(list[max]) < 0)
               max = scan;

         // Swap the values
         temp = list[max];
         list[max] = list[index];
         list[index] = temp;
      }
   }
}
