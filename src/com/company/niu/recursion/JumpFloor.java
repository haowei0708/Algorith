package com.company.niu.recursion;

/**
 *
 */
public class JumpFloor {

    public int JumpFloor(int target) {
        if (target <= 1) {
            return 1;
        }

        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
