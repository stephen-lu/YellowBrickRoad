# ZipCode Week 1 Learning Progression

## Learning Path Overview - Java & Python Tracks
```mermaid
graph TD
    A[Development Setup] --> B{Choose Track}
    B --> C[Java Basics]
    B --> D[Python Basics]
    
    C --> C1[Methods & Returns]
    D --> D1[Functions & Returns]
    
    C1 --> E[Object-Oriented Programming]
    D1 --> E
    
    E --> F[Problem Solving]
    F --> G[Applications]
    
    A --> A1[Git/GitHub]
    A --> A2[Terminal/Shell]
    A --> A3[IDE Setup]
    
    C --> C2[Data Types]
    C --> C3[Variables]
    C --> C4[Basic Operations]
    
    D --> D2[Think Python Notebooks]
    D --> D3[Interactive Learning]
    D --> D4[Python Syntax]
    
    C1 --> C5[Method Signatures]
    C1 --> C6[Return vs Print]
    D1 --> D5[Function Definitions]
    D1 --> D6[Return vs Print]
    
    E --> E1[Classes & Objects]
    E --> E2[State Management]
    E --> E3[Error Handling]
    
    F --> F1[Algorithm Design]
    F --> F2[String Manipulation]
    F --> F3[Logic Problems]
    
    G --> G1[Java: Game Development]
    G --> G2[Python: Scientific Calculator]
    G --> G3[Collaborative Projects]
```

## Project Dependencies & Skills - Java & Python Tracks
```mermaid
graph LR
    subgraph "Foundation Skills"
        Git[Git/GitHub Basics]
        Terminal[Terminal Commands]
        Lang{Language Choice}
    end
    
    subgraph "Java Track"
        JavaSyntax[Java Syntax]
        JavaDrills[DanDoBetterDrills<br/>Java Version]
        ObjectsJ[ObjectsOne<br/>OOP Fundamentals]
        ReturnsJ[UsingReturns<br/>Method Design]
        DreamJ[DreamHouse2025<br/>Graphics Intro]
        WordJ[WordGuess<br/>Game Logic]
        ParenJ[ParenSymmetry<br/>Algorithms]
        CalcJ[ScientificCalculator<br/>Java Group Project]
    end
    
    subgraph "Python Track"
        ThinkPy[Think Python<br/>Interactive Notebooks]
        PythonDrills[DanDoBetterDrills<br/>Python Version]
        CalcPy[Python.ScientificCalculator<br/>Python Group Project]
    end
    
    Git --> Lang
    Terminal --> Lang
    Lang --> JavaSyntax
    Lang --> ThinkPy
    
    JavaSyntax --> JavaDrills
    JavaSyntax --> ObjectsJ
    JavaSyntax --> ReturnsJ
    ThinkPy --> PythonDrills
    
    JavaDrills --> DreamJ
    JavaDrills --> WordJ
    JavaDrills --> ParenJ
    JavaDrills --> CalcJ
    ObjectsJ --> WordJ
    ObjectsJ --> CalcJ
    ReturnsJ --> WordJ
    ReturnsJ --> ParenJ
    
    PythonDrills --> CalcPy
    ThinkPy --> CalcPy
```

## Skill Building Sequence
```mermaid
sequenceDiagram
    participant Student
    participant Environment
    participant Java
    participant OOP
    participant Projects
    
    Student->>Environment: Setup Git, Terminal, IDE
    Environment->>Java: Learn basic syntax
    Java->>Java: Practice with DanDoBetterDrills
    Java->>OOP: Understand classes with ObjectsOne
    OOP->>OOP: Practice return vs print concepts
    OOP->>Projects: Apply skills to games
    Projects->>Student: Build confidence through working code
```

## Concept Relationships - Dual Track Programming
```mermaid
mindmap
  root((Programming Fundamentals))
    Java Track
      Data Types
        Primitives
          int, double, boolean
        Objects
          String, Arrays
      Methods
        Signatures
        Parameters
        Return Types
        vs Printing
      OOP Concepts
        Classes
          Blueprints
          Attributes
          Behaviors
        Objects
          Instances
          State
          new keyword
        Encapsulation
          private fields
          getters/setters
      Applications
        Game Development
          User input
          State tracking
          Win/lose conditions
        Graphics
          Drawing
          Visual output
    Python Track
      Data Types
        Numbers
          int, float
        Collections
          Lists, Dictionaries, Tuples
        Strings
          Powerful methods
      Functions
        Definitions
        Parameters
        Return values
        vs Print statements
      OOP Concepts
        Classes
          State management
          Methods
        Objects
          Instances
          Attributes
        Error Handling
          try/except
          Validation
      Applications
        Scientific Computing
          Mathematical functions
          Calculator logic
          Display systems
        Interactive Learning
          Jupyter notebooks
          Immediate feedback
    Shared Skills
      Problem Solving
        Algorithms
          Parentheses matching
          String manipulation
        Logic Problems
          Boolean operations
          Conditional thinking
      Development Skills
        Version Control
          Git workflow
          Collaboration
        Testing
          Unit tests
          Edge cases
          Debugging
        Project Management
          Team coordination
          Code organization
```

## Python Learning Progression Notes

### **Foundation Phase (Week 1)**
**Think Python Resource** - Complete beginner introduction using interactive Jupyter notebooks
- Variables, functions, conditionals, loops
- Data structures: Lists, dictionaries, tuples  
- Interactive learning environment with immediate feedback

### **Skill Building Phase**
**DanDoBetterDrills (Python Version)** - Parallel exercises to Java version
- String manipulation using Python's powerful string methods
- Boolean logic with Python's True/False and logical operators
- Mathematical operations with Python's numeric types
- Function implementation and understanding Python functions vs Java methods

### **Application Phase (Weekend Project)**  
**Python Scientific Calculator** - Advanced project focusing on:
- Object-oriented programming: Classes, state management, encapsulation
- Error handling: try/except blocks, input validation
- Advanced mathematical functions: Trigonometry, logarithms
- Display systems: Binary, octal, decimal, hexadecimal conversion
- Comprehensive testing: Unit tests, edge cases, descriptive naming
- Collaborative development: Git workflow, team programming

### **Key Differences from Java Track**
- **Interactive Learning**: Jupyter notebooks provide immediate feedback
- **Simplified Syntax**: Python's more readable syntax reduces cognitive load
- **Focus on Logic**: Less boilerplate code allows focus on problem-solving
- **Scientific Computing**: Calculator project introduces mathematical libraries
- **Collaborative Emphasis**: Both tracks emphasize teamwork and version control