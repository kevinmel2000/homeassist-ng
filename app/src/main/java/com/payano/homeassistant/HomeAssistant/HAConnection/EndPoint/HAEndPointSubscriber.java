package com.payano.homeassistant.HomeAssistant.HAConnection.EndPoint;

public interface HAEndPointSubscriber {
    void notifyChanged(HAConnectionEndPointEvent event);
}
