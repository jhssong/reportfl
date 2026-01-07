{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ChainedTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChainedTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 128,
      "comment": "\n * Transformer implementation that chains the specified transformers together.\n * \u003cp\u003e\n * The input object is passed to the first transformer. The transformed result\n * is passed to the second transformer and so on.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iTransformers"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The transformers to call in turn "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.chainedTransformer(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e...)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Factory method that performs validation and copies the parameter array.\n     *\n     * @param \u003cT\u003e  the object type\n     * @param transformers  the transformers to chain, copied, no nulls\n     * @return the \u003ccode\u003echained\u003c/code\u003e transformer\n     * @throws NullPointerException if the transformers array is null\n     * @throws NullPointerException if any transformer in the array is null\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 44)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.chainedTransformer(java.util.Collection\u003c? extends org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e\u003e)",
      "begin_line": 69,
      "end_line": 82,
      "comment": "\n     * Create a new Transformer that calls each transformer in turn, passing the\n     * result into the next transformer. The ordering is that of the iterator()\n     * method on the collection.\n     *\n     * @param \u003cT\u003e  the object type\n     * @param transformers  a collection of transformers to chain\n     * @return the \u003ccode\u003echained\u003c/code\u003e transformer\n     * @throws NullPointerException if the transformers collection is null\n     * @throws NullPointerException if any transformer in the collection is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 100)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.ChainedTransformer(boolean, org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e[])",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Hidden constructor for the use by the static factory methods.\n     *\n     * @param clone  if {@code true} the input argument will be cloned\n     * @param transformers  the transformers to chain, no nulls\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 16)",
        "(line 92,col 9)-(line 92,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.ChainedTransformer(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e...)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003echainedTransformer\u003c/code\u003e if you want that.\n     *\n     * @param transformers  the transformers to chain, copied, no nulls\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.transform(T)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Transforms the input to result via each decorated transformer\n     *\n     * @param object  the input object passed to the first transformer\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedTransformer.getTransformers()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Gets the transformers.\n     *\n     * @return a copy of the transformers\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 54)"
      ]
    }
  ]
}