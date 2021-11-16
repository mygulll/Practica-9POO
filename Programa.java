public class Programa {
    public static void main(String[] args) {
        try{
            System.out.println("/try/ Instruccion 1.");
            int n = Integer.parseInt("M"); //Error forzado en tiempo de ejecucion.
            System.out.println("/try/ Instruccion 2.");
            System.out.println("/try/ Instruccion 3, etc..");
        }
        catch (Exception e){
            System.out.println("/catch/ Instrucciones a ejecutar cuando se produce un error");
            System.out.println("Se ha producido un error " + e);
        }
        finally {
            System.out.println("/finally/ Instrucciones a ejecutar (haya o no haya errores)");
        }
    }
}
