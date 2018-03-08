package example;

import example.srcmodel.*;
import example.trgmodel.*;
import org.milyn.*;
import org.milyn.container.*;
import org.milyn.payload.*;
import org.xml.sax.*;

import java.io.*;

public class Main {

    protected Target runSmooksTransform(Source src) throws IOException, SAXException {
        Smooks smooks = new Smooks("smooks-config.xml");

        try {
            ExecutionContext executionContext = smooks.createExecutionContext();
            JavaSource source = new JavaSource(src);
            JavaResult result = new JavaResult();
            smooks.filterSource(executionContext, source, result);
            return (Target) result.getBean("Order");
        } finally {
            smooks.close();
        }
    }

    public static void main(String[] args) throws IOException, SAXException, SmooksException {
        Main smooksMain = new Main();
        Source src = new Source();
        System.out.println(src);
        Target lineOrder = smooksMain.runSmooksTransform(src);
        System.out.println(lineOrder);
    }
}