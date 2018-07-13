public static void main(String[] args) {
		int a=1,num=10,p=0;
		for(int j=a;j<=num;j++){
			p=0;
		for(int i=1;i<=j;i++){
			if(j%i==0){
				p++;
			}
		}
		if(p==2){
			System.out.print(j+" ");
		}
		}
}
