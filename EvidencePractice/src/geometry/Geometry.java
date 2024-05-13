
package geometry;

import java.util.Date;


public class Geometry {
    private String color="White";
    private boolean filled;
    private Date createDate;

    public Geometry() {
    }

    public Geometry(String color,boolean filled, Date createDate) {
        this.color=color;
        this.filled = filled;
        this.createDate = createDate;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    
    
}
