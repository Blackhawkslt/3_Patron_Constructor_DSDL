public class Mercedes {
    private String motor;
    private String llantas;
    private String turbo;
    private String color;
    private Mercedes(MercedesConstructor constructor){
        this.motor = constructor.motor;
        this.llantas = constructor.llantas;
        this.turbo = constructor.turbo;
        this.color = constructor.color;
    }
    public String getMotor(){
        return motor;
    }
    public String getLlantas(){
        return llantas;
    }
    public String getTurbo(){
        return turbo;
    }
    public String getColor(){
        return color;
    }
    public String Resultado(){
        return "se crea un nuevo mercedes con Motor: " +motor+ "- Turbo: "+turbo+"- Llantas: "+llantas+"- Color: "+color;
    }

    public static class MercedesConstructor{
        private String motor;
        private String llantas;
        private String turbo;
        private String color;
        
        public MercedesConstructor(String motor, String llantas){
            this.motor = motor;
            this.llantas = llantas;
        }
        public MercedesConstructor setTurbo(String turbo){
            this.turbo = turbo;
            return this;
        }
        public MercedesConstructor setColor(String color){
            this.color = color;
            return this;
        }
        public Mercedes construir(){
            return new Mercedes(this);
        }
    }
}
