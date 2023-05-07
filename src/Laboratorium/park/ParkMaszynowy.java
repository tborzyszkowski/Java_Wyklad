package Laboratorium.park;

import java.util.*;

public class ParkMaszynowy {
	private List<Maszyna> maszyny = new ArrayList<Maszyna>();

	public ParkMaszynowy(List<Maszyna> maszyny) {
		this.maszyny = maszyny;
	}

	public List<Maszyna> getMaszyny() {
		return maszyny;
	}

	public void setMaszyny(List<Maszyna> maszyny) {
		this.maszyny = maszyny;
	}

	public void addMaszyna(Maszyna maszyna){
		maszyny.add(maszyna);
	}

	public void deleteMaszyna(Maszyna maszyna){
		maszyny.remove(maszyna);
	}
	 public int ileMaszyn(){
		return maszyny.size();
	 }

	 public String toString(){
		return maszyny.toString();
	 }
}
