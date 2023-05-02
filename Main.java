import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Gets the puzzle input
        ArrayList<String> a = new ArrayList<>();
        int x = 0;
        do{
            String b = sc.nextLine();
            if (b.equalsIgnoreCase("s")){
                break;
            }
            a.add(b);
        }while(x == 0);

        //Puts the total calories of each elf within a list
        x = 0;
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0;i<a.size();i++){
            if (i == a.size()-1){
                x = x +Integer.parseInt(a.get(i));
                c.add(x);
            }
            else if(!a.get(i).equalsIgnoreCase("")){
                x = x +Integer.parseInt(a.get(i));
            }
            else{
                c.add(x);
                x = 0;
            };

        }

        //Prints out the top 3
        int first = Collections.max(c);
        c.remove(Collections.max(c));
        int second = Collections.max(c);
        c.remove(Collections.max(c));
        int third = Collections.max(c);
        c.remove(Collections.max(c));
        System.out.println("The Elf Who Is Carrying The Most Has: " + first);
        System.out.println("The Elf Who Is Carrying The 2nd Most Has: " + second);
        System.out.println("The Elf Who Is Carrying The 3rd Most Has: " + third);
        System.out.println("Combined Amount Of The Top 3 Is: " + (first + second + third));

    }
}