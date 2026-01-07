{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/InvokerTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvokerTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e"
      ],
      "begin_line": 36,
      "end_line": 147,
      "comment": "\n * Transformer implementation that creates a new object instance by reflection.\n * \u003cp\u003e\n * \u003cb\u003eWARNING:\u003c/b\u003e from v4.1 onwards this class will \u003cb\u003enot\u003c/b\u003e be serializable anymore\n * in order to prevent potential remote code execution exploits. Please refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-580\"\u003eCOLLECTIONS-580\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iMethodName"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The method name to call "
    },
    {
      "type": "field",
      "varNames": [
        "iParamTypes"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The array of reflection parameter types "
    },
    {
      "type": "field",
      "varNames": [
        "iArgs"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The array of reflection arguments "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.invokerTransformer(java.lang.String)",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with no arguments.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @return an invoker transformer\n     * @throws NullPointerException if methodName is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.invokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 74,
      "end_line": 88,
      "comment": "\n     * Gets an instance of this transformer calling a specific method with specific values.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call\n     * @param paramTypes  the parameter types of the method\n     * @param args  the arguments to pass to the method\n     * @return an invoker transformer\n     * @throws NullPointerException if methodName is null\n     * @throws IllegalArgumentException if paramTypes does not match args\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Constructor for no arg instance.\n     *\n     * @param methodName  the method to call\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 16)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 27)",
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.InvokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einvokerTransformer\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * Note: from 4.0, the input parameters will be cloned\n     *\n     * @param methodName  the method to call\n     * @param paramTypes  the constructor parameter types\n     * @param args  the constructor arguments\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 69)",
        "(line 116,col 9)-(line 116,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InvokerTransformer.transform(java.lang.Object)",
      "begin_line": 125,
      "end_line": 145,
      "comment": "\n     * Transforms the input to result by invoking a method on the input.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result, null if null input\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 144,col 9)"
      ]
    }
  ]
}