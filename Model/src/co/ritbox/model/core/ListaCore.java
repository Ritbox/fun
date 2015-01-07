package co.ritbox.model.core;

import co.ritbox.model.dto.ListaDto;

import co.ritbox.model.entities.BunLista;
import co.ritbox.model.session.ListaSessionEJB;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ListaCore {
    
    public ListaCore() {
        super();
    }
    
    /**
     *
     * @param codigo
     * @return
     */
    public List<ListaDto> obtenerLista(String codigo){
        List<ListaDto> resultado = new ArrayList<ListaDto>();
        ListaSessionEJB lista;
        try {
            lista = (ListaSessionEJB) new InitialContext().lookup("fun-Model-ListaSessionEJB#co.ritbox.model.session.ListaSessionEJB");
            List<BunLista> funLista = lista.obtenerLista(codigo);
            for(BunLista registro : funLista){
                ListaDto listaDto = new ListaDto();
                listaDto.setCodigo(registro.getCodigo());
                listaDto.setNombre(registro.getNombre());
                resultado.add(listaDto);
            }
        } catch (NamingException e) {
            String error = e.getMessage();
        }
        return resultado;
    }
}
