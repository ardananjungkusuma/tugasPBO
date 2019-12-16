package projectakhir;

import GameTebakTebakan.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author ardan & wahyu
 */
public class AppFoodTruck extends javax.swing.JFrame {
    
    FoodTruck jam = new FoodTruck();
    FoodTruck foodChurros = new FoodTruck();
    FoodTruck foodTaiwanChick = new FoodTruck();
    FoodTruck drinkThaiTea = new FoodTruck();
    Makanan churros = new Makanan();
    Makanan taiwanChick = new Makanan();
    Minuman thaiTea = new Minuman();
    
    String info;
    int randomIdBuy = (int) (Math.random() * 1000);
    TebakGame tebakGame = new TebakGame();
    int tebakan;
    int jumlahtebakan = 5;
    boolean dapetDiskon;
    
    //polimorfisme
    Pembeli pembeliBiasa = new PembeliBiasa();
    Pembeli pembeliDiskon = new PembeliDiskon();
    
    double totalHarga, finalHarga;

    public FoodTruck getJam() {
        return jam;
    }

    public void setJam(FoodTruck jam) {
        this.jam = jam;
    }

    public FoodTruck getFoodChurros() {
        return foodChurros;
    }

    public void setFoodChurros(FoodTruck foodChurros) {
        this.foodChurros = foodChurros;
    }

    public FoodTruck getFoodTaiwanChick() {
        return foodTaiwanChick;
    }

    public void setFoodTaiwanChick(FoodTruck foodTaiwanChick) {
        this.foodTaiwanChick = foodTaiwanChick;
    }

    public FoodTruck getDrinkThaiTea() {
        return drinkThaiTea;
    }

    public void setDrinkThaiTea(FoodTruck drinkThaiTea) {
        this.drinkThaiTea = drinkThaiTea;
    }

    public Pembeli getPembeliBiasa() {
        return pembeliBiasa;
    }

    public Pembeli getPembeliDiskon() {
        return pembeliDiskon;
    }

    public void setPembeliBiasa(PembeliBiasa pembeliBiasa) {
        this.pembeliBiasa = pembeliBiasa;
    }

    public void setPembeliDiskon(PembeliDiskon pembeliDiskon) {
        this.pembeliDiskon = pembeliDiskon;
    }

    public Makanan getChurros() {
        return churros;
    }

    public void setChurros(Makanan churros) {
        this.churros = churros;
    }

    public Makanan getTaiwanChick() {
        return taiwanChick;
    }

    public void setTaiwanChick(Makanan taiwanChick) {
        this.taiwanChick = taiwanChick;
    }

    public Minuman getThaiTea() {
        return thaiTea;
    }

    public void setThaiTea(Minuman thaiTea) {
        this.thaiTea = thaiTea;
    }

    public TebakGame getTebakGame() {
        return tebakGame;
    }

    public void setTebakGame(TebakGame tebakGame) {
        this.tebakGame = tebakGame;
    }

