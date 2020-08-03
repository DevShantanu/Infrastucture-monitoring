import java.io.*;  
import java.net.*;  
import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class MyServer{
public static String str1;
public static String str2;
public static String str3;
public static String str4;
public static String str5;
public static String str6;
public static String str7;
public static String str8;
public static void main(String args[])
{
str1= mReceive();
str2= mReceive();
create_dir();
int i;
	for(i=0;i<=100;i++)
	{
		imReceive();
	}

}
public static void imReceive()
{
	create_dir();
	try{  
	ServerSocket socket = new ServerSocket(666);

            Socket clientSocket = socket.accept();

            DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
            FileOutputStream fout = new FileOutputStream("C:/Users/Vishal Khairnar/Desktop/Library/"+str1+"/"+str2+"/"+str3+"/"+str4+"/"+str5+"/"+str6+"/"+str7+"/"+str8+".png");
            int i;
            while ( (i = dis.read()) > -1) {
                fout.write(i);
            }

            fout.flush();
            fout.close();
            dis.close();
            socket.close();
            clientSocket.close();
}catch(Exception e)
{System.out.println(e);}  
}
public static void create_dir()
{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();
   String t=dtf.format(now);
   str3=String.valueOf(t.toCharArray(), 0, 4);
   str4=String.valueOf(t.toCharArray(), 5, 2);
   str5=String.valueOf(t.toCharArray(), 8, 2);
   str6=String.valueOf(t.toCharArray(), 11, 2);
   str7=String.valueOf(t.toCharArray(), 14, 2);
   str8=String.valueOf(t.toCharArray(), 17, 2);
int j=0;
    try {
         	  File file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1);
                  file.getParentFile().mkdir();
                  file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2);
                  file.getParentFile().mkdir();
                  file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3);
                  file.getParentFile().mkdir();
                  file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3+"//"+str4);
                  file.getParentFile().mkdir();
                  file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3+"//"+str4+"//"+str5);
                  file.getParentFile().mkdir();
                  file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3+"//"+str4+"//"+str5+"//"+str6);
                  file.getParentFile().mkdir();
                   file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3+"//"+str4+"//"+str5+"//"+str6+"//"+str7);
                  file.getParentFile().mkdir();
                   file = new File("C://Users//Vishal Khairnar//Desktop//Library//"+str1+"//"+str2+"//"+str3+"//"+str4+"//"+str5+"//"+str6+"//"+str7+"//"+str8);
                  file.getParentFile().mkdir();

        }
        catch(Exception e) {
            System.out.println("exception");
        }
}
public static String mReceive()
{
	String  str="aaa";
	try{  
	ServerSocket ss=new ServerSocket(666);  
	Socket s=ss.accept(); 
	DataInputStream dis=new DataInputStream(s.getInputStream());  
	str=(String)dis.readUTF();  
	ss.close();
	}catch(Exception e)
	{System.out.println(e);}
	return str; 
}
}