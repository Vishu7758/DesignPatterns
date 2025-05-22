package com.designpatterns.behavioural.mediator;

public interface Mediator {
    void registerAirplane(Airplane airplane);

    void handleTakeoffRequest(Airplane airplane);

    void handleLandingRequest(Airplane airplane);
}
