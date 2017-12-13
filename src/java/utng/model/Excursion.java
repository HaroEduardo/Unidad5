
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
@Table(name="tbl_excursion")
public class Excursion implements Serializable{
    //Se indica que el id se genera usando la estrategia de generar un valor autoincrementable
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Se crea la columna id_subject
    @Column(name="id_excursion")
    private Long idExcursion;//atributo privado idSubject
    //Se crea la columna nombre_subject
    @Column(name="name",length=100)
    private String excursionName;//atributo privado subjectName
    
    @Column(name="destination",length=100)
    private String destination;
    
    @Column(name="activity", length=100)
    private String activity;
    
    @Column(name="transport", length=100)
    private String transport;
    
    @Column(name="hotel", length=100)
    private String hotel;
    
    @Column(name="chofer", length=100)
    private String chofer;
    
    @Column(name="guide", length=100)
    private String guide;
    
    @Column(name="cost", length=100)
    private String cost;
    
@ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_qualification")    
    private Qualification qualification;

    public Excursion(Long idExcursion, String excursionName, String destination, String activity, String transport, String hotel, String chofer, String guide, String cost, Qualification qualification) {
        this.idExcursion = idExcursion;
        this.excursionName = excursionName;
        this.destination = destination;
        this.activity = activity;
        this.transport = transport;
        this.hotel = hotel;
        this.chofer = chofer;
        this.guide = guide;
        this.cost = cost;
        this.qualification = qualification;
    }


    
    
    public Excursion() {
        this.idExcursion=0L;
    }

    public Long getIdExcursion() {
        return idExcursion;
    }

    public void setIdExcursion(Long idExcursion) {
        this.idExcursion = idExcursion;
    }

    public String getExcursionName() {
        return excursionName;
    }

    public void setExcursionName(String excursionName) {
        this.excursionName = excursionName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    

    
    
    
    
    
}
