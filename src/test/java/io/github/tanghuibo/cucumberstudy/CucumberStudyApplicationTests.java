package io.github.tanghuibo.cucumberstudy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author tanghuibo
 * @date 2020/6/6下午11:34
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:src/test/resources/test-result", features = "src/test/resources/use-cases/")
public class CucumberStudyApplicationTests {
}
