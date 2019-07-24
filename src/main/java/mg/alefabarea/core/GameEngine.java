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

package mg.alefabarea.core;

import mg.alefabarea.GameProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andriantomanga
 */
@Component
public class GameEngine extends JPanel implements Runnable {

    @Autowired
    GameProperties gameProperties;

    public void init() {
        // TODO
    }

    @Override
    public void run() {

    }

    @Override
    protected void paintComponent(Graphics graphics) {
        final Color lastColor = graphics.getColor();
        Graphics2D drawer = (Graphics2D) graphics;
        drawer.setColor(Color.WHITE);
        drawer.fillRect(0,0, getWidth(), getHeight());

        drawer.setColor(lastColor);
    }
}
