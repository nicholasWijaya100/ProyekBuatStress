
import java.awt.Graphics;
import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class Peashooter extends Plant{
    private Image pea;
    private int damage;
    private double waktuTiapTembak; //waktu yang diperlukan peashooter untuk menembak pea
    private double terakhirTembak; //Detik terakhir pea ditembakan

    public Peashooter(Image pea, int damage, double waktuTiapTembak, int hp, Image plantImage, int x, int y, int cost) {
        super(hp, plantImage, x, y, cost);
        this.pea = pea;
        this.damage = damage;
        this.waktuTiapTembak = waktuTiapTembak;
        this.terakhirTembak = 0;
    }

    public Image getPea() {
        return pea;
    }

    public void setPea(Image pea) {
        this.pea = pea;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getWaktuTiapTembak() {
        return waktuTiapTembak;
    }

    public void setWaktuTiapTembak(double waktuTiapTembak) {
        this.waktuTiapTembak = waktuTiapTembak;
    }

    public double getTerakhirTembak() {
        return terakhirTembak;
    }

    public void setTerakhirTembak(double terakhirTembak) {
        this.terakhirTembak = terakhirTembak;
    }
    
    @Override
    public void generateSun() {
        System.out.println("Peashooter tidak bisa generate sun");
    }

    @Override
    public void shoot() {
        System.out.println("Peashooter shoot");
    }

    @Override
    public void explode() {
        System.out.println("Peashooter tidak bisa explode");
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
