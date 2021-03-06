
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

public class Sunflower extends Plant{
    private double waktuGenerateSun; //waktu yang diperlukan sunflower untuk spawn sun
    private double terakhirGenerateSun; //Detik terakhir sun di generate

    public Sunflower(double waktuGenerateSun, int hp, Image plantImage, int x, int y, int cost) {
        super(hp, plantImage, x, y, cost);
        this.waktuGenerateSun = waktuGenerateSun;
        this.terakhirGenerateSun = 0;
    }

    public double getWaktuGenerateSun() {
        return waktuGenerateSun;
    }

    public void setWaktuGenerateSun(double waktuGenerateSun) {
        this.waktuGenerateSun = waktuGenerateSun;
    }

    public double getTerakhirGenerateSun() {
        return terakhirGenerateSun;
    }

    public void setTerakhirGenerateSun(double terakhirGenerateSun) {
        this.terakhirGenerateSun = terakhirGenerateSun;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Image getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(Image plantImage) {
        this.plantImage = plantImage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public void generateSun(Sun sunGeneric, ArrayList<Sun> sunDiLawn, int xFlower, int yFlower) {
        System.out.println("Sunflower create sun");
        try {
            Sun baru = (Sun) sunGeneric.clone();
            baru.setX(xFlower);
            baru.setY(yFlower + 10);
            sunDiLawn.add(baru);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sunflower.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void shoot(ArrayList<Peluruh> peluruhList, ArrayList<Peluruh> peluruhDiLawn) {
        System.out.println("Sunflower cannot shoot");
    }

    @Override
    public void explode() {
        System.out.println("Sunflower Cannot Explode");
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.plantImage, x, y, null);
    }    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
