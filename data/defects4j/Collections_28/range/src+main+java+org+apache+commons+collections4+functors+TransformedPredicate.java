{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/TransformedPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 109,
      "comment": "\n * Predicate implementation that transforms the given object before invoking\n * another \u003ccode\u003ePredicate\u003c/code\u003e.\n *\n * @since 3.1\n * @version $Id$\n "
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
      "type": "field",
      "varNames": [
        "iPredicate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The predicate to call "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformedPredicate.transformedPredicate(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 51,
      "end_line": 60,
      "comment": "\n     * Factory to create the predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param transformer  the transformer to call\n     * @param predicate  the predicate to call with the result of the transform\n     * @return the predicate\n     * @throws NullPointerException if the transformer or the predicate is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.TransformedPredicate.TransformedPredicate(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003etransformedPredicate\u003c/code\u003e if you want that.\n     *\n     * @param transformer  the transformer to use\n     * @param predicate  the predicate to decorate\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 35)",
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformedPredicate.evaluate(T)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Evaluates the predicate returning the result of the decorated predicate\n     * once the input has been transformed\n     *\n     * @param object  the input object which will be transformed\n     * @return true if decorated predicate returns true\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 56)",
        "(line 85,col 9)-(line 85,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformedPredicate.getPredicates()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Gets the predicate being decorated.\n     *\n     * @return the predicate as the only element in an array\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.TransformedPredicate.getTransformer()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Gets the transformer in use.\n     *\n     * @return the transformer\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 28)"
      ]
    }
  ]
}