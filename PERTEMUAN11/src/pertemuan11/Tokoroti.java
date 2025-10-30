/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "tokoroti")
@NamedQueries({
    @NamedQuery(name = "Tokoroti.findAll", query = "SELECT t FROM Tokoroti t"),
    @NamedQuery(name = "Tokoroti.findByIdKue", query = "SELECT t FROM Tokoroti t WHERE t.idKue = :idKue"),
    @NamedQuery(name = "Tokoroti.findByNamaKue", query = "SELECT t FROM Tokoroti t WHERE t.namaKue = :namaKue"),
    @NamedQuery(name = "Tokoroti.findByHarga", query = "SELECT t FROM Tokoroti t WHERE t.harga = :harga"),
    @NamedQuery(name = "Tokoroti.findByStock", query = "SELECT t FROM Tokoroti t WHERE t.stock = :stock")})
public class Tokoroti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kue")
    private String idKue;
    @Column(name = "nama_kue")
    private String namaKue;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "stock")
    private Integer stock;

    public Tokoroti() {
    }

    public Tokoroti(String idKue) {
        this.idKue = idKue;
    }

    public String getIdKue() {
        return idKue;
    }

    public void setIdKue(String idKue) {
        this.idKue = idKue;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKue != null ? idKue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tokoroti)) {
            return false;
        }
        Tokoroti other = (Tokoroti) object;
        if ((this.idKue == null && other.idKue != null) || (this.idKue != null && !this.idKue.equals(other.idKue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuan11.Tokoroti[ idKue=" + idKue + " ]";
    }
    
}
