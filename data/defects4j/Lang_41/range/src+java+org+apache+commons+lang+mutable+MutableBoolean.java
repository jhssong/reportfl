{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/mutable/MutableBoolean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableBoolean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.mutable.Mutable\u003cjava.lang.Boolean\u003e",
        "java.io.Serializable",
        "java.lang.Comparable\u003corg.apache.commons.lang.mutable.MutableBoolean\u003e"
      ],
      "begin_line": 30,
      "end_line": 168,
      "comment": "\n * A mutable \u003ccode\u003eboolean\u003c/code\u003e wrapper.\n * \n * @see Boolean\n * @since 2.2\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.booleanValue()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.compareTo(org.apache.commons.lang.mutable.MutableBoolean)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other\n     *            the mutable to compare to\n     * @return zero if this object represents the same boolean value as the argument; a positive value if this object\n     *         represents true and the argument represents false; and a negative value if this object represents false\n     *         and the argument represents true\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.getValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.hashCode()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return the integer \u003ccode\u003e1231\u003c/code\u003e if this object represents \u003ccode\u003etrue\u003c/code\u003e; returns the integer\n     *         \u003ccode\u003e1237\u003c/code\u003e if this object represents \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(java.lang.Boolean)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.toString()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 37)"
      ]
    }
  ]
}