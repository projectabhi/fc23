package com.test.python;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CallHelloPython {

	public static void main(String[] args) throws Exception{
		System.out.println("Calling /mnt/fedora-home/adey/learning/python_workspace/hello.py");
		Process p=Runtime.getRuntime().exec("python /mnt/fedora-home/adey/learning/python_workspace/hello.py");
		InputStream is=p.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		String inputLine;
		System.out.println("Output:");
		while((inputLine = br.readLine()) != null)
		{
			System.out.println(inputLine);
		}
		br.close();
		isr.close();
		is.close();
	}

}
