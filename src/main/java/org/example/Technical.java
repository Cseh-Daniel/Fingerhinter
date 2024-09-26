package org.example;

import javax.xml.bind.annotation.XmlElement;

public class Technical {
    private int fingering;

    // Getter and Setter for fingering
    @XmlElement(name = "fingering") // Maps the <fingering> element
    public int getFingering() {
        return fingering;
    }

    public void setFingering(int fingering) {
        this.fingering = fingering;
    }
}
