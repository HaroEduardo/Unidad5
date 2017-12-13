
package utng.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_qualification")
public class Qualification implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    @Column(name="id_qualification")
    private Long idQualification;
    
    
    
    @Column(name="student",length=100)
    private String student;
    
    @Column(name="period", length=100)
    private String period;
    
    @Column(name="qualification")
    private double qualification;
    
    @Column(name="state", length=100)
    private String state;

    public Qualification(Long idQualification,  String student, String period, double qualification, String state) {
        this.idQualification = idQualification;
        
        this.student = student;
        this.period = period;
        this.qualification = qualification;
        this.state = state;
    }
    
    public Qualification() {
        this.idQualification=0L;
    }

    public Long getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(Long idQualification) {
        this.idQualification = idQualification;
    }

    

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
       
}
