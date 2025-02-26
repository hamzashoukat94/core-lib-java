package apimatic.core.utilities;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;

public class CompatibilityFactoryMock extends CoreHttpRequestMock {

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule().silent();

    @Mock
    public CompatibilityFactory compatibilityFactory;

}
