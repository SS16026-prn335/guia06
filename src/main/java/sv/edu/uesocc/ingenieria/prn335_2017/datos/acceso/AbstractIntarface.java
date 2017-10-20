package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;

/**
 *
 * @author Nestor
 */
public interface AbstractIntarface<T> {
    
    boolean create(T Entity);

    boolean edit(T Entity);

    boolean remove(T Entity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int desde, int hasta);

    int count();
    
}
