package com.payano.homeassistant.HomeAssistant.HAConnection;

public interface HAConnectionSubscriber {
    void notifyChanged(HAConnectionEvent event);
}
