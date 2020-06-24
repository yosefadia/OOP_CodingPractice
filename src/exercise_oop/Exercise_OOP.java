/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_oop;

/**
 *
 * @author yosef
 */
    
abstract class OperasiBilanganAbs{
    protected double a,b,c;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();

}

class OperasiPenjumlahan extends OperasiBilanganAbs{

    protected double a,b,c;

    @Override
    protected void set_A(double a) {
        this.a = a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
       this.b = b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
       this.c = a + b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        return b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        return c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan " + a + " + " + b + " = " + c ); //To change body of generated methods, choose Tools | Templates.
    }

}

class OperasiPengurangan extends OperasiBilanganAbs{

    @Override
    protected void set_A(double a) {
        this.a = a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
       this.b = b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
       this.c = a - b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        return b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        return c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan " + a + " - " + b + " = " + c ); //To change body of generated methods, choose Tools | Templates.
    }

}

class OperasiPerkalian extends OperasiBilanganAbs{

    @Override
    protected void set_A(double a) {
        this.a = a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
       this.b = b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
       this.c = a * b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        return b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        return c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian " + a + " * " + b + " = " + c ); //To change body of generated methods, choose Tools | Templates.
    }

}

class OperasiPembagian extends OperasiBilanganAbs{

    @Override
    protected void set_A(double a) {
        this.a = a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
       this.b = b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
       this.c = a / b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        return b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        return c; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian " + a + " / " + b + " = " + c ); //To change body of generated methods, choose Tools | Templates.
    }

}

final class OperasiBilanganAbsCetak{
    private static void cetakSemua(OperasiBilanganAbs OB, double a, double b){

        OB.set_A(a);
        OB.set_B(b);
        OB.set_C();
        OB.tampil();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            OperasiPenjumlahan jml = new OperasiPenjumlahan(); 
            cetakSemua(jml, 10.5, 2.5);
            OperasiPengurangan krg = new OperasiPengurangan(); 
            cetakSemua(krg, 10.5, 2.5);
            OperasiPerkalian kl = new OperasiPerkalian(); 
            cetakSemua(kl, 10.5, 2.5);
            OperasiPembagian bg = new OperasiPembagian(); 
            cetakSemua(bg, 10.5, 2.5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}   

