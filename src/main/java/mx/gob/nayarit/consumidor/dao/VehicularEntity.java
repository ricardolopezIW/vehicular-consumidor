package mx.gob.nayarit.consumidor.dao;

import mx.gob.nayarit.consumidor.model.Vehicular;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicular")
public class VehicularEntity extends Vehicular {

    @Id
    private ObjectId id;

    public VehicularEntity() {
    }

    public VehicularEntity(Vehicular vehicular) {
        this.setPlacas(vehicular.getPlacas());
        this.setImporte(vehicular.getImporte());
        this.setNoSerie(vehicular.getNoSerie());
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
