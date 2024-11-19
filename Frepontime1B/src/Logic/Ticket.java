package Logic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String código;
    private boolean validez;
    private LocalDate fechaReserva;
    private LocalTime horaReserva;

    public Ticket(String código, LocalDate fechaReserva, LocalTime horaReserva, boolean validez) {
        this.código = código;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.validez = validez;
    }

    public String getCodigo() {
        return código;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public boolean isValidez() {
        return validez;
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }
}
