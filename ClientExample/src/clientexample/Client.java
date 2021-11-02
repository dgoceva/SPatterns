/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientexample;

import java.net.*;
import java.io.*;
/**
 * Client Program.
 * Connects to a server which converts text to uppercase.
 * Server responds on port 2345.
 * Server host specified on command line: java Client server_host
 */
public class Client {
  public static void main(String args[]) {
    Socket s;
    String host;
    int port = 2345;
    DataInputStream is;
    DataInputStream ui;
    PrintStream os;
    String theLine;
    host = args[0];
    try {
      s = new Socket(host, port);
      is = new DataInputStream(s.getInputStream());
      os = new PrintStream(s.getOutputStream());
      ui = new DataInputStream(System.in);
      System.out.println("Enter Data");
      while(true) {
        theLine = ui.readLine();
        if (theLine.equals("end"))
          break;
        os.println(theLine);
        System.out.println(is.readLine());
      }
os.close();
      is.close();
      ui.close();
      s.close();
    }
    catch(UnknownHostException e) {
      System.out.println("Can’t find " + host);
    }
    catch(SocketException e) {
      System.out.println("Could not connect to " + host);
    }   
    catch(IOException e) {
      System.out.println(e);
    }
  }
}
