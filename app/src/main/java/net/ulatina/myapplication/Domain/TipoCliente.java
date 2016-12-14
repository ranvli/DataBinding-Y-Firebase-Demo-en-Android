package net.ulatina.myapplication.Domain;

/**
 * Created by ranvli on 12/14/2016.
 */
public enum TipoCliente {
    EMPRESARIAL, PERSONAL;

    public static TipoCliente Parse(String tipoClienteString) {

        switch (tipoClienteString) {
            case "EMPRESARIAL":
                return TipoCliente.EMPRESARIAL;
            case "PERSONAL":
                return TipoCliente.PERSONAL;
        }

        return null;

    }


}
