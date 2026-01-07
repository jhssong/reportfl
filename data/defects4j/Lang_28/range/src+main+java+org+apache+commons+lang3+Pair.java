{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/Pair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 98,
      "comment": "\n * A basic immutable Object pair.\n *\n * \u003cp\u003e#ThreadSafe# if the objects are threadsafe\u003c/p\u003e\n * @since Lang 3.0\n * @author Matt Benson\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Left object "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Right object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Pair.Pair(L, R)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Create a new Pair instance.\n     * @param left\n     * @param right\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 25)",
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.equals(java.lang.Object)",
      "begin_line": 53,
      "end_line": 63,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 44)",
        "(line 62,col 9)-(line 62,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.hashCode()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.toString()",
      "begin_line": 76,
      "end_line": 85,
      "comment": "\n     * Returns a String representation of the Pair in the form: (L,R)\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 28)",
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Pair.of(L, R)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Static creation method for a Pair\u003cL, R\u003e.\n     * @param \u003cL\u003e\n     * @param \u003cR\u003e\n     * @param left\n     * @param right\n     * @return Pair\u003cL, R\u003e(left, right)\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 43)"
      ]
    }
  ]
}