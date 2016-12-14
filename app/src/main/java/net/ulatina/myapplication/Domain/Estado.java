package net.ulatina.myapplication.Domain;

/**
 * Created by ranvli on 12/14/2016.
 */
public enum Estado {

    ACTIVO, INACTIVO, CERRADO;

    public static Estado Parse(String estadoString) {

        switch (estadoString) {
            case "ACTIVO":
                return Estado.ACTIVO;
            case "INACTIVO":
                return Estado.INACTIVO;
            case "CERRADO":
                return Estado.CERRADO;

        }

        return null;
    }

}
