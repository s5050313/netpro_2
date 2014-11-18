
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class browser extends javax.swing.JFrame {
    String Url, No, address, address1, address2, address3, re, re2;

    public browser() {
        super("Tippawat Wattanakulmeechai s5050313@kmitl.ac.th - Java Web Browser (Network Programming Class Assignment)");
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        URL1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JEditorPane();
        URL2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Thread1 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Thread2 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Get");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(display1);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(display2);

        jScrollPane3.setViewportView(Thread1);

        jScrollPane4.setViewportView(Thread2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MyT link1 = new MyT(URL1.getText(), "Thread1");
        MyT link2 = new MyT(URL2.getText(), "Thread2");
        link1.start();
        link2.start();   
        address1=address;    
        address=this.URL1.getText();
        try{
            this.display1.setPage(address);
        }
        catch(Exception e){
        }

        address2=address3;    
        address3=this.URL2.getText();
        try{
         this.display2.setPage(address3);
        }
        catch(Exception e){
        }
        if(!address1.equals(address)){
        re=address1;}
        else{
        
        }
        if (!address2.equals(address3)){
                re2=address2;}
        else{
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MyT link1 = new MyT(URL1.getText(), "Thread1");
        MyT link2 = new MyT(URL2.getText(), "Thread2");
        link1.start();
        link2.start();  
        try{
            this.display1.setPage(re);
            this.display2.setPage(re2);
        }
        catch(Exception e){
        }        

    }//GEN-LAST:event_jButton2ActionPerformed

    public void ShowH(String URL, String Thread) {
        String url = URL;
        String thread = Thread;
        try {

            URL obj = new URL(url);
            URLConnection conn = obj.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();
            Thread1.setText(Thread1.getText() + thread + " :\n");

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                Thread1.setText(Thread1.getText() + "Key : " + entry.getKey() + " ,Value : " + entry.getValue() + "\n");
            }
            Thread1.setText(Thread1.getText() + "\nGet HTTP Header For : " + thread + "\n");
            String server = conn.getHeaderField("Server");

            if (server == null) {
                Thread1.setText(Thread1.getText() + "'Server' is not found!\n");
            } else {
                Thread1.setText(Thread1.getText() + "Server : " + server + "\n");
            }
            Thread1.setText(Thread1.getText() + "Done\n________________________\n");
        } catch (Exception e) {
            
        }
    }
    
    public class MyT extends Thread {

        String thrNo;
        

        public MyT(String url, String no) {
            Url = url;
            thrNo = no;
        }

        @Override
        public void run() {

            try {
                Thread2.setText(Thread2.getText() + thrNo + " : Start Get URL\n");

                if (thrNo.equals("Thread1")) {
                    display1.setPage(address);

                }
                if (thrNo.equals("Thread2")) {
                    display2.setPage(address3);

                }

                Thread2.setText(Thread2.getText() + thrNo + " : GetPage\n");

                Thread2.setText(Thread2.getText() + thrNo + " : Print Header\n");

                ShowH(Url, thrNo);

                Thread2.setText(Thread2.getText() + thrNo + " : Finish\n");
            } catch (IOException ex) {
                //Logger.getLogger(Assign2.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new browser().setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Thread1;
    private javax.swing.JEditorPane Thread2;
    private javax.swing.JTextField URL1;
    private javax.swing.JTextField URL2;
    private javax.swing.JEditorPane display1;
    private javax.swing.JEditorPane display2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
