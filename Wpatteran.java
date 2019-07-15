class Demo1236 
{
	public static void main(String[] args) 
	{
		for (int i =1;i < 5;i++)
		{
                       
            System.out.print("*"); 
			for (int j=5;j>i;j--)
			{      
			System.out.print(" ");
			}
			for (int k =1; k <= (i*2)-1; k++)
			{
				if(k==1 || k == (i*2)-1)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
                       for(int m=5;m>i;m--)
                       {System.out.printf(" ");}
                        System.out.print("*"); 
                        System.out.println(" ");
		}
                  
                
		
	}
}
