package Pong.cena;

import static Pong.cena.Cena.screenSize;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.gl2.GLUT;

public class Skate 
{

    //construtor
    public Skate() {}
     
    //dados para renderização dos objetos
    public double width = screenSize.getWidth();
    public double height = screenSize.getHeight();
    public float aspect = (float)(this.width/this.height);
    
    //metodo para desenhar o skate completo
    public void desenhaSkate(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            skate(gl, glut);
            rodas(gl, glut);
        gl.glPopMatrix();
    }
    
    //desenho do skate
    public void skate(GL2 gl, GLUT glut)
    {
        //desenho do skate
        gl.glColor3f(0.47f,0.53f,0.6f);
        gl.glPushMatrix();
            gl.glTranslatef(-14*this.aspect, -90*this.aspect, 60*this.aspect);
            glut.glutSolidCube(7*this.aspect);
        gl.glPopMatrix();
        
        gl.glColor3f(0.47f,0.53f,0.6f);
        gl.glPushMatrix();
            gl.glTranslatef(-7*this.aspect, -90*this.aspect, 60*this.aspect);
            glut.glutSolidCube(7*this.aspect);
        gl.glPopMatrix();
        
        gl.glColor3f(0.47f,0.53f,0.6f);
        gl.glPushMatrix();
            gl.glTranslatef(0, -90*this.aspect, 60*this.aspect);
            glut.glutSolidCube(7*this.aspect);
        gl.glPopMatrix();
               
        gl.glColor3f(0.47f,0.53f,0.6f);
        gl.glPushMatrix();
            gl.glTranslatef(7*this.aspect, -90*this.aspect, 60*this.aspect);
            glut.glutSolidCube(7*this.aspect);
        gl.glPopMatrix();
        
        gl.glColor3f(0.47f,0.53f,0.6f);
        gl.glPushMatrix();
            gl.glTranslatef(14*this.aspect, -90*this.aspect, 60*this.aspect);
            glut.glutSolidCube(7*this.aspect);
        gl.glPopMatrix(); 
    }
    
    //desenho das rodas do skate
    public void rodas(GL2 gl, GLUT glut)
    {
        gl.glColor3f(1,1,1);
        gl.glPushMatrix();
            gl.glTranslatef(-14*this.aspect, -95*this.aspect, 0);
            glut.glutSolidTorus(0.5f*this.aspect, 1*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glColor3f(1,1,1);
        gl.glPushMatrix();
            gl.glTranslatef(14*this.aspect, -95*this.aspect, 0);
            glut.glutSolidTorus(0.5f*this.aspect, 1*this.aspect, 50, 50);
        gl.glPopMatrix();
        
    }
}   