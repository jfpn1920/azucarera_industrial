import java.util.Scanner;
public class azucarera_industrial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] lotes = new String[10];
        String[] proveedores = new String[10];
        double[] canaRecibida = new double[10];
        String[] fechas = new String[10];
        String[] turnos = new String[10];
        String[] procesos = new String[10];
        double[] azucarProducida = new double[10];
        double[] rendimientos = new double[10];
        String[] operadores = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_azucarera_industrial|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal de azucarera industrial");
            System.out.println("1) Registrar lote");
            System.out.println("2) Editar lote");
            System.out.println("3) Listar lotes");
            System.out.println("4) Buscar lote");
            System.out.println("5) Eliminar lote");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------//
                //--|registrar_lote|--//
                //--------------------//
                case 1:
                    if (total >= lotes.length) {
                        System.out.println("No hay espacio para registrar mas lotes.");
                        break;
                    }
                    System.out.println("registro de lote");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("identificacion del lote: ");
                    lotes[total] = entrada.nextLine();
                    System.out.print("proveedor de la cana: ");
                    proveedores[total] = entrada.nextLine();
                    System.out.print("cana recibida en toneladas: ");
                    canaRecibida[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("fecha de produccion: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("turno: ");
                    turnos[total] = entrada.nextLine();
                    System.out.print("proceso: ");
                    procesos[total] = entrada.nextLine();
                    System.out.print("azucar producida en toneladas: ");
                    azucarProducida[total] = entrada.nextDouble();
                    System.out.print("rendimiento en porcentaje: ");
                    rendimientos[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("operador responsable: ");
                    operadores[total] = entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Lote registrado correctamente.");
                    break;
                //-----------------//
                //--|editar_lote|--//
                //-----------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("datos de los lotes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Proveedor: " + proveedores[i] + " | Cana recibida: " + canaRecibida[i] + " toneladas | Fecha: " + fechas[i] + " | Turno: " + turnos[i] + " | Proceso: " + procesos[i] + " | Azucar producida: " + azucarProducida[i] + " toneladas | Rendimiento: " + rendimientos[i] + "% | Operador: " + operadores[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del lote a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar lote");
                        System.out.print("nueva identificacion del lote: ");
                        lotes[posicion] = entrada.nextLine();
                        System.out.print("nuevo proveedor de la cana: ");
                        proveedores[posicion] = entrada.nextLine();
                        System.out.print("nueva cantidad de cana en toneladas: ");
                        canaRecibida[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("nueva fecha de produccion: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("nuevo turno: ");
                        turnos[posicion] = entrada.nextLine();
                        System.out.print("nuevo proceso: ");
                        procesos[posicion] = entrada.nextLine();
                        System.out.print("nueva cantidad de azucar producida en toneladas: ");
                        azucarProducida[posicion] = entrada.nextDouble();
                        System.out.print("nuevo rendimiento en porcentaje: ");
                        rendimientos[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("nuevo operador responsable: ");
                        operadores[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Lote actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------//
                //--|listar_lotes|--//
                //------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                    } else {
                        System.out.println("lista de lotes");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Proveedor: " + proveedores[i] + " | Cana recibida: " + canaRecibida[i] + " toneladas | Fecha: " + fechas[i] + " | Turno: " + turnos[i] + " | Proceso: " + procesos[i] + " | Azucar producida: " + azucarProducida[i] + " toneladas | Rendimiento: " + rendimientos[i] + "% | Operador: " + operadores[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------//
                //--|buscar_lote|--//
                //-----------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("busqueda de lote");
                    System.out.print("Ingrese el ID del lote a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("lote encontrado");
                        System.out.println("ID: " + idBusqueda + " | Lote: " + lotes[posicion] + " | Proveedor: " + proveedores[posicion] + " | Cana recibida: " + canaRecibida[posicion] + " toneladas | Fecha: " + fechas[posicion] + " | Turno: " + turnos[posicion] + " | Proceso: " + procesos[posicion] + " | Azucar producida: " + azucarProducida[posicion] + " toneladas | Rendimiento: " + rendimientos[posicion] + "% | Operador: " + operadores[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------//
                //--|eliminar_lote|--//
                //-------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("datos de los lotes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Proveedor: " + proveedores[i] + " | Cana recibida: " + canaRecibida[i] + " toneladas | Fecha: " + fechas[i] + " | Turno: " + turnos[i] + " | Proceso: " + procesos[i] + " | Azucar producida: " + azucarProducida[i] + " toneladas | Rendimiento: " + rendimientos[i] + "% | Operador: " + operadores[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del lote a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            lotes[i] = lotes[i + 1];
                            proveedores[i] = proveedores[i + 1];
                            canaRecibida[i] = canaRecibida[i + 1];
                            fechas[i] = fechas[i + 1];
                            turnos[i] = turnos[i + 1];
                            procesos[i] = procesos[i + 1];
                            azucarProducida[i] = azucarProducida[i + 1];
                            rendimientos[i] = rendimientos[i + 1];
                            operadores[i] = operadores[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Lote eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    double totalCana = 0;
                    double totalAzucar = 0;
                    double sumaRendimientos = 0;
                    for (int i = 0; i < total; i++) {
                        totalCana += canaRecibida[i];
                        totalAzucar += azucarProducida[i];
                        sumaRendimientos += rendimientos[i];
                    }
                    double promedioAzucar = totalAzucar / total;
                    double promedioRendimiento = sumaRendimientos / total;
                    String proveedorMayor = proveedores[0];
                    int cantidadProveedorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadProveedor = 0;
                        for (int j = 0; j < total; j++) {
                            if (proveedores[i].equalsIgnoreCase(proveedores[j])) {
                                cantidadProveedor++;
                            }
                        }
                        if (cantidadProveedor > cantidadProveedorMayor) {
                            cantidadProveedorMayor = cantidadProveedor;
                            proveedorMayor = proveedores[i];
                        }
                    }
                    String turnoMayor = turnos[0];
                    int cantidadTurnoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTurno = 0;
                        for (int j = 0; j < total; j++) {
                            if (turnos[i].equalsIgnoreCase(turnos[j])) {
                                cantidadTurno++;
                            }
                        }
                        if (cantidadTurno > cantidadTurnoMayor) {
                            cantidadTurnoMayor = cantidadTurno;
                            turnoMayor = turnos[i];
                        }
                    }
                    String procesoMayor = procesos[0];
                    int cantidadProcesoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadProceso = 0;
                        for (int j = 0; j < total; j++) {
                            if (procesos[i].equalsIgnoreCase(procesos[j])) {
                                cantidadProceso++;
                            }
                        }
                        if (cantidadProceso > cantidadProcesoMayor) {
                            cantidadProcesoMayor = cantidadProceso;
                            procesoMayor = procesos[i];
                        }
                    }
                    String operadorMayor = operadores[0];
                    int cantidadOperadorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadOperador = 0;
                        for (int j = 0; j < total; j++) {
                            if (operadores[i].equalsIgnoreCase(operadores[j])) {
                                cantidadOperador++;
                            }
                        }
                        if (cantidadOperador > cantidadOperadorMayor) {
                            cantidadOperadorMayor = cantidadOperador;
                            operadorMayor = operadores[i];
                        }
                    }
                    String loteMayor = lotes[0];
                    double mayorProduccion = azucarProducida[0];
                    for (int i = 1; i < total; i++) {
                        if (azucarProducida[i] > mayorProduccion) {
                            mayorProduccion = azucarProducida[i];
                            loteMayor = lotes[i];
                        }
                    }
                    double mayorRendimiento = rendimientos[0];
                    for (int i = 1; i < total; i++) {
                        if (rendimientos[i] > mayorRendimiento) {
                            mayorRendimiento = rendimientos[i];
                        }
                    }
                    int pendientes = 0;
                    int procesando = 0;
                    int finalizados = 0;
                    int cancelados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Procesando")) {
                            procesando++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else if (estados[i].equalsIgnoreCase("Cancelado")) {
                            cancelados++;
                        }
                    }
                    System.out.println("resumen de azucarera industrial");
                    System.out.println("Lotes registrados: " + total);
                    System.out.println("Total de cana recibida: " + totalCana + " toneladas");
                    System.out.println("Total de azucar producida: " + totalAzucar + " toneladas");
                    System.out.println("Promedio de azucar producida: " + promedioAzucar + " toneladas");
                    System.out.println("Promedio de rendimiento: " + promedioRendimiento + "%");
                    System.out.println("Proveedor mas utilizado: " + proveedorMayor);
                    System.out.println("Turno mas utilizado: " + turnoMayor);
                    System.out.println("Proceso mas frecuente: " + procesoMayor);
                    System.out.println("Operador con mas lotes: " + operadorMayor);
                    System.out.println("Lote con mayor produccion: " + loteMayor);
                    System.out.println("Mayor produccion: " + mayorProduccion + " toneladas");
                    System.out.println("Mayor rendimiento: " + mayorRendimiento + "%");
                    System.out.println("Lotes pendientes: " + pendientes);
                    System.out.println("Lotes en procesamiento: " + procesando);
                    System.out.println("Lotes finalizados: " + finalizados);
                    System.out.println("Lotes cancelados: " + cancelados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Azucarera Industrial.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}