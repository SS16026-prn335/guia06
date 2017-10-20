package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.RolCategoria;

/**
 *
 * @author Nestor
 */
@Stateless
public class RolCategoriaFacade extends AbstractFacade<RolCategoria> implements RolCategoriaFacadeLocal {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria.prn335_2017_talvesFunciona_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolCategoriaFacade() {
        super(RolCategoria.class);
    }
    
}
