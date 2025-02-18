package dev.nau;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
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
        assertThat(Annalyns.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), is(expectedResult));
    }

    @ParameterizedTest
    @CsvSource({
        "true, false, true",
        "false, false, false",
        "true, true, false",
        "false, true, false",
        "true, false, true"
    })
    @Tag("task:3")
    @DisplayName("The canSignalPrisoner method returns correct values based on archer and prisoner states")
    public void testCanSignalPrisoner(boolean prisonerIsAwake, boolean archerIsAwake, boolean expectedResult) {
        assertThat(Annalyns.canSignalPrisoner(archerIsAwake, prisonerIsAwake), is(expectedResult));
    }

    @ParameterizedTest
    @CsvSource({
        "true, false, true, true, true",
        "false, false, false, true, true",
        "false, false, true, true, true",
        "true, false, false, true, true",
        "false, true, false, true, false",
        "true, false, true, true, true",
        "true, true, true, true, false",

        "false, false, true, false, true",
        "false, false, false, false, false",
        "true, false, true, false, false",
        "false, true, true, false, false",
        "true, false, false, false, false",
        "false, true, false, false, false",
        "true, true, true, false, false"
    })
    @Tag("task:4")
    @DisplayName("The canFreePrisoner method returns correct values based on the given conditions")
    public void testCanFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent, boolean expectedResult) {

        boolean result = Annalyns.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);

        assertThat(result, is(expectedResult));
    }
}
