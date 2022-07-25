package com.motivity;

import java.util.*;

class LargeNumber {
	
	
public  String LargetNumber(int [] nums)
{
	int n=nums.length;
	String [] ob=new String[n];
	for(int i=0;i<n;i++)
	{
		ob[i]=String.valueOf(nums[i]);
		Arrays.sort(ob,(a,b)->(b+a).compareTo(a+b));
		StringBuffer ob1=new StringBuffer();
		for(String str:ob)
			ob1.append(str);
			String result=ob1.toString();
		  return 
		  result.startsWith("0") ? "0": result;
			  
	}
	return "";
	

}
}