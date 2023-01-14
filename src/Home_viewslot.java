/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static main.Home_bookslot.txtcarplateno;
/**
 *
 * @author Dell
 */
public class Home_viewslot extends javax.swing.JFrame {

    /**
     * Creates new form Home_viewslot
     */
    public Home_viewslot() {
        initComponents();
    }
    
    static PreparedStatement pst;
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/minorproject1", "root","Diksha@1503");
            System.out.println("Connection done successfully");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
    
    
    
    public static void changeSlotColor(){
        //Border border = BorderFactory.createLineBorder(Color.GREEN,1);
        //s1.setBorder(border);
        //s1.setOpaque(true);
        //s1.setBackgro(new java.awt.Color(102, 255, 102));
        //s1.setVisible(true);
        try{
            String c = txtcarplateno.getText();
            int value = Integer.parseInt(c);
            String query = "select SlotNo from Slots where CarPlateNo ='"+value+"'";
            pst = Home_bookslot.connect().prepareStatement(query);
            ResultSet rs1 = pst.executeQuery(query);
            int slot = 0;
            while(rs1.next()){
                slot = rs1.getInt("SlotNo");
            }
            System.out.println("slotname : "+ slot);   
            switch(slot){
                case 1:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    b.setOpaque(true);
                    p3.setOpaque(true);
                    cc.setOpaque(true);
                    p4.setOpaque(true);
                    d.setOpaque(true);
                    p5.setOpaque(true);
                    e.setOpaque(true);
                    p6.setOpaque(true);
                    f.setOpaque(true);
                    p7.setOpaque(true);
                    s1.setOpaque(true);
                    //s1.setBackground(new java.awt.Color(102, 255, 102));
                    break;
                case 2:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    o.setOpaque(true);
                    p15.setOpaque(true);
                    s2.setOpaque(true);
                    //s2.setBorder(border);
                    break;
                case 3:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    b.setOpaque(true);
                    p3.setOpaque(true);
                    cc.setOpaque(true);
                    p4.setOpaque(true);
                    d.setOpaque(true);
                    p5.setOpaque(true);
                    e.setOpaque(true);
                    p6.setOpaque(true);
                    f.setOpaque(true);
                    p7.setOpaque(true);
                    g.setOpaque(true);
                    s3.setOpaque(true);
                    break;
                case 4:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    o.setOpaque(true);
                    p15.setOpaque(true);
                    pp.setOpaque(true);
                    p16.setOpaque(true);
                    s4.setOpaque(true);
                    break;
                case 5:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    b.setOpaque(true);
                    p3.setOpaque(true);
                    cc.setOpaque(true);
                    p4.setOpaque(true);
                    d.setOpaque(true);
                    p5.setOpaque(true);
                    e.setOpaque(true);
                    p6.setOpaque(true);
                    f.setOpaque(true);
                    p7.setOpaque(true);
                    g.setOpaque(true);
                    p8.setOpaque(true);
                    h.setOpaque(true);
                    p9.setOpaque(true);
                    i.setOpaque(true);
                    p10.setOpaque(true);
                    s5.setOpaque(true);
                    break;
                case 6:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    o.setOpaque(true);
                    p15.setOpaque(true);
                    pp.setOpaque(true);
                    p16.setOpaque(true);
                    q.setOpaque(true);
                    p17.setOpaque(true);
                    r.setOpaque(true);
                    p18.setOpaque(true);
                    s6.setOpaque(true);
                    break;
                case 7:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    b.setOpaque(true);
                    p3.setOpaque(true);
                    cc.setOpaque(true);
                    p4.setOpaque(true);
                    d.setOpaque(true);
                    p5.setOpaque(true);
                    e.setOpaque(true);
                    p6.setOpaque(true);
                    f.setOpaque(true);
                    p7.setOpaque(true);
                    g.setOpaque(true);
                    p8.setOpaque(true);
                    h.setOpaque(true);
                    p9.setOpaque(true);
                    i.setOpaque(true);
                    p10.setOpaque(true);
                    j.setOpaque(true);
                    p11.setOpaque(true);
                    s7.setOpaque(true);
                    break;
                case 8:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    a.setOpaque(true);
                    p2.setOpaque(true);
                    o.setOpaque(true);
                    p15.setOpaque(true);
                    pp.setOpaque(true);
                    p16.setOpaque(true);
                    q.setOpaque(true);
                    p17.setOpaque(true);
                    r.setOpaque(true);
                    p18.setOpaque(true);
                    s.setOpaque(true);
                    p19.setOpaque(true);
                    s8.setOpaque(true);
                    break;
                case 9:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    z12.setOpaque(true);
                    p24.setOpaque(true);
                    s9.setOpaque(true);
                    //s9.setBorder(border);
                    break;
                case 10:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    u.setOpaque(true);
                    p26.setOpaque(true);
                    v.setOpaque(true);
                    p27.setOpaque(true);
                    w.setOpaque(true);
                    p28.setOpaque(true);
                    x.setOpaque(true);
                    p29.setOpaque(true);
                    y.setOpaque(true);
                    p30.setOpaque(true);
                    s10.setOpaque(true);
                    break;
                case 11:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    z12.setOpaque(true);
                    p24.setOpaque(true);
                    z11.setOpaque(true);
                    p23.setOpaque(true);
                    s11.setOpaque(true);
                    break;
                case 12:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    u.setOpaque(true);
                    p26.setOpaque(true);
                    v.setOpaque(true);
                    p27.setOpaque(true);
                    w.setOpaque(true);
                    p28.setOpaque(true);
                    x.setOpaque(true);
                    p29.setOpaque(true);
                    y.setOpaque(true);
                    p30.setOpaque(true);
                    z.setOpaque(true);
                    p31.setOpaque(true);
                    s12.setOpaque(true);
                    break;
                case 13:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    z12.setOpaque(true);
                    p24.setOpaque(true);
                    z11.setOpaque(true);
                    p23.setOpaque(true);
                    z10.setOpaque(true);
                    p22.setOpaque(true);
                    z8.setOpaque(true);
                    p21.setOpaque(true);
                    s13.setOpaque(true);
                    break;
                case 14:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    u.setOpaque(true);
                    p26.setOpaque(true);
                    v.setOpaque(true);
                    p27.setOpaque(true);
                    w.setOpaque(true);
                    p28.setOpaque(true);
                    x.setOpaque(true);
                    p29.setOpaque(true);
                    y.setOpaque(true);
                    p30.setOpaque(true);
                    z.setOpaque(true);
                    p31.setOpaque(true);
                    z1.setOpaque(true);
                    p32.setOpaque(true);
                    z2.setOpaque(true);
                    p33.setOpaque(true);
                    s14.setOpaque(true);
                    break;
                case 15:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    z12.setOpaque(true);
                    p24.setOpaque(true);
                    z11.setOpaque(true);
                    p23.setOpaque(true);
                    z10.setOpaque(true);
                    p22.setOpaque(true);
                    z8.setOpaque(true);
                    p21.setOpaque(true);
                    z9.setOpaque(true);
                    p20.setOpaque(true);
                    s15.setOpaque(true);
                    break;
                case 16:
                    System.out.println("slot "+slot+" is green");
                    p0.setOpaque(true);
                    p1.setOpaque(true);
                    t.setOpaque(true);
                    p25.setOpaque(true);
                    u.setOpaque(true);
                    p26.setOpaque(true);
                    v.setOpaque(true);
                    p27.setOpaque(true);
                    w.setOpaque(true);
                    p28.setOpaque(true);
                    x.setOpaque(true);
                    p29.setOpaque(true);
                    y.setOpaque(true);
                    p30.setOpaque(true);
                    z.setOpaque(true);
                    p31.setOpaque(true);
                    z1.setOpaque(true);
                    p32.setOpaque(true);
                    z2.setOpaque(true);
                    p33.setOpaque(true);
                    z3.setOpaque(true);
                    p34.setOpaque(true);
                    s16.setOpaque(true);
                    break;
                default:
                    System.out.println("not working :(");
                //break;
            }
        }
        catch(SQLException e1){
            e1.printStackTrace();    
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

        huehue = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        entry = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        s1 = new javax.swing.JPanel();
        S1 = new javax.swing.JLabel();
        s2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        s4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        s9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        s3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        s10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        s11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        s12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        s5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        s6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        s8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        s7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        s13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        s15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        s14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        s16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        p0 = new javax.swing.JPanel();
        p14 = new javax.swing.JPanel();
        p32 = new javax.swing.JPanel();
        p23 = new javax.swing.JPanel();
        p9 = new javax.swing.JPanel();
        p15 = new javax.swing.JPanel();
        p13 = new javax.swing.JPanel();
        p21 = new javax.swing.JPanel();
        p35 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p24 = new javax.swing.JPanel();
        p8 = new javax.swing.JPanel();
        p22 = new javax.swing.JPanel();
        p7 = new javax.swing.JPanel();
        p12 = new javax.swing.JPanel();
        p37 = new javax.swing.JPanel();
        p25 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        p27 = new javax.swing.JPanel();
        p29 = new javax.swing.JPanel();
        p26 = new javax.swing.JPanel();
        p28 = new javax.swing.JPanel();
        p30 = new javax.swing.JPanel();
        p18 = new javax.swing.JPanel();
        p19 = new javax.swing.JPanel();
        p20 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        p16 = new javax.swing.JPanel();
        p11 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        p10 = new javax.swing.JPanel();
        p17 = new javax.swing.JPanel();
        p33 = new javax.swing.JPanel();
        p36 = new javax.swing.JPanel();
        p31 = new javax.swing.JPanel();
        p34 = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        a = new javax.swing.JPanel();
        b = new javax.swing.JPanel();
        d = new javax.swing.JPanel();
        e = new javax.swing.JPanel();
        f = new javax.swing.JPanel();
        g = new javax.swing.JPanel();
        h = new javax.swing.JPanel();
        i = new javax.swing.JPanel();
        j = new javax.swing.JPanel();
        k = new javax.swing.JPanel();
        l = new javax.swing.JPanel();
        m = new javax.swing.JPanel();
        n = new javax.swing.JPanel();
        o = new javax.swing.JPanel();
        pp = new javax.swing.JPanel();
        q = new javax.swing.JPanel();
        r = new javax.swing.JPanel();
        s = new javax.swing.JPanel();
        t = new javax.swing.JPanel();
        u = new javax.swing.JPanel();
        v = new javax.swing.JPanel();
        w = new javax.swing.JPanel();
        x = new javax.swing.JPanel();
        y = new javax.swing.JPanel();
        z = new javax.swing.JPanel();
        z1 = new javax.swing.JPanel();
        z2 = new javax.swing.JPanel();
        z3 = new javax.swing.JPanel();
        z4 = new javax.swing.JPanel();
        z5 = new javax.swing.JPanel();
        z6 = new javax.swing.JPanel();
        z7 = new javax.swing.JPanel();
        z8 = new javax.swing.JPanel();
        z9 = new javax.swing.JPanel();
        z10 = new javax.swing.JPanel();
        z11 = new javax.swing.JPanel();
        z12 = new javax.swing.JPanel();
        cc = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(916, 626));

        huehue.setBackground(new java.awt.Color(5, 2, 29));
        huehue.setMaximumSize(new java.awt.Dimension(916, 626));
        huehue.setMinimumSize(new java.awt.Dimension(916, 626));
        huehue.setPreferredSize(new java.awt.Dimension(916, 626));

        jPanel2.setBackground(new java.awt.Color(53, 53, 164));

        jLabel9.setBackground(new java.awt.Color(17, 12, 58));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("< Back");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Slot Path");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(332, 332, 332)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap())
        );

