package com.shrish;

import java.util.ResourceBundle;

public class App
{
   public int userLogin(String in_user, String in_pwd)
   {
	   //This statement fetches the "config" file wherever it is under resources folder
	   ResourceBundle rb=ResourceBundle.getBundle("config");
	   String userName=rb.getString("username");
	   String passWord =rb.getString("password");
	   
	   
	   if(in_user.equals(userName) &&in_pwd.equals(passWord))
	   return 1;//Login is successful
	   
	   else
	   return 0;//Login is not successful
   }
	   
 }

