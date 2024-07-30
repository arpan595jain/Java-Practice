class ForEachExample1{  
  public static void main(String args[]){  
  //declaring an array  
            int arr[]={12,13,14,44};   //traversing the array with for-each loop  
            int total=0;  
   for(int i:arr){  
     System.out.println(i);  
total=total+i;  
   }  
 System.out.println("Total: "+total);   }   }  
