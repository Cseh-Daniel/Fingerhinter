package org.example;

import javax.xml.bind.annotation.XmlElement;

public class Notations {
    private Technical technical;

    // Getter and Setter for technical
    @XmlElement(name = "technical") // Maps the <technical> element
    public Technical getTechnical() {
        return technical;
    }

    public void setTechnical(Technical technical) {
        this.technical = technical;
    }
}
