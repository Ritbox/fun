package co.ritbox.view.servlets;

import co.ritbox.model.core.ListaCore;

import co.ritbox.model.util.Enumerador;

import co.ritbox.view.FrontController.Controller;

import co.ritbox.view.FrontController.View;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

import javax.servlet.*;
import javax.servlet.http.*;

public class EvaluacionRiesgoServlet implements Controller {

    @Override
    public View execute(HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        String accion = request.getParameter("accion");
        ListaCore listaCore = new ListaCore();
        listaCore.obtenerLista("TIP_CON");
        return new View("/evaluacion_riesgo.jsp", new HashMap());
    }
    
}
