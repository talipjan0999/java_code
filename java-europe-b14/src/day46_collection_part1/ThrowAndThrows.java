package day46_collection_part1;

public class ThrowAndThrows {
	public static void main(String[] args) throws Exception {
		public static void main(String[] args)  {
			
			System.out.println("Hello world");

			//throw new RuntimeException("This is some exception");
			
			
			
		
			//throw new Exception("Another exception");
			 
			
			

			String username = "";
			
			if(username.isEmpty()) {
	@ -22,7 +18,41 @@ public class ThrowAndThrows {
				System.out.println("Valid username");
			}
			
			try {
				sleep3(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		public static void sleep(int seconds) throws InterruptedException {
			
			Thread.sleep(seconds*1000);
			
		}

		public static void sleep2(int seconds) throws InterruptedException {
			
			sleep(seconds);
			
		}
		
		public static void sleep3(int seconds) throws InterruptedException {
			
			sleep2(seconds);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}