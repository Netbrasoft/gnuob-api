
package com.netbrasoft.gnuob.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for role.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="role"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADMINISTRATOR"/&gt;
 *     &lt;enumeration value="MANAGER"/&gt;
 *     &lt;enumeration value="EMPLOYEE"/&gt;
 *     &lt;enumeration value="GUEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "role")
@XmlEnum
public enum Role {

   ADMINISTRATOR, MANAGER, EMPLOYEE, GUEST;

   public String value() {
      return name();
   }

   public static Role fromValue(String v) {
      return valueOf(v);
   }

}
