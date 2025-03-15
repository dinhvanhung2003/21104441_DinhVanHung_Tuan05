package com.example.designpattern_tuan05.adapter;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;



import java.io.IOException;

public class XMLToJsonAdapter implements JsonDataSystemNew{
    private XMLDataSystemOld xmlSystemOld;
    public XMLToJsonAdapter(XMLDataSystemOld xmlSystemOld){
        this.xmlSystemOld=xmlSystemOld;
    }

    @Override
    public String getJsonData() throws IOException {
        String xmlString=xmlSystemOld.getXMLData();

        XmlMapper xmlMapper=new XmlMapper();
        com.example.designpattern_tuan05.adapter.Data dataInstance=xmlMapper.readValue(xmlString.getBytes(),Data.class);
        JsonMapper jsonMapper=new JsonMapper();
        return jsonMapper.writeValueAsString(dataInstance);
    }
}
