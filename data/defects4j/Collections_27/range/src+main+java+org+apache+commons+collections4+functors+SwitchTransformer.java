{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/SwitchTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 199,
      "comment": "\n * Transformer implementation calls the transformer whose predicate returns true,\n * like a switch statement.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicates"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The tests to consider "
    },
    {
      "type": "field",
      "varNames": [
        "iTransformers"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The matching transformers to call "
    },
    {
      "type": "field",
      "varNames": [
        "iDefault"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The default transformer to call if no tests match "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 56,
      "end_line": 70,
      "comment": "\n     * Factory method that performs validation and copies the parameter arrays.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicates  array of predicates, cloned, no nulls\n     * @param transformers  matching array of transformers, cloned, no nulls\n     * @param defaultTransformer  the transformer to use if no match, null means return null\n     * @return the \u003ccode\u003echained\u003c/code\u003e transformer\n     * @throws NullPointerException if array is null\n     * @throws NullPointerException if any element in the array is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 42)",
        "(line 61,col 9)-(line 61,col 44)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(java.util.Map\u003c? extends org.apache.commons.collections4.Predicate\u003c? super I\u003e, ? extends org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e\u003e)",
      "begin_line": 91,
      "end_line": 118,
      "comment": "\n     * Create a new Transformer that calls one of the transformers depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The Map consists of Predicate keys and Transformer values. A transformer\n     * is called if its matching predicate returns true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * transformer is called. The default transformer is set in the map with a\n     * null key. The ordering is that of the iterator() method on the entryset\n     * collection of the map.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param map  a map of predicates to transformers\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e transformer\n     * @throws NullPointerException if the map is null\n     * @throws NullPointerException if any transformer in the map is null\n     * @throws ClassCastException  if the map elements are of the wrong type\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 88)",
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 89)",
        "(line 109,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 110,col 18)",
        "(line 111,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 91)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.SwitchTransformer(boolean, org.apache.commons.collections4.Predicate\u003c? super I\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\n     * Hidden constructor for the use by the static factory methods.\n     *\n     * @param clone  if {@code true} the input arguments will be cloned\n     * @param predicates  array of predicates, no nulls\n     * @param transformers  matching array of transformers, no nulls\n     * @param defaultTransformer  the transformer to use if no match, null means return null\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 16)",
        "(line 133,col 9)-(line 133,col 73)",
        "(line 134,col 9)-(line 134,col 79)",
        "(line 135,col 9)-(line 136,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.SwitchTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eswitchTransformer\u003c/code\u003e if you want that.\n     *\n     * @param predicates  array of predicates, cloned, no nulls\n     * @param transformers  matching array of transformers, cloned, no nulls\n     * @param defaultTransformer  the transformer to use if no match, null means return null\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.transform(I)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n     * Transforms the input to result by calling the transformer whose matching\n     * predicate returns true.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.getPredicates()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Gets the predicates.\n     *\n     * @return a copy of the predicates\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.getTransformers()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Gets the transformers.\n     *\n     * @return a copy of the transformers\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchTransformer.getDefaultTransformer()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Gets the default transformer.\n     *\n     * @return the default transformer\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 24)"
      ]
    }
  ]
}