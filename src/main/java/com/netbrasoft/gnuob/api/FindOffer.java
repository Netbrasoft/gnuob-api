
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findOffer complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findOffer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offer" type="{http://gnuob.netbrasoft.com/}offer" minOccurs="0"/&gt;
 *         &lt;element name="paging" type="{http://gnuob.netbrasoft.com/}paging" minOccurs="0"/&gt;
 *         &lt;element name="orderBy" type="{http://gnuob.netbrasoft.com/}orderBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findOffer", propOrder = {"offer", "paging", "orderBy"})
public class FindOffer implements Serializable {

  private static final long serialVersionUID = 7583630229443284808L;
  protected Offer offer;
  protected Paging paging;
  @XmlSchemaType(name = "string")
  protected OrderBy orderBy;

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
   * @param value allowed object is {@link Offer }
   * 
   */
  public void setOffer(Offer value) {
    this.offer = value;
  }

  /**
   * Gets the value of the paging property.
   * 
   * @return possible object is {@link Paging }
   * 
   */
  public Paging getPaging() {
    return paging;
  }

  /**
   * Sets the value of the paging property.
   * 
   * @param value allowed object is {@link Paging }
   * 
   */
  public void setPaging(Paging value) {
    this.paging = value;
  }

  /**
   * Gets the value of the orderBy property.
   * 
   * @return possible object is {@link OrderBy }
   * 
   */
  public OrderBy getOrderBy() {
    return orderBy;
  }

  /**
   * Sets the value of the orderBy property.
   * 
   * @param value allowed object is {@link OrderBy }
   * 
   */
  public void setOrderBy(OrderBy value) {
    this.orderBy = value;
  }

}
