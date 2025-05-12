import java.util.Scanner;
class MangoTree{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows=sc.nextInt();    //no of rows
    int columns=sc.nextInt();     //no of columns and tree are in 1st row , 1st column and last clumn determine given tree number is there any tree or not so print yes or no.
    int treeNumber=sc.nextInt();

    if(treeNumber <= columns || treeNumber%columns==1 || treeNumber%columns==0)
    {
      System.out.println("YES");

    }
    else{
      System.out.println("No");
    }
  }
}