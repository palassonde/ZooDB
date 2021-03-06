package zoo.entity;
// Generated Apr 23, 2015 11:42:05 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Individu generated by hbm2java
 */
public class Individu  implements java.io.Serializable {


     private long idindividu;
     private Espece espece;
     private String nom;
     private Date naissancedate;
     private Date decesdate;
     private String sang;
     private Long idpere;
     private Long idmere;
     private Set mesures = new HashSet(0);

    public Individu() {
    }

	
    public Individu(long idindividu, Espece espece, String nom, Date naissancedate, String sang) {
        this.idindividu = idindividu;
        this.espece = espece;
        this.nom = nom;
        this.naissancedate = naissancedate;
        this.sang = sang;
    }
    public Individu(long idindividu, Espece espece, String nom, Date naissancedate, Date decesdate, String sang, Long idpere, Long idmere, Set mesures) {
       this.idindividu = idindividu;
       this.espece = espece;
       this.nom = nom;
       this.naissancedate = naissancedate;
       this.decesdate = decesdate;
       this.sang = sang;
       this.idpere = idpere;
       this.idmere = idmere;
       this.mesures = mesures;
    }
   
    public long getIdindividu() {
        return this.idindividu;
    }
    
    public void setIdindividu(long idindividu) {
        this.idindividu = idindividu;
    }
    public Espece getEspece() {
        return this.espece;
    }
    
    public void setEspece(Espece espece) {
        this.espece = espece;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Date getNaissancedate() {
        return this.naissancedate;
    }
    
    public void setNaissancedate(Date naissancedate) {
        this.naissancedate = naissancedate;
    }
    public Date getDecesdate() {
        return this.decesdate;
    }
    
    public void setDecesdate(Date decesdate) {
        this.decesdate = decesdate;
    }
    public String getSang() {
        return this.sang;
    }
    
    public void setSang(String sang) {
        this.sang = sang;
    }
    public Long getIdpere() {
        return this.idpere;
    }
    
    public void setIdpere(Long idpere) {
        this.idpere = idpere;
    }
    public Long getIdmere() {
        return this.idmere;
    }
    
    public void setIdmere(Long idmere) {
        this.idmere = idmere;
    }
    public Set getMesures() {
        return this.mesures;
    }
    
    public void setMesures(Set mesures) {
        this.mesures = mesures;
    }




}


