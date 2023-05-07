package hisotrialnaveg;

import java.time.LocalDateTime;
import java.util.ArrayList;


class Historial {
    private ArrayList<PaginaWeb> paginas;

    public Historial() {
        this.paginas = new ArrayList<PaginaWeb>();
    }

    public void nuevaPagina(String url) {
        if (paginas.isEmpty() || LocalDateTime.now().isAfter(paginas.get(paginas.size() - 1).getFechaHora())) {
            PaginaWeb nuevaPagina = new PaginaWeb(url);
            paginas.add(nuevaPagina);
            System.out.println("Se ha añadido la página: " + nuevaPagina.toString());
        } else {
            System.out.println("No se permiten fechas anteriores a la última página consultada.");
        }
    }

    public void consultarHistorialCompleto() {
        if (paginas.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {
            for (PaginaWeb pagina : paginas) {
                System.out.println(pagina.toString());
            }
        }
    }

    public void consultarHistorialDia(LocalDateTime fecha) {
        
        boolean encontrado = false;
        for (PaginaWeb pagina : paginas) {
            if (pagina.getFechaHora().toLocalDate().equals(fecha.toLocalDate())) {
                System.out.println(pagina.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron páginas consultadas en el día especificado.");
        }
    }

    public void borrarHistorial() {
        paginas.clear();
        System.out.println("Historial borrado.");
    }
}
