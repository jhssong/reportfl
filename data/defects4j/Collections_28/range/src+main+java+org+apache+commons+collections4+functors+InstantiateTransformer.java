{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/InstantiateTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstantiateTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cjava.lang.Class\u003c? extends T\u003e, T\u003e"
      ],
      "begin_line": 36,
      "end_line": 131,
      "comment": "\n * Transformer implementation that creates a new object instance by reflection.\n * \u003cp\u003e\n * \u003cb\u003eWARNING:\u003c/b\u003e from v4.1 onwards this class will \u003cb\u003enot\u003c/b\u003e be serializable anymore\n * in order to prevent potential remote code execution exploits. Please refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-580\"\u003eCOLLECTIONS-580\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NO_ARG_INSTANCE"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Singleton instance that uses the no arg constructor "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The constructor parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The constructor arguments "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.instantiateTransformer()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Get a typed no-arg instance.\n     *\n     * @param \u003cT\u003e  the type of the objects to be created\n     * @return Transformer\u003cClass\u003c? extends T\u003e, T\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.instantiateTransformer(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 67,
      "end_line": 79,
      "comment": "\n     * Transformer method that performs validation.\n     *\n     * @param \u003cT\u003e  the type of the objects to be created\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     * @return an instantiate transformer\n     * @throws IllegalArgumentException if paramTypes does not match args\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.InstantiateTransformer()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Constructor for no arg instance.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)",
        "(line 86,col 9)-(line 86,col 27)",
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.InstantiateTransformer(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateTransformer\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * Note: from 4.0, the input parameters will be cloned\n     *\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 101,col 69)",
        "(line 102,col 9)-(line 102,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.transform(java.lang.Class\u003c? extends T\u003e)",
      "begin_line": 111,
      "end_line": 129,
      "comment": "\n     * Transforms the input Class object to a result by instantiation.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 128,col 9)"
      ]
    }
  ]
}