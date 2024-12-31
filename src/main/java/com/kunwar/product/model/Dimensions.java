package com.kunwar.product.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Dimensions {
    private Double width;
    private Double height;
    private Double depth;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

}
