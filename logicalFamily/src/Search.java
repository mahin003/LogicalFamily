
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Search extends javax.swing.JFrame {

    public Search() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        relation = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        showfather = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mothername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        showmother = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        childrens = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        showchild = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spausename = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        showspause = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        headname = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 700));

        jPanel2.setBackground(new java.awt.Color(70, 192, 190));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Logical Family");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(537, 537, 537))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(505, 505, 505))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Myriad Pro", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(70, 192, 190));
        jButton2.setText("Add a new person");
        jButton2.setPreferredSize(new java.awt.Dimension(91, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Myriad Pro", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(70, 192, 190));
        jButton4.setText("Add a new family");
        jButton4.setPreferredSize(new java.awt.Dimension(91, 33));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(6, 35));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(6, 35));

        relation.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N

        jButton3.setFont(new java.awt.Font("Myriad Pro", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(70, 192, 190));
        jButton3.setText("Relation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 192, 190));
        jLabel2.setText("Name");

        jButton5.setFont(new java.awt.Font("Myriad Pro", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(70, 192, 190));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 192, 190));
        jLabel5.setText("Search for a person");

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 192, 190));
        jLabel1.setText("Who is The Father Of");

        fathername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Myriad Pro", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(70, 192, 190));
        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showfather.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 192, 190));
        jLabel6.setText("??");

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 192, 190));
        jLabel7.setText("Who is the Mother Of");

        mothername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 192, 190));
        jLabel8.setText("??");

        jButton6.setFont(new java.awt.Font("Myriad Pro", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(70, 192, 190));
        jButton6.setText("FIND");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        showmother.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 192, 190));
        jLabel9.setText("How Many childrens does ");

        childrens.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Myriad Pro", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(70, 192, 190));
        jButton7.setText("FIND");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        showchild.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 192, 190));
        jLabel10.setText("Has??");

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 192, 190));
        jLabel11.setText("Who is The spause of");

        spausename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 192, 190));
        jLabel12.setText("??");

        jButton8.setFont(new java.awt.Font("Myriad Pro", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(70, 192, 190));
        jButton8.setText("FIND");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        showspause.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 192, 190));
        jLabel13.setText("Your choosen family's head Member");

        headname.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        headname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headnameActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(70, 192, 190));
        jButton9.setText("DONE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(70, 192, 190));
        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mothername, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showmother)
                    .addComponent(showfather))
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(childrens, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showchild, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spausename, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showspause, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relation, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9))
                    .addComponent(headname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6))
                    .addComponent(showfather, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mothername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(showmother, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrens)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(showchild, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spausename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(showspause, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        addnewperson ob = new addnewperson();
        ob.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        newfamily ob = new newfamily();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
     if(firstfamily==true){   String x;
        BufferedReader br;
        int j = 0;
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                names[j] = parts[0];
                j++;
                names[j] = parts[1];
                j++;
                names[j] = parts[2];
                j++;

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                names[j] = parts[0];
                j++;
                names[j] = parts[1];
                j++;
                names[j] = parts[2];
                j++;

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        String c = jTextField1.getText();
        c = c.toLowerCase();
        System.out.println(c);
        System.out.println(spause2.get(c));
        String l = "Not a Part Of Family", g;
        for (int p = 0; p < j; p++) {
            System.out.println(names[p]);
        }
        Boolean f = false;
        try {
            for (int p = 0; p < j; p++) {
                if (c.equals(names[p])) {
                    f = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        if (f == false) {
            jTextField2.setText(l);
        } else {
            l = "PART OF THE FAMILY";
            jTextField2.setText(l);
        }
        jTextField1.setText("");}
   else  if(secondfamily==true){   String x;
        BufferedReader br;
        int j = 0;
        String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                names[j] = parts[0];
                j++;
                names[j] = parts[1];
                j++;
                names[j] = parts[2];
                j++;

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                names[j] = parts[0];
                j++;
                names[j] = parts[1];
                j++;
                names[j] = parts[2];
                j++;

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        String c = jTextField1.getText();
        c = c.toLowerCase();
        System.out.println(c);
        System.out.println(spause2.get(c));
        String l = "Not a Part Of Family", g;
        for (int p = 0; p < j; p++) {
            System.out.println(names[p]);
        }
        Boolean f = false;
        try {
            for (int p = 0; p < j; p++) {
                if (c.equals(names[p])) {
                    f = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        if (f == false) {
            jTextField2.setText(l);
        } else {
            l = "PART OF THE FAMILY";
            jTextField2.setText(l);
        }
        jTextField1.setText("");}
   else{
      JOptionPane.showMessageDialog(null,"\"please fill the || Head OF the Family TextField ||, TRY AGAIN\"" );  jTextField1.setText("");
   }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(firstfamily==true){
        try {
            String x;
            BufferedReader br;
            int j = 0;
            String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
            try {
                br = new BufferedReader(new FileReader(line));
                while ((x = br.readLine()) != null) {
                    System.out.println(x);
                    String parts[] = x.split(" ");
                    spause.put(parts[2], parts[1]);
                    spause.put(parts[1], parts[2]);
                    fatherOf.put(parts[0], parts[1]);
                    //  System.out.println(parts[3]);

                    motherOf.put(parts[0], parts[2]);
                    genderOf.put(parts[0], parts[3]);
                    genderOf.put(parts[1], "m");
                    genderOf.put(parts[2], "f");
                    System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
                }
            } catch (Exception e) {
                System.out.println("EXCEPTION ");
            }
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            try {
                br = new BufferedReader(new FileReader(line));
                while ((x = br.readLine()) != null) {
                    System.out.println(x);
                    String parts[] = x.split(" ");
                    spause.put(parts[2], parts[1]);
                    spause.put(parts[1], parts[2]);
                    fatherOf.put(parts[0], parts[1]);
                    //  System.out.println(parts[3]);

                    motherOf.put(parts[0], parts[2]);
                    genderOf.put(parts[0], parts[3]);
                    genderOf.put(parts[1], "m");
                    genderOf.put(parts[2], "f");
                    System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
                }
            } catch (Exception e) {
                System.out.println("EXCEPTION ");
            }

            String firstname, SecondName;

            relation.setText("");
            firstname = jTextField3.getText();
            firstname = firstname.toLowerCase();
            System.out.println(firstname);
            SecondName = jTextField5.getText();
            SecondName = SecondName.toLowerCase();
            System.out.println(SecondName);
            // System.out.println(genderOf.get(firstname)+" ");
            // System.out.println(firstname+" "+SecondName);
            Boolean k = false;
            Integer firstLevelf = 0, firstLevelf2 = 0, Secondlevelf = 0, Secondlevelf1 = 0, firstLevelm = 0, firstLevelm2 = 0, Secondlevelm = 0, Secondlevelm1 = 0;
            for (Map.Entry<String, String> entry : spause.entrySet()) {
                if ((entry.getKey().equals(firstname) & entry.getValue().equals(SecondName)) || (entry.getKey().equals(firstname) & entry.getValue().equals(SecondName))) {
                    relation.setText("They are spauses");
                    k = true;
                    System.out.println("spause");
                }
            }

            Boolean firstcng = false, secondcng = false;
            if (firstname.equals(SecondName)) {
                JOptionPane.showMessageDialog(null, "You Entered the same name, TRY AGAIN");
            } else {
                if (fatherOf.get(firstname) == null) {
                    firstcng = true;
                    firstname = spause.get(firstname);

                }

                if (fatherOf.get(SecondName) == null) {
                    secondcng = true;
                    SecondName = spause.get(SecondName);

                }
                String name = null, namex = null;
                if (fatherOf.get(firstname) != null) {
                    firstLevelf++;
                    firstLevelf2++;
                    name = fatherOf.get(firstname);
                    namex = fatherOf.get(firstname);
                }
                //   System.out.println("father of > "+name);

                while (fatherOf.get(name) != null) {
                    firstLevelf++;

                    name = fatherOf.get(name);
                    //System.out.println(name+" >> "+fatherOf.get(name));
                }
                while (motherOf.get(namex) != null) {
                    firstLevelf2++;
                    namex = motherOf.get(namex);

                }

                Integer firstfathermax = Math.max(firstLevelf, firstLevelf2);
                if (motherOf.get(firstname) != null) {
                    firstLevelm++;
                    firstLevelm2++;
                    name = motherOf.get(firstname);
                    namex = motherOf.get(firstname);
                }

                while (motherOf.get(namex) != null) {
                    firstLevelm++;
                    namex = motherOf.get(namex);
                }
                while (fatherOf.get(name) != null) {
                    firstLevelm2++;
                    name = fatherOf.get(name);

                }
                Integer firstmothermax = Math.max(firstLevelm, firstLevelm2);
                Integer maxfirstlvl = Math.max(firstmothermax, firstfathermax);
                if (fatherOf.get(SecondName) != null) {
                    Secondlevelf++;
                    Secondlevelf1++;
                    name = fatherOf.get(SecondName);
                    namex = fatherOf.get(SecondName);
                }
                //  System.out.println("father of secondnAAEM > "+name);
                while (fatherOf.get(name) != null) {
                    Secondlevelf++;
                    // System.out.println(name+" > "+fatherOf.get(name));
                    name = fatherOf.get(name);

                }
                while (motherOf.get(namex) != null) {
                    Secondlevelf1++;
                    //   System.out.println(namex+" > "+motherOf.get(namex));
                    namex = motherOf.get(namex);

                }
                Integer secondfathermax = Math.max(Secondlevelf, Secondlevelf1);
                if (motherOf.get(SecondName) != null) {
                    Secondlevelm1++;
                    Secondlevelm++;
                    name = motherOf.get(SecondName);
                    namex = motherOf.get(SecondName);
                }
                while (motherOf.get(name) != null) {
                    Secondlevelm++;
                    name = motherOf.get(name);

                }
                while (fatherOf.get(namex) != null) {
                    Secondlevelm1++;
                    namex = fatherOf.get(namex);
                }

                Integer secondmothermax = Math.max(Secondlevelm, Secondlevelm1);
                Integer maxsecondlvl = Math.max(secondmothermax, secondfathermax);
                //   System.out.println(maxfirstlvl+" "+maxsecondlvl);
                if (maxfirstlvl == maxsecondlvl) {
                    if (firstcng == false & secondcng == false) {
                        if (fatherOf.get(firstname).equals(fatherOf.get(SecondName))) {
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("SISTERS");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("BROTHERS");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("SISTER-BROTHER");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("BROTHER-SISTER");
                            }
                        } else {
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("SISTERS(cousin)");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("BROTHERS(cousin)");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("SISTER-BROTHER(cousin)");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("BROTHER-SISTER(cousin)");
                            }
                        }
                    } else {
                        if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("SiSterInLaw(brother'sWife) - brothrInLaw(HusbandsBrother)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("SiSterInLaw(brother'sWife) - SisterInLaw(HusbandsSister)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("BrotherInLaw(Sister'sHusband) - SisterInLaw(Wife'sSister)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("BrotherInLaw(sister's Husband)- BrotherInLaw(wife'sBrother)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText(" SisterInLaw(HusbandsSister)-SiSter-In-Law(brother'sWiife)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText(" BrotherInLaw(Sister'sBrother)-BrotherInLaw(Sister'sHusband)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText(" SisterInLaw(wife'sSister)-Brother-In-Law(sister's Husband)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("BortherInLaw(Husband'sBrother)-SiSter-In-Law(brothers-wife)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("SisterInLaw(Husband's SisterInLaw)-SiSter-In-Law(Husband's SisterInLaw)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("BrotherInLaw(wife's BrotherInLaw)-Brother-In-Law(wife's BrotherInLaw");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("BrotherInLaw(Husbands's BrotherInLaw)-SiSter-In-Law(wife's SisterInLaw)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("SisterInLawa(wife's SisterInLaw)-Brother-In-Law(Husbands's BrotherInLaw");
                        }
                    }

                } else if ((maxfirstlvl - maxsecondlvl) == 1) {
                    if (firstcng == false & ((fatherOf.get(firstname).equals(SecondName)) || (motherOf.get(firstname).equals(SecondName)))) {
                        if (secondcng == true) {
                            SecondName = spause.get(SecondName);
                        }
                        if (genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Son-Father");
                        } else if (genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Daughter-Father");
                        } else if (genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Son-MOther");
                        } else if (genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Daughter-Mother");
                        }
                    } else if (((firstcng == true & secondcng == false) || (firstcng == true & secondcng == true)) & ((fatherOf.get(firstname).equals(SecondName)) || (motherOf.get(firstname).equals(SecondName)))) {
                        if (secondcng == true & genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-MotherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-FatherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLaw-FatherInLaw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLaw-MotherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-MOtherInLAw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-FatherInLAw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLAw-MotherInLAw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLAw-FatherInLAw");
                        }

                    } else {
                        if (firstcng == false & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Uncle");
                            }
                        } else if (firstcng == false & secondcng == true) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Uncle");
                            }
                        } //bower family add kora baki...
                        else if (firstcng == true) {
                            if (secondcng == true) {
                                SecondName = spause.get(SecondName);
                            }
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("NephewInLaw-UncleInLaw");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("NephewInLaw-UncleInLaw");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("NeiceInLaw-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("NephewInLaw-AntyInLaw");
                            }

                        }
                    }

                } else if ((maxfirstlvl - maxsecondlvl) == -1) {
                    if (secondcng == false & ((fatherOf.get(SecondName).equals(firstname)) || (motherOf.get(SecondName).equals(firstname)))) {
                        if (firstcng == true) {
                            firstname = spause.get(firstname);
                        }
                        if (genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Father-Son");
                        } else if (genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Father-Daughter");
                        } else if (genderOf.get(SecondName).equals("m") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MOther-Son");
                        } else if (genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Mother-Daughter");
                        }
                    } else if (((firstcng == false & secondcng == true) || (firstcng == true & secondcng == true)) & ((fatherOf.get(SecondName).equals(firstname)) || (motherOf.get(SecondName).equals(firstname)))) {
                        if (firstcng == false & genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLaw-SonInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLaw-SonInLaw");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLaw-DaughterInLaw-");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLaw-DaughterInLaw-");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MOtherInLAw-SonInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLAw-SonInLaw");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("m") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLAw-DaughterInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLAw-SonInLaw");
                        }
                    } else {
                        if (firstcng == false & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Uncle-Nephew");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("ANTY-Nephew");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Anty-Neice");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Uncle-Neice");
                            }
                        } else if (firstcng == true & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Uncle");
                            }
                        } //bower family add kora baki...
                        else if (secondcng == true) {
                            if (firstcng == true) {
                                firstname = spause.get(firstname);
                            }
                            if (genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                                relation.setText("UncleInLaw-NephewInLaw");
                            } else if (genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                                relation.setText("UncleInLaw-NeiceInLaw");
                            } else if (genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("f")) {
                                relation.setText("-AntyInLaw-NeiceInLaw");
                            } else if (genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("f")) {
                                relation.setText("AntyInLaw-NephewInLaw");
                            }

                        }
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == 2) {
                    if (secondcng == true) {
                        SecondName = spause.get(SecondName);
                    }

                    if (firstcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandSon-GrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandSonInLaw-GrandFather");
                    } else if (firstcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("Granddaughter-GrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandDaughterInLaw-GrandFather");
                    } else if (firstcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandSon-GrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandSonInLaw-GrandMother");
                    } else if (firstcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("Granddaughter-GrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandDaughterInLaw-GrandMother");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == -2) {
                    if (firstcng == true) {
                        firstname = spause.get(firstname);
                    }
                    if (secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandFather-GrandSon");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandFather-GrandSonInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandFather-Granddaugher");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandFather-GrandDaughterInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandMother-Granddaughter");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandMother-GranddaughterInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandMother-GrandSon");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandMother-GrandSonInLaw");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == 3) {
                    if (secondcng == true) {
                        SecondName = spause.get(SecondName);
                    }

                    if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandSon-GrandGrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandSonInLaw-GrandGrandFather");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGranddaughter-GrandGrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandDaughterInLaw-GrandGrandFather");
                    } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandSon-GrandGrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandSonInLaw-GrandGrandMother");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGranddaughter-GrandGrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandDaughterInLaw-GrandGrandMother");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == -3) {
                    if (firstcng == true) {
                        firstname = spause.get(firstname);
                    }
                    if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandFather-GRANDGrandSon");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandGrandFather-GrandGrandSonInLaw");
                    } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandFather-GrandGranddaugher");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandGrandFather-GrandGrandDaughterInLaw");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandMother-GrandGranddaughter");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandMother-GrandGranddaughterInLaw");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandMother-GrandGrandSon");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandMother-GrandGrandSonInLaw");
                    }
                }
            }
            jTextField3.setText("");
            jTextField5.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES, TRY AGAIN");
            jTextField3.setText("");
            jTextField5.setText("");
            //System.out.println("Exepsadkfg");
        }}
      else  if(secondfamily==true){
        try {
            String x;
            BufferedReader br;
            int j = 0;
            String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
            try {
                br = new BufferedReader(new FileReader(line));
                while ((x = br.readLine()) != null) {
                    System.out.println(x);
                    String parts[] = x.split(" ");
                    spause.put(parts[2], parts[1]);
                    spause.put(parts[1], parts[2]);
                    fatherOf.put(parts[0], parts[1]);
                    //  System.out.println(parts[3]);

                    motherOf.put(parts[0], parts[2]);
                    genderOf.put(parts[0], parts[3]);
                    genderOf.put(parts[1], "m");
                    genderOf.put(parts[2], "f");
                    System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
                }
            } catch (Exception e) {
                System.out.println("EXCEPTION ");
            }
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            try {
                br = new BufferedReader(new FileReader(line));
                while ((x = br.readLine()) != null) {
                    System.out.println(x);
                    String parts[] = x.split(" ");
                    spause.put(parts[2], parts[1]);
                    spause.put(parts[1], parts[2]);
                    fatherOf.put(parts[0], parts[1]);
                    //  System.out.println(parts[3]);

                    motherOf.put(parts[0], parts[2]);
                    genderOf.put(parts[0], parts[3]);
                    genderOf.put(parts[1], "m");
                    genderOf.put(parts[2], "f");
                    System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
                }
            } catch (Exception e) {
                System.out.println("EXCEPTION ");
            }

            String firstname, SecondName;

            relation.setText("");
            firstname = jTextField3.getText();
            firstname = firstname.toLowerCase();
            System.out.println(firstname);
            SecondName = jTextField5.getText();
            SecondName = SecondName.toLowerCase();
            System.out.println(SecondName);
            // System.out.println(genderOf.get(firstname)+" ");
            // System.out.println(firstname+" "+SecondName);
            Boolean k = false;
            Integer firstLevelf = 0, firstLevelf2 = 0, Secondlevelf = 0, Secondlevelf1 = 0, firstLevelm = 0, firstLevelm2 = 0, Secondlevelm = 0, Secondlevelm1 = 0;
            for (Map.Entry<String, String> entry : spause.entrySet()) {
                if ((entry.getKey().equals(firstname) & entry.getValue().equals(SecondName)) || (entry.getKey().equals(firstname) & entry.getValue().equals(SecondName))) {
                    relation.setText("They are spauses");
                    k = true;
                    System.out.println("spause");
                }
            }

            Boolean firstcng = false, secondcng = false;
            if (firstname.equals(SecondName)) {
                JOptionPane.showMessageDialog(null, "You Entered the same name, TRY AGAIN");
            } else {
                if (fatherOf.get(firstname) == null) {
                    firstcng = true;
                    firstname = spause.get(firstname);

                }

                if (fatherOf.get(SecondName) == null) {
                    secondcng = true;
                    SecondName = spause.get(SecondName);

                }
                String name = null, namex = null;
                if (fatherOf.get(firstname) != null) {
                    firstLevelf++;
                    firstLevelf2++;
                    name = fatherOf.get(firstname);
                    namex = fatherOf.get(firstname);
                }
                //   System.out.println("father of > "+name);

                while (fatherOf.get(name) != null) {
                    firstLevelf++;

                    name = fatherOf.get(name);
                    //System.out.println(name+" >> "+fatherOf.get(name));
                }
                while (motherOf.get(namex) != null) {
                    firstLevelf2++;
                    namex = motherOf.get(namex);

                }

                Integer firstfathermax = Math.max(firstLevelf, firstLevelf2);
                if (motherOf.get(firstname) != null) {
                    firstLevelm++;
                    firstLevelm2++;
                    name = motherOf.get(firstname);
                    namex = motherOf.get(firstname);
                }

                while (motherOf.get(namex) != null) {
                    firstLevelm++;
                    namex = motherOf.get(namex);
                }
                while (fatherOf.get(name) != null) {
                    firstLevelm2++;
                    name = fatherOf.get(name);

                }
                Integer firstmothermax = Math.max(firstLevelm, firstLevelm2);
                Integer maxfirstlvl = Math.max(firstmothermax, firstfathermax);
                if (fatherOf.get(SecondName) != null) {
                    Secondlevelf++;
                    Secondlevelf1++;
                    name = fatherOf.get(SecondName);
                    namex = fatherOf.get(SecondName);
                }
                //  System.out.println("father of secondnAAEM > "+name);
                while (fatherOf.get(name) != null) {
                    Secondlevelf++;
                    // System.out.println(name+" > "+fatherOf.get(name));
                    name = fatherOf.get(name);

                }
                while (motherOf.get(namex) != null) {
                    Secondlevelf1++;
                    //   System.out.println(namex+" > "+motherOf.get(namex));
                    namex = motherOf.get(namex);

                }
                Integer secondfathermax = Math.max(Secondlevelf, Secondlevelf1);
                if (motherOf.get(SecondName) != null) {
                    Secondlevelm1++;
                    Secondlevelm++;
                    name = motherOf.get(SecondName);
                    namex = motherOf.get(SecondName);
                }
                while (motherOf.get(name) != null) {
                    Secondlevelm++;
                    name = motherOf.get(name);

                }
                while (fatherOf.get(namex) != null) {
                    Secondlevelm1++;
                    namex = fatherOf.get(namex);
                }

                Integer secondmothermax = Math.max(Secondlevelm, Secondlevelm1);
                Integer maxsecondlvl = Math.max(secondmothermax, secondfathermax);
                //   System.out.println(maxfirstlvl+" "+maxsecondlvl);
                if (maxfirstlvl == maxsecondlvl) {
                    if (firstcng == false & secondcng == false) {
                        if (fatherOf.get(firstname).equals(fatherOf.get(SecondName))) {
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("SISTERS");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("BROTHERS");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("SISTER-BROTHER");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("BROTHER-SISTER");
                            }
                        } else {
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("SISTERS(cousin)");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("BROTHERS(cousin)");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("SISTER-BROTHER(cousin)");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("BROTHER-SISTER(cousin)");
                            }
                        }
                    } else {
                        if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("SiSterInLaw(brother'sWife) - brothrInLaw(HusbandsBrother)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("SiSterInLaw(brother'sWife) - SisterInLaw(HusbandsSister)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("BrotherInLaw(Sister'sHusband) - SisterInLaw(Wife'sSister)");
                        } else if (k == false & firstcng == true & secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("BrotherInLaw(sister's Husband)- BrotherInLaw(wife'sBrother)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText(" SisterInLaw(HusbandsSister)-SiSter-In-Law(brother'sWiife)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText(" BrotherInLaw(Sister'sBrother)-BrotherInLaw(Sister'sHusband)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText(" SisterInLaw(wife'sSister)-Brother-In-Law(sister's Husband)");
                        } else if (k == false & firstcng == false & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("BortherInLaw(Husband'sBrother)-SiSter-In-Law(brother-wife)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("SisterInLaw(Husband's SisterInLaw)-SiSter-In-Law(Husband's SisterInLaw)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("BrotherInLaw(wife's BrotherInLaw)-Brother-In-Law(wife's BrotherInLaw");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                            relation.setText("BrotherInLaw(Husbands's BrotherInLaw)-SiSter-In-Law(wife's SisterInLaw)");
                        } else if (k == false & firstcng == true & secondcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                            relation.setText("SisterInLawa(wife's SisterInLaw)-Brother-In-Law(Husbands's BrotherInLaw");
                        }
                    }

                } else if ((maxfirstlvl - maxsecondlvl) == 1) {
                    if (firstcng == false & ((fatherOf.get(firstname).equals(SecondName)) || (motherOf.get(firstname).equals(SecondName)))) {
                        if (secondcng == true) {
                            SecondName = spause.get(SecondName);
                        }
                        if (genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Son-Father");
                        } else if (genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Daughter-Father");
                        } else if (genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Son-MOther");
                        } else if (genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("Daughter-Mother");
                        }
                    } else if (((firstcng == true & secondcng == false) || (firstcng == true & secondcng == true)) & ((fatherOf.get(firstname).equals(SecondName)) || (motherOf.get(firstname).equals(SecondName)))) {
                        if (secondcng == true & genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-MotherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("f") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-FatherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLaw-FatherInLaw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("m") & fatherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLaw-MotherInLaw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-MOtherInLAw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("f") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("SonInLaw-FatherInLAw");
                        } else if (secondcng == false & genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLAw-MotherInLAw");
                        } else if (secondcng == true & genderOf.get(firstname).equals("m") & motherOf.get(firstname).equals(SecondName)) {
                            relation.setText("DaughterInLAw-FatherInLAw");
                        }

                    } else {
                        if (firstcng == false & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Uncle");
                            }
                        } else if (firstcng == false & secondcng == true) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Uncle");
                            }
                        } //bower family add kora baki...
                        else if (firstcng == true) {
                            if (secondcng == true) {
                                SecondName = spause.get(SecondName);
                            }
                            if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("NephewInLaw-UncleInLaw");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("NephewInLaw-UncleInLaw");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("NeiceInLaw-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("NephewInLaw-AntyInLaw");
                            }

                        }
                    }

                } else if ((maxfirstlvl - maxsecondlvl) == -1) {
                    if (secondcng == false & ((fatherOf.get(SecondName).equals(firstname)) || (motherOf.get(SecondName).equals(firstname)))) {
                        if (firstcng == true) {
                            firstname = spause.get(firstname);
                        }
                        if (genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Father-Son");
                        } else if (genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Father-Daughter");
                        } else if (genderOf.get(SecondName).equals("m") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MOther-Son");
                        } else if (genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("Mother-Daughter");
                        }
                    } else if (((firstcng == false & secondcng == true) || (firstcng == true & secondcng == true)) & ((fatherOf.get(SecondName).equals(firstname)) || (motherOf.get(SecondName).equals(firstname)))) {
                        if (firstcng == false & genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLaw-SonInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLaw-SonInLaw");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLaw-DaughterInLaw-");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("m") & fatherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLaw-DaughterInLaw-");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MOtherInLAw-SonInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLAw-SonInLaw");
                        } else if (firstcng == false & genderOf.get(SecondName).equals("m") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("MotherInLAw-DaughterInLaw");
                        } else if (firstcng == true & genderOf.get(SecondName).equals("f") & motherOf.get(SecondName).equals(firstname)) {
                            relation.setText("FatherInLAw-SonInLaw");
                        }
                    } else {
                        if (firstcng == false & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Uncle-Nephew");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("ANTY-Nephew");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Anty-Neice");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Uncle-Neice");
                            }
                        } else if (firstcng == true & secondcng == false) {
                            if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Nephew-Uncle");
                            } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Nephew-ANTY");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                                relation.setText("Neice-Anty");
                            } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                                relation.setText("Neice-Uncle");
                            }
                        } //bower family add kora baki...
                        else if (secondcng == true) {
                            if (firstcng == true) {
                                firstname = spause.get(firstname);
                            }
                            if (genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                                relation.setText("UncleInLaw-NephewInLaw");
                            } else if (genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                                relation.setText("UncleInLaw-NeiceInLaw");
                            } else if (genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("f")) {
                                relation.setText("-AntyInLaw-NeiceInLaw");
                            } else if (genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("f")) {
                                relation.setText("AntyInLaw-NephewInLaw");
                            }

                        }
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == 2) {
                    if (secondcng == true) {
                        SecondName = spause.get(SecondName);
                    }

                    if (firstcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandSon-GrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandSonInLaw-GrandFather");
                    } else if (firstcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("Granddaughter-GrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandDaughterInLaw-GrandFather");
                    } else if (firstcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandSon-GrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandSonInLaw-GrandMother");
                    } else if (firstcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("Granddaughter-GrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandDaughterInLaw-GrandMother");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == -2) {
                    if (firstcng == true) {
                        firstname = spause.get(firstname);
                    }
                    if (secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandFather-GrandSon");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandFather-GrandSonInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandFather-Granddaugher");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandFather-GrandDaughterInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandMother-Granddaughter");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandMother-GranddaughterInLaw");
                    } else if (secondcng == false & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandMother-GrandSon");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandMother-GrandSonInLaw");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == 3) {
                    if (secondcng == true) {
                        SecondName = spause.get(SecondName);
                    }

                    if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandSon-GrandGrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandSonInLaw-GrandGrandFather");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGranddaughter-GrandGrandFather");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandDaughterInLaw-GrandGrandFather");
                    } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandSon-GrandGrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandSonInLaw-GrandGrandMother");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGranddaughter-GrandGrandMother");
                    } else if (firstcng == true & genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandDaughterInLaw-GrandGrandMother");
                    }
                } else if ((maxfirstlvl - maxsecondlvl) == -3) {
                    if (firstcng == true) {
                        firstname = spause.get(firstname);
                    }
                    if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandFather-GRANDGrandSon");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("f") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandGrandFather-GrandGrandSonInLaw");
                    } else if (genderOf.get(firstname).equals("m") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandFather-GrandGranddaugher");
                    } else if (secondcng == true & genderOf.get(SecondName).equals("m") & genderOf.get(firstname).equals("m")) {
                        relation.setText("GrandGrandFather-GrandGrandDaughterInLaw");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandMother-GrandGranddaughter");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandMother-GrandGranddaughterInLaw");
                    } else if (genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("m")) {
                        relation.setText("GrandGrandMother-GrandGrandSon");
                    } else if (secondcng == true & genderOf.get(firstname).equals("f") & genderOf.get(SecondName).equals("f")) {
                        relation.setText("GrandGrandMother-GrandGrandSonInLaw");
                    }
                }
            }
            jTextField3.setText("");
            jTextField5.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES or from DIFFERENT FAMILY, TRY AGAIN");
            jTextField3.setText("");
            jTextField5.setText("");
            //System.out.println("Exepsadkfg");
        }}
      else {
            JOptionPane.showMessageDialog(null, "please fill the || Head OF the Family TextField ||, TRY AGAIN");
            jTextField3.setText("");
            jTextField5.setText("");
           
      } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // TODO add your handling code here:
        if(firstfamily==true){
        String x;
        BufferedReader br;
        int j = 0;
        String a = "Information was not provided", name = fathername.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }
                if (parts[0].equals(name)) {
                    a = parts[1];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[1];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("Information was not provided") & j == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES , TRY AGAIN");
            fathername.setText("");
        } else {
            a = a.toUpperCase();

            showfather.setText(a);
            fathername.setText("");
        }}
       else if(secondfamily==true){
        String x;
        BufferedReader br;
        int j = 0;
        String a = "Information was not provided", name = fathername.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }
                if (parts[0].equals(name)) {
                    a = parts[1];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[1];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("Information was not provided") & j == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES , TRY AGAIN");
            fathername.setText("");
        } else {
            a = a.toUpperCase();

            showfather.setText(a);
            fathername.setText("");
        }}
       else{
            JOptionPane.showMessageDialog(null, "please fill the || Head OF the Family TextField ||, TRY AGAIN");fathername.setText("");
       } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      if(firstfamily==true){  String x;
        BufferedReader br;
        int j = 0;
        String a = "Information was not provided", name = mothername.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[2];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[2];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("Information was not provided") & j == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES, TRY AGAIN");
            mothername.setText("");
        } else {
            a = a.toUpperCase();
            showmother.setText(a);
            mothername.setText("");
        }}
     else if(secondfamily==true){  String x;
        BufferedReader br;
        int j = 0;
        String a = "Information was not provided", name = mothername.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[2];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    j = 1;
                }

                if (parts[0].equals(name)) {
                    a = parts[2];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("Information was not provided") & j == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES, TRY AGAIN");
            mothername.setText("");
        } else {
            a = a.toUpperCase();
            showmother.setText(a);
            mothername.setText("");
        }}
      else{
           JOptionPane.showMessageDialog(null, "please fill the || Head OF the Family TextField ||, TRY AGAIN");  mothername.setText("");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
      if(firstfamily==true){  String x;
        BufferedReader br;
        int j = 0;
        String a = "UnMarried", name = spausename.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
        int c = 0;
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name)) {
                    c = 1;
                }
                if (parts[1].equals(name)) {
                    a = parts[2];
                } else if (parts[2].equals(name)) {
                    a = parts[1];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name)) {
                    c = 1;
                }
                if (parts[1].equals(name)) {
                    a = parts[2];
                } else if (parts[2].equals(name)) {
                    a = parts[1];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("UnMarried") & c == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES or Information was not provided, TRY AGAIN");
            spausename.setText("");
        } else {
            a = a.toUpperCase();
            showspause.setText(a);
            spausename.setText("");
        }}
     else  if(secondfamily==true){  String x;
        BufferedReader br;
        int j = 0;
        String a = "UnMarried", name = spausename.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        int c = 0;
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name)) {
                    c = 1;
                }
                if (parts[1].equals(name)) {
                    a = parts[2];
                } else if (parts[2].equals(name)) {
                    a = parts[1];
                }

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name)) {
                    c = 1;
                }
                if (parts[1].equals(name)) {
                    a = parts[2];
                } else if (parts[2].equals(name)) {
                    a = parts[1];
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (a.equals("UnMarried") & c == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES or Information was not provided, TRY AGAIN");
            spausename.setText("");
        } else {
            a = a.toUpperCase();
            showspause.setText(a);
            spausename.setText("");
        }}
     
        else{
           JOptionPane.showMessageDialog(null, "please fill the || Head OF the Family TextField ||, TRY AGAIN");spausename.setText("");
       
     }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
