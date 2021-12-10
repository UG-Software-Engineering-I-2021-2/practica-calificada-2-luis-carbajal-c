package cs.ing;

import cs.ing.custom_exceptions.CustomRuntimeException;

public class Student {
    private String nombre;
    private int tipo;
    private int notaBase = 11;
    static final int PREGADO = 0;
    static final int MAESTRIA = 1;
    static final int DOCTORADO = 2;

    Student(int type, String nombre) {
        tipo = type;
        this.nombre = nombre;
    }

    int grado() {
        return switch (tipo) {
            case PREGADO -> notaBase;
            case MAESTRIA -> notaBase + 1;
            case DOCTORADO -> notaBase + 2;
            default -> throw new CustomRuntimeException("Empleado incorrecto");
        };
    }
}
