package utng.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_module")
public class Module implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_module")
    private Long idModule;
    @Column(name="name", length=100)
    private String moduleName;
    @Column(length=150)
    private String route;
    public Module(Long idModule, String name, String route){
        super();
        this.idModule= idModule;
        this.moduleName=moduleName;
        this.route=route;
    }

    public Module() {
        this(0L,"","");
    }
    public Long getIdModule() {
        return idModule;
    }
    public void setIdModule(Long idModule) {
        this.idModule = idModule;
    }
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
}

