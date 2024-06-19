package Classes;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class LoginSystem {
  private final Map<String, String> usuarios; // mapa que armazena os usu�rios e senhas
  private static String usuarioLogado;
  private static String chaveMestra = "mestra1234"; // chave mestra para adicionar usu�rios

  public LoginSystem() {
    usuarios = new HashMap<>();
    // adicione os usu�rios e senhas aqui
    usuarios.put("ryan", "1234");
    usuarios.put("isabella", "1234");
    usuarios.put("larissa", "1234");
    usuarios.put("flavia", "1234");
    usuarios.put("bernardo", "1234");
    usuarios.put("nicolas", "1234");
    usuarios.put("pescuma", "1234");
    //...
  }

  public boolean login(String usuario, String senha) {
    if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
      usuarioLogado = usuario; // armazena o usu�rio logado na vari�vel est�tica
      return true; // login bem-sucedido
    } else {
      return false; // login falhou
    }
  }

  public void adicionarUsuario(String novoUsuario, String novaSenha, String chave) {
    if (chave.equals(chaveMestra)) {
      usuarios.put(novoUsuario, novaSenha);
      JOptionPane.showMessageDialog(null, "Usu�rio adicionado com sucesso!");
    } else {
      JOptionPane.showMessageDialog(null, "Chave mestra inv�lida!");
    }
  }
}