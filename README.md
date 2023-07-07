# Verificador de Senhas

Este é um programa simples em Java que verifica a senha inserida pelo usuário. O programa permite até 3 tentativas para inserir a senha correta e exibe uma mensagem de acesso permitido ou bloqueado com base na correspondência da senha.

## Como usar

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório onde o arquivo `VerificadorSenhas.java` está localizado.
3. Compile o arquivo Java executando o seguinte comando:
   ```
   javac VerificadorSenhas.java
   ```
4. Execute o programa com o comando:
   ```
   java VerificadorSenhas
   ```
5. Digite sua senha quando solicitado e pressione Enter.

## Exemplo de Uso

```
Digite sua senha:
senha456
Senha Incorreta, tente novamente:
Suas tentativas restantes: 2
senhaabc
Senha Incorreta, tente novamente:
Suas tentativas restantes: 1
senha123

ACESSO PERMITIDO
```

## Notas

- A senha padrão definida neste programa é "senha123". Você pode alterar a senha verificada modificando a linha `!senha.equals("senha123")` para a senha desejada.
- O programa permite até 3 tentativas de senha. Você pode ajustar o número de tentativas alterando o valor de `3 - contador` na linha `System.out.println("Suas tentativas restantes " + (3 - contador))`.
- Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema para compilar e executar o programa Java.
