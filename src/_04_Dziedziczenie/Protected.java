package _04_Dziedziczenie;

public class Protected extends ProtectedBase {
	public void F(Protected p) {
        //int a = p.a; //Błąd, nie mamy dostępu do składowych prywatnych
        //klasy bazowej
        int b = p.b; //OK
        int c = p.c; //OK, składowe publiczne
    }
    public void G(ProtectedBase p) {
        //int a = p.a; //Błąd, nie mamy dostępu do składowych prywatnych
        
        int b = p.b; // BRAK BŁĘDU a w C# jest
      
        int c = p.c; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
