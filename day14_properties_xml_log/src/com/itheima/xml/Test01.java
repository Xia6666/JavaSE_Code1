package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws Exception{
        ArrayList<Contact> arrayList=new ArrayList<>();
        SAXReader reader=new SAXReader();
        Document document = reader.read("day14_properties_xml_log/src/com/itheima/xml/contactList.xml");
        Element root = document.getRootElement();

        List<Element> elements = root.elements();
        for (Element element : elements) {
            arrayList.add(new Contact(element.attributeValue("id"),
                    element.attributeValue("vip"),
                    element.elementText("name"),
                    element.elementText("gender"),
                    element.elementText("email")));
        }
        for (Contact contact : arrayList) {
            System.out.println(contact);
        }



    }

}
class Contact{
        private String id;
        private String vip;
        private String name;
        private String gender;
        private String email;

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", vip='" + vip + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact() {
    }

    public Contact(String id, String vip, String name, String gender, String email) {
        this.id = id;
        this.vip = vip;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
}
