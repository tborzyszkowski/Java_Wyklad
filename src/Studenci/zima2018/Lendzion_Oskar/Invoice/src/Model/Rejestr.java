package Model;

import java.util.ArrayList;
import java.util.List;

public class Rejestr {
	
	
	List<Faktura> faktury = new ArrayList<>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faktury == null) ? 0 : faktury.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rejestr other = (Rejestr) obj;
		if (faktury == null) {
			if (other.faktury != null)
				return false;
		} else if (!faktury.equals(other.faktury))
			return false;
		return true;
	}

	public Rejestr Zapisz(Faktura faktura) {
		
		faktury.add(faktura);
		
		return this;
	}
	
	public Rejestr Usun(Faktura faktura) {
		
		faktury.remove(faktura);
		
		return this;
	}

	@Override
	public String toString() {
		return "Rejestr [faktury=" + faktury + "\n]";
	}

	
	   
}
