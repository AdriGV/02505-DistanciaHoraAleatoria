/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        //Rótulo
        System.out.println("Distancia ente horas");
        System.out.println("=====================");
        
        //Hora Actual
        int HoraAct = cal.get(Calendar.HOUR_OF_DAY);
        int MinutoAct = cal.get(Calendar.MINUTE);
        int SegundoAct = cal.get(Calendar.SECOND);

        //Hora de inicio
       // int horaClase = 8;
       // int MinutoClase = 25;
        // int segundoClase = 00;
        //Hora de inicio random
        int horaIni = RND.nextInt(HoraAct - 0 + 1) + 0;
        int minutoIni = RND.nextInt(MinutoAct - 0 + 1) + 0;
        int segundoIni = RND.nextInt(SegundoAct - 0 + 1) + 0;

        //Tiempos
        int tiempoIni = horaIni * 3600 + minutoIni * 60 + segundoIni;
        int tiempoAct = HoraAct * 3600 + MinutoAct * 60 + SegundoAct;

        //Segundos
        int SegundosRes = tiempoAct - tiempoIni;
        //Minutos
        int MinutosRes = SegundosRes / 60;
        SegundosRes = SegundosRes % 60;
        //Horas
        int HorasRes = MinutosRes / 60;
        MinutosRes = MinutosRes % 60;

        //Salidas
        System.out.printf("Hora actual ......: %02d/%02d/%02d%n", HoraAct, MinutoAct, SegundoAct);
        System.out.printf("Hora inicio ......: %02d/%02d/%02d%n", horaIni, minutoIni, segundoIni);
        System.out.printf("Tiempo de clase ..: %01d/%02d/%02d%n", HorasRes, MinutosRes, SegundosRes);

    }

}
