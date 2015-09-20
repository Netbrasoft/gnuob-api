
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findOfferById complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findOfferById"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offer" type="{http://gnuob.netbrasoft.com/}offer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findOfferById", propOrder = { "offer" })
public class FindOfferById implements Serializable {

   private static final long serialVersionUID = -4709741510794022070L;
   protected Offer offer;

   /**
    * Gets the value of the offer property.
    * 
    * @return possible object is {@link Offer }
    * 
    */
   public Offer getOffer() {
      return offer;
   }

   /**
    * Sets the value of the offer property.
    * 
    * @param value
    *           allowed object is {@link Offer }
    * 
    */
   public void setOffer(Offer value) {
      this.offer = value;
   }

}