    public AppFoodTruck() {
        initComponents();
        
        //jam buka jam tutup
        jam.setJamBuka("10.00");
        jam.setJamTutup("21.00");
        txtJamBuka.setText(jam.getJamBuka());
        txtJamTutup.setText(jam.getJamTutup());
        
        //aggregasi
        foodChurros.setMakanan(churros);
        foodTaiwanChick.setMakanan(taiwanChick);
        drinkThaiTea.setMinuman(thaiTea);
        jButtonTotalPrice.setEnabled(false);
        
        //fungsi button group agar hanya bisa dichecklist 1 saja dari ketiga menu
        ButtonGroup groupSizeTaiwanChick = new ButtonGroup();
        ButtonGroup groupRasaChurros = new ButtonGroup();
        ButtonGroup groupSizeChurros = new ButtonGroup();
        ButtonGroup groupRasaTaiwanChick = new ButtonGroup();
        ButtonGroup groupRasaThaiTea = new ButtonGroup();
        ButtonGroup groupTopping = new ButtonGroup();

        //fungsi idPembelianDanGame untuk merandom id pembelian dan id game
        int idPembelianDanGame = randomIdBuy;
        
        //fungsinya untuk set angka random, String.valueOf fungsinya untuk mengkonversi idPembelianGame menjadi String
        idPemesanan.setText(String.valueOf(idPembelianDanGame));
        idPemesanan1.setText(String.valueOf(idPembelianDanGame));
        
        
        jTextAreaOrder.setEditable(false);
        jRButtonCokelat.setEnabled(false);
        jRButtonOreo.setEnabled(false);
        jRButtonVanila.setEnabled(false);
        jRadioButtonChocolate.setEnabled(false);
        jRadioButtonGreentea.setEnabled(false);
        jRadioButtonLadaHitam.setEnabled(false);
        jRadioButtonMacha.setEnabled(false);
        jRadioButtonPedasBadai.setEnabled(false);
        jRadioButtonPedasSantuy.setEnabled(false);
        jRadioButtonSmallC.setEnabled(false);
        jRadioButtonSmallT.setEnabled(false);
        jTextTebakanAnda.setEditable(false);
        jRadioButtonMediumC.setEnabled(false);
        jRadioButtonMediumT.setEnabled(false);
        jRadioButtonLargeC.setEnabled(false);
        jRadioButtonLargeT.setEnabled(false);
        jRadioButtonSusu.setEnabled(false);
        jRadioButtonOreo.setEnabled(false);

        //fungsi untuk menggroupkan button button
        groupRasaChurros.add(jRButtonCokelat);
        groupRasaChurros.add(jRButtonVanila);
        groupRasaChurros.add(jRButtonOreo);
        groupSizeChurros.add(jRadioButtonLargeC);
        groupSizeChurros.add(jRadioButtonMediumC);
        groupSizeChurros.add(jRadioButtonSmallC);
        groupRasaTaiwanChick.add(jRadioButtonPedasBadai);
        groupRasaTaiwanChick.add(jRadioButtonPedasSantuy);
        groupRasaTaiwanChick.add(jRadioButtonLadaHitam);
        groupSizeTaiwanChick.add(jRadioButtonSmallT);
        groupSizeTaiwanChick.add(jRadioButtonMediumT);
        groupSizeTaiwanChick.add(jRadioButtonLargeT);
        groupRasaThaiTea.add(jRadioButtonGreentea);
        groupRasaThaiTea.add(jRadioButtonChocolate);
        groupRasaThaiTea.add(jRadioButtonMacha);
        groupTopping.add(jRadioButtonSusu);
        groupTopping.add(jRadioButtonOreo);
        
        //item listener berfungsi untuk mengecek setiap checkbox (sudah dicentang atau belum)
        jCheckBoxChurros.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    jRButtonCokelat.setEnabled(true);
                    jRButtonOreo.setEnabled(true);
                    jRButtonVanila.setEnabled(true);
                    jRadioButtonSmallC.setEnabled(true);
                    jRadioButtonMediumC.setEnabled(true);
                    jRadioButtonLargeC.setEnabled(true);
                } else {
                    jRButtonCokelat.setEnabled(false);
                    jRButtonOreo.setEnabled(false);
                    jRButtonVanila.setEnabled(false);
                    jRadioButtonSmallC.setEnabled(false);
                    jRadioButtonMediumC.setEnabled(false);
                    jRadioButtonLargeC.setEnabled(false);
                    groupRasaChurros.clearSelection();
                    groupSizeChurros.clearSelection();
                }
            }
        });
        
        jCheckBoxTaiwanChicken.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    jRadioButtonLadaHitam.setEnabled(true);
                    jRadioButtonPedasBadai.setEnabled(true);
                    jRadioButtonPedasSantuy.setEnabled(true);
                    jRadioButtonSmallT.setEnabled(true);
                    jRadioButtonMediumT.setEnabled(true);
                    jRadioButtonLargeT.setEnabled(true);
                } else {
                    jRadioButtonLadaHitam.setEnabled(false);
                    jRadioButtonPedasBadai.setEnabled(false);
                    jRadioButtonPedasSantuy.setEnabled(false);
                    jRadioButtonSmallT.setEnabled(false);
                    jRadioButtonMediumT.setEnabled(false);
                    jRadioButtonLargeT.setEnabled(false);
                    groupSizeTaiwanChick.clearSelection();
                    groupRasaTaiwanChick.clearSelection();
                }
            }
        });
        
        jCheckBoxThaiTea.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    jRadioButtonChocolate.setEnabled(true);
                    jRadioButtonGreentea.setEnabled(true);
                    jRadioButtonMacha.setEnabled(true);
                    jRadioButtonSusu.setEnabled(true);
                    jRadioButtonOreo.setEnabled(true);
                } else {
                    jRadioButtonChocolate.setEnabled(false);
                    jRadioButtonGreentea.setEnabled(false);
                    jRadioButtonMacha.setEnabled(false);
                    jRadioButtonSusu.setEnabled(false);
                    jRadioButtonOreo.setEnabled(false);
                    groupRasaThaiTea.clearSelection();
                    groupTopping.clearSelection();
                }
            }
        });
        jButtonTebak.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHarga = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtJamBuka = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtJamTutup = new javax.swing.JLabel();
        jPanelPemesanan = new javax.swing.JPanel();
        idPemesanan = new javax.swing.JLabel();
        jCheckBoxChurros = new javax.swing.JCheckBox();
        jCheckBoxThaiTea = new javax.swing.JCheckBox();
        jCheckBoxTaiwanChicken = new javax.swing.JCheckBox();
        jRButtonCokelat = new javax.swing.JRadioButton();
        jRButtonVanila = new javax.swing.JRadioButton();
        jRButtonOreo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonPedasBadai = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonLadaHitam = new javax.swing.JRadioButton();
        jRadioButtonPedasSantuy = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonGreentea = new javax.swing.JRadioButton();
        jRadioButtonChocolate = new javax.swing.JRadioButton();
        jRadioButtonMacha = new javax.swing.JRadioButton();
        jButtonOrderNow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOrder = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonTotalPrice = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButtonSmallC = new javax.swing.JRadioButton();
        jRadioButtonMediumC = new javax.swing.JRadioButton();
        jRadioButtonLargeC = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButtonSmallT = new javax.swing.JRadioButton();
        jRadioButtonMediumT = new javax.swing.JRadioButton();
        jRadioButtonLargeT = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonOreo = new javax.swing.JRadioButton();
        jRadioButtonSusu = new javax.swing.JRadioButton();
        jPanelGame = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idPemesanan1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButtonMulai = new javax.swing.JButton();
        jTextTebakanAnda = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabelCluedanJawaban = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelKesempatan = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabelIsiTebakanAnda = new javax.swing.JLabel();
        jButtonTebak = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        kunciJawaban = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lezaad FoodTruck App");

        jPanelHarga.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("\"Lezaad FoodTruck Menu\"");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("1. Churros");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel15.setText("Rasa : Cokelat, Vanilla, Oreo ");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel16.setText("Size Box :");

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 51));
        jLabel20.setText("2. Taiwan Chicken");

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel21.setText("Rasa : Pedas Sekali, Pedas Santuy, Lada Hitam");

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("Small : 10.000   Medium : 15.000  Large : 22.000");

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 51));
        jLabel17.setText("3. Thai Tea");

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("Rasa : Greentea, Chocolate, Macha    10.000");

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setText("Small : 8.000   Medium : 13.000  Large : 18.000");

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("Topping : Oreo, Susu.  Harga Tambah 5.000");

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel30.setText("* Jika Anda Tidak Memilih Rasa Maupun Size Box, ");

        jLabel31.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel31.setText("maka kami set Rasa Cokelat dan Size Small.");

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel32.setText("* Jika Anda Tidak Memilih Rasa Maupun Size Box, ");

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel33.setText("maka kami set Rasa Pedas Santuy dan Size Small.");

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel34.setText("* Kami Set Chocolate Jika Anda Tidak Memilih Rasa.");

        jLabel35.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel35.setText("Size Box :");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/3558109-delivery-dogs-food-hot-street-truck_107840.png"))); // NOI18N

        jLabel38.setText("Jam Operasional : ");

        txtJamBuka.setText("jambuka");

        jLabel40.setText("-");

        txtJamTutup.setText("jamtutup");

        javax.swing.GroupLayout jPanelHargaLayout = new javax.swing.GroupLayout(jPanelHarga);
        jPanelHarga.setLayout(jPanelHargaLayout);
        jPanelHargaLayout.setHorizontalGroup(
            jPanelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHargaLayout.createSequentialGroup()
                .addGroup(jPanelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel17)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)))
                    .addGroup(jPanelHargaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel22))
                    .addGroup(jPanelHargaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2))
                    .addGroup(jPanelHargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJamBuka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJamTutup)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelHargaLayout.setVerticalGroup(
            jPanelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtJamBuka)
                    .addComponent(jLabel40)
                    .addComponent(txtJamTutup))
                .addGap(3, 3, 3)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(1, 1, 1)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(1, 1, 1)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Price List", jPanelHarga);

        jPanelPemesanan.setBackground(new java.awt.Color(153, 204, 255));
        jPanelPemesanan.setForeground(new java.awt.Color(0, 204, 204));

        idPemesanan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        idPemesanan.setForeground(new java.awt.Color(255, 0, 51));
        idPemesanan.setText("ID Pemesanan");

        jCheckBoxChurros.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBoxChurros.setText("Churros");
        jCheckBoxChurros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChurrosActionPerformed(evt);
            }
        });

        jCheckBoxThaiTea.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBoxThaiTea.setText("Thai Tea");
        jCheckBoxThaiTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThaiTeaActionPerformed(evt);
            }
        });

        jCheckBoxTaiwanChicken.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBoxTaiwanChicken.setText("Taiwan Chicken");
        jCheckBoxTaiwanChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTaiwanChickenActionPerformed(evt);
            }
        });

        jRButtonCokelat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRButtonCokelat.setText("Cokelat");

        jRButtonVanila.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRButtonVanila.setText("Vanilla");

        jRButtonOreo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRButtonOreo.setText("Oreo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Rasa :");

        jRadioButtonPedasBadai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonPedasBadai.setText("Pedas Sekali");
        jRadioButtonPedasBadai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPedasBadaiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Rasa :");

        jRadioButtonLadaHitam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonLadaHitam.setText("Lada Hitam");

        jRadioButtonPedasSantuy.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonPedasSantuy.setText("Pedas Santuy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Rasa :");

        jRadioButtonGreentea.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonGreentea.setText("Greentea");

        jRadioButtonChocolate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonChocolate.setText("Chocolate");

        jRadioButtonMacha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonMacha.setText("Macha");

        jButtonOrderNow.setBackground(new java.awt.Color(255, 51, 51));
        jButtonOrderNow.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrderNow.setText("Order Now");
        jButtonOrderNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderNowActionPerformed(evt);
            }
        });

        jTextAreaOrder.setBackground(new java.awt.Color(204, 204, 255));
        jTextAreaOrder.setColumns(20);
        jTextAreaOrder.setRows(5);
        jTextAreaOrder.setText("--Anda Belum Melakukan Pemesanan--");
        jTextAreaOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaOrder);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        jLabel6.setText("Your Order");

        jLabel1.setText("ID Pembelian :");

        jButtonTotalPrice.setBackground(new java.awt.Color(0, 153, 51));
        jButtonTotalPrice.setText("Total Price");
        jButtonTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalPriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("SizeBox :");

        jRadioButtonSmallC.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonSmallC.setText("Small");
        jRadioButtonSmallC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSmallCActionPerformed(evt);
            }
        });

        jRadioButtonMediumC.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonMediumC.setText("Medium");

        jRadioButtonLargeC.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonLargeC.setText("Large");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("SizeBox :");

        jRadioButtonSmallT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonSmallT.setText("Small");
        jRadioButtonSmallT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSmallTActionPerformed(evt);
            }
        });

        jRadioButtonMediumT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonMediumT.setText("Medium");

        jRadioButtonLargeT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonLargeT.setText("Large");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Topping :");

        jRadioButtonOreo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonOreo.setText("Oreo");

        jRadioButtonSusu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonSusu.setText("Susu");

        javax.swing.GroupLayout jPanelPemesananLayout = new javax.swing.GroupLayout(jPanelPemesanan);
        jPanelPemesanan.setLayout(jPanelPemesananLayout);
        jPanelPemesananLayout.setHorizontalGroup(
            jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPemesananLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonSmallT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMediumT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLargeT))
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonPedasBadai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonPedasSantuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLadaHitam)
                        .addGap(30, 30, 30))))
            .addGroup(jPanelPemesananLayout.createSequentialGroup()
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPemesanan))
                    .addComponent(jCheckBoxChurros)
                    .addComponent(jCheckBoxThaiTea)
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonGreentea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonChocolate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMacha))
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonSusu))
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPemesananLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRButtonCokelat))
                                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonSmallC))))
                            .addComponent(jCheckBoxTaiwanChicken))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRButtonVanila)
                            .addComponent(jRadioButtonMediumC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonLargeC)
                            .addComponent(jRButtonOreo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPemesananLayout.createSequentialGroup()
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel6))
                    .addGroup(jPanelPemesananLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOrderNow, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPemesananLayout.setVerticalGroup(
            jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPemesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPemesanan)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxChurros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRButtonCokelat)
                    .addComponent(jRButtonVanila)
                    .addComponent(jRButtonOreo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButtonSmallC)
                    .addComponent(jRadioButtonMediumC)
                    .addComponent(jRadioButtonLargeC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxTaiwanChicken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPedasBadai)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonPedasSantuy)
                    .addComponent(jRadioButtonLadaHitam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jRadioButtonSmallT)
                    .addComponent(jRadioButtonMediumT)
                    .addComponent(jRadioButtonLargeT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxThaiTea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButtonGreentea)
                    .addComponent(jRadioButtonChocolate)
                    .addComponent(jRadioButtonMacha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButtonOreo)
                    .addComponent(jRadioButtonSusu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonOrderNow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTotalPrice)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pemesanan", jPanelPemesanan);

        jPanelGame.setBackground(new java.awt.Color(153, 255, 153));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setText("Game Menebak Angka");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Berhadiah Potongan Harga 50%!!!");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Note : Kesempatan Menebak Hanya 5x");

        jLabel11.setText("ID Game :");

        idPemesanan1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        idPemesanan1.setForeground(new java.awt.Color(255, 0, 51));
        idPemesanan1.setText("ID Pemesanan");

        jLabel18.setText("Masukan Tebakan Anda :");

        jButtonMulai.setBackground(new java.awt.Color(255, 153, 153));
        jButtonMulai.setText("Klik Untuk Mulai Game");
        jButtonMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMulaiActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setText("Hasil : ");

        jLabelCluedanJawaban.setBackground(new java.awt.Color(255, 0, 0));
        jLabelCluedanJawaban.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabelCluedanJawaban.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCluedanJawaban.setText("ANDA AKAN MENDAPATKAN CLUE DISINI");

        jLabel28.setText("Kesempatan Menebak Tersisa :");

        jLabelKesempatan.setBackground(new java.awt.Color(255, 0, 51));
        jLabelKesempatan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelKesempatan.setForeground(new java.awt.Color(255, 0, 51));
        jLabelKesempatan.setText("5");

        jLabel29.setText("Hasil Tebakan Terakhir : ");

        jLabelIsiTebakanAnda.setText("Anda Belum Menebak");

        jButtonTebak.setBackground(new java.awt.Color(0, 153, 153));
        jButtonTebak.setText("SUBMIT TEBAKAN!!!");
        jButtonTebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTebakActionPerformed(evt);
            }
        });

        jLabel27.setText("Kali");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setText("Tebak Angka dari 1-100");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/wait.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGameLayout = new javax.swing.GroupLayout(jPanelGame);
        jPanelGame.setLayout(jPanelGameLayout);
        jPanelGameLayout.setHorizontalGroup(
            jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(122, 122, 122))
            .addGroup(jPanelGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGameLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kunciJawaban))
                    .addGroup(jPanelGameLayout.createSequentialGroup()
                        .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idPemesanan1))
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel7))
                            .addComponent(jLabel9)
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCluedanJawaban))
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKesempatan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButtonTebak, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36)
                            .addGroup(jPanelGameLayout.createSequentialGroup()
                                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIsiTebakanAnda)
                                    .addComponent(jTextTebakanAnda))))
                        .addContainerGap())))
        );
        jPanelGameLayout.setVerticalGroup(
            jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPemesanan1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMulai)
                    .addComponent(kunciJawaban))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabelKesempatan)
                    .addComponent(jLabel27))
                .addGap(10, 10, 10)
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextTebakanAnda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabelIsiTebakanAnda))
                .addGap(8, 8, 8)
                .addComponent(jButtonTebak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCluedanJawaban)
                    .addComponent(jLabel19))
                .addGap(58, 58, 58)
                .addComponent(jLabel37)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dapatkan DISKON 50% !!!", jPanelGame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonSmallTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSmallTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSmallTActionPerformed

    private void jRadioButtonSmallCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSmallCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSmallCActionPerformed

    private void jCheckBoxTaiwanChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTaiwanChickenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTaiwanChickenActionPerformed

    private void jCheckBoxThaiTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThaiTeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxThaiTeaActionPerformed

    private void jCheckBoxChurrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChurrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxChurrosActionPerformed

    private void jRadioButtonPedasBadaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPedasBadaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPedasBadaiActionPerformed

    private void jButtonMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMulaiActionPerformed
        // TODO add your handling code here:
        jButtonTebak.setEnabled(true);
        jTextTebakanAnda.setEditable(true);
        setTebakGame(tebakGame);
        //tebakan untuk mendapat hasil acak angka
        tebakan = getTebakGame().acakAngkanya();
        //jLabelJawaban.setText(String.valueOf(tebakan));Untuk tau jawabannya, kalo sudah fix baru dihapus
        jButtonMulai.setEnabled(false);
    }//GEN-LAST:event_jButtonMulaiActionPerformed

    private void jButtonTebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTebakActionPerformed
        // TODO add your handling code here:
        
        String tebakanTerakhir = jTextTebakanAnda.getText();
        jLabelIsiTebakanAnda.setText(tebakanTerakhir);
        
        String nebak = jTextTebakanAnda.getText();
        
        jumlahtebakan = jumlahtebakan - 1;
        jLabelKesempatan.setText(String.valueOf(jumlahtebakan));
