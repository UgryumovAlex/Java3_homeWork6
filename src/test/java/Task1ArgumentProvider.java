import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Task1ArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}),
                arguments(new int[]{1, 2, 4, 3, 4}, new int[]{}),
                arguments(new int[]{1, 1, 4, 4, 4, 1, 1}, new int[]{1, 1}),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{5, 6, 7})
        );
    }
}
