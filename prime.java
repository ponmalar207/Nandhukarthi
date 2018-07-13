	public static void main(String[] args) {
		int num=111,p=0;
		for(int i=1;i<=Math.sqrt(num);i++){
			if(num%i==0){
				p++;
			}
		}
		if(p==2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
