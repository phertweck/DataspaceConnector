package de.fraunhofer.isst.dataspaceconnector.model;

public interface BaseFactory<T extends BaseEntity, D extends BaseDescription<T>> {
    T create(D desc);
    boolean update(T type, D desc);
}
