package dev.nau;

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
}
