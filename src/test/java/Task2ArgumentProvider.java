import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Task2ArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}),
                arguments(new int[]{2, 4, 3, 4}),
                arguments(new int[]{2, 1, 3, 1})
        );
    }
}
