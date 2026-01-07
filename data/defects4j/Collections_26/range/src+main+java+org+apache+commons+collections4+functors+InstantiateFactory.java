{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/InstantiateFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstantiateFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 138,
      "comment": "\n * Factory implementation that creates a new object instance by reflection.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The serial version "
    },
    {
      "type": "field",
      "varNames": [
        "iClassToInstantiate"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The class to create "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The constructor parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The constructor arguments "
    },
    {
      "type": "field",
      "varNames": [
        "iConstructor"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The constructor "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.instantiateFactory(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 57,
      "end_line": 73,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cT\u003e  the type the factory creates\n     * @param classToInstantiate  the class to instantiate, not null\n     * @param paramTypes  the constructor parameter types, cloned\n     * @param args  the constructor arguments, cloned\n     * @return a new instantiate factory\n     * @throws NullPointerException if classToInstantiate is null\n     * @throws IllegalArgumentException if paramTypes does not match args\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.InstantiateFactory(java.lang.Class\u003cT\u003e)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateFactory\u003c/code\u003e if you want that.\n     *\n     * @param classToInstantiate  the class to instantiate\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 16)",
        "(line 83,col 9)-(line 83,col 49)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 21)",
        "(line 86,col 9)-(line 86,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.InstantiateFactory(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateFactory\u003c/code\u003e if you want that.\n     *\n     * @param classToInstantiate  the class to instantiate\n     * @param paramTypes  the constructor parameter types, cloned\n     * @param args  the constructor arguments, cloned\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 16)",
        "(line 99,col 9)-(line 99,col 49)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.findConstructor()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Find the Constructor for the class specified.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.create()",
      "begin_line": 121,
      "end_line": 136,
      "comment": "\n     * Creates an object using the stored constructor.\n     *\n     * @return the new object\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 135,col 9)"
      ]
    }
  ]
}