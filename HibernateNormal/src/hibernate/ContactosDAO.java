package hibernate;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ContactosDAO {
    
 private Session sesion; 
 private Transaction tx;  

    public long guardaContacto(Contacto contacto) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return id; 
    }  

    public void actualizaContacto(Contacto contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public void eliminaContacto(Contacto contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public Contacto obtenContacto(long idContacto) throws HibernateException 
    { 
        Contacto contacto = null;  
        try 
        { 
            iniciaOperacion(); 
            contacto = (Contacto) sesion.get(Contacto.class, idContacto); 
        } finally 
        { 
            sesion.close(); 
        }  

        return contacto; 
    }  

    public List<Contacto> obtenListaContactos() throws HibernateException 
    { 
        List<Contacto> listaContactos = null;  

        try 
        { 
            iniciaOperacion(); 
            listaContactos = sesion.createQuery("from Contacto").list(); 
        } finally 
        { 
            sesion.close(); 
        }  

        return listaContactos; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = Hibernateutil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
    
}