//        kunciJawaban.setText(String.valueOf(tebakan));
        
        if (Integer.parseInt(nebak) == tebakan) {
            if (jumlahtebakan > 0) {
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/win.png")));
                jLabelCluedanJawaban.setText("Selamat Anda Dapat Potongan Harga 50%");
                jTextTebakanAnda.setEnabled(false);
                dapetDiskon = true;
                jButtonTebak.setEnabled(false);
                dapetDiskon = true;
            }
        } else if (Integer.parseInt(nebak) < tebakan) {
            if (jumlahtebakan > 0) {
                jLabelCluedanJawaban.setText("Tebakan Anda Terlalu Kecil!!");
            } else {
                jTextTebakanAnda.setEditable(false);
                jButtonTebak.setEnabled(false);
                jLabelCluedanJawaban.setText("Maaf Anda Gagal Mendapat Diskon 50%");
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/lose.png")));
            }
        } else if (Integer.parseInt(nebak) > tebakan) {
            if (jumlahtebakan > 0) {
                jLabelCluedanJawaban.setText("Tebakan Anda Terlalu Besar!!");
            } else {
                jTextTebakanAnda.setEditable(false);
                jButtonTebak.setEnabled(false);
                jLabelCluedanJawaban.setText("Maaf Anda Gagal Mendapat Diskon 50%");
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/lose.png")));
            }
        } else {
            if (jumlahtebakan > 0) {
                jLabelCluedanJawaban.setText("Masukan Angka Saja (1-100)");
            } else {
                jTextTebakanAnda.setEditable(false);
                jButtonTebak.setEnabled(false);
                jLabelCluedanJawaban.setText("Maaf Anda Gagal Mendapat Diskon 50%");
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/lose.png")));
            }
        }
    }//GEN-LAST:event_jButtonTebakActionPerformed

    private void jButtonOrderNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderNowActionPerformed
        // TODO add your handling code here:
        jButtonTotalPrice.setEnabled(true);
        if (jCheckBoxChurros.isSelected()) {
            if (jRButtonCokelat.isSelected()) {
                foodChurros.getMakanan().setRasa("Cokelat");
            } else if (jRButtonOreo.isSelected()) {
                foodChurros.getMakanan().setRasa("Oreo");
            } else if (jRButtonVanila.isSelected()) {
                foodChurros.getMakanan().setRasa("Vanilla");
            } else {
                foodChurros.getMakanan().setRasa("Cokelat");
            }
            if (jRadioButtonLargeC.isSelected()) {
                foodChurros.getMakanan().setSize("Large");
                foodChurros.getMakanan().setHarga(22000);
            } else if (jRadioButtonMediumC.isSelected()) {
                foodChurros.getMakanan().setSize("Medium");
                foodChurros.getMakanan().setHarga(15000);
            } else if (jRadioButtonSmallC.isSelected()) {
                foodChurros.getMakanan().setSize("Small");
                foodChurros.getMakanan().setHarga(10000);
            } else {
                foodChurros.getMakanan().setSize("Small");
                foodChurros.getMakanan().setHarga(10000);
            }

        } else {
            foodChurros.getMakanan().setHarga(0);
        }

        if (jCheckBoxTaiwanChicken.isSelected()) {
            if (jRadioButtonPedasBadai.isSelected()) {
                foodTaiwanChick.getMakanan().setRasa("Pedas Badai");
            } else if (jRadioButtonPedasSantuy.isSelected()) {
                foodTaiwanChick.getMakanan().setRasa("Pedas Santuy");
            } else if (jRadioButtonLadaHitam.isSelected()) {
                foodTaiwanChick.getMakanan().setRasa("Lada Hitam");
            } else {
                foodTaiwanChick.getMakanan().setRasa("Pedas Santuy");
            }
            if (jRadioButtonSmallT.isSelected()) {
                foodTaiwanChick.getMakanan().setSize("Small");
                foodTaiwanChick.getMakanan().setHarga(8000);
            } else if (jRadioButtonMediumT.isSelected()) {
                foodTaiwanChick.getMakanan().setSize("Medium");
                foodTaiwanChick.getMakanan().setHarga(13000);
            } else if (jRadioButtonLargeT.isSelected()) {
                foodTaiwanChick.getMakanan().setSize("Large");
                foodTaiwanChick.getMakanan().setHarga(18000);
            } else {
                foodTaiwanChick.getMakanan().setSize("Small");
                foodTaiwanChick.getMakanan().setHarga(8000);
            }
        } else {
            foodTaiwanChick.getMakanan().setHarga(0);
        }

        if (jCheckBoxThaiTea.isSelected()) {
            if (jRadioButtonGreentea.isSelected()) {
                //aggregasi
                drinkThaiTea.getMinuman().setRasa("Green Tea");
                drinkThaiTea.getMinuman().setHarga(10000);
            } else if (jRadioButtonChocolate.isSelected()) {
                drinkThaiTea.getMinuman().setRasa("Chocolate");
                drinkThaiTea.getMinuman().setHarga(10000);
            } else if (jRadioButtonMacha.isSelected()) {
                drinkThaiTea.getMinuman().setRasa("Macha");
                drinkThaiTea.getMinuman().setHarga(10000);
            } else {
                drinkThaiTea.getMinuman().setRasa("Chocolate");
                drinkThaiTea.getMinuman().setHarga(10000);
            }
            if (jRadioButtonSusu.isSelected()) {
                drinkThaiTea.getMinuman().setTopping("Susu");
                drinkThaiTea.getMinuman().setHarga(15000);
            } else if (jRadioButtonOreo.isSelected()) {
                drinkThaiTea.getMinuman().setTopping("Oreo");
                drinkThaiTea.getMinuman().setHarga(15000);
            } else {
            }
        } else {
            drinkThaiTea.getMinuman().setHarga(0);
        }

        if (jCheckBoxThaiTea.isSelected() == false && jCheckBoxChurros.isSelected() == false && jCheckBoxTaiwanChicken.isSelected() == false) {
            info = "Pesen Terlebih Dahulu";
            jTextAreaOrder.setText(info);

        } else {
            info = "-----Pesanan Anda-----\n";
            if (jCheckBoxChurros.isSelected() || jCheckBoxTaiwanChicken.isSelected() || jCheckBoxThaiTea.isSelected()) {
                info += "Makanan : \n";
                if (jCheckBoxChurros.isSelected()) {
                    info += "~~Churros Rasa " + foodChurros.getMakanan().getRasa() + ", Size " + foodChurros.getMakanan().getSize() + "\n";
                }
                if (jCheckBoxTaiwanChicken.isSelected()) {
                    info += "~~Taiwan Chick Rasa " + foodTaiwanChick.getMakanan().getRasa() + ", Size " + foodTaiwanChick.getMakanan().getSize() + "\n";
                }
                if (jCheckBoxThaiTea.isSelected()) {
                    info += "Minuman : \n";
                    if(drinkThaiTea.getMinuman().getTopping() == null){
                             info += "~~Thai Tea " + drinkThaiTea.getMinuman().getRasa() + " Tidak Pake Topping ";    
                            }else{
                        info += "~~Thai Tea " + drinkThaiTea.getMinuman().getRasa() + " " +drinkThaiTea.getMinuman().getTopping();    
                    }
                    
                            
                }
            }
            jTextAreaOrder.setText(info);
        }

    }//GEN-LAST:event_jButtonOrderNowActionPerformed
    public void hasilBayar(IBayar b) {
        if (b instanceof PembeliBiasa) {
            //casting object
            PembeliBiasa pb = (PembeliBiasa) b;
            finalHarga = pb.bayarSekarang(totalHarga);

        } else if (b instanceof PembeliDiskon) {
            //casting object
            PembeliDiskon pd = (PembeliDiskon) b;
            finalHarga = pd.bayarSekarang(totalHarga);
        }
    }

    private void jButtonTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalPriceActionPerformed
        // TODO add your handling code here:
        totalHarga = thaiTea.getHarga() + taiwanChick.getHarga() + churros.getHarga();
        //polimor calling method
        if (dapetDiskon == true) {
            hasilBayar(pembeliDiskon);
        } else {
            hasilBayar(pembeliBiasa);
        }
        info = "Rincian Harga Final\nTotal Harga Awal : Rp. " + totalHarga + "\n";
        info += "Total Harga Bayar : Rp. " + finalHarga;
        JOptionPane.showMessageDialog(this, info);
    }//GEN-LAST:event_jButtonTotalPriceActionPerformed

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
            java.util.logging.Logger.getLogger(AppFoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFoodTruck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idPemesanan;
    private javax.swing.JLabel idPemesanan1;
    private javax.swing.JButton jButtonMulai;
    private javax.swing.JButton jButtonOrderNow;
    private javax.swing.JButton jButtonTebak;
    private javax.swing.JButton jButtonTotalPrice;
    private javax.swing.JCheckBox jCheckBoxChurros;
    private javax.swing.JCheckBox jCheckBoxTaiwanChicken;
    private javax.swing.JCheckBox jCheckBoxThaiTea;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCluedanJawaban;
    private javax.swing.JLabel jLabelIsiTebakanAnda;
    private javax.swing.JLabel jLabelKesempatan;
    private javax.swing.JPanel jPanelGame;
    private javax.swing.JPanel jPanelHarga;
    private javax.swing.JPanel jPanelPemesanan;
    private javax.swing.JRadioButton jRButtonCokelat;
    private javax.swing.JRadioButton jRButtonOreo;
    private javax.swing.JRadioButton jRButtonVanila;
    private javax.swing.JRadioButton jRadioButtonChocolate;
    private javax.swing.JRadioButton jRadioButtonGreentea;
    private javax.swing.JRadioButton jRadioButtonLadaHitam;
    private javax.swing.JRadioButton jRadioButtonLargeC;
    private javax.swing.JRadioButton jRadioButtonLargeT;
    private javax.swing.JRadioButton jRadioButtonMacha;
    private javax.swing.JRadioButton jRadioButtonMediumC;
    private javax.swing.JRadioButton jRadioButtonMediumT;
    private javax.swing.JRadioButton jRadioButtonOreo;
    private javax.swing.JRadioButton jRadioButtonPedasBadai;
    private javax.swing.JRadioButton jRadioButtonPedasSantuy;
    private javax.swing.JRadioButton jRadioButtonSmallC;
    private javax.swing.JRadioButton jRadioButtonSmallT;
    private javax.swing.JRadioButton jRadioButtonSusu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaOrder;
    private javax.swing.JTextField jTextTebakanAnda;
    private javax.swing.JLabel kunciJawaban;
    private javax.swing.JLabel txtJamBuka;
    private javax.swing.JLabel txtJamTutup;
    // End of variables declaration//GEN-END:variables
}