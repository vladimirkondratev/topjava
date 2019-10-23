package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {
    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;

    public static final int MEAL1_ID = START_SEQ + 2;
    public static final int MEAL2_ID = START_SEQ + 3;
    public static final int MEAL3_ID = START_SEQ + 4;
    public static final int MEAL4_ID = START_SEQ + 5;
    public static final int MEAL5_ID = START_SEQ + 6;

    public static final Meal MEAL1 = new Meal(MEAL1_ID, LocalDateTime.of(2005, 10, 28, 14, 00), "обед", 500);
    public static final Meal MEAL2 = new Meal(MEAL2_ID, LocalDateTime.of(2005, 10, 31, 20, 00), "ужин", 1000);
    public static final Meal MEAL3 = new Meal(MEAL3_ID, LocalDateTime.of(2005, 10, 31, 7, 00), "завтрак", 300);
    public static final Meal MEAL4 = new Meal(MEAL4_ID, LocalDateTime.of(2005, 10, 31, 13, 30), "обед", 800);
    public static final Meal MEAL5 = new Meal(MEAL5_ID, LocalDateTime.of(2005, 10, 31, 18, 00), "ужин", 1000);

    public static final LocalDate START_TIME = LocalDate.of(2005, 10, 15);
    public static final LocalDate END_TIME = LocalDate.of(2005, 10, 30);

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected );
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields().isEqualTo(expected);
    }
}
