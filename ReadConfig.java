package com.webmath.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public void Readconfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}
	}
		public String navigate()
		{
			String url=pro.getProperty("url");
			return url;
		}
		
		public String chromepath()
		{
			String chromepath=pro.getProperty("chromepath");
			return chromepath;
		}

	
		
	}

	

