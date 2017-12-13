package utng.data;

import org.hibernate.HibernateException;
import utng.model.Excursion;

public class ExcursionDAO extends DAO<Excursion>{
    //Constructor
    public ExcursionDAO() {
        super(new Excursion());
    }
    //Obtener excursion por Id
    public Excursion getOneById(Excursion excursion)
            throws HibernateException {
        return super.getOneById(excursion.getIdExcursion());
    }    
}
