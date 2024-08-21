 public static int B;
    public static int H;
    public static boolean flag;
    
    static
    {
        Scanner sc = new Scanner(System.in);
        
        B = sc.nextInt();
        H = sc.nextInt();
        
        if(B<=0 || H<=0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            flag = true;
    }
    



public static void main(String[] args){
if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

