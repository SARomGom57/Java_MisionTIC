import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JLabel lblPassword;
    private JLabel lblUser;
    private JButton btnLogin;

    public App(){
        setLayout(null);
        lblUser = new JLabel("Usuario");
        lblUser.setBounds(20, 10, 100, 20);
        add(lblUser);
        lblPassword = new JLabel("Clave");
        lblPassword.setBounds(20, 40, 100, 20);
        add(lblPassword);
        txtUser = new JTextField();
        txtUser.setBounds(120, 10, 100, 20);
        add(txtUser);
        txtPassword = new JPasswordField(); 
        txtPassword.setBounds(120, 40, 100, 20);
        add(txtPassword);
        btnLogin = new JButton("Login");
        btnLogin.setBounds(20, 70, 100, 20); 
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    public static void main(String[] args) throws Exception {
        App login = new App();
        login.setBounds(20, 20, 280, 180);
        login.setVisible(true);
        login.setTitle("Login");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin){
            String clave = new String(txtPassword.getPassword());
            if(Login.autenticar(txtUser.getText(), clave)){
                JOptionPane.showMessageDialog(App.this, "Ingreso Exitoso!", "Login", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(App.this, "Usuario o Clave incorrecta!", "Login", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
}
