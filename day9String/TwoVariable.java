class TwoVariable
{
  public static void main(String args[])
  {
    // String a= "Hello";
    // String b="Hello";
    // System.out.println(a==b);// true  as objects were not created so it will both point to the same location so true. the both are created inside the string pool.

    String a=new String("Hello"); // but here in this case individual objects are created so both will point to different locations so output will be false.
    String b=new String("Hello");
    System.out.println(a==b);  // false  .here stored outside the string pool.
    System.out.println(a.equals(b)); // true .it is used to check the data not the address so it will print true no matter it is object or string.
    System.out.println(a.startsWith("H")); // true
    System.out.println(a.contains("ello"));  //true
    String c= " sujata ";
    System.out.println(c.trim());         //sujata
    System.out.println(a.endsWith("l"));    //false
    System.out.println(c.split("u"));  // split is not inplace operation it will return a new array.

    System.out.println(c.replace(" ","k"));   //ksujata
    System.out.println(b.toLowerCase());    //hello
    System.out.println(b.toUpperCase());   //HELLO
  }
}
//double equals to used to check the address.
//inbuilt methods-length() , charAt(int index), Substring(int beginIndex, int endIndex), toUpperCase(), toLowerCase(), trim(//will remove the white spaces), .equals(), startsWith(String prefix),  etc. are used to check the data.
//split(t); abcdt bdjdjt djdkjkt 
//              0      1      2      <-- store in index . suppose arr[0]--> abcdt.

//contains(CharSequence s), replace(String old, String new)

##so we have a given array ,we have to find subset of the array

                               ##subset
--> for a given array we will get 2^n subset.
-->subset should be in sequeunce but might be in continous or might not in continous.

1.take the value
2.don't take the value.


