
package com.netbrasoft.gnuob.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for paging complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="paging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paging", propOrder = {"first", "max"})
public class Paging implements Serializable {

  private static final long serialVersionUID = -3371605179175461095L;
  protected int first;
  protected int max;

  /**
   * Gets the value of the first property.
   * 
   */
  public int getFirst() {
    return first;
  }

  /**
   * Gets the value of the max property.
   * 
   */
  public int getMax() {
    return max;
  }

  /**
   * Sets the value of the first property.
   * 
   */
  public void setFirst(final int value) {
    this.first = value;
  }

  /**
   * Sets the value of the max property.
   * 
   */
  public void setMax(final int value) {
    this.max = value;
  }

}