if(firstfamily==true){        String x;
        BufferedReader br;
        int j = 0;
        String name = childrens.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
        int c = 0;
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    c = 1;
                }

                if (parts[1].equals(name)) {
                    j++;
                } else if (parts[2].equals(name)) {
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    c = 1;
                }

                if (parts[1].equals(name)) {
                    j++;
                } else if (parts[2].equals(name)) {
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (j == 0 & c == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES, TRY AGAIN");
            showchild.setText("");
        } else {
            childrens.setText("");
            String l = Integer.toString(j);
            showchild.setText(l);
        }}
else if(secondfamily==true){        String x;
        BufferedReader br;
        int j = 0;
        String name = childrens.getText();
        name = name.toLowerCase();
        String line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        int c = 0;
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    c = 1;
                }

                if (parts[1].equals(name)) {
                    j++;
                } else if (parts[2].equals(name)) {
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        try {
            line = "E:/NetBeansProjects/JavaProject/newDATA.txt";
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String parts[] = x.split(" ");
                if (parts[0].equals(name) || parts[1].equals(name) || parts[2].equals(name)) {
                    c = 1;
                }

                if (parts[1].equals(name)) {
                    j++;
                } else if (parts[2].equals(name)) {
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        if (j == 0 & c == 0) {
            JOptionPane.showMessageDialog(null, "INVALID OR MISSPELLED NAMES, TRY AGAIN");
            showchild.setText("");
        } else {
            childrens.setText("");
            String l = Integer.toString(j);
            showchild.setText(l);
        }}
else{
     JOptionPane.showMessageDialog(null, "please fill the || Head OF the Family TextField ||, TRY AGAIN");childrens.setText("");
      
}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         String x; firstfamily=false;secondfamily=false;
        BufferedReader br;
        int j = 0;String [] namem= new String[100];String [] namef= new String[100];String [] name1m= new String[100];String [] name1f= new String[100];
        String line = "E:/NetBeansProjects/JavaProject/DATA.txt";
       
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String part[]=x.split(" ");
                namem[f1]=part[1];f1++;namef[f2]=part[2];f2++;
               fathersrh.put(part[0],part[1]);
               mothersrh.put(part[0],part[2]);
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        for(int i=0;i<f1;i++){
            if((fathersrh.get(namem[i])==null)&(fathersrh.get(namef[i])==null)){
                 headmale1=namem[i];
                 headfemale1=namef[i];
            }
        }
        line = "E:/NetBeansProjects/JavaProject/newfamilyDATA.txt";
        fathersrh.clear();mothersrh.clear();
        try {
            br = new BufferedReader(new FileReader(line));
            while ((x = br.readLine()) != null) {
                //  System.out.println(x);
                String part[]=x.split(" ");
                name1m[s1]=part[1];s1++;name1f[s2]=part[2];s2++;
               fathersrh.put(part[0],part[1]);
               mothersrh.put(part[0],part[2]);
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION ");
        }
        for(int i=0;i<s1;i++){
            if((fathersrh.get(name1m[i])==null)&(fathersrh.get(name1f[i])==null)){
                 headmale2=name1m[i];
                 headfemale2=name1f[i];
            }
        }
        String name= headname.getText();name=name.toLowerCase();
        if(name.equals(headmale1)||name.equals(headfemale1)){
            firstfamily=true;System.out.println("sdjfg>>>> "+firstfamily);}
        else if(name.equals(headmale2)||name.equals(headfemale2)){
            secondfamily=true;System.out.println("weryiweryi<<<<<"+secondfamily);}
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void headnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headnameActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }
    String headmale1,headfemale1,headmale2,headfemale2;
    BufferedReader br = null; Boolean firstfamily=false,secondfamily=false;Integer f1=0,f2=0,s1=0,s2=0;
    HashMap<String, String> spause = new HashMap<>();
    HashMap<String, String> father = new HashMap<>();
    HashMap<String, String> fatherOf = new HashMap<>();
    HashMap<String, String> motherOf = new HashMap<>();
    HashMap<String, String> genderOf = new HashMap<>();
    HashMap<String, String> fathersrh = new HashMap<>();
    HashMap<String, String> mothersrh = new HashMap<>();
    HashMap<String, String> genderOf2 = new HashMap<>();
    HashMap<String, String> spause2 = new HashMap<>();
    HashMap<String, String> sonof = new HashMap<>();

    String[] names = new String[100];
    int i = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField childrens;
    private javax.swing.JTextField fathername;
    private javax.swing.JTextField headname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField mothername;
    private javax.swing.JTextField relation;
    private javax.swing.JTextField showchild;
    private javax.swing.JTextField showfather;
    private javax.swing.JTextField showmother;
    private javax.swing.JTextField showspause;
    private javax.swing.JTextField spausename;
    // End of variables declaration//GEN-END:variables
}
