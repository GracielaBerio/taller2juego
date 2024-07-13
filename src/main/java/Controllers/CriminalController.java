package Controllers;

import DAO.CriminalDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Controlador para manejar las operaciones relacionadas con los criminales.
 */
public class CriminalController {

    // SessionFactory es costosa de crear y debería ser una instancia única
    private static SessionFactory sessionFactory;

    static {
        try {
            // Configurar la fábrica de sesiones de Hibernate
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(CriminalDAO.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para crear un nuevo criminal en la base de datos.
     *
     * @param idCriminal      ID del criminal
     * @param nombreCriminal  Nombre del criminal
     * @param hobby           Hobby del criminal
     * @param sexo            Sexo del criminal
     * @param colorPelo       Color de pelo del criminal
     * @param ocupacion       Ocupación del criminal
     * @param vehiculo        Vehículo del criminal
     * @param caracteristica  Característica distintiva del criminal
     * @return                Mensaje indicando si el criminal fue creado
     */
    public String crearCriminal(int idCriminal, String nombreCriminal, String hobby, String sexo, String colorPelo, String ocupacion,
                                String vehiculo, String caracteristica) {

        // Abrir una nueva sesión de Hibernate
        Session session = sessionFactory.openSession();

        try {
            // Crear una nueva instancia de CriminalDAO
            CriminalDAO criminal = new CriminalDAO(idCriminal, nombreCriminal, sexo, ocupacion, colorPelo, vehiculo, hobby, caracteristica);

            // Iniciar una transacción de Hibernate
            session.beginTransaction();

            // Guardar el objeto criminal en la base de datos
            session.save(criminal);

            // Confirmar la transacción
            session.getTransaction().commit();

            return "Criminal creado";

        } catch (Exception e) {
            // Manejar cualquier excepción que ocurra y hacer rollback de la transacción
            if (session.getTransaction() != null) {
                // Rollback significa deshacer la transacción para dejar la base de datos en el estado anterior
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            return "Error al crear criminal";

        } finally {
            // Cerrar la sesión de Hibernate
            session.close();
        }
    }

    
    // Método para buscar un criminal por ID o nombre
    public String buscarCriminal(String searchValue) {
        Session session = sessionFactory.openSession();
        CriminalDAO criminal = null;

        try {
            session.beginTransaction();

            // Intentar buscar por ID
            try {
                int id = Integer.parseInt(searchValue);
                criminal = session.get(CriminalDAO.class, id);
            } catch (NumberFormatException e) {
                // Si no es un número, buscar por nombre
                String hql = "FROM CriminalDAO WHERE nombreCriminal = :nombre";
                criminal = session.createQuery(hql, CriminalDAO.class)
                        .setParameter("nombre", searchValue)
                        .uniqueResult();
            }

            session.getTransaction().commit();

            if (criminal != null) {
                return criminal.toString();
            } else {
                return "Criminal no encontrado";
            }

        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            return "Error al buscar criminal";

        } finally {
            session.close();
        }
    }

    // Método para cerrar la SessionFactory cuando la aplicación termina
    public static void cerrarSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
