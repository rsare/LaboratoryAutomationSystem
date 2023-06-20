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
@Table(name = "BLOOD_ANALYSIS")
@PrimaryKeyJoinColumn(name = "id")
@NamedQueries({
    @NamedQuery(name = "BloodAnalysis.findAll", query = "SELECT b FROM BloodAnalysis b"),
    @NamedQuery(name = "BloodAnalysis.findByWbc", query = "SELECT b FROM BloodAnalysis b WHERE b.wbc = :wbc"),
    @NamedQuery(name = "BloodAnalysis.findByNeu", query = "SELECT b FROM BloodAnalysis b WHERE b.neu = :neu"),
    @NamedQuery(name = "BloodAnalysis.findByLym", query = "SELECT b FROM BloodAnalysis b WHERE b.lym = :lym"),
    @NamedQuery(name = "BloodAnalysis.findByMono", query = "SELECT b FROM BloodAnalysis b WHERE b.mono = :mono"),
    @NamedQuery(name = "BloodAnalysis.findByEos", query = "SELECT b FROM BloodAnalysis b WHERE b.eos = :eos"),
    @NamedQuery(name = "BloodAnalysis.findByBaso", query = "SELECT b FROM BloodAnalysis b WHERE b.baso = :baso"),
    @NamedQuery(name = "BloodAnalysis.findByRbc", query = "SELECT b FROM BloodAnalysis b WHERE b.rbc = :rbc"),
    @NamedQuery(name = "BloodAnalysis.findByHgb", query = "SELECT b FROM BloodAnalysis b WHERE b.hgb = :hgb"),
    @NamedQuery(name = "BloodAnalysis.findByHct", query = "SELECT b FROM BloodAnalysis b WHERE b.hct = :hct"),
    @NamedQuery(name = "BloodAnalysis.findByMcv", query = "SELECT b FROM BloodAnalysis b WHERE b.mcv = :mcv")})
public class BloodAnalysis extends Analysis implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "WBC")
    private Integer wbc;
    @Column(name = "NEU")
    private Integer neu;
    @Column(name = "LYM")
    private Integer lym;
    @Column(name = "MONO")
    private Integer mono;
    @Column(name = "EOS")
    private Integer eos;
    @Column(name = "BASO")
    private Integer baso;
    @Column(name = "RBC")
    private Integer rbc;
    @Column(name = "HGB")
    private Integer hgb;
    @Column(name = "HCT")
    private Integer hct;
    @Column(name = "MCV")
    private Integer mcv;

    public BloodAnalysis() {
    }

    public BloodAnalysis(Integer wbc, Integer neu, Integer lym, Integer mono, Integer eos, Integer baso, Integer rbc, Integer hgb, Integer hct, Integer mcv) {
        this.wbc = wbc;
        this.neu = neu;
        this.lym = lym;
        this.mono = mono;
        this.eos = eos;
        this.baso = baso;
        this.rbc = rbc;
        this.hgb = hgb;
        this.hct = hct;
        this.mcv = mcv;
    }
    

    public Integer getWbc() {
        return wbc;
    }

    public void setWbc(Integer wbc) {
        this.wbc = wbc;
    }

    public Integer getNeu() {
        return neu;
    }

    public void setNeu(Integer neu) {
        this.neu = neu;
    }

    public Integer getLym() {
        return lym;
    }

    public void setLym(Integer lym) {
        this.lym = lym;
    }

    public Integer getMono() {
        return mono;
    }

    public void setMono(Integer mono) {
        this.mono = mono;
    }

    public Integer getEos() {
        return eos;
    }

    public void setEos(Integer eos) {
        this.eos = eos;
    }

    public Integer getBaso() {
        return baso;
    }

    public void setBaso(Integer baso) {
        this.baso = baso;
    }

    public Integer getRbc() {
        return rbc;
    }

    public void setRbc(Integer rbc) {
        this.rbc = rbc;
    }

    public Integer getHgb() {
        return hgb;
    }

    public void setHgb(Integer hgb) {
        this.hgb = hgb;
    }

    public Integer getHct() {
        return hct;
    }

    public void setHct(Integer hct) {
        this.hct = hct;
    }

    public Integer getMcv() {
        return mcv;
    }

    public void setMcv(Integer mcv) {
        this.mcv = mcv;
    }

    @Override
    public String toString() {
        return "jpa_Core.BloodAnalysis[ id=" + " ]";
    }

}
