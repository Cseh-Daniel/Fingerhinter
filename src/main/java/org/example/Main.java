package org.example;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ScorePartwise partwise = new ScorePartwise();
        try {
            partwise.unmarshal();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
