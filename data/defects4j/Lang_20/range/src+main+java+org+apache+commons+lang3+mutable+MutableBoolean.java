{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java",
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
      "begin_line": 29,
      "end_line": 191,
      "comment": "\n * A mutable \u003ccode\u003eboolean\u003c/code\u003e wrapper.\n * \n * @see Boolean\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.getValue()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean, never null\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(java.lang.Boolean)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isTrue()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Checks if the current value is \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003etrue\u003c/code\u003e\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isFalse()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Checks if the current value is \u003ccode\u003efalse\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.booleanValue()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toBoolean()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Gets this mutable as an instance of Boolean.\n     *\n     * @return a Boolean instance containing the value from this mutable, never null\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.hashCode()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return the hash code returned by \u003ccode\u003eBoolean.TRUE\u003c/code\u003e or \u003ccode\u003eBoolean.FALSE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.compareTo(org.apache.commons.lang3.mutable.MutableBoolean)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     *  where false is less than true\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toString()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 37)"
      ]
    }
  ]
}