# nomedoprojeto

---

**Problema:**  
Criar muitos objetos pequenos pode consumir memória demais, tornando a aplicação ineficiente.

**Solução:**  
Compartilhar objetos imutáveis (estado intrínseco) e mover o estado variável para o cliente (estado extrínseco).

**Quando usar**
- Quando há muitos objetos semelhantes
- Quando o custo de memória é alto
- Quando o estado pode ser dividido entre intrínseco e extrínseco
- Quando a identidade do objeto não importa

**Vantagens**
- Redução massiva de memória
- Estruturas grandes tornam-se viáveis
- Compartilhamento eficiente

**Desvantagens**
- Aumento de complexidade
- Cliente precisa fornecer estado extrínseco
- Pode aumentar custo de processamento