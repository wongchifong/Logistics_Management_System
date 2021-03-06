/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.bushallsalmanui;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.bushallsalmanblservice.CarLoadingService;
import blservice.queryblservice.QueryService;
import data.orderdata.OrderIO;
import dataservice.otherdataservice.ExpressService;
import po.courierpo.CourierOrderpo;
import presentation.courierui.PriceAndTimeui;
import vo.bushallsalmanvo.CarLoadingvo;
import vo.queryvo.QueryOrdervo;

/**
 *
 * @author user
 */
public class CarLoadingui extends javax.swing.JFrame {

	static CarLoadingService cls;
	static QueryService q;
    /**
     * Creates new form CarLoadingui
     * @throws Exception 
     */
    public CarLoadingui() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        cls=RMIClient.getCarLoadingService();
        q=RMIClient.getQueryService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yingYeTing = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        car = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chuFaDi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        destinaton = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jianZhuang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yaYun = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        yunFei = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiaoxingma = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("车辆装车管理"));

        jLabel1.setText("装车日期：");

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        jLabel5.setText("营业厅编号：");

        jLabel6.setText("汽运编号：");

        jLabel7.setText("出发地：");

        jLabel8.setText("目的地：");

        jLabel9.setText("监装员：");

        jLabel10.setText("押运员：");

        jLabel11.setText("运费：");

        jLabel12.setText("订单条形码号：");

        tiaoxingma.setColumns(20);
        tiaoxingma.setRows(5);
        jScrollPane1.setViewportView(tiaoxingma);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(yingYeTing, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(car)
                    .addComponent(chuFaDi)
                    .addComponent(destinaton)
                    .addComponent(jianZhuang)
                    .addComponent(yaYun)
                    .addComponent(yunFei)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yingYeTing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chuFaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(destinaton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jianZhuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(yaYun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(yunFei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jButton2.setText("确定");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("退出");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addGap(52, 52, 52)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
    	this.dispose();
    }
    private void jButton2ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
    	CarLoadingvo carLoading=new CarLoadingvo(year.getText(),month.getText(),day.getText(),yingYeTing.getText(),car.getText(),chuFaDi.getText(),destinaton.getText(),jianZhuang.getText(),yaYun.getText(),yunFei.getText(),tiaoxingma.getText());
        String yytID="";
       // System.out.println(yingYeTing.getText());
        if((yytID=yingYeTing.getText()).equals("")||yytID.length()!=6){
        	erroryytID();
        	return;
        }
        String qyID="";
        if((qyID=car.getText()).equals("")||qyID.length()!=19){
        	errorqyID();
        	return;
        }
        
        boolean a=errorID(year.getText());
        if(a)return;
        boolean b=errorID(month.getText());
        if(b)return;
        boolean c=errorID(day.getText());
        if(c)return;
        boolean d=errorID(yingYeTing.getText());
        if(d)return;
        boolean e1=errorID(car.getText());
        if(e1)return;
        boolean f=errorID(yunFei.getText());
        if(f)return;
        
        int i=0;
        int row=0;
        while(tiaoxingma.getText().charAt(i)!=' '){
        if(tiaoxingma.getText().charAt(i)=='\n'){
        	row++;
        }
        i++;
        }
        int k=0;
        for(int j=1;j<=row;j++){
        	String txmID="";
        while(tiaoxingma.getText().charAt(k)!='\n'){
        	txmID+=tiaoxingma.getText().charAt(k);
        	k++;
        }
        k++;
        if(txmID.equals("")||txmID.length()!=10){
        	errortxmID();
        	return;
        }
        for(int n=0;n<txmID.length();n++){
   		 if(!(txmID.charAt(n)>='0'&&txmID.charAt(n)<='9')){
   			 errorID2();
   			 return;
   		 }
        }
        }
        int m=0;
        for(int j1=1;j1<=row;j1++){
        	String txmID1="";
        while(tiaoxingma.getText().charAt(m)!='\n'){
        	txmID1+=tiaoxingma.getText().charAt(m);
        	m++;
        }
        m++;
        ExpressService es = new OrderIO();
        CourierOrderpo co;
			try {
				co = es.search(txmID1);
				if(co==null){
					notExit(txmID1);
					return;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        try {
            boolean a1 = cls.inputLoad(carLoading);
            if(a1){
                System.out.println("成功！");
                JOptionPane.showMessageDialog(null, "写入成功", "成功", 
                		JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "写入失败", "失败！", 
                		JOptionPane.ERROR_MESSAGE);
            }
            // TODO add your handling code here:
        } catch (RemoteException ex) {
            Logger.getLogger(PriceAndTimeui.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    

	private boolean errorID(String text) {
		// TODO Auto-generated method stub
		for(int i=0;i<text.length();i++){
    		if(!(text.charAt(i)>='0'&&text.charAt(i)<='9')){
    			JOptionPane.showMessageDialog(null, "包含非法字符！", "输入有误", JOptionPane.ERROR_MESSAGE);
    			return true;
    		}
    	}
		return false;
	}

	private void errorID2() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "条形码号应全为数字！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void notExit(String txmID) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "不存在该订单"+txmID+"!", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void errortxmID() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "订单条形码号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void erroryytID() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "营业厅编号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}
	private void errorqyID() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "汽运编号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CarLoadingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarLoadingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarLoadingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarLoadingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new CarLoadingui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField car;
    private javax.swing.JTextField chuFaDi;
    private javax.swing.JTextField day;
    private javax.swing.JTextField destinaton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jianZhuang;
    private javax.swing.JTextField month;
    private javax.swing.JTextArea tiaoxingma;
    private javax.swing.JTextField yaYun;
    private javax.swing.JTextField year;
    private javax.swing.JTextField yingYeTing;
    private javax.swing.JTextField yunFei;
    // End of variables declaration//GEN-END:variables
}
