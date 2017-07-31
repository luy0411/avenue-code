package com.avenue.serializer;

import com.avenue.entity.Image;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ImageSerializer extends JsonSerializer<Set<Image>> {
    public ImageSerializer() {
    }

    public void serialize(Set<Image> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if(list.isEmpty()) {
            jsonGenerator.writeObject(new ArrayList());
        } else {
            jsonGenerator.writeStartArray();

            for(Iterator var4 = list.iterator(); var4.hasNext(); jsonGenerator.writeEndObject()) {
                Image image= (Image) var4.next();
                jsonGenerator.writeStartObject();
                jsonGenerator.writeNumberField("id", image.getId().longValue());
                jsonGenerator.writeStringField("url", image.getUrl());
            }

            jsonGenerator.writeEndArray();
        }
    }
}
