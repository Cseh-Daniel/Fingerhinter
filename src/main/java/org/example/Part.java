package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Part {
    private String id;
    private List<Measure> measures;

    // Getter and Setter for id
    @XmlAttribute(name = "id") // Maps the "id" attribute of <part>
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for measures
    @XmlElement(name = "measure") // Maps the list of <measure> elements
    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }
}
