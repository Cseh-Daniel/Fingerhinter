package org.example;

import javax.xml.bind.annotation.XmlElement;

public class Note {
    private Notations notations;

    // Getter and Setter for notations
    @XmlElement(name = "notations") // Maps the <notations> element
    public Notations getNotations() {
        return notations;
    }

    public void setNotations(Notations notations) {
        this.notations = notations;
    }
}
