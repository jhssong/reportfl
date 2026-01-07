{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/mutable/MutableShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableShort\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 281,
      "comment": "\n * A mutable \u003ccode\u003eshort\u003c/code\u003e wrapper.\n * \n * @see Short\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableShort with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(short)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(java.lang.Number)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructs a new MutableShort parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a short\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.getValue()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Gets the value as a Short instance.\n     * \n     * @return the value as a Short, never null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.setValue(short)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.setValue(java.lang.Number)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.increment()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.decrement()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.add(short)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.add(java.lang.Number)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.subtract(short)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.subtract(java.lang.Number)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.shortValue()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Returns the value of this MutableShort as a short.\n     *\n     * @return the numeric value represented by this object after conversion to type short.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.intValue()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Returns the value of this MutableShort as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.longValue()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Returns the value of this MutableShort as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.floatValue()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Returns the value of this MutableShort as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.doubleValue()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Returns the value of this MutableShort as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.toShort()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Gets this mutable as an instance of Short.\n     *\n     * @return a Short instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.equals(java.lang.Object)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableShort\u003c/code\u003e object that contains the same \u003ccode\u003eshort\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.hashCode()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.compareTo(org.apache.commons.lang3.mutable.MutableShort)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 39)",
        "(line 267,col 9)-(line 267,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.toString()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 37)"
      ]
    }
  ]
}