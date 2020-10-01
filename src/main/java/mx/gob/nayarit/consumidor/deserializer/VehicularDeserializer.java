package mx.gob.nayarit.consumidor.deserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.gob.nayarit.consumidor.model.Vehicular;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class VehicularDeserializer implements Deserializer<Vehicular> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public Vehicular deserialize(String s, byte[] bytes) {
        return null;
    }

    @Override
    public Vehicular deserialize(String topic, Headers headers, byte[] data) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.
                    readValue(new String(data, "UTF-8"), Vehicular.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void close() {

    }
}
