package mx.gob.nayarit.consumidor.cosumer;

import mx.gob.nayarit.consumidor.dao.VehicularEntity;
import mx.gob.nayarit.consumidor.dao.VehicularRepository;
import mx.gob.nayarit.consumidor.model.Vehicular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class VehicularConsumidor {

    @Autowired
    private VehicularRepository vehicularRepository;

    @KafkaListener(topics = "vehicular-topic", groupId = "group_id")
    public void consumidor(@Payload Vehicular vehicular){
        vehicularRepository.save(new VehicularEntity(vehicular));
    }

}
