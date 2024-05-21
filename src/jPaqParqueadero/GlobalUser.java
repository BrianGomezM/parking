
package jPaqParqueadero;


public class GlobalUser {
    private static String varNombre;
    private static String varRol;
    private static int varIdRol;
    private static String varDocumento;
    private static int varIdUsuario;
    private static String varCodigoFactura;
    private static String varPlaca;
    private static String varHoraIngreso;
    private static String varHoraSalida;
    private static String varHoraTotal;
    private static String varPagar;
    private static String varFecha;
    
    public GlobalUser(int varIdRol, int varIdUsuario, String varNombre, String varRol,String varDocumento){
        GlobalUser.varIdRol = varIdRol;
        GlobalUser.varIdUsuario =varIdUsuario;
        GlobalUser.varNombre=varNombre;
        GlobalUser.varRol=varRol;
        GlobalUser.varDocumento=varDocumento;
        
    }
    public GlobalUser(String codigoFactura, String varPlaca, String varHoraIngreso, String varFecha){
        GlobalUser.varCodigoFactura = codigoFactura;
        GlobalUser.varPlaca = varPlaca;
        GlobalUser.varHoraIngreso =varHoraIngreso;
        GlobalUser.varFecha = varFecha;
    }


    
    public GlobalUser(String varHoraSalida, String varHoraTotal , String varPagar){
        GlobalUser.varHoraSalida=varHoraSalida;
        GlobalUser.varHoraTotal=varHoraTotal;
        GlobalUser.varPagar=varPagar;
    }

        public static String getVarFecha() {
        return varFecha;
    }

    public static void setVarFecha(String varFecha) {
        GlobalUser.varFecha = varFecha;
    }
    
    
    public static String getVarHoraSalida() {
        return varHoraSalida;
    }

    public static void setVarHoraSalida(String varHoraSalida) {
        GlobalUser.varHoraSalida = varHoraSalida;
    }

    public static String getVarHoraTotal() {
        return varHoraTotal;
    }

    public static void setVarHoraTotal(String varHoraTotal) {
        GlobalUser.varHoraTotal = varHoraTotal;
    }

    public static String getVarPagar() {
        return varPagar;
    }

    public static void setVarPagar(String varPagar) {
        GlobalUser.varPagar = varPagar;
    }

    public static String getVarCodigoFactura() {
        return varCodigoFactura;
    }

    public static void setVarCodigoFactura(String varCodigoFactura) {
        GlobalUser.varCodigoFactura = varCodigoFactura;
    }

    public static String getVarPlaca() {
        return varPlaca;
    }

    public static void setVarPlaca(String varPlaca) {
        GlobalUser.varPlaca = varPlaca;
    }

    public static String getVarHoraIngreso() {
        return varHoraIngreso;
    }

    public static void setVarHoraIngreso(String varHoraIngreso) {
        GlobalUser.varHoraIngreso = varHoraIngreso;
    }

    public static String getCodigoFactura() {
        return varCodigoFactura;
    }

    public static void setCodigoFactura(String codigoFactura) {
        GlobalUser.varCodigoFactura = codigoFactura;
    }
    
    public static int getVarIdRol() {
        return varIdRol;
    }

    public static void setVarIdRol(int varIdRol) {
        GlobalUser.varIdRol = varIdRol;
    }
    
    public static int getVarIdUsuario() {
        return varIdUsuario;
    }

    public static void setVarIdUsuario(int varIdUsuario) {
        GlobalUser.varIdUsuario = varIdUsuario;
    }
    
    public static String getVarRol() {
        return varRol;
    }

    public static void setVarRol(String varRol) {
        GlobalUser.varRol = varRol;
    }

    public static String getVarDocumento() {
        return varDocumento;
    }

    public static void setVarDocumento(String varDocumento) {
        GlobalUser.varDocumento = varDocumento;
    }

    public static String getVarNombre() {
        return varNombre;
    }

    public void setVarNombre(String varNombre) {
        GlobalUser.varNombre = varNombre;
    }
    
}
