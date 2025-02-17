package dev.nau;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AnnalynsTest {

    @Test
    @Tag("task:1")
    @DisplayName("The canFastAttack method returns true when knight is sleeping")
    public void can_execute_fast_attack_if_knight_is_sleeping() {
        boolean knightIsAwake = false;
        assertThat(Annalyns.canFastAttack(knightIsAwake), is(true));
    }

    @Test
    @Tag("task:1")
    @DisplayName("The canFastAttack method returns false when knight is awake")
    public void cannot_execute_fast_attack_if_knight_is_awake() {
        boolean knightIsAwake = true;
        assertThat(Annalyns.canFastAttack(knightIsAwake), is(false));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({
            "false, false, true, true",
            "false, true, true, true",
            "true, true, true, true",
            "true, false, true, true",
            "true, true, false, true",
            "false, false, false, false",
            "true, false, false, true",
            "false, true, false, true"
    })
    public void testCanSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean expectedResult) {
        // Aquí el método puede ser llamado con los parámetros
        assertThat(Annalyns.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), is(expectedResult));
    }
}
