/*
 * Copyright CoderLand
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 */

package test;

/**
 * Class for  application
 */
public class Application {
    /**
     * Entry point o the application.
     *
     * @param args Argument from CLI.
     */
    public static void main(final String[] args) {
        System.out.println("Hello world !");
    }

    /**
     * Add to value.
     *
     * @param firstValue first value.
     * @param secondValue second value.
     * @return result of the addition.
     */
    public static int add(final int firstValue, final int secondValue) {
        return firstValue + secondValue;
    }
}