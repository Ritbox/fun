package co.ritbox.model.session;

import co.ritbox.model.entities.BunLista;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ListaSessionEJB {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    BunLista persistBunLista(BunLista bunLista);

    BunLista mergeBunLista(BunLista bunLista);

    void removeBunLista(BunLista bunLista);

    List<BunLista> getBunListaFindAll();
    
    List<BunLista> obtenerLista(String codigo);
}
