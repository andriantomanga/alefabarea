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

package mg.alefabarea.gui;

import mg.alefabarea.GameProperties;
import mg.alefabarea.core.GameEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * @author Andriantomanga
 */
@Component
public class GameFrame extends JFrame {

    @Autowired
    private GameEngine gameEngine;

    @Autowired
    private GameProperties gameProperties;

    @PostConstruct
    public void init() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Alefa Barea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // setUndecorated(true);
        pack();

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle bounds = env.getMaximumWindowBounds();

        gameProperties.setScreenWidth(bounds.width);
        gameProperties.setScreenHeight(bounds.height);
        gameEngine.init();

        getContentPane().add(gameEngine);
    }
}
