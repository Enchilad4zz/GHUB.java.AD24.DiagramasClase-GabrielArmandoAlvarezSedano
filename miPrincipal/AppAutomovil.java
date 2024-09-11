package miPrincipal;

public class AppAutomovil {

    private float velocidad;
    private float tiempo;

    public Automovil (float velocidad, float tiempo){
    this.tiempo = tiempo;
    this.velocidad = velocidad;
    }
    public float  calcularDistancia(){
        return velocidad * tiempo;

    }

    public float getVelocidad(){
        return velocidad;
    }
    public float getTiempo(){
        return tiempo;
    }
        public void setVelocidad(float velocidad){
            this.velocidad = velocidad;
        }

        public void setTiempo(float tiempo){
            this.tiempo = tiempo;
        }

        public static void main(String[] args) {
            Automovil auto = new AppAutomovil(20,10);
            float distancia = auto.calcularDistancia;

            System.out.println("la distancia recorrida es" + distancia + "metros");

        }


}