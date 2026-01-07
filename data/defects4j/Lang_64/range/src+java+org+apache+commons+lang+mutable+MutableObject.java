{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/mutable/MutableObject.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.mutable.Mutable",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 113,
      "comment": "\n * A mutable \u003ccode\u003eObject\u003c/code\u003e wrapper.\n * \n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableObject.MutableObject()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableObject with the default value of \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableObject.MutableObject(java.lang.Object)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableObject with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.getValue()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Gets the value.\n     * \n     * @return the value\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.setValue(java.lang.Object)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.equals(java.lang.Object)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableObject\u003c/code\u003e object that contains the same \u003ccode\u003eObject\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.hashCode()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.toString()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 57)"
      ]
    }
  ]
}