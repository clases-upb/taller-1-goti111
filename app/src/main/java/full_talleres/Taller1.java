/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidad_km_seg) {
        try {
            final int METROS_POR_KM = 1000;
            final int SEGUNDOS_POR_HORA = 3600;

            int metros_por_segundo = velocidad_km_seg * METROS_POR_KM;
            int metros_por_hora = metros_por_segundo * SEGUNDOS_POR_HORA;
            return (metros_por_segundo + "m/s -" + metros_por_hora + "m/h");
            
        }
        
        catch (Exception e) {
            return ("Error en la conversión");
        }
    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cantidad_cc){
        try {
            final float cc_x_lt = 1000;
            float cantidad_final = (float)cantidad_cc / cc_x_lt;
            return cantidad_final;

            
        } 
        catch (Exception e) {
            return 0;
        }
    }
  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
    public static int Convertir_us_cops(int cant_usd){
    try {
        final int cops_x_usd = 4170;
        int total_usd = cant_usd * cops_x_usd;
        return total_usd;  
    } 

    catch (Exception e) {
        return -1;
    }
  }
     
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
    public static double Convertir_cent_far(double temperatura_grados_C){
    try {
        double grados_f = 0;
        final byte treinta_dos = 32;
        final byte nueve = 9;
        final byte cinco = 5;
        
        grados_f = treinta_dos + (nueve * temperatura_grados_C / cinco);
        return grados_f;
    } 
    catch (Exception e) {
        return 0;
    }
  }
   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
    public static int Calcular_segs(byte nro_dias, byte nro_horas, byte nro_mins, byte nro_segs){
    try {
        int total_segs = 0;
        final int segs_x_dia = 86400;
        final short segs_x_hora = 3600;
        final byte segs_x_min = 60;

        int segundos_x_dia_total = nro_dias * segs_x_dia;
        int segundos_x_hora_total = nro_horas * segs_x_hora;
        int segundos_x_min_total = nro_mins * segs_x_min;
        total_segs = segundos_x_dia_total + segundos_x_hora_total + segundos_x_min_total;
        return total_segs;  
    } 
    catch (Exception e) {
        return -1;
    }
   }
    
   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
    public static String Calcular_peso_carga(float peso_camion_cargado, float peso_camion_vacio) {
    try {
        float peso_neto_carga = peso_camion_cargado - peso_camion_vacio;
        float kg_por_TON = 1000;
        float peso_neto_kg = peso_neto_carga * kg_por_TON;
        float peso_neto_TON = peso_neto_carga;

        String mensaje_final = String.format("%.0f kilos - %.3f toneladas", peso_neto_kg, peso_neto_TON);
        return mensaje_final;
    } catch (Exception e) {
        return ("Error en la función Calcular_peso_carga");
    }
}

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
    public static float Calcular_horasxviaje(String destino, short distancia_kms, short v_promedio){
    try {
        float horas_viaje = 0;
        horas_viaje = distancia_kms / v_promedio;
        return horas_viaje;
    } 
    catch (Exception e) {
        return -1;

    }
  }

   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
    public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
    try {
        final float km_por_combustible_crucero = 60.8f;
        final float combustible_velocidad_crucero_TON = 0.2f;
        final float combustible_despegue_TON = 1.2f;
        final float combustible_aterrizaje_TON = 0.4f;
        
        int total_km = ruta1 + ruta2 + ruta3 + ruta4;
        
        float combustible_crucero = (total_km / km_por_combustible_crucero) * combustible_velocidad_crucero_TON;
        float total_combustible = combustible_crucero + (combustible_despegue_TON + combustible_aterrizaje_TON) * 4;
        
        return total_combustible;
    } 
    catch (Exception e) {
        return -1;
    }
}

   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
    public static double Calcular_peso_luna(byte peso_kilos){
    try {
        final double gravedad_tierra = 9.81;
        final double FACTOR_LUNA = 0.165;
        double peso_tierra_new = peso_kilos * gravedad_tierra;
        double peso_luna_new = peso_tierra_new * FACTOR_LUNA;
        return peso_luna_new;
          
    } 
    catch (Exception e) {
        return 0;
    }
  }
   
      
}
