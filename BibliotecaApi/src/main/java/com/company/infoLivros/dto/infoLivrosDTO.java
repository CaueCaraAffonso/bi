package com.company.infoLivros.dto;

public class infoLivrosDTO {
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private Number paginas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Number getPaginas(){
        return paginas;
    }

    public void setPaginas(Number paginas) {
        this.paginas = paginas;
    }
}

