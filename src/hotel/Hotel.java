package hotel;

import hotel.dbase.Db;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Hotel extends javax.swing.JFrame {

    static Login login;
    String KullanıcıAdi;
    DefaultTableModel personelModel;
    int p_status = 0;

    public Hotel() {

        PersonelerGenerate();
        initComponents();
        Generate();
    }

    public void Generate() {
        //Start
        head.setText("Anasayfa");
        //article.add(pageAnasayfa);
        article.repaint();
        article.revalidate();
    }

    public void PersonelerGenerate() {
        //model
        personelModel = new DefaultTableModel();
        Object[] cols = {
            "Adı",
            "Soyadı",
            "Kullanıcı Adı",
            "Tc Kimlik",
            "Telefon",
            "Email",
            "Not",
            "Personel_Yetki"
        };
        personelModel.setColumnIdentifiers(cols);
        //connnection
        Db.Connnect();
        ResultSet rs = Db.Find("SELECT * FROM personels");
        try {
            while (rs.next()) {
                Object[] rows = {
                    rs.getString("personel_adi"),
                    rs.getString("personel_soyadi"),
                    rs.getString("kullanici_adi"),
                    rs.getString("personel_tc"),
                    rs.getString("personel_tel"),
                    rs.getString("personel_email"),
                    rs.getString("personel_not"),
                    rs.getString("personel_yetki")
                };
                personelModel.addRow(rows);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        misafirler = new javax.swing.JButton();
        rezervasyonlar = new javax.swing.JButton();
        odalar = new javax.swing.JButton();
        personaller = new javax.swing.JButton();
        anasayfa = new javax.swing.JButton();
        navbar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        authority = new javax.swing.JLabel();
        article = new javax.swing.JPanel();
        PagePersoneller = new javax.swing.JPanel();
        view_1 = new javax.swing.JButton();
        personellerArticle = new javax.swing.JPanel();
        personelScroll = new javax.swing.JScrollPane();
        personellerTable = new javax.swing.JTable();
        personelAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        personel_adi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        personel_soyadi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        personel_not = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        personel_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        personel_tel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        personel_tc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        personel_yetki = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        personel_add = new javax.swing.JButton();
        add_1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        head = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(236, 236, 236)));

        misafirler.setBackground(new java.awt.Color(255, 255, 255));
        misafirler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_reception_40px_1.png"))); // NOI18N
        misafirler.setContentAreaFilled(false);
        misafirler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        misafirler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misafirlerActionPerformed(evt);
            }
        });

        rezervasyonlar.setBackground(new java.awt.Color(255, 255, 255));
        rezervasyonlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_calendar_40px_2.png"))); // NOI18N
        rezervasyonlar.setContentAreaFilled(false);
        rezervasyonlar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rezervasyonlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervasyonlarActionPerformed(evt);
            }
        });

        odalar.setBackground(new java.awt.Color(255, 255, 255));
        odalar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_insomnia_40px.png"))); // NOI18N
        odalar.setContentAreaFilled(false);
        odalar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odalarActionPerformed(evt);
            }
        });

        personaller.setBackground(new java.awt.Color(255, 255, 255));
        personaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_working_with_a_laptop_40px_1.png"))); // NOI18N
        personaller.setContentAreaFilled(false);
        personaller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personallerActionPerformed(evt);
            }
        });

        anasayfa.setBackground(new java.awt.Color(255, 255, 255));
        anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_home_40px_1.png"))); // NOI18N
        anasayfa.setContentAreaFilled(false);
        anasayfa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(misafirler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rezervasyonlar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personaller, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anasayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(misafirler, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rezervasyonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(odalar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personaller, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        navbar.setBackground(new java.awt.Color(255, 255, 255));
        navbar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(236, 236, 236)));
        navbar.setPreferredSize(new java.awt.Dimension(0, 60));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/logo.png"))); // NOI18N
        logo.setText("jLabel7");

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_name_40px_1.png"))); // NOI18N
        profile.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 60, 60));

        name.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Şükrü Taha Bıyık");
        profile.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, 30));

        authority.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        authority.setForeground(new java.awt.Color(218, 61, 101));
        authority.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        authority.setText("(Yönetici)");
        profile.add(authority, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 390, 20));

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        article.setBackground(new java.awt.Color(255, 255, 255));
        article.setLayout(new java.awt.CardLayout());

        PagePersoneller.setBackground(new java.awt.Color(255, 255, 255));

        view_1.setBackground(new java.awt.Color(255, 255, 255));
        view_1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        view_1.setForeground(new java.awt.Color(255, 255, 255));
        view_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_table_30px.png"))); // NOI18N
        view_1.setActionCommand("Personel Ekle");
        view_1.setBorder(null);
        view_1.setContentAreaFilled(false);
        view_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_1.setOpaque(true);
        view_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_1ActionPerformed(evt);
            }
        });

        personellerArticle.setBackground(new java.awt.Color(255, 255, 255));
        personellerArticle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(236, 236, 236)));
        personellerArticle.setLayout(new java.awt.CardLayout());

        personellerTable.setModel(personelModel);
        personelScroll.setViewportView(personellerTable);

        personellerArticle.add(personelScroll, "card2");

        personelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Adı");

        personel_adi.setText(" ");
        personel_adi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        jLabel2.setText("Soyadı");

        personel_soyadi.setText(" ");
        personel_soyadi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));
        personel_soyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_soyadiActionPerformed(evt);
            }
        });

        jLabel3.setText("Şifre");

        jLabel4.setText("Kullanıcı Adı");

        kullanici_adi.setText(" ");
        kullanici_adi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        jLabel5.setText("Not");

        personel_not.setText(" ");
        personel_not.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        jLabel6.setText("Email Adresi");

        personel_email.setText(" ");
        personel_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        jLabel7.setText("Telefon Numarası");

        personel_tel.setText(" ");
        personel_tel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        jLabel8.setText("TC Kimlik Numarası");

        personel_tc.setText(" ");
        personel_tc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));
        personel_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_tcActionPerformed(evt);
            }
        });

        jLabel9.setText("Yetki");

        personel_yetki.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personel", "Yönetici" }));
        personel_yetki.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        personel_add.setText("Ekle");
        personel_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personelAddLayout = new javax.swing.GroupLayout(personelAdd);
        personelAdd.setLayout(personelAddLayout);
        personelAddLayout.setHorizontalGroup(
            personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personelAddLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(personelAddLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(personel_yetki, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_not, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personel_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personelAddLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(password))))))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        personelAddLayout.setVerticalGroup(
            personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personelAddLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_adi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_not, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(personel_yetki))
                .addGap(18, 18, 18)
                .addComponent(personel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        personellerArticle.add(personelAdd, "card3");

        add_1.setBackground(new java.awt.Color(255, 255, 255));
        add_1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add_1.setForeground(new java.awt.Color(255, 255, 255));
        add_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_add_new_30px.png"))); // NOI18N
        add_1.setActionCommand("Personel Ekle");
        add_1.setBorder(null);
        add_1.setContentAreaFilled(false);
        add_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_1.setOpaque(true);
        add_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagePersonellerLayout = new javax.swing.GroupLayout(PagePersoneller);
        PagePersoneller.setLayout(PagePersonellerLayout);
        PagePersonellerLayout.setHorizontalGroup(
            PagePersonellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagePersonellerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagePersonellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(view_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personellerArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PagePersonellerLayout.setVerticalGroup(
            PagePersonellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagePersonellerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(view_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(personellerArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        article.add(PagePersoneller, "card2");

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(236, 236, 236)));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/images/icons8_export_30px.png"))); // NOI18N
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        head.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(59, 82, 109));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(article, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(article, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RemovePage() {
        head.setText("");
        article.removeAll();
        article.repaint();
        article.revalidate();
    }
    private void misafirlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misafirlerActionPerformed
        RemovePage();
        head.setText("Misafirler");
        //article.add(pageMisafirler);
        article.repaint();
        article.revalidate();
    }//GEN-LAST:event_misafirlerActionPerformed

    private void anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaActionPerformed
        RemovePage();
        head.setText("Anasayfa");
        //article.add(pageAnasayfa);
        article.repaint();
        article.revalidate();
    }//GEN-LAST:event_anasayfaActionPerformed

    private void rezervasyonlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezervasyonlarActionPerformed
        RemovePage();
        head.setText("Rezarvasyonlar");
        //article.add(pageRezervasyonlar);
        article.repaint();
        article.revalidate();
    }//GEN-LAST:event_rezervasyonlarActionPerformed

    private void odalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odalarActionPerformed
        RemovePage();
        head.setText("Odalar");
        //article.add(pageOdalar);
        article.repaint();
        article.revalidate();
    }//GEN-LAST:event_odalarActionPerformed

    private void personallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personallerActionPerformed
        RemovePage();
        head.setText("Personeller");
        article.add(PagePersoneller);
        article.repaint();
        article.revalidate();

    }//GEN-LAST:event_personallerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        login = new Login();
        login.setVisible(true);
        login.result = false;
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void view_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_1ActionPerformed
        personellerArticle.removeAll();
        personellerArticle.repaint();
        personellerArticle.revalidate();
        //
        personellerArticle.add(personelScroll);
        personellerArticle.repaint();
        personellerArticle.revalidate();
    }//GEN-LAST:event_view_1ActionPerformed

    private void add_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_1ActionPerformed
        p_status = 0;
