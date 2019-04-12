package hfe;

import com.ulcjava.base.development.DevelopmentRunner;

public class StartDevelopment {

    public static void main(String[] args) {
        DevelopmentRunner.setApplicationClass(HfeApplication.class);
        DevelopmentRunner.setUseGui(false);
        DevelopmentRunner.run();
    }
}
