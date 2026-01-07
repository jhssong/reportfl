{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/TransformerPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformerPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 91,
      "comment": "\n * Predicate implementation that returns the result of a transformer.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "comment": " The transformer to call "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(org.apache.commons.collections4.Transformer\u003c? super T, java.lang.Boolean\u003e)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Factory to create the predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param transformer  the transformer to decorate\n     * @return the predicate\n     * @throws NullPointerException if the transformer is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.TransformerPredicate.TransformerPredicate(org.apache.commons.collections4.Transformer\u003c? super T, java.lang.Boolean\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003etransformerPredicate\u003c/code\u003e if you want that.\n     *\n     * @param transformer  the transformer to decorate\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerPredicate.evaluate(T)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\n     * Evaluates the predicate returning the result of the decorated transformer.\n     *\n     * @param object  the input object\n     * @return true if decorated transformer returns Boolean.TRUE\n     * @throws FunctorException if the transformer returns an invalid type\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 62)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformerPredicate.getTransformer()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Gets the transformer.\n     *\n     * @return the transformer\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 28)"
      ]
    }
  ]
}