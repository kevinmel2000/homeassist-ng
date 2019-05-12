package com.payano.homeassistant.HomeAssistant.HAConnection;

public class HAConnectionEvent {
    public String eventType;
    public String eventStatus;
    public Object eventObject;

    @Override
    public String toString() {
        return "HAConnectionEndPointEvent{" +
                "eventType=" + eventType +
                ", eventStatus=" + eventStatus +
                ", eventObject=" + eventObject + "}";
    }

}
