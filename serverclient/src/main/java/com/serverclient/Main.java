package com.serverclient;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(7666);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String str = (String)dataInputStream.readUTF();
            System.out.println("Message = " + str);
            socket.close();
            serverSocket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
