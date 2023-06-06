package Pong.cena;

import static Pong.cena.Cena.screenSize;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.gl2.GLUT;

//classe para producao dos cenarios
public class Cenarios 
{
    
    //construtor
    public Cenarios() {}
    
    //dados para animação do cenario no menu
    public float movNuvens = 0;     
    
    //dados para renderização dos objetos
    public double width = screenSize.getWidth();
    public double height = screenSize.getHeight();
    public float aspect = (float)(this.width/this.height);
    
    //metodo para desenhar cenario do menu
    public void drawCenario1(GL2 gl, GLUT glut)
    {          
        desenhaGuiaBaixo(gl);
        desenhaRua(gl);
        desenhaGuiaCima(gl);
        desenhaCampoMenu(gl);
        desenhaCeuMenu(gl, glut); 
        desenhaPostesAzuis(gl, glut);
    }
    
    //metodo para desenhar cenario da primeira fase
    public void drawCenario2(GL2 gl, GLUT glut)
    {          
        desenhaGuiaCima(gl);
        desenhaRua(gl);
        desenhaGuiaBaixo(gl);
        desenhaCampo1Fase(gl);
        desenhaCeu1Fase(gl, glut); 
        desenhaPostesAzuis(gl, glut);
    }
    
    //metodo para desenhar cenario da segunda fase
    public void drawCenario3(GL2 gl, GLUT glut)
    {          
        desenhaGuiaCima(gl);
        desenhaRua(gl);
        desenhaGuiaBaixo(gl);
        desenhaCampo2Fase(gl);
        desenhaCeu2Fase(gl, glut); 
        desenhaPostesAmarelos(gl, glut);
    }
    
    //metodo para desenhar cenario do fim do jogo
    public void drawCenario4(GL2 gl, GLUT glut)
    {          
        desenhaGuiaCima(gl);
        desenhaRua(gl);
        desenhaGuiaBaixo(gl);
        desenhaCampoFim(gl);
        desenhaCeuFim(gl, glut); 
        desenhaPostesAmarelos(gl, glut);
    }
    
    //desenha varios postes c/ lustres azuis
    public void desenhaPostesAzuis(GL2 gl, GLUT glut)
    {   
        gl.glPushMatrix();
            gl.glTranslatef(-102*this.aspect,0, 10*this.aspect);
            desenhaPosteAzul(gl, glut);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(-34*this.aspect,0, 10*this.aspect);
            desenhaPosteAzul(gl, glut);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(34*this.aspect,0, 10*this.aspect);
            desenhaPosteAzul(gl, glut);
        gl.glPopMatrix();
                   
        gl.glPushMatrix();
            gl.glTranslatef(102*this.aspect,0, 10*this.aspect);
            desenhaPosteAzul(gl, glut);
        gl.glPopMatrix();       
    }
    
    //desenha varios postes c/ lustres amarelos
    public void desenhaPostesAmarelos(GL2 gl, GLUT glut)
    {   
        gl.glPushMatrix();
            gl.glTranslatef(-102*this.aspect,0, 10*this.aspect);
            desenhaPosteAmarelo(gl, glut);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(-34*this.aspect,0, 10*this.aspect);
            desenhaPosteAmarelo(gl, glut);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(34*this.aspect,0, 10*this.aspect);
            desenhaPosteAmarelo(gl, glut);
        gl.glPopMatrix();
                   
        gl.glPushMatrix();
            gl.glTranslatef(102*this.aspect,0, 10*this.aspect);
            desenhaPosteAmarelo(gl, glut);
        gl.glPopMatrix();       
    }
    
