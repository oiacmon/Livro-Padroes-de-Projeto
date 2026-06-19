# Abstract Factory

---

**Problema:**  
Criar famílias de objetos relacionados sem acoplar o código às classes concretas.

**Solução:**  
Definir uma interface para criar famílias de produtos e implementar fábricas concretas para cada variação.

**Quando usar**
- Quando o sistema precisa ser independente de classes concretas
- Quando produtos devem ser usados em conjunto
- Quando existem múltiplas famílias de objetos

**Vantagens**
- Remove dependência de classes concretas
- Garante compatibilidade entre produtos
- Facilita troca de famílias inteiras

**Desvantagens**
- Pode aumentar o número de classes
- Pode ser complexo para pequenas aplicações