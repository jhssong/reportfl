{
  "filepath": "/tmp/Lang-12b/src/main/java/org/apache/commons/lang3/tuple/MutableTriple.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableTriple",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.tuple.Triple\u003cL, M, R\u003e"
      ],
      "begin_line": 30,
      "end_line": 132,
      "comment": "\n * \u003cp\u003eA mutable triple consisting of three {@code Object} elements.\u003c/p\u003e\n *\n * \u003cp\u003eNot #ThreadSafe#\u003c/p\u003e\n *\n * @param \u003cL\u003e the left element type\n * @param \u003cM\u003e the middle element type\n * @param \u003cR\u003e the right element type\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Left object "
    },
    {
      "type": "field",
      "varNames": [
        "middle"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Middle object "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Right object "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.of(L, M, R)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eObtains an mutable triple of three objects inferring the generic types.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis factory allows the triple to be created using inference to\n     * obtain the generic types.\u003c/p\u003e\n     *\n     * @param \u003cL\u003e the left element type\n     * @param \u003cM\u003e the middle element type\n     * @param \u003cR\u003e the right element type\n     * @param left  the left element, may be null\n     * @param middle  the middle element, may be null\n     * @param right  the right element, may be null\n     * @return a triple formed from the three parameters, not null\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.MutableTriple()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create a new triple instance of three nulls.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.MutableTriple(L, M, R)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Create a new triple instance.\n     *\n     * @param left  the left value, may be null\n     * @param middle  the middle value, may be null\n     * @param right  the right value, may be null\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 29)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.getLeft()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.setLeft(L)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Sets the left element of the triple.\n     *\n     * @param left  the new value of the left element, may be null\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.getMiddle()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.setMiddle(M)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Sets the middle element of the triple.\n     *\n     * @param middle  the new value of the middle element, may be null\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.getRight()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.tuple.MutableTriple.setRight(R)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Sets the right element of the triple.\n     *\n     * @param right  the new value of the right element, may be null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)"
      ]
    }
  ]
}