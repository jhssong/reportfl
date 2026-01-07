{
  "filepath": "/tmp/Lang-27b/src/main/java/org/apache/commons/lang3/mutable/MutableObject.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.mutable.Mutable\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 129,
      "comment": "\n * A mutable \u003ccode\u003eObject\u003c/code\u003e wrapper.\n * \n * @since 2.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.MutableObject()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructs a new MutableObject with the default value of \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.MutableObject(T)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Constructs a new MutableObject with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.getValue()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Gets the value.\n     * \n     * @return the value, may be null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.setValue(T)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableObject\u003c/code\u003e object that contains the same \u003ccode\u003eT\u003c/code\u003e\n     * value as this object.\n     * \u003c/p\u003e\n     * \n     * @param obj  the object to compare with, \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return  \u003ccode\u003etrue\u003c/code\u003e if the objects are the same;\n     *          \u003ccode\u003etrue\u003c/code\u003e if the objects have equivalent \u003ccode\u003evalue\u003c/code\u003e fields;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.hashCode()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Returns the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableObject.toString()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 57)"
      ]
    }
  ]
}