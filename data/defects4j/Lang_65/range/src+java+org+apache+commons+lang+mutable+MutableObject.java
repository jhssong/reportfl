{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableObject.java",
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
      "end_line": 109,
      "comment": "\n * A mutable \u003ccode\u003eObject\u003c/code\u003e wrapper.\n * \n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableObject.MutableObject()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructs a new MutableObject with the default value of \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableObject.MutableObject(java.lang.Object)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Constructs a new MutableObject with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)",
        "(line 50,col 9)-(line 50,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.getValue()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Gets the value.\n     * \n     * @return the value\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.setValue(java.lang.Object)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.equals(java.lang.Object)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableObject\u003c/code\u003e object that contains the same \u003ccode\u003eObject\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.hashCode()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return the value\u0027s hash code or \u003ccode\u003e0\u003c/code\u003e if the value is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableObject.toString()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 57)"
      ]
    }
  ]
}