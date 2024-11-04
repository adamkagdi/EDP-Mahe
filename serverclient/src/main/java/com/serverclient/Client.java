package com.serverclient;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket2 = new Socket("localhost", 7666);
            DataOutputStream dataOutputStream = new DataOutputStream(socket2.getOutputStream());
            dataOutputStream.writeUTF("Hello Server");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket2.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
