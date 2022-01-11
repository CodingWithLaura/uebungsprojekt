package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.time.Instant;

public class ComputerTimeProvider implements TimeProvider{
    @Override
    public void showSystemTime() {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }

    @Override
    public void showUTCTime() {
        System.out.println(Instant.now().toString());
    }
}
