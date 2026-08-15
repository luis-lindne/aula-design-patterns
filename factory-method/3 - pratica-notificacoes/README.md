# Respostas — Factory Method / Sistema de Notificações

**a) Problema resolvido:**
`NotificationService` criava `EmailNotification` diretamente, ficando acoplado a uma implementação concreta. O Factory Method remove esse acoplamento: quem decide qual notificação criar são as subclasses.

**b) Vantagem ao adicionar novos tipos:**
Basta criar duas classes novas (produto + criador concreto) — nenhum código existente é alterado. Foi assim com o WhatsApp.

**c) Onde está o Factory Method:**
No método abstrato `createNotification()`, declarado em `NotificationService` e implementado em cada `*NotificationService`.

**d) Papel do polimorfismo:**
`sendNotification()` chama `createNotification()` e `send()` por meio dos tipos abstratos (`NotificationService`/`Notification`); em tempo de execução, quem roda é a implementação da subclasse concreta usada.

**e) Só a interface `Notification` bastaria para dizer que é Factory Method?**
Não. Isso só dá abstração de produto (polimorfismo comum). O padrão só existe quando a **criação** também é abstraída — via `createNotification()` sobrescrito nas subclasses do criador.
