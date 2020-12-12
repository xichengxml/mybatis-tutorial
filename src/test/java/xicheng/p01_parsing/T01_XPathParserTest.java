package xicheng.p01_parsing;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.parsing.XPathParser;
import org.junit.Test;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-12-12 20:29
 */
@Slf4j
public class T01_XPathParserTest {

    private static final String RESOURCE = "resources/nodelet_test.xml";

    @Test
    public void documentBuilderFactoryTest() {
        DocumentBuilderFactory instance01 = DocumentBuilderFactory.newInstance();
        DocumentBuilderFactory instance02 = DocumentBuilderFactory.newInstance();
        log.info("T01_XPathParserTest documentBuilderFactoryTest result: {}", instance01 == instance02);
    }

    @Test
    public void constructorTest() throws Exception {
        // 这种方式是错误的，需要把xml转换成String，通过eval获取
        XPathParser xPathParser = new XPathParser(RESOURCE);
        log.info("T01_XPathParserTest constructorTest xPathParser: {}", JSON.toJSONString(xPathParser));
    }

}
