// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeTest {
    @Test
    void intToString() {
        int[] numbers = {
            0, 2, 4, 7, 9,
            // TODO: add multi digit tests
        };

        for (var number : numbers) {
            var got = Iterative.intToString(number);
            var expected = Integer.toString(number);
            assertEquals(expected, got);
        }
    }
}
