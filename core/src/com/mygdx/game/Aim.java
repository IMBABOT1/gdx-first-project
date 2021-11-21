package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class Aim {

    private float x;
    private float y;
    private MyGdxGame myGdxGame;
    private Texture texture;


    public Aim(MyGdxGame game){
        this.myGdxGame = game;
        this.x = MathUtils.random(0, 1280);
        this.y = MathUtils.random(0, 720);
        this.texture = new Texture("Snake.png");
    }


    public void render(SpriteBatch batch){
        batch.draw(texture, x, y);
    }

    public void checkHit(){
        if (myGdxGame.getTank().getProjectile().getX() == x && myGdxGame.getTank().getProjectile().getY() == y){
            dispose();
        }
    }


    public void update(float dt){
        checkHit();
    }

    public void dispose(){
        texture.dispose();
    }
}
