{
  "filepath": "/tmp/Lang-8b/src/main/java/org/apache/commons/lang3/tuple/ImmutableTriple.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImmutableTriple",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.tuple.Triple\u003cL, M, R\u003e"
      ],
      "begin_line": 35,
      "end_line": 103,
      "comment": "\n * \u003cp\u003eAn immutable triple consisting of three {@code Object} elements.\u003c/p\u003e\n * \n * \u003cp\u003eAlthough the implementation is immutable, there is no restriction on the objects\n * that may be stored. If mutable objects are stored in the triple, then the triple\n * itself effectively becomes mutable. The class is also not {@code final}, so a subclass\n * could add undesirable behaviour.\u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe# if all three objects are thread-safe\u003c/p\u003e\n *\n * @param \u003cL\u003e the left element type\n * @param \u003cM\u003e the middle element type\n * @param \u003cR\u003e the right element type\n *\n * @version $Id$\n "
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
        "middle"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Middle object "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Right object "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutableTriple.of(L, M, R)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eObtains an immutable triple of from three objects inferring the generic types.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis factory allows the triple to be created using inference to\n     * obtain the generic types.\u003c/p\u003e\n     * \n     * @param \u003cL\u003e the left element type\n     * @param \u003cM\u003e the middle element type\n     * @param \u003cR\u003e the right element type\n     * @param left  the left element, may be null\n     * @param middle  the middle element, may be null\n     * @param right  the right element, may be null\n     * @return a triple formed from the three parameters, not null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.ImmutableTriple.ImmutableTriple(L, M, R)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Create a new triple instance.\n     *\n     * @param left  the left value, may be null\n     * @param middle the middle value, may be null\n     * @param right  the right value, may be null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 29)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutableTriple.getLeft()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutableTriple.getMiddle()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.ImmutableTriple.getRight()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 21)"
      ]
    }
  ]
}