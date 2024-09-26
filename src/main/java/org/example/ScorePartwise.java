package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@XmlRootElement(name = "score-partwise")
public class ScorePartwise {

    private String movementTitle;
    private String version;

    //    @XmlElement(name = "movement-title")
    public String getMovementTitle() {
        return movementTitle;
    }

    @XmlElement(name = "movement-title")
    public void setMovementTitle(String movementTitle) {
        this.movementTitle = movementTitle;
    }


    @XmlAttribute(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

//    private List<Part> parts;
//
//    @XmlElement(name = "part")
//    public List<Part> getParts() {
//        return parts;
//    }
//
//    public void setParts(List<Part> parts) {
//        this.parts = parts;
//    }

    public ScorePartwise unmarshal() throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(ScorePartwise.class);
        return (ScorePartwise) context.createUnmarshaller().unmarshal(new FileReader("./input/input.xml"));
    }

}
