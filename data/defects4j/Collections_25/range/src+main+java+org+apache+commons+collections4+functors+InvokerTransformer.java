{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/InvokerTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvokerTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 142,
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
        "iMethodName"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The method name to call "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The array of reflection parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The array of reflection arguments "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.invokerTransformer(java.lang.String)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with no arguments.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @return an invoker transformer\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.invokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 70,
      "end_line": 84,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with specific values.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @param paramTypes  the parameter types of the method\n     * @param args  the arguments to pass to the method\n     * @return an invoker transformer\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Constructor for no arg instance.\n     *\n     * @param methodName  the method to call\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 16)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einvokerTransformer\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * Note: from 4.0, the input parameters will be cloned\n     *\n     * @param methodName  the method to call\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 69)",
        "(line 112,col 9)-(line 112,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.transform(java.lang.Object)",
      "begin_line": 121,
      "end_line": 140,
      "comment": "\n     * Transforms the input to result by invoking a method on the input.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result, null if null input\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 139,col 9)"
      ]
    }
  ]
}