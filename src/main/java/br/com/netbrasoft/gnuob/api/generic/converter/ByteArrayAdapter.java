/*
 * Copyright 2016 Netbrasoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package br.com.netbrasoft.gnuob.api.generic.converter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ByteArrayAdapter extends XmlAdapter<String, byte[]> {

  @Override
  public byte[] unmarshal(final String value) {
    return value.getBytes();
  }

  @Override
  public String marshal(final byte[] value) {
    return value != null ? new String(value) : null;
  }
}
