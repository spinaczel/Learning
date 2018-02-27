import java.util.Scanner;
class EncodeData{
    String msg, key;
    String encmsg = "";
    String decmsg = "";


    EncodeData(String key){

        this.key = key;
    }

   void encrypt(String msg){
        int j = 0;
        for(int i=0; i<msg.length (); i++){
            encmsg =  encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == key.length ()) j=0;
        }
   }

   String getEncrypt(){
       return encmsg;
    }

    String decrypt() {
         int j=0;
         for (int i=0; i<msg.length ();i++){
             decmsg = decmsg + (char)(encmsg.charAt (i) ^ key.charAt (j));
             j++;
             if (j == key.length ()) j=0;
         }
         return decmsg;

    }
}

public class Encode {
    public static void main (String args[]){
        String msg;
        String key;

        Scanner read = new Scanner (System.in);
        System.out.println ("Podaj wartosc klucza szyfrowania ASCII: ");
        key = read.nextLine ();

        System.out.println("Podaj tekst do zaszyfrowania ");
        msg = read.nextLine ();
        EncodeData message = new EncodeData (key);
        message.encrypt (msg);



        System.out.println ("Wiadomość: " + msg + " Szyfrowana kluczem " + "\"" + message.key + "\"" +
                "\n Zaszyfrowana brzmi: " + "\"" +  message.getEncrypt() + "\"");
        System.out.println ("\nWiadomosc odszyfrowana(kontrola): " + message.decrypt() );



    }
}

