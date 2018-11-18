package loanSystem;


public class NipValidator implements Validation {

	// http://wipos.p.lodz.pl/zylla/ut/nip-rego.html 
	//
@Override
   public boolean isValid(LoanApplication loanApplication) { 
	
	   String nip = loanApplication.getNip();
       int nsize = nip.length(); 
       if (nsize != 10) { 
           return false; 
       } 
       int[] weights = {6,5,7,2,3,4,5,6,7}; 
       int j = 0, sum = 0, control = 0; 
       int csum = new Integer(nip.substring(nsize - 1)).intValue(); 
       if (csum == 0) { 
           csum = 10; 
       } 
       for (int i = 0; i < nsize - 1; i++) { 
           char c = nip.charAt(i); 
           j = new Integer(String.valueOf(c)).intValue(); 
           sum += j * weights[i]; 
       } 
       control = sum % 11; 
       return (control == csum); 
   }

}

