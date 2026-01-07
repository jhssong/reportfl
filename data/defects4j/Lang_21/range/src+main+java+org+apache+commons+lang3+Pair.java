{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/Pair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 99,
      "comment": "\n * A basic immutable Object pair.\n *\n * \u003cp\u003e#ThreadSafe# if the objects are threadsafe\u003c/p\u003e\n * @since Lang 3.0\n * @author Matt Benson\n * @version $Id$\n "
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
        "right"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Right object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Pair.Pair(L, R)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Create a new Pair instance.\n     * @param left\n     * @param right\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 25)",
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.equals(java.lang.Object)",
      "begin_line": 54,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 44)",
        "(line 63,col 9)-(line 63,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.hashCode()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.toString()",
      "begin_line": 77,
      "end_line": 86,
      "comment": "\n     * Returns a String representation of the Pair in the form: (L,R)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 29)",
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 28)",
        "(line 85,col 9)-(line 85,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.of(L, R)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Static fluent creation method for a Pair\u003cL, R\u003e:  \u003ccode\u003ePair.of(left, right)\u003c/code\u003e\n     * @param \u003cL\u003e\n     * @param \u003cR\u003e\n     * @param left\n     * @param right\n     * @return Pair\u003cL, R\u003e(left, right)\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 43)"
      ]
    }
  ]
}