/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_Core;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author bayra
 */
@Entity
@DiscriminatorValue("LabAttendant")
public class LabAttendant extends Person {

    public LabAttendant() {
    }

    public LabAttendant(String name, String surname, String username, String password) {
        super(name, surname, username, password);

    }

}
