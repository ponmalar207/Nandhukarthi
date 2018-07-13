public static void main(String[] args) {
     int num=120;
     String s1=String.valueOf(num);
     String s2=new StringBuffer(s1).reverse().toString();
     if(s1.equals(s2)){
    	 System.out.println("YES");
     }else{
    	 System.out.println("NO");
     }

	}
