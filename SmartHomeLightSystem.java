public class SmartHomeLightSystem {
    public static void main(String[] args) {
        // Initialize the light states to OFF (0)
        int lightStates = 0;

        // Turn ON Light 1 (set bit 0 to 1)
        lightStates |= 1; // 0001

        // Check if Light 2 is ON or OFF (check bit 1)
        boolean isLight2On = (lightStates & (1 << 1)) != 0;
        System.out.println("Is Light 2 ON? " + isLight2On);

        // Turn OFF Light 3 (clear bit 2)
        lightStates &= ~(1 << 2); // No change, since bit 2 was already 0

        // Display the final state of all lights in binary format
        System.out.println("Final Light States (binary): " + Integer.toBinaryString(lightStates));
    }
}

/*OUTPUT
 Is Light 2 ON? false
Final Light States (binary): 1
 */
