class Main {

  public static void main(String[] args) {
    int[] arr1 = new int[5];
    int[] arr2 = {44,45,46,47,48};

    int sum;
    sum = 3;

    arr1[0] = 4;
    arr1[1] = arr2[1]; 

    for(int index = 2; index < arr1.length; index++)
    {
      arr1[index] = arr2[index];
      System.out.println(arr1[index]);
    }
  }
}



