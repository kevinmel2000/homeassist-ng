package com.payano.homeassistant.HomeAssistant.HAConnection.EndPoint;

public class HAConnectionEndPointEvent {
    public String eventType;
    public String eventStatus;
    public Object eventObject;
    public HAConnectionEndPoint haConnectionEndPoint;

    @Override
    public String toString() {
        return "HAConnectionEndPointEvent{" +
                "eventType=" + eventType +
                ", eventStatus=" + eventStatus +
                ", eventObject=" + eventObject +
                ", haConnectionEndPoint=" + haConnectionEndPoint +
                '}';
    }

}
