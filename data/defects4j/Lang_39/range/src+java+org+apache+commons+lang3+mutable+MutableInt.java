{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/mutable/MutableInt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableInt",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableInt\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 27,
      "end_line": 271,
      "comment": "\n * A mutable \u003ccode\u003eint\u003c/code\u003e wrapper.\n * \n * @see Integer\n * @since 2.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.MutableInt()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableInt with the default value of zero.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.MutableInt(int)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableInt with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.MutableInt(java.lang.Number)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new MutableInt with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.MutableInt(java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructs a new MutableInt parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into an int\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.getValue()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Gets the value as a Integer instance.\n     * \n     * @return the value as a Integer, never null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.setValue(int)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.setValue(java.lang.Number)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.increment()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.decrement()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.add(int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.add(java.lang.Number)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.subtract(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.subtract(java.lang.Number)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.intValue()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Returns the value of this MutableInt as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.longValue()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Returns the value of this MutableInt as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.floatValue()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Returns the value of this MutableInt as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.doubleValue()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Returns the value of this MutableInt as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.toInteger()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Gets this mutable as an instance of Integer.\n     *\n     * @return a Integer instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.equals(java.lang.Object)",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableInt\u003c/code\u003e object that contains the same \u003ccode\u003eint\u003c/code\u003e value\n     * as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.hashCode()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.compareTo(org.apache.commons.lang3.mutable.MutableInt)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 37)",
        "(line 257,col 9)-(line 257,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableInt.toString()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 37)"
      ]
    }
  ]
}