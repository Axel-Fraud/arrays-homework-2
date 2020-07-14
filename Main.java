class Main {
  public static void main(String[] args) {

  String[] yee = {"food", "Swimming", "Life", "Peace", "Eat"};
  


int[] test = new int[20];
  for(int i=0; i<test.length; i++){
    test[i] = (int)(Math.random()*20);
  }
  System.out.println(aRray(test));
  System.out.println(arrayString(test));
  System.out.println(laCie(yee));
  laCie(yee);

  double[] retArr = arrMult(5);
  for(int i=0; i<retArr.length; i++){
    System.out.println(retArr[i]);
  }

  }

public static int aRray(int[] test) {

int total = 0;
  for(int i=0; i<test.length; i++){
    total += test[i];
  }
return total;
}


public static boolean arrayString(int[] arr) {
  for(int i=0; i<arr.length; i++){
  if(0==arr[i]){
    return true;
  }
  }
  return false;
}
public static int laCie(String[] arr) {
  int c = 0;
  for(int i=0; i<arr.length; i++){
   c += arr[i].length();
  }
  return c;
}

public static double[] arrMult(int N){
  double[] yass = new double[N];
  for(int i=0; i<yass.length; i++){
    yass[i] = (Math.random()*10);
  }
return yass;
}


}

/*Write a method that takes in an array of integers and returns the sum of the integers in the array. 

   Write a method that takes in an array of strings and returns the total number of letters of all the strings.
   
    5. Write a method that takes in an array of integers and returns true if the integer 0 is contained within the array.
   
    6. Write a method that takes in an integer N and returns an array with N random doubles between 0 and 
   10 In your main method, call this method and print out the resulting array. 
   */