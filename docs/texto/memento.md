# Memento

---

**Problema:**  
Salvar e restaurar o estado interno de um objeto sem violar o encapsulamento, permitindo operações como undo/redo.

**Solução:**  
Criar um objeto Memento que armazena o estado do Originator. O Caretaker guarda o memento, mas não pode acessar seu conteúdo.

**Quando usar**
- Quando é necessário implementar undo/redo.
- Quando o estado interno não deve ser exposto.
- Quando checkpoints ou rollback são necessários.

**Vantagens**
- Mantém encapsulamento.
- Permite múltiplos estados salvos.
- Facilita undo/redo.

**Desvantagens**
- Pode consumir muita memória.
- Caretaker não sabe o tamanho real do memento.