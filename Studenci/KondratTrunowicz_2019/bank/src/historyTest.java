import org.junit.*;

import java.time.LocalDate;

public class historyTest {
    @Test
    public void GetDate() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        history historia = new history (ld1, 50, 990);
        Assert.assertEquals(ld1 ,historia.getDate());
    }
    @Test
    public void GetN() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        history historia = new history (ld1, 50, 990);
        Assert.assertEquals(50 ,historia.getN());
    }
    @Test
    public void GetBalance() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        history historia = new history (ld1, 50, 990);
        Assert.assertEquals(990 ,historia.getBalance());
    }
    @Test
    public void setN() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        history historia = new history (ld1, 50, 990);
        historia.setN(30);
        Assert.assertEquals(30 ,historia.getN());
    }
    @Test
    public void setBalance() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        history historia = new history (ld1, 50, 990);
        historia.setBalance(300);
        Assert.assertEquals(300 ,historia.getBalance());
    }
    @Test
    public void setDate() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        LocalDate ld2 = LocalDate.parse("2019-11-23");
        history historia = new history (ld1, 50, 990);
        historia.setDate(ld2);
        Assert.assertEquals(ld2 ,historia.getDate());
    }
    @Test
    public void setHistoryALL() {
        // Arrange
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        LocalDate ld2 = LocalDate.parse("2019-11-23");
        history historia = new history (ld1, 50, 990);
        historia.setBalance(300);
        historia.setN(30);
        historia.setDate(ld2);
        Assert.assertEquals(ld2 ,historia.getDate());
        Assert.assertEquals(30 ,historia.getN());
        Assert.assertEquals(300 ,historia.getBalance());
    }

}
