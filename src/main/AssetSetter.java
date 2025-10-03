package main;

import object.OBJ_KEY;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    public void setObject() {
        gp.obj[0] = new OBJ_KEY();
        gp.obj[0].worldX = 38 * gp.tileSize;
        gp.obj[0].worldY = 40 * gp.tileSize;

        gp.obj[1] = new OBJ_KEY();
        gp.obj[1].worldX = 7 * gp.tileSize;
        gp.obj[1].worldY = 6 * gp.tileSize;
    }
}
