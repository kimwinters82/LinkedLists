import java.util.*;
import java.util.LinkedList;

public class Solution {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    int num = Integer.parseInt(myscanner.nextLine());
    Link[] array = new Link [num]; //creates array of links
    for (int i = 0; i<num; i++){ //adds values to each element in array
      array[i] = new Link(Integer.parseInt(myscanner.nextLine()));
    }
    while(myscanner.hasNext()){
      int select = myscanner.nextInt();
      int previous = myscanner.nextInt();
      int next = myscanner.nextInt();
      if(previous!=-1){ //sets connection to previous and next element
        array[select].previous = array[previous];
      }
      if (next !=-1){
        array[select].next=array[next];
      }
    }
    LinkedList mylist = new LinkedList(); //creates linkedlist object ->mylist
    if(num>0){
      mylist.first = array[0];//sets start pointer to the first element in array
      mylist.last = array[num-1]; //sets end pointer to the final element in the array
    }
    System.out.println(search(mylist));
  }

  public static int search(Linkedlist a){
    if (array.isEmpty()){
      return 0; }//if list empty or broken
    //else return largest element in the linkedlist
  }
}