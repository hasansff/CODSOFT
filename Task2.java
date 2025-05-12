import java.util.*;
public class Task2 {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int subjects = 5;
    int totalmarks = 0;
    //take input marks from the user
    for(int i = 1;i<=subjects;i++){
        System.out.print("ENTER SUBJECT"+i+"MARK (OUT OF 100) : ");
        int mark = s.nextInt();
        totalmarks = totalmarks + mark;
    }

    //percentage calculation
    int percentage = totalmarks/subjects;

    //display results
    System.out.println("TOTAL MARKS OBTAINED IS "+ totalmarks);
    System.out.println("AVERAGE PERCENTAGE IS "+percentage);
    if(percentage < 45){
        System.out.println("Fail");
    }
    else if(percentage == 45 || percentage < 70){
        System.out.println("B");
    }
    else if(percentage == 70 || percentage <= 90){
        System.out.println("A");
    }
    else{
        System.out.println("O");
    }

}
}
