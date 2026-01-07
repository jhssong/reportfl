{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImmutablePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.tuple.Pair\u003cL, R\u003e"
      ],
      "begin_line": 35,
      "end_line": 103,
      "comment": "\n * \u003cp\u003eAn immutable pair consisting of two {@code Object} elements.\u003c/p\u003e\n * \n * \u003cp\u003eAlthough the implementation is immutable, there is no restriction on the objects\n * that may be stored. If mutable objects are stored in the pair, then the pair\n * itself effectively becomes mutable. The class is also not {@code final}, so a subclass\n * could add undesirable behaviour.\u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe# if the objects are threadsafe\u003c/p\u003e\n *\n * @param \u003cL\u003e the left element type\n * @param \u003cR\u003e the right element type\n *\n * @since Lang 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Left object "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Right object "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutablePair.of(L, R)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eObtains an immutable pair of from two objects inferring the generic types.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis factory allows the pair to be created using inference to\n     * obtain the generic types.\u003c/p\u003e\n     * \n     * @param \u003cL\u003e the left element type\n     * @param \u003cR\u003e the right element type\n     * @param left  the left element, may be null\n     * @param right  the right element, may be null\n     * @return a pair formed from the two parameters, not null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.ImmutablePair.ImmutablePair(L, R)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Create a new pair instance.\n     *\n     * @param left  the left value, may be null\n     * @param right  the right value, may be null\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutablePair.getLeft()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutablePair.getRight()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutablePair.setValue(R)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eThrows {@code UnsupportedOperationException}.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis pair is immutable, so this operation is not supported.\u003c/p\u003e\n     *\n     * @param value  the value to set\n     * @return never\n     * @throws UnsupportedOperationException as this operation is not supported\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)"
      ]
    }
  ]
}