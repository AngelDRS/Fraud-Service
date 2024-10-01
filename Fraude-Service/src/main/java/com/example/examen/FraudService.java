package com.example.examen;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FraudService {
    private static final Set<String> blacklistedCards;

    static {
        Set<String> tempSet = new HashSet<>();
        tempSet.add("4111111111111111");
        tempSet.add("5111111111111111");
        blacklistedCards = Collections.unmodifiableSet(tempSet);
    }

    /**
     * Verifica si la tarjeta proporcionada está en la lista negra.
     *
     * @param card el número de tarjeta a verificar
     * @return true si la tarjeta está en la lista negra, false de lo contrario
     */
    public boolean isBlacklisted(String card) {
        // Verificamos que la tarjeta no sea nula ni esté vacía.
        if (card == null || card.isEmpty()) {
            throw new IllegalArgumentException("El número de tarjeta no puede ser nulo o vacío.");
        }
        return blacklistedCards.contains(card);
    }

    /**
     * Agrega una tarjeta a la lista negra.
     * Nota: Este método no es parte del diseño original, pero puede ser útil para futuras ampliaciones.
     *
     * @param card el número de tarjeta a agregar
     */
    public static void addCardToBlacklist(String card) {
        // Implementación a considerar en el futuro.
        throw new UnsupportedOperationException("Agregar tarjetas a la lista negra no está soportado.");
    }
}
