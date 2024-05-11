
package geometry;

import java.util.Date;

public abstract class GeometryObject {
    
    private String color="White";
    private boolean filled;
    private Date dateCreated;

    public GeometryObject() {
    }

    public GeometryObject(String color, boolean filled, Date dateCreated) {
        this.color= color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public abstract double getArea();
    public abstract double gePerimeter();

    @Override
    public String toString() {
        return "GeometryObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
    
    
}
