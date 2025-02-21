# Toy3_Compiler

## 📌 Descrizione

**Toy3 Compiler** è un progetto universitario di un compilatore per il linguaggio **Toy3**, progettato per analizzare codice sorgente scritto in Toy3 e tradurlo in **linguaggio C** come codice intermedio. Il progetto implementa un **lexer (JFlex)**, un **parser (JavaCup)** e un **AST (Abstract Syntax Tree)** per gestire la sintassi e la semantica del linguaggio.

Questo compilatore supporta:
- Dichiarazioni di variabili e funzioni
- Operazioni aritmetiche e logiche
- Controlli di flusso (`if-then-else`, `while`)
- Operazioni di input/output
- Analisi semantica tramite **scoping**
- Generazione di codice intermedio in **C**

---

## 🛠️ **Installazione e Setup**

### ⚡ Requisiti
Assicurati di avere installato:
- **Java 17+**
- **JFlex** per la generazione del lexer
- **JavaCup** per la generazione del parser
- **Gradle (opzionale, per la gestione del progetto)**
- **GCC** (se vuoi compilare il codice intermedio generato)

### 🔧 **Istruzioni di Installazione**
1. Clona la repository:
   ```bash
   git clone https://github.com/fra-02/Toy3_Compiler.git
   cd Toy3_Compiler
   
2. Configurazione ed Esecuzione

Per testare il compilatore, è sufficiente creare una configurazione di esecuzione nel proprio IDE (es. IntelliJ IDEA o Eclipse) con la classe Main come entry point.
Aggiungere come argomento della linea di comando il file di testo contenente il codice sorgente Toy3 da compilare.


