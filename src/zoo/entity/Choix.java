package zoo.entity;
// Generated Apr 23, 2015 11:42:05 AM by Hibernate Tools 4.3.1



/**
 * Choix generated by hbm2java
 */
public class Choix  implements java.io.Serializable {


     private ChoixId id;
     private Zone zone;
     private Surveillant surveillant;
     private String affinite;

    public Choix() {
    }

    public Choix(ChoixId id, Zone zone, Surveillant surveillant, String affinite) {
       this.id = id;
       this.zone = zone;
       this.surveillant = surveillant;
       this.affinite = affinite;
    }
   
    public ChoixId getId() {
        return this.id;
    }
    
    public void setId(ChoixId id) {
        this.id = id;
    }
    public Zone getZone() {
        return this.zone;
    }
    
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    public Surveillant getSurveillant() {
        return this.surveillant;
    }
    
    public void setSurveillant(Surveillant surveillant) {
        this.surveillant = surveillant;
    }
    public String getAffinite() {
        return this.affinite;
    }
    
    public void setAffinite(String affinite) {
        this.affinite = affinite;
    }




}

