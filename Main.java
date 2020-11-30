import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    int num = Integer.parseInt(myscanner.nextLine());
    Link[] array = new Link [num];
    for (int i = 0; i<num; i++){
      array[i] = new Link(Integer.parseInt(myscanner.nextLine()));
    }
    while(myscanner.hasNext()){
      int select = myscanner.nextInt();
      int previous = myscanner.nextInt();
      int next = myscanner.nextInt();
      if(previous!=-1){
        array[select].previous = array[previous];
      }
      if (next !=-1){
        array[select].next=array[next];
      }
    }
    LinkedList mylist = new LinkedList();
    if(num>0){
      mylist.first = array[0];
      mylist.last = array[num-1];
    }
    System.out.println(search(mylist));
  }

  public static int search(Linkedlist a){
    return 0; //if list empty or broken
    //else return largest element in the linkedlist
  }
}