{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/mutable/MutableBoolean.java",
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
      "begin_line": 32,
      "end_line": 172,
      "comment": "\n * A mutable \u003ccode\u003eboolean\u003c/code\u003e wrapper.\n * \n * @see Boolean\n * @since 2.2\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)",
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 16)",
        "(line 72,col 9)-(line 72,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.booleanValue()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.compareTo(java.lang.Object)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return zero if this object represents the same boolean value as the argument; a positive value if this object\n     *         represents true and the argument represents false; and a negative value if this object represents false\n     *         and the argument represents true\n     * @throws ClassCastException\n     *             if the argument is not a MutableInt\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 52)",
        "(line 98,col 9)-(line 98,col 41)",
        "(line 99,col 9)-(line 99,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.getValue()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.hashCode()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return the integer \u003ccode\u003e1231\u003c/code\u003e if this object represents \u003ccode\u003etrue\u003c/code\u003e; returns the integer\n     *         \u003ccode\u003e1237\u003c/code\u003e if this object represents \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Boolean}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.toString()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 37)"
      ]
    }
  ]
}