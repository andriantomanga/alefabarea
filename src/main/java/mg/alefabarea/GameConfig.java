/**
 * Copyright 2019 Nabil Andriantomanga
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mg.alefabarea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Andriantomanga
 */
@Configuration
@ComponentScan("mg.alefabarea")
public class GameConfig {

    public static final int DEFAULT_SCALE = 1;

    @Bean
    public GameProperties gameProperties() {
        GameProperties gameProperties = new GameProperties();
        gameProperties.setScale(DEFAULT_SCALE);
        return gameProperties;
    }
}
