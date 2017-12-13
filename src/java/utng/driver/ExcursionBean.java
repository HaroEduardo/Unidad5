package utng.driver;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.ExcursionDAO;
import utng.data.QualificationDAO;
import utng.model.Excursion;
import utng.model.Qualification;

@ManagedBean(name = "excursionBean")
@SessionScoped
public class ExcursionBean implements Serializable{
    
    private List<Excursion>excursions;
    private Excursion excursion;
    private List<Qualification>qualification;
    private List<Qualification> qualifications;
    public ExcursionBean(){
        excursion = new Excursion();
        excursion.setQualification(new Qualification());
    }

    public List<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(List<Excursion> excursions) {
        this.excursions = excursions;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public List<Qualification> getQualification() {
        return qualification;
    }

    public void setQualification(List<Qualification> qualification) {
        this.qualification = qualification;
    }

    
   
    
    public String toList(){
        ExcursionDAO dao = new ExcursionDAO();
        try {
            excursions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Excursions";
    }
    
    public String delete(){
         ExcursionDAO dao = new ExcursionDAO();
        try {
            dao.delete(excursion);
            excursions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Delete";
    }
    
    public String start(){
        excursion= new Excursion();
        excursion.setQualification(new Qualification());
        try{
            qualifications=new QualificationDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Start";
    }
    
    public String save(){
        ExcursionDAO dao = new ExcursionDAO();
        try {
            if(excursion.getIdExcursion()!= 0){
                dao.update(excursion);
            }else {
                dao.insert(excursion);
            }
            excursions=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }
    
    public String cancel(){
    return "Cancel";
    }
    
    public String edit(Excursion excursion){
        this.excursion=excursion;
        try{
            qualification= new QualificationDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Edit";
    }   
}
