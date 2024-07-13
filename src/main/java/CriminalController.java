
import DAO.CriminalDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class CriminalController {
    public String crearCriminal(String nombreCriminal, String hobby, String sexo, String colorPelo, String ocupacion,
                    String vehiculo, String caracteristica;){
            
        SessionFactory  sessionFactory  =   new 
        Configuration().configure("hibernate.cfg.xml").addAnnotatdedClass(CriminalDAO.class).buildSessionFactory();
    
        Session session = sessionFactory.openSession();
        
        try{
        
            CriminalDAO criminal = new CriminalDAO()
            
        return "Criminal creado";
        
        }catch (Exeption e) {
            e.printStackTrace();
        }
        
    }
}
