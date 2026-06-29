# Command

---

**Problema:**  
Acoplar diretamente quem solicita uma operação com quem a executa dificulta o uso de filas, histórico, undo/redo e macro-comandos.

**Solução:**  
Encapsular uma solicitação como um objeto (Command), separando o emissor (Invoker) do executor real

**Quando usar**
- filas de comandos
- histórico de operações
- undo/redo
- macro-comandos (comandos)

**Vantagens**
- Desacoplamento entre emissor e executor.
- Suporte natural a histórico e undo/redo.
- Facilita composição de comandos.

**Desvantagens**
- Aumenta o número de classes.
- Pode adicionar indireção desnecessária em cenários simples.