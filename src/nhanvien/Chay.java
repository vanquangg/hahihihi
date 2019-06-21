package nhanvien;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author thi
 */
public class Chay extends javax.swing.JPanel 
    implements Runnable{
    
    private Thread t;
    private int x = 0;
    
    public Chay() {
        initComponents();
        t = new Thread(this);
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font f = new Font("Arial", Font.BOLD,16);
        g.setFont(f);
        g.setColor(Color.RED);
        g.drawString("CẬP NHẬT NHÂN VIÊN", x, 20);
    }

    @Override
    public void run(){
        while(true){
            repaint();
            try{
                Thread.sleep(30); //30 miligiay
            }
            catch(Exception e){}
            x++;
            if (x>this.getWidth()) x=0;
        }
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
