/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Client implements User{ //polimorphisme
    private ArrayList<Integer> id = new ArrayList<Integer>();//enkapsulasi
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    //modifier
    public int size(){
        return this.namaClient.size();
        //mengembalikan nilai
    } 
    public Client(){
         //enkapsulasi
        this.namaClient.add("Fadhil");
        this.alamat.add("Lamongan");
        this.telepon.add("08982916070");
        this.saldo.add(100000);
        
        this.namaClient.add("yodig");
        this.alamat.add("Probolinggo");
        this.telepon.add("0895368724855");
        this.saldo.add(150000);
    }//data terkini
    
   
    public int getId(Integer id){
        return this.id.indexOf(id);
        //mengembalikan nilai variabel
    }
    
    @Override//inheritance
    public void setNama(String nama) {//menambahkan nilai//mutator
        this.namaClient.add(nama);
    }

    @Override //mengambil
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public void addSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public void setSaldo(int id,int saldo){
        this.saldo.set(id,saldo);
    }

    @Override 
    public String getNama(int id) { //mengambil nilai//asessor
        return this.namaClient.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public int getSaldo(int id){
        return this.saldo.get(id);
    }
    
    public void tampilClient(){ // 
        int n = this.namaClient.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo   = "+getSaldo(i));
        }
    }
}