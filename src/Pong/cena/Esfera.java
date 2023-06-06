package Pong.cena;

import static Pong.cena.Cena.screenSize;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.gl2.GLUT;

public class Esfera {

    //contrutor
    public Esfera() {}
    
    //dados para renderização dos objetos
    public double width = screenSize.getWidth();
    public double height = screenSize.getHeight();
    public float aspect = (float)(this.width/this.height);
    
    //desenho da esfera
    public void draw(GL2 gl, GLUT glut)
    {
        gl.glColor3f(0.70f, 0.50f, 0);
        gl.glTranslatef(0,0, 15*this.aspect);
        glut.glutSolidSphere(8*this.aspect, 50, 50);       
    }
    
}
