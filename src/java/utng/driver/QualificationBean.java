package utng.driver;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.data.QualificationDAO;
import utng.data.ExcursionDAO;
import utng.model.Qualification;
import utng.model.Excursion;

@ManagedBean(name = "qualificationBean")
@SessionScoped
public class QualificationBean implements Serializable{
    
    private List<Qualification> qualifications;
    private Qualification qualification;
    

    public QualificationBean() {
        
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    
    
  
    
    public String toList() {
        QualificationDAO dao = new QualificationDAO();
        try {
            qualifications = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Qualifications";
    }

    public String delete() {
        QualificationDAO dao = new QualificationDAO();
        try {
            dao.delete(qualification);
            qualifications = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Delete";
    }

    public String start() {
        qualification = new Qualification();
   
        return "Start";
    }

    public String save() {
        QualificationDAO dao = new QualificationDAO();
        try {
            if (qualification.getIdQualification() != 0) {
                dao.update(qualification);
            } else {
                dao.insert(qualification);
            }
            qualifications = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }

    public String cancel() {
        return "Cancel";
    }

    public String edit(Qualification qualification) {
        this.qualification = qualification;
        
        return "Edit";
    }    
    
}
