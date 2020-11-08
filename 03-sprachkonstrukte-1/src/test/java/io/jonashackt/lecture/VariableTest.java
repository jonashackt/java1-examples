package io.jonashackt.lecture;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VariableTest {

    @Test
    void check_if_variable_overlaps_instance_variable_with_same_name() {
        // Given
        Variable variable = new Variable();

        // When
        String overlappingVariable = variable.getOverlappingVariable();

        // Then
        assertNotEquals(variable.iamAnInstanceVariable, overlappingVariable);

        System.out.println("overlappingVariable: '" + overlappingVariable + "'");
        System.out.println("variable.iamAnInstanceVariable: '" + variable.iamAnInstanceVariable + "'");
    }
}