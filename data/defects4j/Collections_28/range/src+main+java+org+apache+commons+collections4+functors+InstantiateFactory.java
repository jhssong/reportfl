{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/InstantiateFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstantiateFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e"
      ],
      "begin_line": 36,
      "end_line": 140,
      "comment": "\n * Factory implementation that creates a new object instance by reflection.\n * \u003cp\u003e\n * \u003cb\u003eWARNING:\u003c/b\u003e from v4.1 onwards this class will \u003cb\u003enot\u003c/b\u003e be serializable anymore\n * in order to prevent potential remote code execution exploits. Please refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-580\"\u003eCOLLECTIONS-580\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iClassToInstantiate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The class to create "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The constructor parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The constructor arguments "
    },
    {
      "type": "field",
      "varNames": [
        "iConstructor"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The constructor "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.instantiateFactory(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 58,
      "end_line": 74,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cT\u003e  the type the factory creates\n     * @param classToInstantiate  the class to instantiate, not null\n     * @param paramTypes  the constructor parameter types, cloned\n     * @param args  the constructor arguments, cloned\n     * @return a new instantiate factory\n     * @throws NullPointerException if classToInstantiate is null\n     * @throws IllegalArgumentException if paramTypes does not match args\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.InstantiateFactory(java.lang.Class\u003cT\u003e)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateFactory\u003c/code\u003e if you want that.\n     *\n     * @param classToInstantiate  the class to instantiate\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 85,col 9)-(line 85,col 27)",
        "(line 86,col 9)-(line 86,col 21)",
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.InstantiateFactory(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateFactory\u003c/code\u003e if you want that.\n     *\n     * @param classToInstantiate  the class to instantiate\n     * @param paramTypes  the constructor parameter types, cloned\n     * @param args  the constructor arguments, cloned\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 16)",
        "(line 100,col 9)-(line 100,col 49)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 29)",
        "(line 103,col 9)-(line 103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.findConstructor()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Find the Constructor for the class specified.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateFactory.create()",
      "begin_line": 122,
      "end_line": 138,
      "comment": "\n     * Creates an object using the stored constructor.\n     *\n     * @return the new object\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 137,col 9)"
      ]
    }
  ]
}