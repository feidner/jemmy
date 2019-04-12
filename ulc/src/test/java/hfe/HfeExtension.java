package hfe;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.engine.execution.BeforeEachMethodAdapter;
import org.junit.jupiter.engine.extension.ExtensionRegistry;

public class HfeExtension implements BeforeEachMethodAdapter {
    @Override
    public void invokeBeforeEachMethod(ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) throws Throwable {
        TestStarter.setup();
    }
}
