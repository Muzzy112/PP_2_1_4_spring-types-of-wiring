package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg() {
        return new Egg6();
    }

    @Bean
    public static Needle7 getNeedle(Deth8 death) {
        return new Needle7(death);
    }

    @Bean
    public static Deth8 getDeath() {
        return new Deth8();
    }




}
