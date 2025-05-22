package com.designpatterns.behavioural.mediator;

public class MediatorMain {
    public static void main(String[] ignoredArgs) {
        ControlTower controlTower = new ControlTower();

        Airplane airplane1 = new Airplane("airplaneId1");

        Airplane airplane2 = new Airplane("airplaneId2");

        Airplane airplane3 = new Airplane("airplaneId3");

        Airplane airplane4 = new Airplane("airplaneId4");

        controlTower.registerAirplane(airplane1);
        controlTower.registerAirplane(airplane2);
        controlTower.registerAirplane(airplane3);
        controlTower.registerAirplane(airplane4);

        airplane1.requestTakeoff(); // Takeoff request approved
        airplane2.requestTakeoff(); // Takeoff request approved
        airplane3.requestTakeoff(); // Takeoff request denied
        airplane4.requestTakeoff(); // Takeoff request denied

        controlTower.completeTakeoff(airplane1);
        controlTower.completeTakeoff(airplane2);

        airplane3.requestTakeoff(); // Takeoff request approved
        airplane4.requestTakeoff(); // Takeoff request approved

        controlTower.completeTakeoff(airplane3);
        controlTower.completeTakeoff(airplane4);

        airplane1.requestLanding();
        airplane2.requestLanding();

        controlTower.completeLanding(airplane1);
        controlTower.completeLanding(airplane2);

        airplane3.requestLanding();
        airplane4.requestLanding();

        controlTower.completeLanding(airplane3);
        controlTower.completeLanding(airplane4);
    }
}
