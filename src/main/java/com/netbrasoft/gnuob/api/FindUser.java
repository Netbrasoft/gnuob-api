
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findUser complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://gnuob.netbrasoft.com/}user" minOccurs="0"/&gt;
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
@XmlType(name = "findUser", propOrder = {"user", "paging", "orderBy"})
public class FindUser implements Serializable {

  private static final long serialVersionUID = -8910520861719848846L;
  protected User user;
  protected Paging paging;
  @XmlSchemaType(name = "string")
  protected OrderBy orderBy;

  /**
   * Gets the value of the user property.
   * 
   * @return possible object is {@link User }
   * 
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the value of the user property.
   * 
   * @param value allowed object is {@link User }
   * 
   */
  public void setUser(User value) {
    this.user = value;
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
