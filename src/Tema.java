import java.util.List;

public class Tema {
    String titulo;
    List <Tema> subtema;
    List <Documentos> documento;
    public class Tema(){

    }

    public Tema(String titulo, List<Tema> subtema, List<Documentos> documento) {
        this.titulo = titulo;
        this.subtema = subtema;
        this.documento = documento;
    }
}
}
}
}
