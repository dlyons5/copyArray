class Main {

  public static void main(String[] args) {
    String[] roster1 = new String[10];
    String[] roster2 = {"Bob","Ben","Jeff","Noah","Elija","Dylan","Gabe","Seth","Matt","Dominic"};
    
    for(int index = 0; index < roster1.length; index++)
    {
      roster1[index] = roster2[index];
      System.out.println(roster1[index]);
    }
  }
}



