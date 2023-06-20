/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_Core;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bayra
 */
@Entity
@Table(name = "ANALYSISRESULT")
@NamedQueries({
    @NamedQuery(name = "Analysisresult.findAll", query = "SELECT a FROM Analysisresult a"),
    @NamedQuery(name = "Analysisresult.findById", query = "SELECT a FROM Analysisresult a WHERE a.id = :id"),
    @NamedQuery(name = "Analysisresult.findByAnalysisType", query = "SELECT a FROM Analysisresult a WHERE a.analysisType = :analysisType"),
    @NamedQuery(name = "Analysisresult.findByDate", query = "SELECT a FROM Analysisresult a WHERE a.date = :date")})
public class Analysisresult implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ANALYSIS_TYPE")
    private String analysisType;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "ANALYSIS_ID", referencedColumnName = "ID")
    @ManyToOne
    private Analysis analysisId;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "ID")
    @ManyToOne
    private Patient patientId;
    @JoinColumn(name = "DOCTOR_ID", referencedColumnName = "ID")
    @ManyToOne
    private Doctor doctorId;

    public Analysisresult() {
    }

    public Analysisresult( Date date, Analysis analysisId, Patient patientId, Doctor doctorId) {
        this.date = date;
        this.analysisId = analysisId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        
        if(analysisId instanceof BloodAnalysis){
            analysisType = "Blood Analysis";
        }else if(analysisId instanceof UrineAnalysis){
            analysisType = "Urine Analysis";
        }
        
    }
    
    

    public Analysisresult(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Analysis getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(Analysis analysisId) {
        this.analysisId = analysisId;
    }

    public Person getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public Person getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analysisresult)) {
            return false;
        }
        Analysisresult other = (Analysisresult) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa_Core.Analysisresult[ id=" + id + " ]";
    }

}
