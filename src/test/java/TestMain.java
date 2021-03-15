import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMain {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public TestMain() {
        Locale.setDefault(new Locale("en", "US"));
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainFirst() {
        String data = "50\n10\n-30\n0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double[] expected = new double[]{3, 30, 10};
        double[] actual = Arrays.stream(outContent.toString().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMainSecond() {
        String data = "22.4298\n17.7358\n93.5671\n14\n51.6333\n73.753\n7.70522\n40.2982\n20.2874\n64.242\n34.8968\n0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double[] expected = new double[]{11, 440.54, 40.04};
        double[] actual = Arrays.stream(outContent.toString().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMainThird() {
        String data = "95.2415\n34.9638\n84.0018\n62.0275\n49.2394\n20.3623\n20.1762\n62.2493\n50.8845\n96.0079\n0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double[] expected = new double[]{10, 575.15, 57.51};
        double[] actual = Arrays.stream(outContent.toString().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMainForth() {
        String data = "70.896\n42.4808\n44.6086\n83.6865\n21.0749\n1.03357\n68.5738\n73.4556\n47.9039\n57.728\n0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double[] expected = new double[]{10, 511.44, 51.14};
        double[] actual = Arrays.stream(outContent.toString().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMainFifth() {
        String data = "20.6687\n72.5398\n45.7297\n93.2523\n41.3597\n10.6067\n41.773\n91.7613\n26.0945\n36.7338\n0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double[] expected = new double[]{10, 480.51, 48.05};
        double[] actual = Arrays.stream(outContent.toString().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        assertArrayEquals(expected, actual);
    }
}