/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverexample;

import java.net.*;
import java.io.*;
/**
 * Server Program.
 * Converts incoming text to uppercase and sends converted
 * text back to client.
 * Accepts connection requests on port 2345.
 */
public class Server {
  public static void main(String args[]) {
    ServerSocket theServer;
    Socket con;
    PrintStream ps;
    DataInputStream dis;
    String input;
    int port = 2345;
    boolean flag = true;
try {
      theServer = new ServerSocket(port);
      con = theServer.accept();
      dis = new DataInputStream(con.getInputStream());
      ps = new PrintStream (con.getOutputStream());
      while(flag == true) {
        input = dis.readLine();
        if ( input == null ) break;
        ps.println(uppers(input));
      }
      con.close();
      dis.close();
      ps.close();
      theServer.close();
    }
    catch(NullPointerException e){
      System.out.println("NPE" + e.getMessage());
    }
catch(IOException e) {
      System.out.println(e);
    }
  }
  public static String uppers(String input) {
    char let;
    StringBuffer sb = new StringBuffer(input);
    for (int i = 0; i < sb.length(); i++) {
      let = sb.charAt(i);
      let = Character.toUpperCase(let);
      sb.setCharAt(i,let);
    }
    return sb.toString();
  }
}
