package com.vb.entity;

import org.virtualbox_6_0.IVirtualBox;
import org.virtualbox_6_0.VirtualBoxManager;

public class VBoxManager {
    private final VirtualBoxManager boxManager;
    private final IVirtualBox vbox;

    public VBoxManager(String vbURL, String username, String password) {
        boxManager = VirtualBoxManager.createInstance(null);
        boxManager.connect(vbURL, username, password);
        vbox = boxManager.getVBox();
    }

    public VirtualBoxManager getBoxManager() {
        return boxManager;
    }

    public IVirtualBox getVbox() {
        return vbox;
    }
}
