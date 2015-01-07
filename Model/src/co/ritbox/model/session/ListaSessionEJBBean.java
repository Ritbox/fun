package co.ritbox.model.session;

import co.ritbox.model.entities.BunLista;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "ListaSessionEJB", mappedName = "fun-Model-ListaSessionEJB")
public class ListaSessionEJBBean implements ListaSessionEJB,
                                            ListaSessionEJBLocal {
    @PersistenceContext(unitName="Model")
    private EntityManager em;

    public ListaSessionEJBBean() {
    }

    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public BunLista persistBunLista(BunLista bunLista) {
        em.persist(bunLista);
        return bunLista;
    }

    public BunLista mergeBunLista(BunLista bunLista) {
        return em.merge(bunLista);
    }

    public void removeBunLista(BunLista bunLista) {
        bunLista = em.find(BunLista.class, bunLista.getId());
        em.remove(bunLista);
    }

    /** <code>select o from BunLista o</code> */
    public List<BunLista> getBunListaFindAll() {
        return em.createNamedQuery("BunLista.findAll").getResultList();
    }
    
    /**
     *
     * @param codigo
     * @return
     */
    public List<BunLista> obtenerLista(String codigo){
            List<BunLista> resultado = new ArrayList<BunLista>();
            Query query;
            query =
                    em.createQuery("SELECT o FROM BunLista o WHERE o.bunLista.codigo = :codigo");
            query.setParameter("codigo", codigo);
            resultado = (List<BunLista>) query.getResultList();
            return resultado;
    }
}
