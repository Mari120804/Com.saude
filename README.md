# Com.saude
Aplicativo em Kotlin que calcula IMC; mostra o passo a passo para uma meditação eficaz, indicando mantras para escutar durante a meditação; lista exercícios físicos para sair do sedentarismo (linkando o vídeo de cada exercício no YouTube) e *notifica para beber água (*funcionalidade ainda em aperfeiçoamento para uma nova versão).

↠ Documentação do aplicativo: Com.saude

➝ Introdução:

Este é um modelo básico de documentação do aplicativo Com.saude .
Considero o Com.saude um aplicativo para quem quer dar um passo à frente na vida e transformar-se com hábitos saudáveis, mudar sua autoimagem e deste modo, adquirir vitalidade e resistência para enfrentar o que a vida trouxer, ao implementar as funcionalidades do app em seu cotidiano.
Considerações:
•	Ter uma documentação básica é melhor do que não ter nenhuma;
•	Este é o primeiro aplicativo feito pela desenvolvedora;
•	Quaisquer dúvidas, esclarecimentos e/ou feedback contatar ao e-mail: marianalibaniobarbosa@gmail.com

➝ Dados do app:

•	Linguagem: Kotlin
•	Tamanho: 593 MB
•	Nível mínimo de API: API 26 (Android 8.0; “Oreo”)
•	Versão 0.13.2
•	Desenvolvedora: Mariana Libânio Barbosa
•	Idioma: Português

➝ Exposição completa do aplicativo:

O aplicativo apresenta em princípio uma Splash Screen que contém um ícone relacionado ao tema do app com o próprio nome do app. 

Após, na segunda tela, é apresentado um menu que direciona o usuário ao conteúdo existente no aplicativo. Se ele apertar no primeiro botão “IMC”, será conduzido à tela que irá calcular seu IMC. Depois de calculado, o usuário poderá apertar no botão seguinte ao resultado, esse botão disponibilizará na próxima tela mais botões, cada um conduzirá à um vídeo, já instalado no aplicativo, pensado na acessibilidade do usuário, que mesmo offline, poderá visualizar aos vídeos, sendo este um diferencial do aplicativo. (Vídeos de autoria de Marina Morais no YouTube.)

Se o usuário apertar o botão “Meditação” na segunda tela, este será direcionado à um passo a passo para uma meditação eficaz. Após os 9 passo a passos, haverá um botão que o conduzirá à mantras escolhidos a dedo pela desenvolvedora. Em que, para ter acesso ao vídeo no YouTube, basta o usuário clicar no nome do mantra que achar conveniente.

Apertando o botão “Exercícios” na segunda tela, abrirá uma tela que apresentará uma lista de 12 exercícios rotineiros, para o usuário sair do sedentarismo. Ao apertar “Ver detalhes” após a descrição do exercício, o usuário será direcionado ao vídeo específico do exercício no YouTube.

E por fim, apertando-se o botão “Beber água” na segunda tela, o usuário poderá registrar a quantidade de copos de água que tomou (ainda em aperfeiçoamento para uma nova versão do app) e ainda ser notificado com um lembrete para beber água.

➝ Versionamento:

0.1 ➝ Criei a primeira MainActivity(Splash).
0.2 ➝ Criei a MainActivity2. Coloquei na xml2 um TextView e quatro Buttons no ScrollView com LinearLayout.
0.3 ➝ Criei a MainActivity3. Coloquei o código da Calculadora de IMC. Adicionei mais um Button, não contando com o Button que já veio na calculadora.
0.3.1 ➝ Alterei texto na MainActivity3. Linkei o Button 1 da MainActivity2 à MainActivity3.
0.4.0 ➝ Criei a MainActivity4. Coloquei na xml4 dois TextView, sendo um para link da web e quatro Buttons.
0.4.1 ➝ Alteração no código: Linkei o Button 2 da MainActivity3 à MainActivity4.
0.4.2 ➝ Fix Bug na xml4. Precisei adicionar um ScrollView com um LinearLayout.
0.5.0 ➝ Criei a MainActivity5. Coloquei na xml5 um VideoView.
0.6.0 ➝ Criei a MainActivity6. Coloquei na xml6 um VideoView.
0.7.0 ➝ Criei a MainActivity7. Coloquei na xml7 um VideoView.
0.8.0 ➝ Criei a MainActivity8. Coloquei na xml8 um VideoView.
0.8.1 ➝ Alteração no código: Linkei os Buttons da MainActivity4 às suas respectivas activitys (activitys 5, 6, 7 e 8).
0.9.0 ➝ Criei a MainActivity9. Coloquei na xml9 dez TextView, um Button e o ScrollView com LinearLayout.
0.9.1 ➝ Alteração no código: Linkei o Button 2 da MainActivity2 à MainActivity9.
0.10.0 ➝ Criei a MainActivity10. Coloquei na xml10 onze TextView, sendo dez links para web dentro do ScrollView com LinearLayout.
0.10.1 ➝ Alteração no código: Linkei o Button da activity9 à MainActivity10.
0.10.2 ➝ Fix Bug na MainActivity10. Correção nas variáveis.
0.11.0 ➝ Criei a MainActivity11 e a MainActivity12 para utilizar o RecyclerView listando os exercícios.
0.12.0 ➝ Adicionei uma “Kotlin Class/File” com nome “Exercise”.
0.12.1 ➝ Alteração no código: Linkei o Button 3 da MainActivity2 à MainActivity11.
0.12.2 ➝ Fix Bug na xml12. Precisei adicionar a cor ao TextView “exerciseLinkTextView”.
0.13.0 ➝ Criei a MainActivity13. Coloquei na xml13 um Button e um TextView.
0.13.1 ➝ Alteração no código: Adicionei a função “scheduleWaterReminder” na MainActivity13 e linkei o Button 4 da MainActivity2 à MainActivity13.
0.13.2 ➝ Fix Bug no AndroidManifest ao alterar o ícone do aplicativo.



