
package utng.data;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import utng.model.Qualification;

public class QualificationDAO extends DAO<Qualification>{
    
    public QualificationDAO() {
        super(new Qualification());
    }
    
    public Qualification getOneById(Qualification qualification)
            throws HibernateException {
        return super.getOneById(qualification.getIdQualification());
    }
}
