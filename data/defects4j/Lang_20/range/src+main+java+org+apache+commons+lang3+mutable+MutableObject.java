{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/mutable/MutableObject.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.mutable.Mutable\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 126,
      "comment": "\n * A mutable \u003ccode\u003eObject\u003c/code\u003e wrapper.\n * \n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.MutableObject()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new MutableObject with the default value of \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.MutableObject(T)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableObject with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.getValue()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Gets the value.\n     * \n     * @return the value, may be null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.setValue(T)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.equals(java.lang.Object)",
      "begin_line": 89,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableObject\u003c/code\u003e object that contains the same \u003ccode\u003eT\u003c/code\u003e\n     * value as this object.\n     * \u003c/p\u003e\n     * \n     * @param obj  the object to compare with, \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return  \u003ccode\u003etrue\u003c/code\u003e if the objects are the same;\n     *          \u003ccode\u003etrue\u003c/code\u003e if the objects have equivalent \u003ccode\u003evalue\u003c/code\u003e fields;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.hashCode()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Returns the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.toString()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 57)"
      ]
    }
  ]
}