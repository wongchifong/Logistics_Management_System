/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.stockmanagermanui;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ListSelectionModel;

import RMI.client.RMIClient;
import blservice.stockmanagermanblservice.WarehouseManageService;
import vo.generalmanagervo.Staffvo;
import vo.stocmanagermanvo.StoreCheckvo;

//import jxl.Workbook;
//import jxl.write.Label;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//
//import java.util.List;  
//import javax.servlet.http.HttpServletResponse;  
//import org.apache.struts2.ServletActionContext;  
//import java.lang.reflect.Field; 


/**
 *
 * @author user
 */
public class StoreCheckui extends javax.swing.JFrame {

    /**
     * Creates new form StoreCheckui
     */
	
	static WarehouseManageService wms;
	
    public StoreCheckui(StoreCheckvo[] scvo) throws Exception {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); 
        this.jLabel4.setText("当前截止点："+sdf.format(new Date()));
        
        RMIClient.init();
        wms=RMIClient.getWarehouseManageService();
    }

    @SuppressWarnings("unchecked")
	private void huoSearch(StoreCheckvo[] sv){
 	   final String s[] = new String [100];
 	   if(sv!=null){	   
 	   for(int i=0;i<sv.length;i++){
 		   s[i]=sv[i].bianhao+"      "+sv[i].destination+"     		   "+sv[i].year+"-"+sv[i].month
 				   +"-"+sv[i].day+"        "+sv[i].quhao+"       	          	"
 	   +sv[i].paihao+"    	          		"+sv[i].jiahao+"	  	       				      "+sv[i].weihao;
 	   }
 	   jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = s;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
 	   jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 	    jScrollPane1.setViewportView(jList1);
 	    }
 	  // Searchresult.setText(s);
    }
    
//    public void createExcel(OutputStream os) throws WriteException,IOException{
//        //创建工作薄
//        WritableWorkbook workbook = Workbook.createWorkbook(os);
//        //创建新的一页
//        WritableSheet sheet = workbook.createSheet("库存盘点",0);
//        //创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
//        Label bianhao = new Label(0,0,"快递编号");
//        sheet.addCell(bianhao);
//        Label destination = new Label(1,0,"目的地");
//        sheet.addCell(destination);
//        Label riqi = new Label(2,0,"入库日期");
//        sheet.addCell(riqi);
//        Label quhao = new Label(3,0,"区号");
//        sheet.addCell(quhao);
//        workbook.write();
//        workbook.close();
//        os.close();
//
//    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("当前截止点：");

        jButton1.setText("退出");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("快递编号");

        jLabel2.setText("目的地");

        jLabel3.setText("区号");

        jLabel5.setText("排号");

        jLabel6.setText("架号");

        jButton2.setText("显示");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("位号");

        jLabel8.setText("入库日期");

//        jButton3.setText("导出Excel");
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton3ActionPerformed(evt);
//            }
//
//        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
//    	try {
//    		 String fname = "库存盘点";
//    		 OutputStream os = response.getOutputStream();//取得输出流
//    		    response.reset();//清空输出流
//    		    
//    		    //下面是对中文文件名的处理
//    		    response.setCharacterEncoding("UTF-8");//设置相应内容的编码格式
//    		    fname = java.net.URLEncoder.encode(fname,"UTF-8");
//    		    response.setHeader("Content-Disposition","attachment;filename="+new String(fname.getBytes("UTF-8"),"GBK")+".xls");
//    		    response.setContentType("application/msexcel");//定义输出类型
//
//    		createExcel(null);
//		} catch (WriteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    	try {
			huoSearch(wms.search());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(StoreCheckui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreCheckui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreCheckui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreCheckui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StoreCheckui(null).setVisible(true);
//            }
//        });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
