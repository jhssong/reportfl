{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/ClosureTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 87,
      "comment": "\n * Transformer implementation that calls a Closure using the input object\n * and then returns the input.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iClosure"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The closure to wrap "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ClosureTransformer.closureTransformer(org.apache.commons.collections4.Closure\u003c? super T\u003e)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cT\u003e  the type of the object to transform\n     * @param closure  the closure to call, not null\n     * @return the \u003ccode\u003eclosure\u003c/code\u003e transformer\n     * @throws NullPointerException if the closure is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ClosureTransformer.ClosureTransformer(org.apache.commons.collections4.Closure\u003c? super T\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eclosureTransformer\u003c/code\u003e if you want that.\n     *\n     * @param closure  the closure to call, not null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ClosureTransformer.transform(T)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Transforms the input to result by executing a closure.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 32)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ClosureTransformer.getClosure()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Gets the closure.\n     *\n     * @return the closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 24)"
      ]
    }
  ]
}