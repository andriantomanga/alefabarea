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

import mg.alefabarea.gui.GameFrame;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author Andriantomanga
 */
@SpringBootApplication
@Import(GameConfig.class)
public class AlefaBarea {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(
                AlefaBarea.class)/*.web(WebApplicationType.NONE)*/.headless(false).run(args);

        // MenuFrame menu = context.getBean(MenuFrame.class);
        // menu.setVisible(true);

        GameFrame game = context.getBean(GameFrame.class);
        game.setVisible(true);
    }
}
