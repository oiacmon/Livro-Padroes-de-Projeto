# Factory Method

---

**Problema:**  
Uma classe precisa criar objetos, mas não sabe qual classe concreta deve instanciar.

**Solução:**  
Mover a lógica de criação para subclasses, através de um método fábrica.

**Quando usar**
- Quando uma classe não pode antecipar o tipo de objeto que deve criar
- Quando subclasses devem decidir o que instanciar
- Quando você quer remover dependências de classes concretas

**Vantagens**
- Reduz acoplamento
- Facilita extensão
- Centraliza criação de objetos

**Desvantagens**
- Pode gerar muitas subclasses
- Pode aumentar complexidade