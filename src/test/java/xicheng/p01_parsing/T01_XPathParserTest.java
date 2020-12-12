package xicheng.p01_parsing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-12-12 20:29
 */
@Slf4j
public class T01_XPathParserTest {

    @Test
    public void documentBuilderFactoryTest() {
        DocumentBuilderFactory instance01 = DocumentBuilderFactory.newInstance();
        DocumentBuilderFactory instance02 = DocumentBuilderFactory.newInstance();
        log.info("T01_XPathParserTest documentBuilderFactoryTest result: {}", instance01 == instance02);
    }
}
