package zoo.entity;
// Generated Apr 23, 2015 11:42:05 AM by Hibernate Tools 4.3.1



/**
 * Surveillance generated by hbm2java
 */
public class Surveillance  implements java.io.Serializable {


     private SurveillanceId id;
     private Zone zone;
     private Lotissement lotissement;

    public Surveillance() {
    }

    public Surveillance(SurveillanceId id, Zone zone, Lotissement lotissement) {
       this.id = id;
       this.zone = zone;
       this.lotissement = lotissement;
    }
   
    public SurveillanceId getId() {
        return this.id;
    }
    
    public void setId(SurveillanceId id) {
        this.id = id;
    }
    public Zone getZone() {
        return this.zone;
    }
    
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    public Lotissement getLotissement() {
        return this.lotissement;
    }
    
    public void setLotissement(Lotissement lotissement) {
        this.lotissement = lotissement;
    }




}

