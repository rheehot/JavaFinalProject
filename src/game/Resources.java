package game;

public class Resources {
    public final static String logo =
            " ____        _   _   _           _     _       \n" +
            "| __ )  __ _| |_| |_| | ___  ___| |__ (_)_ __  \n" +
            "|  _ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\ \n" +
            "| |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |\n" +
            "|____/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/ \n" +
            "                                        |_|    ";

    public final static String explosion =
            "     _.-^^---....,,--       \n" +
            " _--                  --_  \n" +
            "<                        >)\n" +
            "|                         | \n" +
            " \\._                   _./  \n" +
            "    ```--. . , ; .--'''       \n" +
            "          | |   |             \n" +
            "       .-=||  | |=-.   \n" +
            "       `-=#$%&%$#=-'   \n" +
            "          | ;  :|     \n" +
            " _____.,-#%&$@%#&#~,._____";

    public static String player1Win =
            " _____  _                      __            _       _ \n" +
            "|  __ \\| |                    /_ |          (_)     | |\n" +
            "| |__) | | __ _ _   _  ___ _ __| | __      ___ _ __ | |\n" +
            "|  ___/| |/ _` | | | |/ _ \\ '__| | \\ \\ /\\ / / | '_ \\| |\n" +
            "| |    | | (_| | |_| |  __/ |  | |  \\ V  V /| | | | |_|\n" +
            "|_|    |_|\\__,_|\\__, |\\___|_|  |_|   \\_/\\_/ |_|_| |_(_)\n" +
            "                 __/ |                                 \n" +
            "                |___/                                    ";

    public final static String player2Win =
            " _____  _                     ___             _       _ \n" +
            "|  __ \\| |                   |__ \\           (_)     | |\n" +
            "| |__) | | __ _ _   _  ___ _ __ ) | __      ___ _ __ | |\n" +
            "|  ___/| |/ _` | | | |/ _ \\ '__/ /  \\ \\ /\\ / / | '_ \\| |\n" +
            "| |    | | (_| | |_| |  __/ | / /_   \\ V  V /| | | | |_|\n" +
            "|_|    |_|\\__,_|\\__, |\\___|_||____|   \\_/\\_/ |_|_| |_(_)\n" +
            "                 __/ |                                  \n" +
            "                |___/                                   ";

    public final static String tutorialRuleTooltip =
    "게임 룰 설명:\n" +
            "본 게임은 턴제 게임으로, 10*10 칸에 각 플레이어가 미리 함선을 배치하고,\n" +
            "각 턴마다 상대 함선을 공격하는 게임입니다.\n" +
            "상대 함선의 위치는 알 수 없으므로 추측을 통해 맞추어야 합니다.\n" +
            "각 함종마다 공격력/체력/특수능력이 나뉘므로\n" +
            "적절한 전략을 이용하는 것이 중요합니다.";

    public final static String tutorialShipsTooltip =
            "함종 설명:\n" +
                    "본 게임에 등장하는 함종은 총 4가지로,\n" +
                    "구축함(DD) HP1/AT1 - 1포인트\n" +
                    "순양함(CA) HP1/AT2 - 2포인트\n" +
                    "전함(BB) HP4/AT4 - 3포인트\n" +
                    "항공모함(CV) HP2/AT3 - 3포인트\n" +
                    "가 있습니다. 항공모함은 2회 공격이 가능합니다.";

    public final static String placeTooltip =
            "함선을 원하는 위치에 배치하십시오." +
            "구축함(DD) - 1포인트" +
            "순양함(CA) - 2포인트" +
            "전함(BB) - 3포인트" +
            "항공모함(CV) - 3포인트";

}
