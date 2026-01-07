{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/TransformerClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformerClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 85,
      "comment": "\n * Closure implementation that calls a Transformer using the input object\n * and ignore the result.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "iTransformer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The transformer to wrap "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerClosure.transformerClosure(org.apache.commons.collections4.Transformer\u003c? super E, ?\u003e)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * A null transformer will return the \u003ccode\u003eNOPClosure\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param transformer  the transformer to call, null means nop\n     * @return the \u003ccode\u003etransformer\u003c/code\u003e closure\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.TransformerClosure.TransformerClosure(org.apache.commons.collections4.Transformer\u003c? super E, ?\u003e)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003etransformerClosure\u003c/code\u003e if you want that.\n     *\n     * @param transformer  the transformer to call, not null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerClosure.execute(E)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Executes the closure by calling the decorated transformer.\n     *\n     * @param input  the input object\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerClosure.getTransformer()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets the transformer.\n     *\n     * @return the transformer\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 28)"
      ]
    }
  ]
}