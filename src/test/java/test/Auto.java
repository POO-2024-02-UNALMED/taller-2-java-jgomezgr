package test;

class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    Motor motor;
    String marca;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){

        int numAsientos = 0;

        for(int i = 0; i < asientos.length; i++){

            if(asientos[i] != null){

                numAsientos++;

            }
        }

        return numAsientos;          
    }

    String verificarIntegridad(){

        if(this.registro == this.motor.registro){

            for(int i = 0; i < this.asientos.length; i++){

                if(asientos[i] != null){

                    if(asientos[i].registro != this.registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "El auto es original";

        }
        else{
            return "Las piezas no son originales";
        }
    }

}