    //desenha um poste com lustre azul
    public void desenhaPosteAzul(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -81*this.aspect, 0);
            gl.glRotatef(-90*this.aspect, 1*this.aspect, 0, 0);
            glut.glutSolidCone(2*this.aspect, 5*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -50*this.aspect, 0);
            gl.glRotatef(50*this.aspect, 1*this.aspect, 0, 0);
            glut.glutSolidCylinder(0.8f*this.aspect, 30*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -50*this.aspect, 0);
            gl.glRotatef(320*this.aspect, 0, 1*this.aspect, 0);
            glut.glutSolidCylinder(0.8f*this.aspect, 8*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.3f, 0.5f, 0.6f);
            gl.glTranslatef(-5*this.aspect, -52*this.aspect, 5*this.aspect);
            gl.glScalef(2*this.aspect, 2*this.aspect, 0);
            glut.glutSolidIcosahedron();
        gl.glPopMatrix();
                  
    }
    
    //desenha um poste com lustre amarelo
    public void desenhaPosteAmarelo(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -81*this.aspect, 0);
            gl.glRotatef(-90*this.aspect, 1*this.aspect, 0, 0);
            glut.glutSolidCone(2*this.aspect, 5*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -50*this.aspect, 0);
            gl.glRotatef(50*this.aspect, 1*this.aspect, 0, 0);
            glut.glutSolidCylinder(0.8f*this.aspect, 30*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glTranslatef(0, -50*this.aspect, 0);
            gl.glRotatef(320*this.aspect, 0, 1*this.aspect, 0);
            glut.glutSolidCylinder(0.8f*this.aspect, 8*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.98f, 0.93f, 0.36f);
            gl.glTranslatef(-5*this.aspect, -52*this.aspect, 5*this.aspect);
            gl.glScalef(2*this.aspect, 2*this.aspect, 0);
            glut.glutSolidIcosahedron();
        gl.glPopMatrix();
                  
    }
    
    //desenha a guia de baixo da rua
    public void desenhaGuiaBaixo(GL2 gl)
    {   
        gl.glPushMatrix();
            gl.glColor3f(0.9f, 0.9f, 0.9f);
            gl.glLineWidth(5f*this.aspect);               
            gl.glBegin(GL2.GL_LINES);                            
                gl.glVertex2f(-200f*this.aspect, -99.2f*this.aspect);
                gl.glVertex2f(200f*this.aspect, -99.2f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();    
    }
    
    //desenha a guia de cima da rua
    public void desenhaGuiaCima(GL2 gl)
    {   
        gl.glPushMatrix();
            gl.glColor3f(0.9f, 0.9f, 0.9f);
            gl.glLineWidth(5f*this.aspect);               
            gl.glBegin(GL2.GL_LINES);                            
                gl.glVertex2f(-200f*this.aspect, -81.6f*this.aspect);
                gl.glVertex2f(200f*this.aspect, -81.6f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();    
    }
    
    //desenha a rua com as faixas
    public void desenhaRua(GL2 gl)
    {
        gl.glPushMatrix();
            gl.glTranslatef(0, -1.5f*this.aspect, 0);
            desenhaFaixasp(gl);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glLineWidth(50*this.aspect);               
            gl.glBegin(GL2.GL_LINES);                            
                gl.glVertex2f(-200f*this.aspect, -94.5f*this.aspect);
                gl.glVertex2f(200f*this.aspect, -94.5f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.1f);
            gl.glLineWidth(50*this.aspect);               
            gl.glBegin(GL2.GL_LINES);                            
                gl.glVertex2f(-200f*this.aspect, -86.2f*this.aspect);
                gl.glVertex2f(200f*this.aspect, -86.2f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();
    }
    
    //desenha as faixas pequenas da rua
    public void desenhaFaixasp(GL2 gl)
    {
        gl.glPushMatrix();
            gl.glColor3f(0.9f, 0.9f, 0.9f);
            gl.glLineWidth(2.5f*this.aspect);               
            gl.glBegin(GL2.GL_LINES); 
                gl.glVertex2f(-150f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-145f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-140f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-135f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-130f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-125f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-120f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-115f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-110f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-105f*this.aspect, -88.8f*this.aspect);
            
                gl.glVertex2f(-100f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-95f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-90f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-85f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-80f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-75f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-70f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-65f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-60f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-55f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-50f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-45f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-40f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-35f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-30f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-25f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-20f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-15f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(-10f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(-5f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(0*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(5f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(10f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(15f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(20f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(25f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(30f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(35f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(40f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(45f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(50f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(55f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(60f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(65f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(70f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(75f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(80f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(85f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(90f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(95f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(100f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(105f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(110f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(115f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(120f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(125f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(130f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(135f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(140f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(145f*this.aspect, -88.8f*this.aspect);
                
                gl.glVertex2f(150f*this.aspect, -88.8f*this.aspect);
                gl.glVertex2f(155f*this.aspect, -88.8f*this.aspect);
                
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();
               
    }
    
    //desenha o campo do menu
    public void desenhaCampoMenu(GL2 gl)
    {   
        gl.glPushMatrix();    
            gl.glColor3f(0.35f, 1, 0.35f);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -81.6f*this.aspect);
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -81.6f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();        
    }
    
    //desenha o campo da primeira fase
    public void desenhaCampo1Fase(GL2 gl)
    {       
        gl.glPushMatrix();
            gl.glColor3f(0.2f, 0.6f, 0.2f);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -81.6f*this.aspect);
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -81.6f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();     
    }
    
    //desenha o campo da segunda fase
    public void desenhaCampo2Fase(GL2 gl)
    {       
        gl.glPushMatrix();
            gl.glColor3f(0, 0.1f, 0);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -81.6f*this.aspect);
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -81.6f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();       
    }
    
    //desenha o campo do fim de jogo
    public void desenhaCampoFim(GL2 gl)
    {       
            gl.glColor3f(0, 0.39f, 0);              
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -81.6f*this.aspect);
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
                gl.glVertex2f(200*this.aspect, -81.6f*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();
        
    }
    
    //desenha o ceu com as nuvens do menu
    public void desenhaCeuMenu(GL2 gl, GLUT glut)
    {
       gl.glPushMatrix();
            gl.glTranslatef((movNuvens += 0.04f)*this.aspect, 0, 0);
            desenhaNuvens(gl, glut);
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glColor3f(0, 0.5f, 1);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(-200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix(); 
        
    }
    
    //desenha ceu com as nuvens da primeira fase
    public void desenhaCeu1Fase(GL2 gl, GLUT glut)
    {
       gl.glPushMatrix();
            gl.glTranslatef(-105*this.aspect,80*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(90*this.aspect,0,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(0,105*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
        
       gl.glPushMatrix();
            gl.glColor3f(0, 0.5f, 1);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(-200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix(); 
        
    }
    
    //desenha o ceu da segunda fase 
    public void desenhaCeu2Fase(GL2 gl, GLUT glut)
    {      
       gl.glPushMatrix();
            gl.glColor3f(0, 0, 0.1f);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(-200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix();        
    }
    
    //desenha o ceu do fim de jogo com as nuvens
    public void desenhaCeuFim(GL2 gl, GLUT glut)
    {
       gl.glPushMatrix();
            gl.glTranslatef((movNuvens += 0.04f)*this.aspect, 0, 0);
            desenhaNuvens(gl, glut);
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glColor3f(0.1f, 0.1f, 0.44f);               
            gl.glBegin(GL2.GL_QUADS);                            
                gl.glVertex2f(-200*this.aspect, -20*this.aspect);
                gl.glVertex2f(-200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, 100*this.aspect);
                gl.glVertex2f(200*this.aspect, -20*this.aspect);
            gl.glEnd();
            gl.glFlush();
        gl.glPopMatrix(); 
        
    }
    
    //desenha as nuvens
    public void desenhaNuvens(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glTranslatef(-105*this.aspect,80*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(90*this.aspect,0,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(0,105*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-20*this.aspect, 10*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-120*this.aspect, 30*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(70*this.aspect, 70*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-10*this.aspect, 60*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-250*this.aspect,80*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-280*this.aspect,0,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-150*this.aspect,105*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-230*this.aspect, 10*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-290*this.aspect, 40*this.aspect,0);
            desenhaNuvemG(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-320*this.aspect, 70*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
       
       gl.glPushMatrix();
            gl.glTranslatef(-160*this.aspect, 60*this.aspect,0);
            desenhaNuvemP(gl, glut); 
       gl.glPopMatrix();
    }
    
    //desenha nuvem pequena
    public void desenhaNuvemP(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glTranslatef(0, 0, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(8*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(8*this.aspect, 2*this.aspect, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(8*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(16*this.aspect, 0, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(8*this.aspect, 50, 50);
        gl.glPopMatrix();
    }
    
    //desenha nuvem grande
    public void desenhaNuvemG(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glTranslatef(0, 0, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(18*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(18*this.aspect, 5*this.aspect, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(18*this.aspect, 50, 50);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslatef(40*this.aspect, 3*this.aspect, 0);
            gl.glColor3f(1, 1, 1);
            glut.glutSolidSphere(18*this.aspect, 50, 50);
        gl.glPopMatrix();
        
    }
    
    //desenha a lua
    public void drawLua(GL2 gl, GLUT glut)
    {
        gl.glPushMatrix();
            gl.glColor3f(1, 0.99f, 0.82f);
            gl.glTranslatef(65*this.aspect, 65*this.aspect, 15*this.aspect);
            glut.glutSolidSphere(20*this.aspect, 50, 50);
        gl.glPopMatrix();
    }
           
}
      
