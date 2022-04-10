/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo1;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class suratkaisar {
     public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String kataawal = scan.nextLine();
        int N = scan.nextInt();
        String teks ="";
        System.out.println(enkripsi(N,kataawal,teks));
  }
        public static String enkripsi (int N, String kataawal,String teks){
        teks = "";
        char alphabet;
        for(int i=0; i < kataawal.length();i++){
            alphabet = kataawal.charAt(i);
                if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + N);
                    if(alphabet > 'z')
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + N);    
                    if(alphabet > 'Z')
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
             teks = teks + alphabet;   
    }   
        return teks;
        }     
}

