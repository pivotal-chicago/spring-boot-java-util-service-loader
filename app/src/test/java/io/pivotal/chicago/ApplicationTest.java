package io.pivotal.chicago;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTest {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public SpringMethodRule springMethodRule = new SpringMethodRule();

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void allDictionariesAreLoadedOnStartup() {
        String output = outputCapture.toString();

        assertThat(output, containsString("BasicDictionary"));
        assertThat(output, containsString("ExtendedDictionary"));
    }
}
