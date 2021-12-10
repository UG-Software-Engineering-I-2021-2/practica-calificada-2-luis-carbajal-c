package cs.ing;

import cs.ing.custom_exceptions.CustomRuntimeException;

public class Teacher {
    private String nombre;
    private int tipo;
    private int salarioBaseMensual = 2000;
    private int comision = 500;
    private int bonus = 100;
    static final int PROFESOR_TP = 0;
    static final int PROFESOR_TC = 1;
    static final int ADMINISTRATIVO = 2;

    Teacher(int type, String nombre) {
        tipo = type;
        this.nombre = nombre;
    }

    int sueldo() {
        return switch (tipo) {
            case PROFESOR_TP -> salarioBaseMensual;
            case PROFESOR_TC -> salarioBaseMensual + comision;
            case ADMINISTRATIVO -> salarioBaseMensual + bonus;
            default -> throw new CustomRuntimeException("Empleado incorrecto");
        };
    }

    public String getNombre() {
        return nombre;
    }
}

