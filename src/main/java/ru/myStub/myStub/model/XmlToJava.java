package ru.myStub.myStub.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlToJava {
    String new_data;
    public String xmltoJava(String d) {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Date.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Date date = (Date) unmarshaller.unmarshal(new StringReader(d));

            new_data = date.getDate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    return new_data;
    }

}