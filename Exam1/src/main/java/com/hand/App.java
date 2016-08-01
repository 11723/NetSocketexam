package com.hand;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class App {

	public static void main(String[] args) {
	URL url;
	try {
		url=new URL("http://files.saas.hand-china.com/javatarget.pdf");
		URLConnection connection=url.openConnection();
     InputStream inputstream=connection.getInputStream();
     BufferedInputStream bis=new BufferedInputStream(inputstream);
     byte[] b=new byte[1024];
     FileOutputStream fos=new FileOutputStream("src/zc.pdf",true);
     int count=bis.read(b,0,1023);
     while(count>0){
    	 fos.write(b, 0, count);
    	 count=bis.read(b,0,1023);
    	 
     }
     fos.close();
     bis.close();
     inputstream.close();
		
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
