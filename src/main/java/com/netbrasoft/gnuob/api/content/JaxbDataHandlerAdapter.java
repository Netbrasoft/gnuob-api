package com.netbrasoft.gnuob.api.content;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbDataHandlerAdapter extends XmlAdapter<DataHandler, String> {

   class ByteArrayDataSource implements DataSource {

      private byte[] bytes;

      public ByteArrayDataSource(byte[] bytes) {
         this.bytes = bytes;
      }

      @Override
      public String getContentType() {
         throw new UnsupportedOperationException();
      }

      @Override
      public InputStream getInputStream() throws IOException {
         return new ByteArrayInputStream(bytes);
      }

      @Override
      public String getName() {
         throw new UnsupportedOperationException();
      }

      @Override
      public OutputStream getOutputStream() throws IOException {
         throw new UnsupportedOperationException();
      }
   }

   @Override
   public DataHandler marshal(String bytes) throws Exception {

      if (bytes != null) {
         return new DataHandler(new ByteArrayDataSource(bytes.getBytes()));
      }
      return null;
   }

   @Override
   public String unmarshal(DataHandler dataHandler) throws Exception {
      if (dataHandler != null) {
         ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
         dataHandler.writeTo(byteArrayOutputStream);
         return new String(byteArrayOutputStream.toByteArray());
      }
      return new String();
   }
}
