/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;
import java.util.*;
/**
 *
 * @author Fariausman
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        studentw3[] list=new studentw3[3];
        studentw3 s1=new studentw3();
        s1.setName("peter");
        s1.setAge(20);
        studentw3 s2=new studentw3();
        list[0]=s1;
        for(int i=0; i<3; i++)
        {
            studentw3 s[i]=new studentw3();
            s[i].setName(input.nextLine);
            s[i].setAge(input.nextInt);
        
        }
         System.out.println(list[0].getName() +"\t"+ list[0].getAge());

    }
    
}
