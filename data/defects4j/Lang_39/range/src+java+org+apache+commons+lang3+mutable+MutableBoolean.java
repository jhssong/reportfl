{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/mutable/MutableBoolean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableBoolean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Boolean\u003e",
        "java.io.Serializable",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableBoolean\u003e"
      ],
      "begin_line": 30,
      "end_line": 189,
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
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.getValue()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean, never null\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(java.lang.Boolean)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isTrue()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Checks if the current value is \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003etrue\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isFalse()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Checks if the current value is \u003ccode\u003efalse\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.booleanValue()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toBoolean()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Gets this mutable as an instance of Boolean.\n     *\n     * @return a Boolean instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.hashCode()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return the hash code returned by \u003ccode\u003eBoolean.TRUE\u003c/code\u003e or \u003ccode\u003eBoolean.FALSE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.compareTo(org.apache.commons.lang3.mutable.MutableBoolean)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     *  where false is less than true\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 41)",
        "(line 175,col 9)-(line 175,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toString()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 37)"
      ]
    }
  ]
}