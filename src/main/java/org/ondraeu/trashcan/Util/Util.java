package org.ondraeu.trashcan.Util;

import org.ondraeu.trashcan.TrashCan;
import foresttech.api.ColorAPI;

public class Util {
    public Util() {
    }

    public static String getString(String path) {
        return ColorAPI.colorize( TrashCan.getInstance().getConfig().getString("Prefix") + " " + TrashCan.getInstance().getConfig().getString(path));
    }
}
