
# Enviando E-mail com Java Spring

Este é um projeto feito com Java utilizando especificamente o SimpleMailMessage para fins didáticos. As instruções de como enviar o corpo da requisição está abaixo.

Gmail:
Lembrando que é necessário ativar a autenticação multifator na sua conta do Gmail assim como gerar a senha de app nas configurações.

Passo para gerar a senha:

1# Clique em Gerenciar sua Conta do Google

2# Clique na aba Segurança

3# Verifique se a autenticação de dois fatores está ativo

4# Na lupa de pesquisa ainda na aba Segurança, digite APP e clique em Senhas de app

5# Autentique-se, após, no campo 'Nome do app', digite o nme da sua aplicação Spring

6# Clique em 'Criar'

7# Copie a senha gerada para acesso, cole no campo 'spring.mail.password=' depois do sinal de igual


No Postman ou na sua ferramenta de preferência:

rota: http://localhost:8080/sendMail

Método: POST

Envie um 'form-data'

    Key:                        Value: 

    to                          seuemail@gmail.com 
    cc                          seuemail@gmail.com, outroemail@gmail.com
    subject                     Message details
    body                        This is a test submission using Java mail


O seu retorno deverá ser Status code 200-OK e uma menssagem de sucesso: 'Mail sent successfully !'