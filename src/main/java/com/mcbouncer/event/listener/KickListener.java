package com.mcbouncer.event.listener;

import com.mcbouncer.event.KickEvent;
import net.lahwran.fevents.MCBListener;

public class KickListener implements MCBListener<KickEvent> {

    public void onEvent(KickEvent event) {
        if (event.getUser().equals(event.getController().getLastKickedUser())) {
            event.setCancelled(true);
        }

        if (event.getController().getCurrentlyLoggingIn().contains(event.getUser())) {
            event.setCancelled(true);
        }
    }
}
