
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for persistContract complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contract" type="{http://gnuob.netbrasoft.com/}contract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistContract", propOrder = {"contract"})
public class PersistContract implements Serializable {

  private static final long serialVersionUID = -8390391616675787964L;
  protected Contract contract;

  /**
   * Gets the value of the contract property.
   * 
   * @return possible object is {@link Contract }
   * 
   */
  public Contract getContract() {
    return contract;
  }

  /**
   * Sets the value of the contract property.
   * 
   * @param value allowed object is {@link Contract }
   * 
   */
  public void setContract(Contract value) {
    this.contract = value;
  }

}
