
package javaa;

public class tesst {
//    static int a = 10;
//Í

    public static void main(String[] args) {
        System.out.println("mang");

        int arr[] = {1,2,3,1,2,3,4};

        for (int i = 0;i< arr.length;i++){
            int k =0;
            for (int j = 0 ; j< arr.length ; j++) {

                if (arr[i] == arr[j])
                    k++;
            }
            System.out.println(k);

        }


    }
    }
//        a = 6;
//        System.out.println("day la java");
//        System.out.println(a+ test12.b);
//        System.out.println(test12.c);
//        System.out.println("niknknk");
//
//        JFrame jFrame = new JFrame("Java Swing Fram tesr");
//        jFrame.setSize(15,30);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);
//        thunghiem(jPanel);
//        jFrame.setVisible(true);
//    }
//    public static void thunghiem(JPanel jPanel){
//        jPanel.setLayout(null);
//        JLabel userJla = new JLabel("user");
//        userJla.setBounds(10,20,80,25);
//        jPanel.add(userJla);
//        JTextField usertext = new JTextField(20);
//        usertext.setBounds(100,20,165,25);
//        jPanel.add(usertext);
//
//        // Same process for password label and text field.
//        JLabel passwordLabel = new JLabel("Password");
//        passwordLabel.setBounds(10,50,80,25);
//        jPanel.add(passwordLabel);
//
//        JPasswordField passwordText = new JPasswordField(20);
//        passwordText.setBounds(100,50,165,25);
//        jPanel.add(passwordText);
//
//        // Creating login button
//        JButton loginButton = new JButton("login");
//        loginButton.setBounds(10, 80, 80, 25);
//        jPanel.add(loginButton);
//        Object ob = new Object();
//        String strinarr[] = new String[50];
//        Float float1 = new Float(3.14f);
//        ob = strinarr;
//        ob = strinarr[5];
//        System.out.println(float1);
//        ob = float1;
//
//        System.out.println("ob = "+ ob);
//        System.out.println("Test Exception");
//        StringBuffer stringBuffer = new StringBuffer();
//        StringBuilder stringBuilder= new StringBuilder();
//        try {
//            eception();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return;
//        }finally {
//            System.out.println("Co vao day khong!!");
//        }
//
//    }
//
//    public static int eception() throws Exception {
//        try {
//            int c = a / 0;
//            return c;
//        } catch (Exception e) {
//            return 13;
////            throw new Exception("Khong duoc chia cho khong");
//        } finally {
//            System.out.println("co vao day duoc khong");
//        }
//    }
//}
