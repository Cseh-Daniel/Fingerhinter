package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Measure {
    private int number;
    private List<Note> notes;

    // Getter and Setter for number
    @XmlAttribute(name = "number") // Maps the "number" attribute of <measure>
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Getter and Setter for notes
    @XmlElement(name = "note") // Maps the list of <note> elements
    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
