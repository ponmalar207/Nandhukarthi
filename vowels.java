 public static void main(String[] args){
	 char ch='@';
	 if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
		 if(ch==97||ch==69||ch==73||ch==79||ch==85||ch==65||ch==101||ch==105||ch==111||ch==117){
			 System.out.println("VOWELS");
		 }else{
			 System.out.println("CONSONANT");
		 }
	 }else{
		 System.out.println("INVALID");
	 }
 }
