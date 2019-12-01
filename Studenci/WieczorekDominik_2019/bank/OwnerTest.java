import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void getName() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        assertEquals(owner.getName(), "Stefan");
    }

    @Test
    void setName() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        owner.setName("Janusz");
        assertEquals(owner.getName(), "Janusz");
    }

    @Test
    void getSurname() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        assertEquals(owner.getSurname(), "Kowalski");
    }

    @Test
    void setSurname() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        owner.setSurname("Nowak");
        assertEquals(owner.getSurname(), "Nowak");
    }

    @Test
    void getPESEL() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        assertEquals(owner.getPESEL(), "44051401458");
    }

    @Test
    void setPESEL() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        owner.setPESEL("12345678912");
        assertEquals(owner.getPESEL(), "12345678912");
    }

    @Test
    void wrongPESEL() {
        assertThrows(IllegalArgumentException.class, () -> new Owner("Stefan", "Kowalski", "4405140458"));
    }
}