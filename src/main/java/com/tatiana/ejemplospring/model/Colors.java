package com.tatiana.ejemplospring.model;

public class Colors {
    private Integer idcolors;

    private String description;

    private String rgb;

    public Colors() {
        super();
    }

    public Colors(Integer idcolors,String description, String rgb) {
        this.idcolors = idcolors;
        this.description=description;
        this.rgb=rgb;
    }

    public Integer getIdcolors() {
        return idcolors;
    }

    public void setIdcolors(Integer idcolors) {
        this.idcolors = idcolors;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }
}
