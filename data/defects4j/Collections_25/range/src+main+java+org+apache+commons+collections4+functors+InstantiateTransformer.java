{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/InstantiateTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstantiateTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cjava.lang.Class\u003c? extends T\u003e, T\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 128,
      "comment": "\n * Transformer implementation that creates a new object instance by reflection.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "NO_ARG_INSTANCE"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Singleton instance that uses the no arg constructor "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The constructor parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The constructor arguments "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.instantiateTransformer()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Get a typed no-arg instance.\n     *\n     * @param \u003cT\u003e  the type of the objects to be created\n     * @return Transformer\u003cClass\u003c? extends T\u003e, T\u003e\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.instantiateTransformer(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 65,
      "end_line": 77,
      "comment": "\n     * Transformer method that performs validation.\n     *\n     * @param \u003cT\u003e  the type of the objects to be created\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     * @return an instantiate transformer\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.InstantiateTransformer()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Constructor for no arg instance.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.InstantiateTransformer(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstantiateTransformer\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * Note: from 4.0, the input parameters will be cloned\n     *\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 16)",
        "(line 99,col 9)-(line 99,col 69)",
        "(line 100,col 9)-(line 100,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstantiateTransformer.transform(java.lang.Class\u003c? extends T\u003e)",
      "begin_line": 109,
      "end_line": 126,
      "comment": "\n     * Transforms the input Class object to a result by instantiation.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 125,col 9)"
      ]
    }
  ]
}