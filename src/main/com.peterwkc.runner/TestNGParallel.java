import org.testng.annotations.Test;

import cucumber.api.cli.Main;

public class TestNGParallel {

    @Test
    public void run() {
        Main.main(new String[]{"--threads", "4", "-p", "timeline:target/cucumber-parallel-report", "-g", "com.peterwkc.step_definitions", "src/main/features"});
    }

}