//
        personel_adi.setText("");
        personel_soyadi.setText("");
        kullanici_adi.setText("");
        password.setText("");
        personel_tc.setText("");
        personel_tel.setText("");
        personel_email.setText("");
        personel_not.setText("");
        personel_yetki.setSelectedIndex(0);
        //
        personellerArticle.removeAll();
        personellerArticle.repaint();
        personellerArticle.revalidate();
        //
        personellerArticle.add(personelAdd);
        personellerArticle.repaint();
        personellerArticle.revalidate();
    }//GEN-LAST:event_add_1ActionPerformed

    private void personel_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_tcActionPerformed

    private void personel_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_addActionPerformed
        String p_adi = personel_adi.getText();
        String p_soyadi = personel_soyadi.getText();
        String kadi = kullanici_adi.getText();
        String pass = password.getText();
        String p_tc = personel_tc.getText();
        String p_tel = personel_tel.getText();
        String p_email = personel_email.getText();
        String p_not = personel_not.getText();
        int p_yetki = personel_yetki.getSelectedIndex();
        //adding
        String into = "(personel_adi,personel_soyadi,kullanici_adi,password,personel_tc,personel_tel,personel_email,personel_not,personel_yetki)";
        String values = "('" + p_adi + "'," + "'" + p_soyadi + "',"
                + "'" + kadi + "'," + "'" + pass + "'," + "'" + p_tc + "',"
                + "'" + p_tel + "'," + "'" + p_email + "'," + "'" + p_not + "',"
                + "'" + p_yetki + "')";
        String sql = "INSERT INTO personels " + into + " VALUES " + values;
        Db.Add(sql);
        Object[] o = {p_adi, p_soyadi, kadi, pass, p_tc, p_tel, p_email, p_not, p_yetki+""};
        personelModel.addRow(o);
        personellerArticle.removeAll();
        personellerArticle.repaint();
        personellerArticle.revalidate();
        //
        personellerArticle.add(personelScroll);
        personellerArticle.repaint();
        personellerArticle.revalidate();
    }//GEN-LAST:event_personel_addActionPerformed

    private void personel_soyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_soyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_soyadiActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        login = new Login();
        if (login.result) {
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Hotel().setVisible(true);
                }
            });
        } else {
            login.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PagePersoneller;
    private javax.swing.JButton add_1;
    private javax.swing.JButton anasayfa;
    private javax.swing.JPanel article;
    private javax.swing.JLabel authority;
    private javax.swing.JPanel bg;
    private javax.swing.JButton exit;
    private javax.swing.JLabel head;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JLabel logo;
    private javax.swing.JButton misafirler;
    private javax.swing.JLabel name;
    private javax.swing.JPanel navbar;
    private javax.swing.JButton odalar;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton personaller;
    private javax.swing.JPanel personelAdd;
    private javax.swing.JScrollPane personelScroll;
    private javax.swing.JButton personel_add;
    private javax.swing.JTextField personel_adi;
    private javax.swing.JTextField personel_email;
    private javax.swing.JTextField personel_not;
    private javax.swing.JTextField personel_soyadi;
    private javax.swing.JTextField personel_tc;
    private javax.swing.JTextField personel_tel;
    private javax.swing.JComboBox<String> personel_yetki;
    private javax.swing.JPanel personellerArticle;
    private javax.swing.JTable personellerTable;
    private javax.swing.JLabel photo;
    private javax.swing.JPanel profile;
    private javax.swing.JButton rezervasyonlar;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton view_1;
    // End of variables declaration//GEN-END:variables

}
