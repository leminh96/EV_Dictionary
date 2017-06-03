package Presentation;

import DataAccess.DatabaseAccess;
import Business.Process;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Profile.Section;
import org.ini4j.Wini;
import org.jdesktop.swingx.autocomplete.*;

public class DictionaryGUI extends javax.swing.JFrame 
{
    private boolean flag = true;
    
    public DictionaryGUI() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Words_List = new javax.swing.JList<>();
        Find_Text = new javax.swing.JTextField();
        Favorite_Button = new javax.swing.JButton();
        Language_Button = new javax.swing.JButton();
        Go_Button = new javax.swing.JButton();
        FavList_Button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Content_TextArea = new javax.swing.JTextArea();
        StartDate_Picker = new org.jdesktop.swingx.JXDatePicker();
        EndDate_Picker = new org.jdesktop.swingx.JXDatePicker();
        Statistic_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-V Dictionary");
        setResizable(false);

        Words_List.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(Words_List);

        Find_Text.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Find_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Find_TextKeyPressed(evt);
            }
        });

        Favorite_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/star.png"))); // NOI18N
        Favorite_Button.setToolTipText("Add to favorite");
        Favorite_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Favorite_ButtonMouseClicked(evt);
            }
        });

        Language_Button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Language_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/change.png"))); // NOI18N
        Language_Button.setText("English");
        Language_Button.setToolTipText("Change language");
        Language_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Language_ButtonMouseClicked(evt);
            }
        });

        Go_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/find.png"))); // NOI18N
        Go_Button.setToolTipText("Find");
        Go_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Go_ButtonMouseClicked(evt);
            }
        });

        FavList_Button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        FavList_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/bookmark.png"))); // NOI18N
        FavList_Button.setToolTipText("Favorite List");
        FavList_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FavList_ButtonMouseClicked(evt);
            }
        });

        Content_TextArea.setEditable(false);
        Content_TextArea.setBackground(new java.awt.Color(240, 240, 240));
        Content_TextArea.setColumns(20);
        Content_TextArea.setRows(5);
        Content_TextArea.setBorder(null);
        jScrollPane3.setViewportView(Content_TextArea);

        Statistic_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/chart.png"))); // NOI18N
        Statistic_Button.setToolTipText("Add to favorite");
        Statistic_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Statistic_ButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ENGLISH - VIETNAMESE DICTIONARY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Statistic");

        jLabel3.setText("to");

        jLabel4.setText("© Le Quoc Minh - 2017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Find_Text)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Go_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(EndDate_Picker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(StartDate_Picker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Statistic_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Favorite_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FavList_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Language_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Go_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(Find_Text)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartDate_Picker, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndDate_Picker, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Statistic_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Favorite_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FavList_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(Language_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findWord()
    {
        String value = (String)Find_Text.getText();
        if (flag == true)
        {
            Content_TextArea.setText(DatabaseAccess.getInstance().getHashEMap(value));
        }
        else
        {
            Content_TextArea.setText(DatabaseAccess.getInstance().getHashVMap(value));
        }
        Words_List.setSelectedValue(value, rootPaneCheckingEnabled);
        Content_TextArea.setCaretPosition(0);
        
        try {
            writeIniFile(Find_Text.getText());
        } catch (IOException ex) {
            Logger.getLogger(DictionaryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void clickOnList(int i)
    {
        if (1 == i)
        {
            Words_List.setListData(DatabaseAccess.getInstance().getListEWord());
            Words_List.addMouseListener(new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent e)
                {
                    String value = (String)Words_List.getModel().getElementAt(Words_List.locationToIndex(e.getPoint()));
                    Find_Text.setText(value);
                    Content_TextArea.setText(DatabaseAccess.getInstance().getHashEMap(value));
                    Content_TextArea.setCaretPosition(0);
                }
            });
            
        }
        else
        {
            Words_List.setListData(DatabaseAccess.getInstance().getListVWord());
            Words_List.addMouseListener(new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent e)
                {
                    String value = (String)Words_List.getModel().getElementAt(Words_List.locationToIndex(e.getPoint()));
                    Find_Text.setText(value);
                    Content_TextArea.setText(DatabaseAccess.getInstance().getHashVMap(value));
                    Content_TextArea.setCaretPosition(0);
                }
            });
            
        }
    }
    
    private void Go_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Go_ButtonMouseClicked
        findWord();
    }//GEN-LAST:event_Go_ButtonMouseClicked

    private void Language_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Language_ButtonMouseClicked
        flag = !flag;
        if (flag == true)
        {
            clickOnList(1);
            Language_Button.setText("English");
        }
        else
        {
            Language_Button.setText("Tiếng Việt");
            clickOnList(2);
        }
        
    }//GEN-LAST:event_Language_ButtonMouseClicked

    private void Find_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Find_TextKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER)
        {
            findWord();
        }
    }//GEN-LAST:event_Find_TextKeyPressed

    private void Favorite_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Favorite_ButtonMouseClicked
        String value = Find_Text.getText();
        if (Process.getInstance().isWordInDatabase(value))
        {
            if (flag == true)
            {
                DatabaseAccess.getInstance().getListFavoriteEWord().add(value);
                try 
                {
                    DatabaseAccess.getInstance().writeBinFile();
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(DictionaryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                DatabaseAccess.getInstance().getListFavoriteVWord().add(value);
                try 
                {
                    DatabaseAccess.getInstance().writeBinFile();
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(DictionaryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_Favorite_ButtonMouseClicked

    private void FavList_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavList_ButtonMouseClicked
        if (flag == true)
        {
            Words_List.setListData(DatabaseAccess.getInstance().getListFavoriteEWord());
        }
        else
        {
            Words_List.setListData(DatabaseAccess.getInstance().getListFavoriteVWord());
        }
    }//GEN-LAST:event_FavList_ButtonMouseClicked

    private void Statistic_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Statistic_ButtonMouseClicked
        Date a = StartDate_Picker.getDate();
        Date b = EndDate_Picker.getDate();
        if (a!= null || b!= null)
        {
            readIniFile(a, b);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please insert start date and end date", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Statistic_ButtonMouseClicked

    public static void main(String args[]) throws Exception 
    {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> 
        {
            new DictionaryGUI().setVisible(true);
        });
        DatabaseAccess.getInstance().parseXmlFile("Anh_Viet.xml", "Viet_Anh.xml");
        clickOnList(1);
        DatabaseAccess.getInstance().readBinFile();
        AutoCompleteDecorator.decorate(Words_List, Find_Text, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }
    
    public static void writeIniFile(String value) throws IOException
    {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date curentdate = new Date();
        try
        {
            File fi = new File("statistic.ini");
            if (!fi.isFile())
            {
                fi.createNewFile();
            }
            Ini ini_o = new Ini(fi);
            String temp = ini_o.get(dateFormat.format(curentdate), value);
            if (temp == null)
            {
                ini_o.put(dateFormat.format(curentdate), value, 1);
            }
            else
            {
                int c = Integer.parseInt(temp);
                c++;
                ini_o.put(dateFormat.format(curentdate), value, c);
            }
            ini_o.store();
        }
        catch (InvalidFileFormatException e) 
        {
            System.out.println("Invalid file format.");
        } 
        catch (IOException e) 
        {
            System.out.print("Error");
        }
    }
    
    public static void readIniFile(Date start_date, Date end_date)
    {
        HashMap <String, Integer> map1 = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try
        {
            Wini ini_i = new Wini(new File("statistic.ini"));
            for (String section : ini_i.keySet())
            {
                LocalDate localdate;
                localdate = LocalDate.parse(section, formatter);
                Date sectiondate = java.sql.Date.valueOf(localdate);
                if (start_date.compareTo(end_date) <= 0)
                {
                    if (start_date.compareTo(sectiondate) <= 0 && end_date.compareTo(sectiondate) >= 0)
                    {
                        HashMap <String, Integer> map2 = new HashMap<>();
                        Section temp_section = ini_i.get(section);
			for (String key : temp_section.keySet())
			{
                            map2.put(key, temp_section.get(key,int.class));
			}
                        map2.forEach((k,v)->map1.merge(k, v, (v1,v2)->v1+v2));
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Start date must before end date", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            if (map1.size() > 0)
            {
                JFrame frame = new JFrame("Statistic");
                String[] columns = new String[]{"Word", "Frequency"};
                Object[][] data = new Object[map1.size()][2];
                Set entries = map1.entrySet();
                Iterator entriesIterator = entries.iterator();
                int i = 0;
                while (entriesIterator.hasNext())
                {
                    Map.Entry mapping = (Map.Entry) entriesIterator.next();
                    data[i][0] = mapping.getKey();
                    data[i][1] = mapping.getValue();
                    i++;
                }
                JTable jTable1 = new JTable(data, columns);
                JScrollPane sp=new JScrollPane(jTable1);  
                frame.add(sp);
            
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Database empty", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (InvalidFileFormatException e) 
        {
            System.out.println("Invalid file format.");
        } 
        catch (IOException e) 
        {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea Content_TextArea;
    private static org.jdesktop.swingx.JXDatePicker EndDate_Picker;
    private javax.swing.JButton FavList_Button;
    private javax.swing.JButton Favorite_Button;
    private static javax.swing.JTextField Find_Text;
    private javax.swing.JButton Go_Button;
    private static javax.swing.JButton Language_Button;
    private static org.jdesktop.swingx.JXDatePicker StartDate_Picker;
    private javax.swing.JButton Statistic_Button;
    private static javax.swing.JList<String> Words_List;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
