{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/PredicateTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicateTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, java.lang.Boolean\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 85,
      "comment": "\n * Transformer implementation that calls a Predicate using the input object\n * and then returns the result.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "iPredicate"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The closure to wrap "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PredicateTransformer.predicateTransformer(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cT\u003e  the input type\n     * @param predicate  the predicate to call, not null\n     * @return the \u003ccode\u003epredicate\u003c/code\u003e transformer\n     * @throws IllegalArgumentException if the predicate is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PredicateTransformer.PredicateTransformer(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003epredicateTransformer\u003c/code\u003e if you want that.\n     *\n     * @param predicate  the predicate to call, not null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PredicateTransformer.transform(T)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Transforms the input to result by calling a predicate.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PredicateTransformer.getPredicate()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets the predicate.\n     *\n     * @return the predicate\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 26)"
      ]
    }
  ]
}