package exercicios.estruturasDeRepeticaoEArrays;

import java.util.Scanner;


//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.


public class CadastroUsuario {

    public static void usuarioESenha() {
        Scanner scanner = new Scanner(System.in);
        String user;
        String pass;

        do {
            System.out.println("Digite um nome de usuario: ");
            user = scanner.next();
            System.out.println("Digite uma senha: ");
            pass = scanner.next();
            if (user.equalsIgnoreCase(pass))
                System.out.println("Erro!! A senha deve ser diferante do Usuario");

        } while (user.equalsIgnoreCase(pass));

        System.out.println("Usuario cadastrado com sucesso.");


    }

}
