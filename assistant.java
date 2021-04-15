import java.util.*;
import java.awt.Desktop;
import java.net.*;


        public class assistant{

	
	public static void main(String[] args) {
		
		
		
		System.out.println("online lecture will be started");
if (Desktop.isDesktopSupported()) {
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://web.whatsapp.com/"));
                
            } catch (Exception e) {
                System.out.println(e.getStackTrace());

            }

	
	
	

		
	}
		
		for(;;) {
	Calendar cld = Calendar.getInstance();
			 
			
			if(cld.get(Calendar.HOUR_OF_DAY) == 14 & cld.get(Calendar.MINUTE) == 25 &  cld.get(Calendar.SECOND) == 0) {
				if (Desktop.isDesktopSupported()) {
		            Desktop d = Desktop.getDesktop();
		            try {
		                d.browse(new URI("file:///C:/subt/forceshutdown.bat"));
		                break;
		            } catch (Exception e) {
		                System.out.println(e.getStackTrace());

		            }

			
			
			
	
				
			}
				
			
		
			
	}
			if(cld.get(Calendar.HOUR_OF_DAY) == 12 & cld.get(Calendar.MINUTE) == 15 &  cld.get(Calendar.SECOND) == 0) {
				if (Desktop.isDesktopSupported()) {
		            Desktop d = Desktop.getDesktop();
		            try {
		                d.browse(new URI("file:///C:/subt/break.txt"));
		                
		            } catch (Exception e) {
		                System.out.println(e.getStackTrace());

		            }

			
			
			
	
				
			}
			
		
			
			
	}
			if(cld.get(Calendar.HOUR_OF_DAY) == 12 & cld.get(Calendar.MINUTE) == 45 &  cld.get(Calendar.SECOND) == 0) {
				if (Desktop.isDesktopSupported()) {
		            Desktop d = Desktop.getDesktop();
		            try {
		                d.browse(new URI("file:///C:/subt/breakended.txt"));
		                
		            } catch (Exception e) {
		                System.out.println(e.getStackTrace());

		            }

			
			
			
	
				
			}
			
		
			}
		}
}
}