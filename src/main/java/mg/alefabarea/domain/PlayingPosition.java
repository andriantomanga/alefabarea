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

/**
 * @author Andriantomanga
 */
public enum PlayingPosition {

    GOAL_KEEPER("GK", "Goal Keeper", "Gardien de but"),

    LEFT_BACK("LB", "Left back", "Arrière gauche"),
    RIGHT_BACK("RB", "Right back", "Arrière droite"),

    CENTRE("C", "Centre", "Centre"),

    LEFT_FORWARD("LF", "Left forward", "Avant gauche"),
    CENTRE_FORWARD("CF", "Centre forward", "Avant centre"),
    RIGHT_FORWARD("RF", "Right forward", "Avant droite");

    private String code;
    private String englishName;
    private String frenchName;

    PlayingPosition(String code, String englishName, String frenchName) {
        this.code = code;
        this.englishName = englishName;
        this.frenchName = frenchName;
    }

    public String getCode() {
        return code;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getFrenchName() {
        return frenchName;
    }
}
