{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/InvokerTransformer.java",
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
      "end_line": 145,
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
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with no arguments.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @return an invoker transformer\n     * @throws NullPointerException if methodName is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.invokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 73,
      "end_line": 87,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with specific values.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @param paramTypes  the parameter types of the method\n     * @param args  the arguments to pass to the method\n     * @return an invoker transformer\n     * @throws NullPointerException if methodName is null\n     * @throws IllegalArgumentException if paramTypes does not match args\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Constructor for no arg instance.\n     *\n     * @param methodName  the method to call\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 16)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einvokerTransformer\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * Note: from 4.0, the input parameters will be cloned\n     *\n     * @param methodName  the method to call\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 113,col 33)",
        "(line 114,col 9)-(line 114,col 69)",
        "(line 115,col 9)-(line 115,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.transform(java.lang.Object)",
      "begin_line": 124,
      "end_line": 143,
      "comment": "\n     * Transforms the input to result by invoking a method on the input.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result, null if null input\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 142,col 9)"
      ]
    }
  ]
}