        entry.setBackground(new java.awt.Color(53, 53, 164));
        entry.setForeground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entry");

        javax.swing.GroupLayout entryLayout = new javax.swing.GroupLayout(entry);
        entry.setLayout(entryLayout);
        entryLayout.setHorizontalGroup(
            entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        entryLayout.setVerticalGroup(
            entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        s1.setBackground(new java.awt.Color(51, 255, 102));
        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s1.setForeground(new java.awt.Color(255, 255, 204));
        s1.setOpaque(false);

        S1.setBackground(new java.awt.Color(17, 12, 58));
        S1.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        S1.setForeground(new java.awt.Color(255, 255, 204));
        S1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S1.setText("1");

        javax.swing.GroupLayout s1Layout = new javax.swing.GroupLayout(s1);
        s1.setLayout(s1Layout);
        s1Layout.setHorizontalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        s1Layout.setVerticalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        s2.setBackground(new java.awt.Color(51, 255, 102));
        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s2.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");

        javax.swing.GroupLayout s2Layout = new javax.swing.GroupLayout(s2);
        s2.setLayout(s2Layout);
        s2Layout.setHorizontalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s2Layout.setVerticalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s4.setBackground(new java.awt.Color(51, 255, 102));
        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s4.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("4");

        javax.swing.GroupLayout s4Layout = new javax.swing.GroupLayout(s4);
        s4.setLayout(s4Layout);
        s4Layout.setHorizontalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s4Layout.setVerticalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s9.setBackground(new java.awt.Color(51, 255, 102));
        s9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s9.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9");

        javax.swing.GroupLayout s9Layout = new javax.swing.GroupLayout(s9);
        s9.setLayout(s9Layout);
        s9Layout.setHorizontalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        s9Layout.setVerticalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s3.setBackground(new java.awt.Color(51, 255, 102));
        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s3.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3");

        javax.swing.GroupLayout s3Layout = new javax.swing.GroupLayout(s3);
        s3.setLayout(s3Layout);
        s3Layout.setHorizontalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        s3Layout.setVerticalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s10.setBackground(new java.awt.Color(51, 255, 102));
        s10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s10.setForeground(new java.awt.Color(255, 255, 204));
        s10.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("10");

        javax.swing.GroupLayout s10Layout = new javax.swing.GroupLayout(s10);
        s10.setLayout(s10Layout);
        s10Layout.setHorizontalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s10Layout.setVerticalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s11.setBackground(new java.awt.Color(51, 255, 102));
        s11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s11.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("11");

        javax.swing.GroupLayout s11Layout = new javax.swing.GroupLayout(s11);
        s11.setLayout(s11Layout);
        s11Layout.setHorizontalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        s11Layout.setVerticalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s12.setBackground(new java.awt.Color(51, 255, 102));
        s12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s12.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("12");

        javax.swing.GroupLayout s12Layout = new javax.swing.GroupLayout(s12);
        s12.setLayout(s12Layout);
        s12Layout.setHorizontalGroup(
            s12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s12Layout.setVerticalGroup(
            s12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s5.setBackground(new java.awt.Color(51, 255, 102));
        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s5.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("5");

        javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
        s5.setLayout(s5Layout);
        s5Layout.setHorizontalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        s5Layout.setVerticalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s6.setBackground(new java.awt.Color(51, 255, 102));
        s6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s6.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("6");

        javax.swing.GroupLayout s6Layout = new javax.swing.GroupLayout(s6);
        s6.setLayout(s6Layout);
        s6Layout.setHorizontalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        s6Layout.setVerticalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s8.setBackground(new java.awt.Color(51, 255, 102));
        s8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s8.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("8");

        javax.swing.GroupLayout s8Layout = new javax.swing.GroupLayout(s8);
        s8.setLayout(s8Layout);
        s8Layout.setHorizontalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        s8Layout.setVerticalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s7.setBackground(new java.awt.Color(51, 255, 102));
        s7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s7.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("7");

        javax.swing.GroupLayout s7Layout = new javax.swing.GroupLayout(s7);
        s7.setLayout(s7Layout);
        s7Layout.setHorizontalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        s7Layout.setVerticalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s13.setBackground(new java.awt.Color(51, 255, 102));
        s13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s13.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("13");

        javax.swing.GroupLayout s13Layout = new javax.swing.GroupLayout(s13);
        s13.setLayout(s13Layout);
        s13Layout.setHorizontalGroup(
            s13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        s13Layout.setVerticalGroup(
            s13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        s15.setBackground(new java.awt.Color(51, 255, 102));
        s15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s15.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("15");

        javax.swing.GroupLayout s15Layout = new javax.swing.GroupLayout(s15);
        s15.setLayout(s15Layout);
        s15Layout.setHorizontalGroup(
            s15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s15Layout.setVerticalGroup(
            s15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s14.setBackground(new java.awt.Color(51, 255, 102));
        s14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s14.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("14");

        javax.swing.GroupLayout s14Layout = new javax.swing.GroupLayout(s14);
        s14.setLayout(s14Layout);
        s14Layout.setHorizontalGroup(
            s14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        s14Layout.setVerticalGroup(
            s14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        s16.setBackground(new java.awt.Color(51, 255, 102));
        s16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 17, 52), 4));
        s16.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("16");

        javax.swing.GroupLayout s16Layout = new javax.swing.GroupLayout(s16);
        s16.setLayout(s16Layout);
        s16Layout.setHorizontalGroup(
            s16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(s16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        s16Layout.setVerticalGroup(
            s16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, s16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        p0.setBackground(new java.awt.Color(51, 255, 51));
        p0.setMaximumSize(new java.awt.Dimension(7, 7));
        p0.setMinimumSize(new java.awt.Dimension(7, 7));
        p0.setName(""); // NOI18N
        p0.setOpaque(false);
        p0.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p0Layout = new javax.swing.GroupLayout(p0);
        p0.setLayout(p0Layout);
        p0Layout.setHorizontalGroup(
            p0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p0Layout.setVerticalGroup(
            p0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p14.setBackground(new java.awt.Color(51, 255, 51));
        p14.setMaximumSize(new java.awt.Dimension(7, 7));
        p14.setMinimumSize(new java.awt.Dimension(7, 7));
        p14.setOpaque(false);
        p14.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p14Layout = new javax.swing.GroupLayout(p14);
        p14.setLayout(p14Layout);
        p14Layout.setHorizontalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p14Layout.setVerticalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p32.setBackground(new java.awt.Color(51, 255, 51));
        p32.setMaximumSize(new java.awt.Dimension(7, 7));
        p32.setMinimumSize(new java.awt.Dimension(7, 7));
        p32.setOpaque(false);
        p32.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p32Layout = new javax.swing.GroupLayout(p32);
        p32.setLayout(p32Layout);
        p32Layout.setHorizontalGroup(
            p32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p32Layout.setVerticalGroup(
            p32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p23.setBackground(new java.awt.Color(51, 255, 51));
        p23.setMaximumSize(new java.awt.Dimension(7, 7));
        p23.setMinimumSize(new java.awt.Dimension(7, 7));
        p23.setOpaque(false);
        p23.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p23Layout = new javax.swing.GroupLayout(p23);
        p23.setLayout(p23Layout);
        p23Layout.setHorizontalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p23Layout.setVerticalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p9.setBackground(new java.awt.Color(51, 255, 51));
        p9.setMaximumSize(new java.awt.Dimension(7, 7));
        p9.setMinimumSize(new java.awt.Dimension(7, 7));
        p9.setOpaque(false);
        p9.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p15.setBackground(new java.awt.Color(51, 255, 51));
        p15.setMaximumSize(new java.awt.Dimension(7, 7));
        p15.setMinimumSize(new java.awt.Dimension(7, 7));
        p15.setOpaque(false);
        p15.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p15Layout = new javax.swing.GroupLayout(p15);
        p15.setLayout(p15Layout);
        p15Layout.setHorizontalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p15Layout.setVerticalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p13.setBackground(new java.awt.Color(51, 255, 51));
        p13.setMaximumSize(new java.awt.Dimension(7, 7));
        p13.setMinimumSize(new java.awt.Dimension(7, 7));
        p13.setOpaque(false);
        p13.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p21.setBackground(new java.awt.Color(51, 255, 51));
        p21.setMaximumSize(new java.awt.Dimension(7, 7));
        p21.setMinimumSize(new java.awt.Dimension(7, 7));
        p21.setOpaque(false);
        p21.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p21Layout = new javax.swing.GroupLayout(p21);
        p21.setLayout(p21Layout);
        p21Layout.setHorizontalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p21Layout.setVerticalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p35.setBackground(new java.awt.Color(51, 255, 51));
        p35.setMaximumSize(new java.awt.Dimension(7, 7));
        p35.setMinimumSize(new java.awt.Dimension(7, 7));
        p35.setOpaque(false);
        p35.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p35Layout = new javax.swing.GroupLayout(p35);
        p35.setLayout(p35Layout);
        p35Layout.setHorizontalGroup(
            p35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p35Layout.setVerticalGroup(
            p35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p2.setBackground(new java.awt.Color(51, 255, 51));
        p2.setMaximumSize(new java.awt.Dimension(7, 7));
        p2.setMinimumSize(new java.awt.Dimension(7, 7));
        p2.setOpaque(false);
        p2.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p3.setBackground(new java.awt.Color(51, 255, 51));
        p3.setMaximumSize(new java.awt.Dimension(7, 7));
        p3.setMinimumSize(new java.awt.Dimension(7, 7));
        p3.setOpaque(false);
        p3.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p4.setBackground(new java.awt.Color(51, 255, 51));
        p4.setMaximumSize(new java.awt.Dimension(7, 7));
        p4.setMinimumSize(new java.awt.Dimension(7, 7));
        p4.setOpaque(false);
        p4.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p24.setBackground(new java.awt.Color(51, 255, 51));
        p24.setMaximumSize(new java.awt.Dimension(7, 7));
        p24.setMinimumSize(new java.awt.Dimension(7, 7));
        p24.setOpaque(false);
        p24.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p24Layout = new javax.swing.GroupLayout(p24);
        p24.setLayout(p24Layout);
        p24Layout.setHorizontalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p24Layout.setVerticalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p8.setBackground(new java.awt.Color(51, 255, 51));
        p8.setMaximumSize(new java.awt.Dimension(7, 7));
        p8.setMinimumSize(new java.awt.Dimension(7, 7));
        p8.setOpaque(false);
        p8.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p22.setBackground(new java.awt.Color(51, 255, 51));
        p22.setMaximumSize(new java.awt.Dimension(7, 7));
        p22.setMinimumSize(new java.awt.Dimension(7, 7));
        p22.setOpaque(false);
        p22.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p22Layout = new javax.swing.GroupLayout(p22);
        p22.setLayout(p22Layout);
        p22Layout.setHorizontalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p22Layout.setVerticalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p7.setBackground(new java.awt.Color(51, 255, 51));
        p7.setMaximumSize(new java.awt.Dimension(7, 7));
        p7.setMinimumSize(new java.awt.Dimension(7, 7));
        p7.setOpaque(false);
        p7.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p12.setBackground(new java.awt.Color(51, 255, 51));
        p12.setMaximumSize(new java.awt.Dimension(7, 7));
        p12.setMinimumSize(new java.awt.Dimension(7, 7));
        p12.setOpaque(false);
        p12.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p37.setBackground(new java.awt.Color(51, 255, 51));
        p37.setMaximumSize(new java.awt.Dimension(7, 7));
        p37.setMinimumSize(new java.awt.Dimension(7, 7));
        p37.setOpaque(false);
        p37.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p37Layout = new javax.swing.GroupLayout(p37);
        p37.setLayout(p37Layout);
        p37Layout.setHorizontalGroup(
            p37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p37Layout.setVerticalGroup(
            p37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p25.setBackground(new java.awt.Color(51, 255, 51));
        p25.setMaximumSize(new java.awt.Dimension(7, 7));
        p25.setMinimumSize(new java.awt.Dimension(7, 7));
        p25.setOpaque(false);
        p25.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p25Layout = new javax.swing.GroupLayout(p25);
        p25.setLayout(p25Layout);
        p25Layout.setHorizontalGroup(
            p25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p25Layout.setVerticalGroup(
            p25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p1.setBackground(new java.awt.Color(51, 255, 51));
        p1.setOpaque(false);
        p1.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p27.setBackground(new java.awt.Color(51, 255, 51));
        p27.setMaximumSize(new java.awt.Dimension(7, 7));
        p27.setMinimumSize(new java.awt.Dimension(7, 7));
        p27.setOpaque(false);
        p27.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p27Layout = new javax.swing.GroupLayout(p27);
        p27.setLayout(p27Layout);
        p27Layout.setHorizontalGroup(
            p27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p27Layout.setVerticalGroup(
            p27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p29.setBackground(new java.awt.Color(51, 255, 51));
        p29.setMaximumSize(new java.awt.Dimension(7, 7));
        p29.setMinimumSize(new java.awt.Dimension(7, 7));
        p29.setOpaque(false);
        p29.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p29Layout = new javax.swing.GroupLayout(p29);
        p29.setLayout(p29Layout);
        p29Layout.setHorizontalGroup(
            p29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p29Layout.setVerticalGroup(
            p29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p26.setBackground(new java.awt.Color(51, 255, 51));
        p26.setMaximumSize(new java.awt.Dimension(7, 7));
        p26.setMinimumSize(new java.awt.Dimension(7, 7));
        p26.setOpaque(false);
        p26.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p26Layout = new javax.swing.GroupLayout(p26);
        p26.setLayout(p26Layout);
        p26Layout.setHorizontalGroup(
            p26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p26Layout.setVerticalGroup(
            p26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p28.setBackground(new java.awt.Color(51, 255, 51));
        p28.setMaximumSize(new java.awt.Dimension(7, 7));
        p28.setMinimumSize(new java.awt.Dimension(7, 7));
        p28.setOpaque(false);
        p28.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p28Layout = new javax.swing.GroupLayout(p28);
        p28.setLayout(p28Layout);
        p28Layout.setHorizontalGroup(
            p28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p28Layout.setVerticalGroup(
            p28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p30.setBackground(new java.awt.Color(51, 255, 51));
        p30.setMaximumSize(new java.awt.Dimension(7, 7));
        p30.setMinimumSize(new java.awt.Dimension(7, 7));
        p30.setOpaque(false);
        p30.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p30Layout = new javax.swing.GroupLayout(p30);
        p30.setLayout(p30Layout);
        p30Layout.setHorizontalGroup(
            p30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p30Layout.setVerticalGroup(
            p30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p18.setBackground(new java.awt.Color(51, 255, 51));
        p18.setMaximumSize(new java.awt.Dimension(7, 7));
        p18.setMinimumSize(new java.awt.Dimension(7, 7));
        p18.setOpaque(false);
        p18.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p18Layout = new javax.swing.GroupLayout(p18);
        p18.setLayout(p18Layout);
        p18Layout.setHorizontalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p18Layout.setVerticalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p19.setBackground(new java.awt.Color(51, 255, 51));
        p19.setMaximumSize(new java.awt.Dimension(7, 7));
        p19.setMinimumSize(new java.awt.Dimension(7, 7));
        p19.setOpaque(false);
        p19.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p19Layout = new javax.swing.GroupLayout(p19);
        p19.setLayout(p19Layout);
        p19Layout.setHorizontalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p19Layout.setVerticalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p20.setBackground(new java.awt.Color(51, 255, 51));
        p20.setMaximumSize(new java.awt.Dimension(7, 7));
        p20.setMinimumSize(new java.awt.Dimension(7, 7));
        p20.setOpaque(false);
        p20.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p20Layout = new javax.swing.GroupLayout(p20);
        p20.setLayout(p20Layout);
        p20Layout.setHorizontalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p20Layout.setVerticalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p5.setBackground(new java.awt.Color(51, 255, 51));
        p5.setMaximumSize(new java.awt.Dimension(7, 7));
        p5.setMinimumSize(new java.awt.Dimension(7, 7));
        p5.setOpaque(false);
        p5.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p16.setBackground(new java.awt.Color(51, 255, 51));
        p16.setMaximumSize(new java.awt.Dimension(7, 7));
        p16.setMinimumSize(new java.awt.Dimension(7, 7));
        p16.setOpaque(false);
        p16.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p16Layout = new javax.swing.GroupLayout(p16);
        p16.setLayout(p16Layout);
        p16Layout.setHorizontalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p16Layout.setVerticalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p11.setBackground(new java.awt.Color(51, 255, 51));
        p11.setMaximumSize(new java.awt.Dimension(7, 7));
        p11.setMinimumSize(new java.awt.Dimension(7, 7));
        p11.setOpaque(false);
        p11.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p6.setBackground(new java.awt.Color(51, 255, 51));
        p6.setMaximumSize(new java.awt.Dimension(7, 7));
        p6.setMinimumSize(new java.awt.Dimension(7, 7));
        p6.setOpaque(false);
        p6.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p10.setBackground(new java.awt.Color(51, 255, 51));
        p10.setMaximumSize(new java.awt.Dimension(7, 7));
        p10.setMinimumSize(new java.awt.Dimension(7, 7));
        p10.setOpaque(false);
        p10.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p17.setBackground(new java.awt.Color(51, 255, 51));
        p17.setMaximumSize(new java.awt.Dimension(7, 7));
        p17.setMinimumSize(new java.awt.Dimension(7, 7));
        p17.setOpaque(false);
        p17.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p17Layout = new javax.swing.GroupLayout(p17);
        p17.setLayout(p17Layout);
        p17Layout.setHorizontalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p17Layout.setVerticalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p33.setBackground(new java.awt.Color(51, 255, 51));
        p33.setMaximumSize(new java.awt.Dimension(7, 7));
        p33.setMinimumSize(new java.awt.Dimension(7, 7));
        p33.setOpaque(false);
        p33.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p33Layout = new javax.swing.GroupLayout(p33);
        p33.setLayout(p33Layout);
        p33Layout.setHorizontalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p33Layout.setVerticalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p36.setBackground(new java.awt.Color(51, 255, 51));
        p36.setMaximumSize(new java.awt.Dimension(7, 7));
        p36.setMinimumSize(new java.awt.Dimension(7, 7));
        p36.setOpaque(false);
        p36.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p36Layout = new javax.swing.GroupLayout(p36);
        p36.setLayout(p36Layout);
        p36Layout.setHorizontalGroup(
            p36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p36Layout.setVerticalGroup(
            p36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p31.setBackground(new java.awt.Color(51, 255, 51));
        p31.setMaximumSize(new java.awt.Dimension(7, 7));
        p31.setMinimumSize(new java.awt.Dimension(7, 7));
        p31.setOpaque(false);
        p31.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p31Layout = new javax.swing.GroupLayout(p31);
        p31.setLayout(p31Layout);
        p31Layout.setHorizontalGroup(
            p31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        p31Layout.setVerticalGroup(
            p31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        p34.setBackground(new java.awt.Color(51, 255, 51));
        p34.setMaximumSize(new java.awt.Dimension(7, 7));
        p34.setMinimumSize(new java.awt.Dimension(7, 7));
        p34.setOpaque(false);
        p34.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout p34Layout = new javax.swing.GroupLayout(p34);
        p34.setLayout(p34Layout);
        p34Layout.setHorizontalGroup(
            p34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p34Layout.setVerticalGroup(
            p34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        exit.setBackground(new java.awt.Color(53, 53, 164));
        exit.setForeground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Exit");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        a.setBackground(new java.awt.Color(51, 255, 51));
        a.setMaximumSize(new java.awt.Dimension(7, 7));
        a.setMinimumSize(new java.awt.Dimension(7, 7));
        a.setOpaque(false);

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        b.setBackground(new java.awt.Color(51, 255, 51));
        b.setMaximumSize(new java.awt.Dimension(7, 7));
        b.setMinimumSize(new java.awt.Dimension(7, 7));
        b.setName(""); // NOI18N
        b.setOpaque(false);

        javax.swing.GroupLayout bLayout = new javax.swing.GroupLayout(b);
        b.setLayout(bLayout);
        bLayout.setHorizontalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        bLayout.setVerticalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        d.setBackground(new java.awt.Color(51, 255, 51));
        d.setMaximumSize(new java.awt.Dimension(7, 7));
        d.setMinimumSize(new java.awt.Dimension(7, 7));
        d.setOpaque(false);

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        e.setBackground(new java.awt.Color(51, 255, 51));
        e.setMaximumSize(new java.awt.Dimension(7, 7));
        e.setMinimumSize(new java.awt.Dimension(7, 7));
        e.setOpaque(false);

        javax.swing.GroupLayout eLayout = new javax.swing.GroupLayout(e);
        e.setLayout(eLayout);
        eLayout.setHorizontalGroup(
            eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        eLayout.setVerticalGroup(
            eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        f.setBackground(new java.awt.Color(51, 255, 51));
        f.setMaximumSize(new java.awt.Dimension(7, 7));
        f.setMinimumSize(new java.awt.Dimension(7, 7));
        f.setOpaque(false);

        javax.swing.GroupLayout fLayout = new javax.swing.GroupLayout(f);
        f.setLayout(fLayout);
        fLayout.setHorizontalGroup(
            fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        fLayout.setVerticalGroup(
            fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        g.setBackground(new java.awt.Color(51, 255, 51));
        g.setMaximumSize(new java.awt.Dimension(7, 7));
        g.setMinimumSize(new java.awt.Dimension(7, 7));
        g.setOpaque(false);

        javax.swing.GroupLayout gLayout = new javax.swing.GroupLayout(g);
        g.setLayout(gLayout);
        gLayout.setHorizontalGroup(
            gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        gLayout.setVerticalGroup(
            gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        h.setBackground(new java.awt.Color(51, 255, 51));
        h.setOpaque(false);
        h.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout hLayout = new javax.swing.GroupLayout(h);
        h.setLayout(hLayout);
        hLayout.setHorizontalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        hLayout.setVerticalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        i.setBackground(new java.awt.Color(51, 255, 51));
        i.setOpaque(false);
        i.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout iLayout = new javax.swing.GroupLayout(i);
        i.setLayout(iLayout);
        iLayout.setHorizontalGroup(
            iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        iLayout.setVerticalGroup(
            iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        j.setBackground(new java.awt.Color(51, 255, 51));
        j.setOpaque(false);
        j.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        k.setBackground(new java.awt.Color(51, 255, 51));
        k.setOpaque(false);
        k.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout kLayout = new javax.swing.GroupLayout(k);
        k.setLayout(kLayout);
        kLayout.setHorizontalGroup(
            kLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        kLayout.setVerticalGroup(
            kLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        l.setBackground(new java.awt.Color(51, 255, 51));
        l.setOpaque(false);
        l.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout lLayout = new javax.swing.GroupLayout(l);
        l.setLayout(lLayout);
        lLayout.setHorizontalGroup(
            lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        lLayout.setVerticalGroup(
            lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        m.setBackground(new java.awt.Color(51, 255, 51));
        m.setOpaque(false);
        m.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout mLayout = new javax.swing.GroupLayout(m);
        m.setLayout(mLayout);
        mLayout.setHorizontalGroup(
            mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        mLayout.setVerticalGroup(
            mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        n.setBackground(new java.awt.Color(51, 255, 51));
        n.setOpaque(false);
        n.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout nLayout = new javax.swing.GroupLayout(n);
        n.setLayout(nLayout);
        nLayout.setHorizontalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        nLayout.setVerticalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        o.setBackground(new java.awt.Color(51, 255, 51));
        o.setOpaque(false);
        o.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout oLayout = new javax.swing.GroupLayout(o);
        o.setLayout(oLayout);
        oLayout.setHorizontalGroup(
            oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        oLayout.setVerticalGroup(
            oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        pp.setBackground(new java.awt.Color(51, 255, 51));
        pp.setOpaque(false);
        pp.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        q.setBackground(new java.awt.Color(51, 255, 51));
        q.setOpaque(false);
        q.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout qLayout = new javax.swing.GroupLayout(q);
        q.setLayout(qLayout);
        qLayout.setHorizontalGroup(
            qLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        qLayout.setVerticalGroup(
            qLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        r.setBackground(new java.awt.Color(51, 255, 51));
        r.setOpaque(false);
        r.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout rLayout = new javax.swing.GroupLayout(r);
        r.setLayout(rLayout);
        rLayout.setHorizontalGroup(
            rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        rLayout.setVerticalGroup(
            rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        s.setBackground(new java.awt.Color(51, 255, 51));
        s.setOpaque(false);
        s.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout sLayout = new javax.swing.GroupLayout(s);
        s.setLayout(sLayout);
        sLayout.setHorizontalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        sLayout.setVerticalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        t.setBackground(new java.awt.Color(51, 255, 51));
        t.setMaximumSize(new java.awt.Dimension(7, 7));
        t.setMinimumSize(new java.awt.Dimension(7, 7));
        t.setName(""); // NOI18N
        t.setOpaque(false);

        javax.swing.GroupLayout tLayout = new javax.swing.GroupLayout(t);
        t.setLayout(tLayout);
        tLayout.setHorizontalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        tLayout.setVerticalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        u.setBackground(new java.awt.Color(51, 255, 51));
        u.setOpaque(false);
        u.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout uLayout = new javax.swing.GroupLayout(u);
        u.setLayout(uLayout);
        uLayout.setHorizontalGroup(
            uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        uLayout.setVerticalGroup(
            uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        v.setBackground(new java.awt.Color(51, 255, 51));
        v.setOpaque(false);
        v.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout vLayout = new javax.swing.GroupLayout(v);
        v.setLayout(vLayout);
        vLayout.setHorizontalGroup(
            vLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        vLayout.setVerticalGroup(
            vLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        w.setBackground(new java.awt.Color(51, 255, 51));
        w.setOpaque(false);
        w.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout wLayout = new javax.swing.GroupLayout(w);
        w.setLayout(wLayout);
        wLayout.setHorizontalGroup(
            wLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        wLayout.setVerticalGroup(
            wLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        x.setBackground(new java.awt.Color(51, 255, 51));
        x.setOpaque(false);
        x.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout xLayout = new javax.swing.GroupLayout(x);
        x.setLayout(xLayout);
        xLayout.setHorizontalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        xLayout.setVerticalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        y.setBackground(new java.awt.Color(51, 255, 51));
        y.setOpaque(false);
        y.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout yLayout = new javax.swing.GroupLayout(y);
        y.setLayout(yLayout);
        yLayout.setHorizontalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        yLayout.setVerticalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z.setBackground(new java.awt.Color(51, 255, 51));
        z.setOpaque(false);
        z.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout zLayout = new javax.swing.GroupLayout(z);
        z.setLayout(zLayout);
        zLayout.setHorizontalGroup(
            zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        zLayout.setVerticalGroup(
            zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z1.setBackground(new java.awt.Color(51, 255, 51));
        z1.setOpaque(false);
        z1.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z1Layout = new javax.swing.GroupLayout(z1);
        z1.setLayout(z1Layout);
        z1Layout.setHorizontalGroup(
            z1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z1Layout.setVerticalGroup(
            z1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z2.setBackground(new java.awt.Color(51, 255, 51));
        z2.setOpaque(false);
        z2.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z2Layout = new javax.swing.GroupLayout(z2);
        z2.setLayout(z2Layout);
        z2Layout.setHorizontalGroup(
            z2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z2Layout.setVerticalGroup(
            z2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z3.setBackground(new java.awt.Color(51, 255, 51));
        z3.setOpaque(false);
        z3.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z3Layout = new javax.swing.GroupLayout(z3);
        z3.setLayout(z3Layout);
        z3Layout.setHorizontalGroup(
            z3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z3Layout.setVerticalGroup(
            z3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z4.setBackground(new java.awt.Color(51, 255, 51));
        z4.setOpaque(false);
        z4.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z4Layout = new javax.swing.GroupLayout(z4);
        z4.setLayout(z4Layout);
        z4Layout.setHorizontalGroup(
            z4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z4Layout.setVerticalGroup(
            z4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z5.setBackground(new java.awt.Color(51, 255, 51));
        z5.setOpaque(false);
        z5.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z5Layout = new javax.swing.GroupLayout(z5);
        z5.setLayout(z5Layout);
        z5Layout.setHorizontalGroup(
            z5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z5Layout.setVerticalGroup(
            z5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z6.setBackground(new java.awt.Color(51, 255, 51));
        z6.setOpaque(false);
        z6.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z6Layout = new javax.swing.GroupLayout(z6);
        z6.setLayout(z6Layout);
        z6Layout.setHorizontalGroup(
            z6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z6Layout.setVerticalGroup(
            z6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z7.setBackground(new java.awt.Color(51, 255, 51));
        z7.setOpaque(false);
        z7.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z7Layout = new javax.swing.GroupLayout(z7);
        z7.setLayout(z7Layout);
        z7Layout.setHorizontalGroup(
            z7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z7Layout.setVerticalGroup(
            z7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z8.setBackground(new java.awt.Color(51, 255, 51));
        z8.setOpaque(false);
        z8.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z8Layout = new javax.swing.GroupLayout(z8);
        z8.setLayout(z8Layout);
        z8Layout.setHorizontalGroup(
            z8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z8Layout.setVerticalGroup(
            z8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z9.setBackground(new java.awt.Color(51, 255, 51));
        z9.setOpaque(false);
        z9.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z9Layout = new javax.swing.GroupLayout(z9);
        z9.setLayout(z9Layout);
        z9Layout.setHorizontalGroup(
            z9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z9Layout.setVerticalGroup(
            z9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z10.setBackground(new java.awt.Color(51, 255, 51));
        z10.setOpaque(false);
        z10.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z10Layout = new javax.swing.GroupLayout(z10);
        z10.setLayout(z10Layout);
        z10Layout.setHorizontalGroup(
            z10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z10Layout.setVerticalGroup(
            z10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z11.setBackground(new java.awt.Color(51, 255, 51));
        z11.setOpaque(false);
        z11.setPreferredSize(new java.awt.Dimension(7, 7));

        javax.swing.GroupLayout z11Layout = new javax.swing.GroupLayout(z11);
        z11.setLayout(z11Layout);
        z11Layout.setHorizontalGroup(
            z11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z11Layout.setVerticalGroup(
            z11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        z12.setBackground(new java.awt.Color(51, 255, 51));
        z12.setMaximumSize(new java.awt.Dimension(7, 7));
        z12.setMinimumSize(new java.awt.Dimension(7, 7));
        z12.setName(""); // NOI18N
        z12.setOpaque(false);

        javax.swing.GroupLayout z12Layout = new javax.swing.GroupLayout(z12);
        z12.setLayout(z12Layout);
        z12Layout.setHorizontalGroup(
            z12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        z12Layout.setVerticalGroup(
            z12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        cc.setBackground(new java.awt.Color(51, 255, 51));
        cc.setMaximumSize(new java.awt.Dimension(7, 7));
        cc.setMinimumSize(new java.awt.Dimension(7, 7));
        cc.setOpaque(false);

        javax.swing.GroupLayout ccLayout = new javax.swing.GroupLayout(cc);
        cc.setLayout(ccLayout);
        ccLayout.setHorizontalGroup(
            ccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ccLayout.setVerticalGroup(
            ccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout huehueLayout = new javax.swing.GroupLayout(huehue);
        huehue.setLayout(huehueLayout);
        huehueLayout.setHorizontalGroup(
            huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, huehueLayout.createSequentialGroup()
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGap(459, 459, 459)
                                .addComponent(p0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, huehueLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(190, 190, 190)
                                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(p25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(z12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 341, Short.MAX_VALUE))
            .addGroup(huehueLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(s7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(s5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(s3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, huehueLayout.createSequentialGroup()
                        .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(p24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(p17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(p18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(p19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(p26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(p27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(p28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(z7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(p37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(p36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(114, 114, 114))
        );
        huehueLayout.setVerticalGroup(
            huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(huehueLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(p0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(z12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(p23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59))
                                    .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(p30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(p32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(z8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(p33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(p34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(huehueLayout.createSequentialGroup()
                                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(z11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(huehueLayout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addComponent(p31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(huehueLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(z10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(s3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(s11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(s12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(s4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(s13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(huehueLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(s7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(s16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, huehueLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(153, 153, 153))))))
                    .addGroup(huehueLayout.createSequentialGroup()
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(huehueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(huehueLayout.createSequentialGroup()
                                .addComponent(p17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(huehue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(huehue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed

        new Home().show();
    }//GEN-LAST:event_jLabel9MousePressed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_viewslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_viewslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_viewslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_viewslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Home_viewslot obj = new Home_viewslot();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                obj.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel S1;
    public static javax.swing.JPanel a;
    private static javax.swing.JPanel b;
    public static javax.swing.JPanel cc;
    public static javax.swing.JPanel d;
    public static javax.swing.JPanel e;
    private javax.swing.JPanel entry;
    private javax.swing.JPanel exit;
    public static javax.swing.JPanel f;
    public static javax.swing.JPanel g;
    public static javax.swing.JPanel h;
    private javax.swing.JPanel huehue;
    public static javax.swing.JPanel i;
    public static javax.swing.JPanel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel k;
    public static javax.swing.JPanel l;
    public static javax.swing.JPanel m;
    public static javax.swing.JPanel n;
    public static javax.swing.JPanel o;
    private static javax.swing.JPanel p0;
    public static javax.swing.JPanel p1;
    public static javax.swing.JPanel p10;
    public static javax.swing.JPanel p11;
    public static javax.swing.JPanel p12;
    public static javax.swing.JPanel p13;
    public static javax.swing.JPanel p14;
    public static javax.swing.JPanel p15;
    public static javax.swing.JPanel p16;
    public static javax.swing.JPanel p17;
    public static javax.swing.JPanel p18;
    public static javax.swing.JPanel p19;
    public static javax.swing.JPanel p2;
    public static javax.swing.JPanel p20;
    public static javax.swing.JPanel p21;
    public static javax.swing.JPanel p22;
    public static javax.swing.JPanel p23;
    public static javax.swing.JPanel p24;
    public static javax.swing.JPanel p25;
    public static javax.swing.JPanel p26;
    public static javax.swing.JPanel p27;
    public static javax.swing.JPanel p28;
    public static javax.swing.JPanel p29;
    public static javax.swing.JPanel p3;
    public static javax.swing.JPanel p30;
    public static javax.swing.JPanel p31;
    public static javax.swing.JPanel p32;
    public static javax.swing.JPanel p33;
    public static javax.swing.JPanel p34;
    public static javax.swing.JPanel p35;
    public static javax.swing.JPanel p36;
    public static javax.swing.JPanel p37;
    public static javax.swing.JPanel p4;
    public static javax.swing.JPanel p5;
    public static javax.swing.JPanel p6;
    public static javax.swing.JPanel p7;
    public static javax.swing.JPanel p8;
    public static javax.swing.JPanel p9;
    public static javax.swing.JPanel pp;
    public static javax.swing.JPanel q;
    public static javax.swing.JPanel r;
    public static javax.swing.JPanel s;
    public static javax.swing.JPanel s1;
    public static javax.swing.JPanel s10;
    public static javax.swing.JPanel s11;
    public static javax.swing.JPanel s12;
    public static javax.swing.JPanel s13;
    public static javax.swing.JPanel s14;
    public static javax.swing.JPanel s15;
    public static javax.swing.JPanel s16;
    public static javax.swing.JPanel s2;
    public static javax.swing.JPanel s3;
    public static javax.swing.JPanel s4;
    public static javax.swing.JPanel s5;
    public static javax.swing.JPanel s6;
    public static javax.swing.JPanel s7;
    public static javax.swing.JPanel s8;
    public static javax.swing.JPanel s9;
    private static javax.swing.JPanel t;
    public static javax.swing.JPanel u;
    public static javax.swing.JPanel v;
    public static javax.swing.JPanel w;
    public static javax.swing.JPanel x;
    public static javax.swing.JPanel y;
    public static javax.swing.JPanel z;
    public static javax.swing.JPanel z1;
    public static javax.swing.JPanel z10;
    public static javax.swing.JPanel z11;
    private static javax.swing.JPanel z12;
    public static javax.swing.JPanel z2;
    public static javax.swing.JPanel z3;
    public static javax.swing.JPanel z4;
    public static javax.swing.JPanel z5;
    public static javax.swing.JPanel z6;
    public static javax.swing.JPanel z7;
    public static javax.swing.JPanel z8;
    public static javax.swing.JPanel z9;
    // End of variables declaration//GEN-END:variables
}
