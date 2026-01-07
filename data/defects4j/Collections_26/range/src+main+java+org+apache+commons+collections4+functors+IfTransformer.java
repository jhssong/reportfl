{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/IfTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IfTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 154,
      "comment": "\n * Transformer implementation that will call one of two closures based on whether a predicate evaluates\n * as true or false.\n *\n * @param \u003cI\u003e The input type for the transformer\n * @param \u003cO\u003e The output type for the transformer\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The test "
    },
    {
      "type": "field",
      "varNames": [
        "iTrueTransformer"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The transformer to use if true "
    },
    {
      "type": "field",
      "varNames": [
        "iFalseTransformer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The transformer to use if false "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.ifTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 57,
      "end_line": 68,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cI\u003e  input type for the transformer\n     * @param \u003cO\u003e  output type for the transformer\n     * @param predicate  predicate to switch on\n     * @param trueTransformer  transformer used if true\n     * @param falseTransformer  transformer used if false\n     * @return the \u003ccode\u003eif\u003c/code\u003e transformer\n     * @throws NullPointerException if either argument is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 67,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.ifTransformer(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e)",
      "begin_line": 82,
      "end_line": 94,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * This factory creates a transformer that just returns the input object when\n     * the predicate is false.\n     *\n     * @param \u003cT\u003e  input and output type for the transformer\n     * @param predicate  predicate to switch on\n     * @param trueTransformer  transformer used if true\n     * @return the \u003ccode\u003eif\u003c/code\u003e transformer\n     * @throws NullPointerException if either argument is null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 103)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.IfTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 104,
      "end_line": 112,
      "comment": "\n     * Constructor that performs no validation.\n     * Use the static factory method \u003ccode\u003eifTransformer\u003c/code\u003e if you want that.\n     *\n     * @param predicate  predicate to switch on, not null\n     * @param trueTransformer  transformer used if true, not null\n     * @param falseTransformer  transformer used if false, not null\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)",
        "(line 109,col 9)-(line 109,col 31)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.transform(I)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Transforms the input using the true or false transformer based to the result of the predicate.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.getPredicate()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Gets the predicate.\n     *\n     * @return the predicate\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.getTrueTransformer()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Gets the transformer used when true.\n     *\n     * @return the transformer\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfTransformer.getFalseTransformer()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Gets the transformer used when false.\n     *\n     * @return the transformer\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 33)"
      ]
    }
  ]
}