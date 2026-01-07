{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/mutable/MutableBoolean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableBoolean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.mutable.Mutable",
        "java.io.Serializable",
        "java.lang.Comparable"
      ],
      "begin_line": 30,
      "end_line": 170,
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
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.compareTo(java.lang.Object)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return zero if this object represents the same boolean value as the argument; a positive value if this object\n     *         represents true and the argument represents false; and a negative value if this object represents false\n     *         and the argument represents true\n     * @throws ClassCastException\n     *             if the argument is not a MutableInt\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.getValue()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.hashCode()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return the integer \u003ccode\u003e1231\u003c/code\u003e if this object represents \u003ccode\u003etrue\u003c/code\u003e; returns the integer\n     *         \u003ccode\u003e1237\u003c/code\u003e if this object represents \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(java.lang.Object)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Boolean}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.toString()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 37)"
      ]
    }
  ]
}