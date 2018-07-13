public static void main(String[] args) {
		int a=371;
		int c=0,sum=0,b=a;
		while(a!=0){
			c=a%10;
			a=a/10;
			c=(int)Math.pow(c,3);
			sum=(sum)+c;
		}
		System.out.println(b);
		System.out.println(sum);
		if(b==sum){
			System.out.println("YES"); 
		}else{
			System.out.println("NO");
		}

	}
