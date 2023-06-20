/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_Core;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author bayra
 */
@Entity
@Table(name = "URINE_ANALYSIS")
@PrimaryKeyJoinColumn(name = "id")
@NamedQueries({
    @NamedQuery(name = "UrineAnalysis.findAll", query = "SELECT u FROM UrineAnalysis u"),
    @NamedQuery(name = "UrineAnalysis.findByGlukoz", query = "SELECT u FROM UrineAnalysis u WHERE u.glukoz = :glukoz"),
    @NamedQuery(name = "UrineAnalysis.findByProtein", query = "SELECT u FROM UrineAnalysis u WHERE u.protein = :protein"),
    @NamedQuery(name = "UrineAnalysis.findByBilirubin", query = "SELECT u FROM UrineAnalysis u WHERE u.bilirubin = :bilirubin"),
    @NamedQuery(name = "UrineAnalysis.findByUrobilinojen", query = "SELECT u FROM UrineAnalysis u WHERE u.urobilinojen = :urobilinojen"),
    @NamedQuery(name = "UrineAnalysis.findByPh", query = "SELECT u FROM UrineAnalysis u WHERE u.ph = :ph"),
    @NamedQuery(name = "UrineAnalysis.findByHemoglobin", query = "SELECT u FROM UrineAnalysis u WHERE u.hemoglobin = :hemoglobin"),
    @NamedQuery(name = "UrineAnalysis.findByKeton", query = "SELECT u FROM UrineAnalysis u WHERE u.keton = :keton"),
    @NamedQuery(name = "UrineAnalysis.findByNitrit", query = "SELECT u FROM UrineAnalysis u WHERE u.nitrit = :nitrit"),
    @NamedQuery(name = "UrineAnalysis.findByLokositEsteraz", query = "SELECT u FROM UrineAnalysis u WHERE u.lokositEsteraz = :lokositEsteraz"),
    @NamedQuery(name = "UrineAnalysis.findByDansite", query = "SELECT u FROM UrineAnalysis u WHERE u.dansite = :dansite")})
public class UrineAnalysis extends Analysis implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "GLUKOZ")
    private Integer glukoz;
    @Column(name = "PROTEIN")
    private Integer protein;
    @Column(name = "BILIRUBIN")
    private Integer bilirubin;
    @Column(name = "UROBILINOJEN")
    private Integer urobilinojen;
    @Column(name = "PH")
    private Integer ph;
    @Column(name = "HEMOGLOBIN")
    private Integer hemoglobin;
    @Column(name = "KETON")
    private Integer keton;
    @Column(name = "NITRIT")
    private Integer nitrit;
    @Column(name = "LOKOSIT_ESTERAZ")
    private Integer lokositEsteraz;
    @Column(name = "DANSITE")
    private Integer dansite;

    public UrineAnalysis() {
    }

    public UrineAnalysis(Integer glukoz, Integer protein, Integer bilirubin, Integer urobilinojen, Integer ph, Integer hemoglobin, Integer keton, Integer nitrit, Integer lokositEsteraz, Integer dansite) {
        
        this.glukoz = glukoz;
        this.protein = protein;
        this.bilirubin = bilirubin;
        this.urobilinojen = urobilinojen;
        this.ph = ph;
        this.hemoglobin = hemoglobin;
        this.keton = keton;
        this.nitrit = nitrit;
        this.lokositEsteraz = lokositEsteraz;
        this.dansite = dansite;
    }
    

    public Integer getGlukoz() {
        return glukoz;
    }

    public void setGlukoz(Integer glukoz) {
        this.glukoz = glukoz;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getBilirubin() {
        return bilirubin;
    }

    public void setBilirubin(Integer bilirubin) {
        this.bilirubin = bilirubin;
    }

    public Integer getUrobilinojen() {
        return urobilinojen;
    }

    public void setUrobilinojen(Integer urobilinojen) {
        this.urobilinojen = urobilinojen;
    }

    public Integer getPh() {
        return ph;
    }

    public void setPh(Integer ph) {
        this.ph = ph;
    }

    public Integer getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(Integer hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public Integer getKeton() {
        return keton;
    }

    public void setKeton(Integer keton) {
        this.keton = keton;
    }

    public Integer getNitrit() {
        return nitrit;
    }

    public void setNitrit(Integer nitrit) {
        this.nitrit = nitrit;
    }

    public Integer getLokositEsteraz() {
        return lokositEsteraz;
    }

    public void setLokositEsteraz(Integer lokositEsteraz) {
        this.lokositEsteraz = lokositEsteraz;
    }

    public Integer getDansite() {
        return dansite;
    }

    public void setDansite(Integer dansite) {
        this.dansite = dansite;
    }

    @Override
    public String toString() {
        return "jpa_Core.UrineAnalysis[ id=" + " ]";
    }

}
