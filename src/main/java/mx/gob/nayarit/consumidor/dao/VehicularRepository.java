package mx.gob.nayarit.consumidor.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicularRepository
extends MongoRepository<VehicularEntity, ObjectId> {
}
