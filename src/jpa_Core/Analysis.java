/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_Core;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author bayra
 */
@Entity
@Table(name = "ANALYSIS")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "analysis_type", discriminatorType = DiscriminatorType.STRING)
@NamedQueries({
    @NamedQuery(name = "Analysis.findAll", query = "SELECT a FROM Analysis a"),
    @NamedQuery(name = "Analysis.findById", query = "SELECT a FROM Analysis a WHERE a.id = :id")})
public abstract class Analysis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @OneToMany(mappedBy = "analysisId")
    private List<Analysisresult> analysisresultList;

    public Analysis() {
    }

    public Analysis(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Analysisresult> getAnalysisresultList() {
        return analysisresultList;
    }

    public void setAnalysisresultList(List<Analysisresult> analysisresultList) {
        this.analysisresultList = analysisresultList;
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
        if (!(object instanceof Analysis)) {
            return false;
        }
        Analysis other = (Analysis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa_Core.Analysis[ id=" + id + " ]";
    }

}
