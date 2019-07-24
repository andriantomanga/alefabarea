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

package mg.alefabarea.domain;

import lombok.Data;

import java.awt.*;

/**
 * @author Andriantomanga
 */
@Data
public class Player extends AbstractMovableEntity {

    private String name;
    private boolean proposed;
    private Point nextStep;
    private Side side;
    private PlayingPosition playingPosition;

    @Override
    public void draw(Graphics2D drawer) {
        // TODO
    }
}
