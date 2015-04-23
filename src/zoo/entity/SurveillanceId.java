package zoo.entity;
// Generated Apr 23, 2015 11:42:05 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * SurveillanceId generated by hbm2java
 */
public class SurveillanceId  implements java.io.Serializable {


     private String code;
     private BigDecimal lotissement;
     private String jour;
     private BigDecimal heure;

    public SurveillanceId() {
    }

    public SurveillanceId(String code, BigDecimal lotissement, String jour, BigDecimal heure) {
       this.code = code;
       this.lotissement = lotissement;
       this.jour = jour;
       this.heure = heure;
    }
   
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public BigDecimal getLotissement() {
        return this.lotissement;
    }
    
    public void setLotissement(BigDecimal lotissement) {
        this.lotissement = lotissement;
    }
    public String getJour() {
        return this.jour;
    }
    
    public void setJour(String jour) {
        this.jour = jour;
    }
    public BigDecimal getHeure() {
        return this.heure;
    }
    
    public void setHeure(BigDecimal heure) {
        this.heure = heure;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SurveillanceId) ) return false;
		 SurveillanceId castOther = ( SurveillanceId ) other; 
         
		 return ( (this.getCode()==castOther.getCode()) || ( this.getCode()!=null && castOther.getCode()!=null && this.getCode().equals(castOther.getCode()) ) )
 && ( (this.getLotissement()==castOther.getLotissement()) || ( this.getLotissement()!=null && castOther.getLotissement()!=null && this.getLotissement().equals(castOther.getLotissement()) ) )
 && ( (this.getJour()==castOther.getJour()) || ( this.getJour()!=null && castOther.getJour()!=null && this.getJour().equals(castOther.getJour()) ) )
 && ( (this.getHeure()==castOther.getHeure()) || ( this.getHeure()!=null && castOther.getHeure()!=null && this.getHeure().equals(castOther.getHeure()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCode() == null ? 0 : this.getCode().hashCode() );
         result = 37 * result + ( getLotissement() == null ? 0 : this.getLotissement().hashCode() );
         result = 37 * result + ( getJour() == null ? 0 : this.getJour().hashCode() );
         result = 37 * result + ( getHeure() == null ? 0 : this.getHeure().hashCode() );
         return result;
   }   


}


