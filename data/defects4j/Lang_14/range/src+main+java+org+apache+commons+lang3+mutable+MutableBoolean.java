{
  "filepath": "/tmp/Lang-14b/src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java",
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
      "begin_line": 31,
      "end_line": 193,
      "comment": "\n * A mutable \u003ccode\u003eboolean\u003c/code\u003e wrapper.\n * \u003cp\u003e\n * Note that as MutableBoolean does not extend Boolean, it is not treated by String.format as a Boolean parameter. \n * \n * @see Boolean\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Constructs a new MutableBoolean with the default value of false.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(boolean)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.MutableBoolean(java.lang.Boolean)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructs a new MutableBoolean with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.getValue()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Gets the value as a Boolean instance.\n     * \n     * @return the value as a Boolean, never null\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(boolean)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.setValue(java.lang.Boolean)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Sets the value from any Boolean instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isTrue()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Checks if the current value is \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003etrue\u003c/code\u003e\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.isFalse()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Checks if the current value is \u003ccode\u003efalse\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if the current value is \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.booleanValue()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns the value of this MutableBoolean as a boolean.\n     * \n     * @return the boolean value represented by this object.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toBoolean()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Gets this mutable as an instance of Boolean.\n     *\n     * @return a Boolean instance containing the value from this mutable, never null\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.equals(java.lang.Object)",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableBoolean\u003c/code\u003e object that contains the same\n     * \u003ccode\u003eboolean\u003c/code\u003e value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.hashCode()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return the hash code returned by \u003ccode\u003eBoolean.TRUE\u003c/code\u003e or \u003ccode\u003eBoolean.FALSE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.compareTo(org.apache.commons.lang3.mutable.MutableBoolean)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     *  where false is less than true\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 41)",
        "(line 179,col 9)-(line 179,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableBoolean.toString()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 37)"
      ]
    }
  ]
}