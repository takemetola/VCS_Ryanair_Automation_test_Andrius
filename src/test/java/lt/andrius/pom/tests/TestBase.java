package lt.andrius.pom.tests;

import lt.andrius.pom.utils.TestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

    public void tearDown() {
        // Common.quitDriver();
    }
}
