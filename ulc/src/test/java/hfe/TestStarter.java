package hfe;

import com.ulcjava.testframework.development.AbstractDevelopmentTestCase;

class TestStarter {

    static void setup() throws Exception {
        My mm = new My();
        mm.setUp();
    }

    private static class My extends AbstractDevelopmentTestCase {
        @Override
        public void setUp() throws Exception {
            super.setUp();
        }

        @Override
        protected Class getApplicationClass() {
            return HfeApplication.class;
        }
    }
}
