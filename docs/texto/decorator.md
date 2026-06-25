# nomedoprojeto

---

**Problema:**  
Adicionar responsabilidades a objetos individuais sem criar subclasses para cada combinação possível.

**Solução:**  
Envolver o objeto original em um decorador que implementa a mesma interface e adiciona comportamentos antes ou depois da chamada original.

**Quando usar**
- Quando você quer adicionar funcionalidades dinamicamente
- Quando não quer criar dezenas de subclasses
- Quando responsabilidades podem ser combinadas livremente

**Vantagens**
- Flexível e dinâmico
- Evita explosão de subclasses
- Permite múltiplas combinações de responsabilidades

**Desvantagens**
- Pode gerar muitos objetos pequenos
- Pode dificultar depuração
- A identidade do objeto decorado muda