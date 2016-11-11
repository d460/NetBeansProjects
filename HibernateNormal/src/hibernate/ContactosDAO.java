package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ContactosDAO {
    
    private Session sesion;
    private Transaction tx;
    
    
    
    private void iniciaOperacion() throws HibernateException {
        sesion = Hibernateutil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();  
    }
    
    private void manejaExcepcion(HibernateException he) throws HibernateException
    {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
}
