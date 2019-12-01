package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ClientTest {
	
	@Test
	void testSetClientName() {
		Client k2 = new Client("Biedronka", "Sopot", 1123456789);
		String name = "Biedronka";
		assertEquals(name, k2.getClientName());
	}


	@Test
	void testSetAdress() {
		Client k2 = new Client("Biedronka", "Sopot", 1123456789);
		String address = "Sopot";
		assertEquals(address,k2.getAdress());
	}


	@Test
	void testsetNip() {
		Client k3 = new Client("Żabka", "Gdynia", 1234567891);
		int nip = 1234567891;
		assertEquals(nip, k3.getNip());
	}
		
}	
