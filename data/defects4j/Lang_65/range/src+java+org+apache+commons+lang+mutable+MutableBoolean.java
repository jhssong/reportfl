{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableBoolean.java",
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
      "begin_line": 29,
      "end_line": 165,
      "comment": "\n * A mutable \u003ccode\u003eboolean\u003c/code\u003e wrapper.\n * \n * @see Boolean\n * @since 2.2\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.booleanValue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.compareTo(java.lang.Object)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return zero if this object represents the same boolean value as the argument; a positive value if this object\n     *         represents true and the argument represents false; and a negative value if this object represents false\n     *         and the argument represents true\n     * @throws ClassCastException\n     *             if the argument is not a MutableInt\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 52)",
        "(line 91,col 9)-(line 91,col 41)",
        "(line 92,col 9)-(line 92,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.getValue()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.hashCode()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return the integer \u003ccode\u003e1231\u003c/code\u003e if this object represents \u003ccode\u003etrue\u003c/code\u003e; returns the integer\n     *         \u003ccode\u003e1237\u003c/code\u003e if this object represents \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.setValue(java.lang.Object)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Boolean}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableBoolean.toString()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)"
      ]
    }
  ]
}